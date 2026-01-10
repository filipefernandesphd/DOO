package ia.Filipe;

import java.util.ArrayList;
import java.util.Map;
import java.util.concurrent.ThreadLocalRandom;
import java.util.function.Supplier;
import java.util.HashMap;
import java.util.List;

public class Player implements ia.Player {
    // Atributos ---------------
    private String nome;
    private String [][] tab;        // tabuleiro
    private String simboloadversario;
    private String simbolojogador;
    private final int[][] LINHAS = {
            {0,0}, {0,1}, {0,2},
            {1,0}, {1,1}, {1,2},
            {2,0}, {2,1}, {2,2}
    };
    private final int[][] COLUNAS = {
            {0,0}, {1,0}, {2,0},
            {0,1}, {1,1}, {2,1},
            {0,2}, {1,2}, {2,2}
    };

    // Pontuações para o jogador
    ArrayList<int[]> linhaspontuadasjogador= new ArrayList<>();         // Linhas que possuem pontuação, pois tem marcação do jogador
    ArrayList<int[]> colunaspontuadasjogador= new ArrayList<>();        // Colunas que possuem pontuação, pois tem marcação do jogador
    ArrayList<int[]> diagonaispontuadasjogador= new ArrayList<>();      // Diagonais que possuem pontuação, pois tem marcação do jogador

    // Pontuações para o adversário
    ArrayList<int[]> linhaspontuadasadversario = new ArrayList<>();     // Linhas que possuem pontuação, pois tem marcação do adversário
    ArrayList<int[]> colunaspontuadasadversario = new ArrayList<>();    // Colunas que possuem pontuação, pois tem marcação do adversário
    ArrayList<int[]> diagonaispontuadasadversario = new ArrayList<>();  // Diagonais que possuem pontuação, pois tem marcação do adversário
    // --------------------------

    // Getters and Setters ---------------
    // Nome
    public String getNome() {
        return this.nome;
    }
    public void setNome(String nome){
        this.nome = nome;
    }

    // Tabuleiro
    public String[][] getTabuleiro() {
        return this.tab;
    }
    public void setTabuleiro(String[][] tab){
        this.tab = tab;
    }

    // Símbolo Adversário
    public String getSimboloAdversario() {
        return this.simboloadversario;
    }
    public void setSimboloAdversario(String simboloadversario){
        this.simboloadversario = simboloadversario;
    }

    // Símbolo Jogador
    public String getSimboloJogador() {
        return this.simbolojogador;
    }
    public void setSimboloJogador(String simbolojogador){
        this.simbolojogador = simbolojogador;
    }
    // -----------------------------------

    // Construtores -----------------
    public Player(){}
    
    public Player(String nome) {
        this.nome = nome;
    }
    // ------------------------------

    // Métodos privados ------------------------------
    /*
    * Verifica as jogadas do tabuleiro e salva (pontuações), tanto do jogador quanto do adversário
    */
    private void verificarJogadasDoTabuleiro() {
        // MUITO IMPORTANTE: limpar para não acumular entre rodadas
        linhaspontuadasjogador.clear();
        colunaspontuadasjogador.clear();
        diagonaispontuadasjogador.clear();
        linhaspontuadasadversario.clear();
        colunaspontuadasadversario.clear();
        diagonaispontuadasadversario.clear();

        for (int i = 0; i < this.tab.length; i++) {
            for (int j = 0; j < this.tab[i].length; j++) {

                // ignora vazio
                if (this.tab[i][j].equals(" ")) continue;

                // ignora qualquer coisa que não seja jogador/adversário (segurança)
                if (!this.tab[i][j].equals(this.simbolojogador) && !this.tab[i][j].equals(this.simboloadversario)) continue;

                // agora sim: decide se é do adversário ou do próprio jogador
                boolean ehAdversario = this.tab[i][j].equals(this.simboloadversario);

                // LINHAS
                if (true) { // só para manter seu estilo; pode remover
                    for (int k = 0; k < this.LINHAS.length; k++) {
                        if (this.LINHAS[k][0] == i && this.LINHAS[k][1] == j) {
                            (ehAdversario ? linhaspontuadasadversario : linhaspontuadasjogador).add(new int[]{i, j});
                        }
                    }
                }

                // COLUNAS
                for (int k = 0; k < this.COLUNAS.length; k++) {
                    if (this.COLUNAS[k][0] == i && this.COLUNAS[k][1] == j) {
                        (ehAdversario ? colunaspontuadasadversario : colunaspontuadasjogador).add(new int[]{i, j});
                    }
                }

                // DIAGONAL PRINCIPAL
                if (i == j) {
                    (ehAdversario ? diagonaispontuadasadversario : diagonaispontuadasjogador).add(new int[]{i, j});
                }

                // DIAGONAL SECUNDÁRIA (forma correta e simples)
                if (i + j == 2) {
                    (ehAdversario ? diagonaispontuadasadversario : diagonaispontuadasjogador).add(new int[]{i, j});
                }
            }
        }
    }

