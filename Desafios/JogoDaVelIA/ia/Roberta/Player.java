package ia.Roberta;



public class Player implements ia.Player {
    String nome;
    String simboloJogador;
    String simboloAdversario;

    public Player(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public String getSimboloJogador() {
        return simboloJogador;
    }

    public void setSimboloJogador(String simbolojogador) {
        this.simboloJogador = simbolojogador;
    }

    public String getSimboloAdversario() {
        return simboloAdversario;
    }

    public void setSimboloAdversario(String simboloadversario) {
        this.simboloAdversario = simboloadversario;
    }

    public int[] jogar(String[][] tabuleiro) {
        // Verifica o tabuleiro e vê se pode vencer o jogo
        int[] jogada = verificarSePodeVencer(tabuleiro, simboloJogador);
        if (jogada != null)
            return jogada;
        // Verifica o tabuleiro, e bloqueia as chances de vitória do adversário
        jogada = verificarSePodeVencer(tabuleiro, simboloAdversario);
        if (jogada != null)
            return jogada;
        // Ocupa o centro do tabuleiro se estiver livre, pois no centro há mais possibilidades de vitória
        if (tabuleiro[1][1].equals(" "))
            return new int[] { 1, 1 };
        // Verifica os cantos (AS PONTAS DO TABULEIRO)
        int[][] cantos = { { 0, 0 }, { 0, 2 }, { 2, 0 }, { 2, 2 } };
        for (int[] c : cantos)
            if (tabuleiro[c[0]][c[1]].equals(" "))
                return c;
        // Verifica as laterais (A 'CÉLULA' QUE FICA ENTRE AS PONTAS)
        int[][] laterais = { { 0, 1 }, { 1, 0 }, { 1, 2 }, { 2, 1 } };
        for (int[] l : laterais)
            if (tabuleiro[l[0]][l[1]].equals(" "))
                return l;
        return new int[] { 0, 0 };
    }

    	

    private int[] verificarSePodeVencer(String[][] tabuleiro, String simbolo) {

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {

                if (tabuleiro[i][j].equals(" ")) {
                    tabuleiro[i][j] = simbolo;

                    boolean venceu = verificarVitoria(tabuleiro, simbolo);

                    tabuleiro[i][j] = " ";

                    if (venceu)
                        return new int[]{i, j};
                }
            }
        }
        return null;
    }

    //Verifica se houve alguma vitória
    private boolean verificarVitoria(String[][] tabuleiro, String simbolo) {
        return (verificarLinhas(tabuleiro, simbolo)
            || verificarColunas(tabuleiro, simbolo)
            || verificarDiagonais(tabuleiro, simbolo));
    }

    // Verifica as linhas
    private boolean verificarLinhas(String[][] t, String s) {
        for (int i = 0; i < 3; i++) {
            if (t[i][0].equals(s) &&
                t[i][1].equals(s) &&
                t[i][2].equals(s)) {
                return true;
            }
        }
        return false;
    }

    //Verifica as colunas
    private boolean verificarColunas(String[][] t, String s) {
        for (int j = 0; j < 3; j++) {
            if (t[0][j].equals(s) &&
                t[1][j].equals(s) &&
                t[2][j].equals(s)) {
                return true;
            }
        }
        return false;
    }

    // Verifica as diagonais
     
    boolean verificarDiagonais(String[][] t, String s) {

        // Diagonal Esquerda para a Direita
        if (t[0][0].equals(s) &&
            t[1][1].equals(s) &&
            t[2][2].equals(s)) {
            return true;
        }

        // Diagonal Direita para a Esquerda
        if (t[0][2].equals(s) &&
            t[1][1].equals(s) &&
            t[2][0].equals(s)) {
            return true;
        }

        return false;
    }
}