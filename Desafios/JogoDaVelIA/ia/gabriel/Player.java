package ia.gabriel;

public class Player implements ia.Player {
    private String simboloJogador = "O";
    private String simboloAdversario = "X";
    private String nomeJogador;

    public Player(String nome){
        this.nomeJogador = nome;
    }

    //Combinações de vitória
    private static final int[][][] COMBINACOES = {
            {{0,0},{0,1},{0,2}}, //linha 0
            {{1,0},{1,1},{1,2}}, //linha 1
            {{2,0},{2,1},{2,2}}, //linha 2

            {{0,0},{1,0},{2,0}}, //coluna 0
            {{0,1},{1,1},{2,1}}, //coluna 1
            {{0,2},{1,2},{2,2}}, //coluna 2

            {{0,0},{1,1},{2,2}}, //diagonal \
            {{0,2},{1,1},{2,0}}  //diagonal /
    };

    @Override
    public int[] jogar(String[][] board) {

        int[] jogada;

        //verifica se tem alguma posição q ganho se jogar
        jogada = tentar(board, simboloJogador);
        if (jogada != null) {
            return jogada;
        }

        //verifica se tem alguma posição q perco se n jogar
        jogada = tentar(board, simboloAdversario);
        if (jogada != null) {
            return jogada;
        }
        //o mtodo pra verificar é o mesmo, só trocamos os símbolos

        jogada = bloquearFork(board, simboloAdversario);
        if (jogada != null) {
            return jogada;
        }
        //algoritimo pra detectar e bloquear fork

        //joga no meio
        if (board[1][1].equals(" ")) {
            return new int[]{1,1};
        }

        //estrategia ofensiva
        jogada = ForkTriangulo(board, simboloJogador, simboloAdversario);
        if (jogada != null) {
            return jogada;
        }

        //joga no canto
        int[][] cantos = {{0,0},{0,2},{2,0},{2,2}};
        for (int[] c : cantos) {
            if (board[c[0]][c[1]].equals(" "))
                return c;
        }
        //um for q passa verificando se cada canto tá livre

        //joga em qualquer lugar livre
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (board[i][j].equals(" "))
                    return new int[]{i, j};
            }
        }
        //for dentro do outro q percorre o board procurando a primeira posição livre

        return null;
    }

//algorítimo de detecção
//percorre as posições de vitória
//com base nas 2 variáveis, decide onde jogar
    private int[] tentar(String[][] board, String simbolo) {
        for (int[][] comb : COMBINACOES) {

            // quantas casas tem o simbolo que está sendo analisado
            int contagemSimbolos = 0;
            //vai guardar a a casa vazia
            int[] casaVazia = null;

            //percorre as posições de vitória, registrando quantos do simbolo analisado tem cada uma
            for (int[] p : comb) {
                if (board[p[0]][p[1]].equals(simbolo)) {
                    contagemSimbolos++;
                }
            //percorre as posições de vitória e guarda a casa vazia
                else if (board[p[0]][p[1]].equals(" ")) {
                    casaVazia = p;
                }
            }

            //se foi encontrada uma possibilidade de vitória minha ou do adversário
            //faz a jogada na casa vazia retorna ela
            if (contagemSimbolos == 2 && casaVazia != null) {
                return new int[]{casaVazia[0], casaVazia[1]};
            }
        }
        return null;
    }

    private int[] ForkTriangulo(String[][] board, String simboloJogador, String simboloAdversario) {
        //só faz se eu tiver o centro
        if (!board[1][1].equals(simboloJogador)) {
            return null;
        }

        //cantos e bordas
        int[][] cantos = {{0,0},{0,2},{2,0},{2,2}};
        int[][] bordas = {{0,1},{1,0},{1,2},{2,1}};

        //procura se o adversário jogou numa borda
        for (int[] b : bordas) {
            if (board[b[0]][b[1]].equals(simboloAdversario)) {
                int[] cantoEscolhido = null;

                //hard ifs pra escolher a borda adequada p criar o fork
                if (b[0] == 0 && b[1] == 1) {
                    cantoEscolhido = new int[]{0,0}; //topo centro -> topo esquerda
                }
                else if (b[0] == 1 && b[1] == 0) {
                    cantoEscolhido = new int[]{0,0}; //esquerda centro -> topo esquerda
                }
                else if (b[0] == 1 && b[1] == 2) {
                    cantoEscolhido = new int[]{0,2}; //direita centro -> topo direita
                }
                else if (b[0] == 2 && b[1] == 1) {
                    cantoEscolhido = new int[]{2,2}; //baixo centro -> baixo direita
                }

                //só joga se o canto estiver livre
                if (cantoEscolhido != null && board[cantoEscolhido[0]][cantoEscolhido[1]].equals(" ")) {
                    return new int[]{cantoEscolhido[0], cantoEscolhido[1]};
                }
            }
        }
        return null;
    }

    private int[] bloquearFork(String[][] board, String simboloAdversario) {
        //percorre todas as posições do tabuleiro
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                //caça posição vazia
                if (board[i][j].equals(" ")) {
                    int ameacas = 0;
                    //variável q controla se a jogada é fork

                    //simula o adversário jogando na posição atual do loop
                    board[i][j] = simboloAdversario;

                    //percorre todas as combinações de vitória
                    for (int[][] comb : COMBINACOES) {
                        int contagemSimbolos = 0;
                        int casasVazias = 0;
                        for (int[] p : comb) {
                            //percorre as posições de vitória, registrando quantos do simbolo analisado tem cada uma
                            if (board[p[0]][p[1]].equals(simboloAdversario)) {
                                contagemSimbolos++;
                            }
                            //percorre as posições de vitória e guarda a casa vazia
                            else if (board[p[0]][p[1]].equals(" ")) {
                                casasVazias++;
                            }
                        }
                        //se ele tem 2 símbolos e 1 casa livre, cria ameaça
                        if (contagemSimbolos == 2 && casasVazias == 1) {
                            ameacas++;
                        }
                    }

                    //desfaz a simulação p n ferrar a jogada
                    board[i][j] = " ";

                    //se essa jogada cria mais de uma ameaça, é um fork
                    if (ameacas > 1) {
                        return new int[]{i, j};
                    }
                }
            }
        }
        return null;
    }

    //getters e setters
    @Override
    public String getNome() {
        return this.nomeJogador;
    }

    public void setNome(String nome) {
        this.nomeJogador = nome;
    }

    @Override
    public String getSimboloJogador() {
        return this.simboloJogador;
    }

    @Override
    public void setSimboloJogador(String simbolo) {
        this.simboloJogador = simbolo;
    }

    @Override
    public String getSimboloAdversario() {
        return this.simboloAdversario;
    }

    @Override
    public void setSimboloAdversario(String simbolo) {
        this.simboloAdversario = simbolo;
    }
}