    /*
    * Verifica se o tabuleiro está vazio
    */
    private boolean verificarTabuleiroVazio(){
        int rodadas = 0;

        for(int i=0; i<this.tab.length; i++){
            for(int j=0; j<this.tab[i].length; j++){
                if(this.tab[i][j].equals(" ")){
                    rodadas++;
                    // System.out.println(i+""+j+" vazio");
                }
            }
        }
        
        if(rodadas == 9){
            return true;
        }else{
            return false;
        }
    }

    /*
    * Define a terceira jogada na linha: bloquear ou vencer
    * @param linhaspontuadas é uma lista de coordenadas de jogadas realizadas pelo jogador (adversário ou o próprio jogador)
    */
    private int[] definirTerceiraJogadaLinha(ArrayList<int[]> linhaspontuadas){
        // Descobre qual é a linha mais frequente
        Map<Integer, Integer> contagem = new HashMap<>();

        for (int[] p : linhaspontuadas) {
            int linha = p[0];  // pega o linha do par
            contagem.put(linha, contagem.getOrDefault(linha, 0) + 1);
        }

        int linhaMaisFrequente = -1;
        int maiorFrequencia = 0;

        for (Map.Entry<Integer, Integer> entry : contagem.entrySet()) {
            int linha = entry.getKey();
            int freq = entry.getValue();

            if (freq > maiorFrequencia) {
                maiorFrequencia = freq;
                linhaMaisFrequente = linha;
            }
        }

        int coluna = -1;
        boolean zero = true;
        boolean um = true;
        boolean dois = true;

        // if(maiorFrequencia>=2){
        //     // loop linhas situação vitória
        //     for (int[] pos : linhaspontuadas) {
        //         if(pos[0] == linhaMaisFrequente){
        //             if(pos[1] == 0){
        //                 zero = false; 
        //             }else if(pos[1] == 1){
        //                 um = false;
        //             }else{
        //                 dois = false;
        //             }
        //         }
        //     }
        // }
        // return new int[]{linhaMaisFrequente,coluna};

        if (maiorFrequencia >= 2) {
            if (zero) coluna = 0;
            else if (um) coluna = 1;
            else if (dois) coluna = 2;
        }
        return (coluna != -1) ? new int[]{linhaMaisFrequente, coluna} : null;
    }
    
    /*
    * Define a terceira jogada na coluna: bloquear ou vencer
    * @param colunaspontuadas é uma lista de coordenadas de jogadas realizadas pelo jogador (adversário ou o próprio jogador)
    */
    private int[] definirTerceiraJogadaColuna(ArrayList<int[]> colunaspontuadas){
        Map<Integer, Integer> contagem = new HashMap<>();

        for (int[] p : colunaspontuadas) {
            int coluna = p[1];  // pega o Y

            contagem.put(coluna, contagem.getOrDefault(coluna, 0) + 1);
        }

        int colunaMaisFrequente = -1;
        int maiorFrequencia = 0;

        for (Map.Entry<Integer, Integer> entry : contagem.entrySet()) {
            int coluna = entry.getKey();
            int freq = entry.getValue();

            if (freq > maiorFrequencia) {
                maiorFrequencia = freq;
                colunaMaisFrequente = coluna;
            }
        }

        int linha = -1;
        boolean zero = true;
        boolean um = true;
        boolean dois = true;

        // if(maiorFrequencia >=2){
        //     // loop linhas situação vitória
        //     for (int[] pos : colunaspontuadas) {
        //         if(pos[1] == colunaMaisFrequente){
        //             if(pos[0] == 0){
        //                 zero = false; 
        //             }else if(pos[0] == 1){
        //                 um = false;
        //             }else{
        //                 dois = false;
        //             }
        //         }
        //     }
        // }
        // return new int[]{linha,colunaMaisFrequente};

        if (maiorFrequencia >= 2) {
            if (zero) linha = 0;
            else if (um) linha = 1;
            else if (dois) linha = 2;
        }
        return (linha != -1) ? new int[]{linha, colunaMaisFrequente} : null;
    }
    
    /*
    * Define a terceira jogada na diagonal: bloquear ou vencer
    * @param diagonaispontuadas é uma lista de coordenadas de jogadas realizadas pelo jogador (adversário ou o próprio jogador)
    */
    private int[] definirTerceiraJogadaDiagonal(ArrayList<int[]> diagonaispontuadas){
        int[] jogada = null;
        int countPrincipal = 0;
        int countSecundaria = 0;

        boolean[] principal = new boolean[3];
        boolean[] secundaria = new boolean[3];

        for (int[] p : diagonaispontuadas) {
            int i = p[0];
            int j = p[1];

            if (i == j) {
                if (i == 0) principal[0] = true;
                if (i == 1) principal[1] = true;
                if (i == 2) principal[2] = true;
                countPrincipal++;
            }

            if (i + j == 2) {
                if (i == 0 && j == 2) secundaria[0] = true;
                if (i == 1 && j == 1) secundaria[1] = true;
                if (i == 2 && j == 0) secundaria[2] = true;
                countSecundaria++;
            }
        }

        if (countPrincipal == 2) {
            if (!principal[0]) jogada = new int[]{0,0};
            if (!principal[1]) jogada = new int[]{1,1};
            if (!principal[2]) jogada = new int[]{2,2};
        }

        if (countSecundaria == 2) {
            if (!secundaria[0]) jogada = new int[]{0,2};
            if (!secundaria[1]) jogada = new int[]{1,1};
            if (!secundaria[2]) jogada = new int[]{2,0};
        }

        return jogada;
    }

    /*
    * Define a jogada em um dos cantos se o tabuleiro estiver vazio
    */
    private int[] jogarNoCantoQuandoTabVazio(){
        int cantos[][] = {{0,0}, {0,2}, {2,0}, {2,2}};
        int escolha = this.verificarTabuleiroVazio() ? (int)(Math.random() * 4) : 0;
        return new int[]{cantos[escolha][0],cantos[escolha][1]};
    }

    /*
    * Define a jogada no centro se o tabuleiro estiver vazio
    */
    private int[] jogarNoCentroQuandoTabVazio(){
        return this.verificarTabuleiroVazio() ? new int[]{1,1} : null;
    }


    /**
     * Escolhe uma jogada válida de forma aleatória entre as posições livres do tabuleiro.
     *
     * O método percorre o tabuleiro atual e coleta todas as posições que não estão
     * ocupadas nem pelo jogador nem pelo adversário. Em seguida, seleciona
     * aleatoriamente uma dessas posições e a retorna.
     *
     * @return um array {@code {i, j}} representando a posição escolhida aleatoriamente,
     *         ou {@code null} caso não exista nenhuma posição livre no tabuleiro
     */
    private int[] jogarAleatoriamente() {
        List<int[]> livres = new ArrayList<>();

        // Varre o tabuleiro e coleta posições livres
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                String v = this.tab[i][j];

                // Considera livre se não for nem do jogador nem do adversário
                if (this.tab[i][j].equals(" ")) {
                    livres.add(new int[]{i, j});
                }
            }
        }

        // Se não há casas livres, não há jogada possível
        if (livres.isEmpty()) {
            return null; // ou lance exceção, ou trate fora
        }

        // Escolhe uma posição aleatória dentre as livres
        int idx = ThreadLocalRandom.current().nextInt(livres.size());
        return livres.get(idx);
    }

    private boolean estaLivre(int[] jogada) {
        return jogada != null && this.tab[jogada[0]][jogada[1]].equals(" ");
    }
    // -----------------------------------------------

    // Métodos públicos ------------------------------
    /*
    * Realiza a jogada no tabuleiro (board) na posição indicada
    * @param board Objeto tabuleiro
    * @return retorna a coordenada da jogada. Ex: {i,j}, sendo i linha e j coluna
    */
    public int[] jogar(String[][] tabuleiro) {
        this.tab = tabuleiro;
        int[] jogada = null;

        // Caso o tabuleiro esteja vazio
        // Escolhe aleatoriamente entre jogar no canto ou no centro
        if(this.verificarTabuleiroVazio()){
            int v = (int) (Math.random() * 2);
            jogada = (v==0) ? this.jogarNoCantoQuandoTabVazio() : this.jogarNoCentroQuandoTabVazio();
        }else{ // Definir o restante da estratégia aqui
            
            // Verifica as jogadas no tabuleiro a partir da 3ª jogada
            this.verificarJogadasDoTabuleiro();

            int[] sugestao;

            sugestao = (this.linhaspontuadasjogador.size() >= 2)
                    ? this.definirTerceiraJogadaLinha(this.linhaspontuadasjogador)
                    : this.definirTerceiraJogadaLinha(this.linhaspontuadasadversario);
            if (sugestao != null) jogada = sugestao;

            sugestao = (this.colunaspontuadasjogador.size() >= 2)
                    ? this.definirTerceiraJogadaColuna(this.colunaspontuadasjogador)
                    : this.definirTerceiraJogadaColuna(this.colunaspontuadasadversario);
            if (sugestao != null) jogada = sugestao;

            sugestao = (this.diagonaispontuadasjogador.size() >= 2)
                    ? this.definirTerceiraJogadaDiagonal(this.diagonaispontuadasjogador)
                    : this.definirTerceiraJogadaDiagonal(this.diagonaispontuadasadversario);
            if (sugestao != null) jogada = sugestao;
        }

        if (!estaLivre(jogada)) {
            jogada = jogarAleatoriamente(); // deve retornar só posições " "
        }

        return jogada;
    }

    // -----------------------------------------------


}
