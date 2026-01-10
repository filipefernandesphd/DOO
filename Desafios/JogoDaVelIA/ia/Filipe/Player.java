package ia.Filipe;

import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;

public class Player implements ia.Player {
    private String nome;

    public Player(){}
    
    public Player(String nome) {
        this.nome = nome;
    }

    // =======================================================
    // Getters and Setters ===================================
    // =======================================================
    public String getNome() {
        return this.nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
    //=========================================================

    /*
    * Realiza a jogada no tabuleiro (board) na posição indicada
    * @param posicao A posição linha x coluna no tabuleiro
    */
    @Override
    public void jogar(int[][] posicao) {
        // Implementação da jogada do jogador Filipe
        System.out.println("Jogador Filipe jogou na posição: " + posicao[0][0] + ", " + posicao[0][1]);
    }

    //=====================================================
    // MÉTODOS CRIADOS PARA TESTE
    //=====================================================


    // Descrição do algoritmo
    // Situações para vitória:
    // Todas as linhas marcadas {[0,0],[0,1],[0,2]} , {[1,0],[1,1],[1,2]} , {[2,0],[2,1],[2,2]}
    // Todas as colunas marcadas {[0,0],[1,0],[2,0]} , {[0,1],[1,1],[2,1]} , {[0,2],[1,2],[2,2]}
    // Diagonais marcadas {[0,0],[1,1],[2,2]} , {[0,2],[1,1],[2,0]}
    

    // Ler o tabuleiro
    // Se estiver vazio, jogar em um dos cantos
    
    // Ler o tabuleiro
    // Analisar jogada do adversário
    // Atribuir uma pontuação para cada posição jogada em direção a vitória
    // Caso haja uma jogada com pontuação máxima, bloquear a jogada do adversário
    // Caso NÃO haja jogada com pontuação máxima, fazer jogada que maximize a pontuação ...


    public void testaInteligencia(String [][] tab, String simbolojogador, String simboloadversario){
        // Lógica para testar a inteligência do jogador Filipe
        System.out.println("Testando a inteligência do jogador Filipe...");

        // Situações para vitória:
        // Linhas
        int[][] linhas = {
            {0,0}, {0,1}, {0,2},
            {1,0}, {1,1}, {1,2},
            {2,0}, {2,1}, {2,2}
        };

        // Colunas
        int[][] colunas = {
            {0,0}, {1,0}, {2,0},
            {0,1}, {1,1}, {2,1},
            {0,2}, {1,2}, {2,2}
        };

        // Diagonais
        int[][] diagonais = {
            {0,0}, {1,1}, {2,2},
            {0,2}, {1,1}, {2,0}
        };

        // Linhas que possuem pontuação, pois tem marcação do adversário
        ArrayList<int[]> linhaspontuadas = new ArrayList<>();

        // Linhas que possuem pontuação, pois tem marcação do adversário
        ArrayList<int[]> colunaspontuadas = new ArrayList<>();

        // Linhas que possuem pontuação, pois tem marcação do adversário
        ArrayList<int[]> diagonaispontuadas = new ArrayList<>();

        // Ler o tabuleiro
        // Analisar jogada do adversário
        // Atribuir uma pontuação para cada posição jogada em direção a vitória
        for(int i=0; i < tab.length; i++){              // loop linhas tabuleiro
            for(int j=0; j < tab.length; j++){          // loop colunas tabuleiro
                
                // loop linhas situação vitória
                for(int k=0; k < linhas.length; k++){   
                    if(linhas[k][0] == i && linhas[k][1] == j && tab[i][j].equals(simboloadversario)){
                        // incrementar pontuação
                        linhaspontuadas.add(new int[]{i,j});
                    }
                }

                // loop colunas situação vitória
                for(int k=0; k < colunas.length; k++){   
                    if(colunas[k][0] == i && colunas[k][1] == j && tab[i][j].equals(simboloadversario)){
                        // incrementar pontuação
                        colunaspontuadas.add(new int[]{i,j});
                    }
                }

                if(tab[i][j].equals(simboloadversario)){
                    // diagonal primária
                    if(i==j){
                        diagonaispontuadas.add(new int[]{i,j});
                    }

                    // diagonal secundária
                    if(i==0 && j==2){
                        diagonaispontuadas.add(new int[]{i,j});
                    }

                    if(i==2 && j==0){
                        diagonaispontuadas.add(new int[]{i,j});
                    }
                }
            }
        }           

        // Mostrando as pontuações
        System.out.println("Linhas pontuadas: ");
        for(int[] pos : linhaspontuadas){
            System.out.println("Posição: " + pos[0] + ", " + pos[1]);
        }
        
        System.out.println();
        System.out.println("Colunas pontuadas: ");
        for(int[] pos : colunaspontuadas){
            System.out.println("Posição: " + pos[0] + ", " + pos[1]);
        }
        
        System.out.println();
        System.out.println("Diagonais pontuadas: ");
        for(int[] pos : diagonaispontuadas){
            System.out.println("Posição: " + pos[0] + ", " + pos[1]);
        }
        System.out.println();

        // Fazendo a jogada
        // Por linha
        if(linhaspontuadas.size() >= 2 ){
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

            // System.out.println("X que mais se repete: " + linhaMaisFrequente);
            // System.out.println("Quantidade: " + maiorFrequencia);

            // Bloquear adversário
            if(maiorFrequencia>=2){
                int coluna = -1;
                boolean zero = true;
                boolean um = true;
                boolean dois = true;
                // loop linhas situação vitória
                for (int[] pos : linhaspontuadas) {
                    if(pos[0] == linhaMaisFrequente){
                        // System.out.print(pos[0]);
                        // System.out.println(pos[1]);

                        if(pos[1] == 0){
                            zero = false; 
                        }else if(pos[1] == 1){
                            um = false;
                        }else{
                            dois = false;
                        }
                    }
                }

                if(zero) { coluna=0; } else if (um) { coluna=1; } else { coluna=2; }
                System.out.println("Jogada para bloquear: " +linhaMaisFrequente +""+coluna);
                tab[linhaMaisFrequente][coluna] = simbolojogador;
                this.showBoard(tab);
            }
        }else{
            System.out.println("Fazer minha jogada");
        }

        // Por coluna
        if(colunaspontuadas.size() >= 2){
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

            // System.out.println("Y que mais se repete: " + colunaMaisFrequente);
            // System.out.println("Quantidade: " + maiorFrequencia);

            if(maiorFrequencia >=2){
                System.out.println("Bloquear jogada");

                int linha = -1;
                boolean zero = true;
                boolean um = true;
                boolean dois = true;
                // loop linhas situação vitória
                for (int[] pos : colunaspontuadas) {
                    if(pos[1] == colunaMaisFrequente){
                        // System.out.print(pos[0]);
                        // System.out.println(pos[1]);

                        if(pos[0] == 0){
                            zero = false; 
                        }else if(pos[0] == 1){
                            um = false;
                        }else{
                            dois = false;
                        }
                    }
                }

                if(zero) { linha=0; } else if (um) { linha=1; } else { linha=2; }
                System.out.println("Jogada para bloquear: " + linha +""+colunaMaisFrequente);
                tab[linha][colunaMaisFrequente] = simbolojogador;
                this.showBoard(tab);
            }
        }else{
            System.out.println("Fazer minha jogada");
        }
        
        // Por Diagonal
        int[] jogadaBloqueio = null;
        if (diagonaispontuadas.size() >= 2) {

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
                if (!principal[0]) jogadaBloqueio = new int[]{0,0};
                if (!principal[1]) jogadaBloqueio = new int[]{1,1};
                if (!principal[2]) jogadaBloqueio = new int[]{2,2};
            }

            if (countSecundaria == 2) {
                if (!secundaria[0]) jogadaBloqueio = new int[]{0,2};
                if (!secundaria[1]) jogadaBloqueio = new int[]{1,1};
                if (!secundaria[2]) jogadaBloqueio = new int[]{2,0};
            }

            System.out.println("Jogada para bloquear: " + jogadaBloqueio[0] +""+jogadaBloqueio[1]);
            tab[jogadaBloqueio[0]][jogadaBloqueio[1]] = simbolojogador;
            this.showBoard(tab);

        }else{
            System.out.println("Fazer minha jogada");
        }

}


    // // Quando o tabuleiro está vazio,
    // // joga em um dos cantos
    // public void testaJogadaNosCantos(){
    //     // Lógica para testar a inteligência do jogador Filipe
    //     System.out.println("Testando a inteligência do jogador Filipe...");
        
    //     // Se o tabuleiro estiver vazio, joga em um dos cantos
    //     String simbolo = "X";
    //     String [][] tab = {
    //         {"", "", ""},
    //         {"", "", ""},
    //         {"", "", ""}
    //     };

    //     int cantos[][] = {{0,0}, {0,2}, {2,0}, {2,2}};
    //     int rodadas = 0;
    //     for(int i=0; i<3; i++){
    //         for(int j=0; j<3; j++){
    //             if(tab[i][j].equals("")){
    //                 rodadas++;
    //             }
    //         }
    //     }

    //     if(rodadas == 9){
    //         int escolha = (int)(Math.random() * 4);
    //         System.out.println("Jogador Filipe escolheu a posição: " + cantos[escolha][0] + ", " + cantos[escolha][1]);

    //         tab[cantos[escolha][0]][cantos[escolha][1]] = simbolo;
    //     } 

    //     this.showBoard(tab);
    // }

    // // Quando o tabuleiro está vazio,
    // // joga no centro
    // public void testaJogadaNoCentro(){
    //     // Lógica para testar a inteligência do jogador Filipe
    //     System.out.println("Testando a inteligência do jogador Filipe...");
        
    //     // Se o tabuleiro estiver vazio, joga no Centro
    //     String simbolo = "X";
    //     String [][] tab = {
    //         {"", "", ""},
    //         {"", "", ""},
    //         {"", "", ""}
    //     };   

    //     int rodadas = 0;
    //     for(int i=0; i<3; i++){
    //         for(int j=0; j<3; j++){
    //             if(tab[i][j].equals("")){
    //                 rodadas++;
    //             }
    //         }
    //     }

    //     if(rodadas == 9){
    //         int escolha = (int)(Math.random() * 4);
    //         System.out.println("Jogador Filipe escolheu a posição: 1,1" );

    //         tab[1][1] = simbolo;
    //     }

    //     this.showBoard(tab);
    // }

    // // Quando o tabuleiro já possui jogadas...
    // // Analisará se tem alguma jogada nos cantos
    // public void testaJogadaConsiderandoUmaNoCanto(){
    //     // Lógica para testar a inteligência do jogador Filipe
    //     System.out.println("Testando a inteligência do jogador Filipe...");
        
    //     String simbolo = "X";
    //     String [][] tab = {
    //         {"", "", ""},
    //         {"", "", ""},
    //         {"", "", "X"}
    //     };

    //     int rodadas = 0;
    //     if(tab[0][0].equals(simbolo)){
    //         rodadas++;
    //     }else if(tab[0][2].equals(simbolo)){
    //         rodadas++;
    //     }else if(tab[2][0].equals(simbolo)){
    //         rodadas++;
    //     }else if(tab[2][2].equals(simbolo)){
    //         rodadas++; 
    //     }

    //     // se houver UMA jogada no canto
    //     // nenhuma no centro
    //     // jogar em outro canto
    //     if(rodadas == 1 && tab[1][1] == ""){
    //         int cantos[][] = {{0,0}, {0,2}, {2,0}, {2,2}};
    //         int escolha = (int)(Math.random() * 4);
            
    //         // verifica se o canto escolhido já está ocupado
    //         while(!tab[cantos[escolha][0]][cantos[escolha][1]].equals("")){
    //             escolha = (int)(Math.random() * 4); 
    //         }

    //         System.out.println("Jogador Filipe escolheu a posição: " + cantos[escolha][0] + ", " + cantos[escolha][1]);
    //         tab[cantos[escolha][0]][cantos[escolha][1]] = simbolo;
    //     }

    //     this.showBoard(tab);
    // } 

    // // Quando o tabuleiro já possui jogadas...
    // // Analisará se tem alguma jogada nos cantos
    // public void testaJogadaConsiderandoDuasNoCantoEcentroVazio(){
    //     // Lógica para testar a inteligência do jogador Filipe
    //     System.out.println("Testando a inteligência do jogador Filipe...");
        
    //     String simbolo = "X";
    //     String [][] tab = {
    //         {"", "", "X"},
    //         {"", "", ""},
    //         {"X", "", ""}
    //     };    

    //     // Se houver DUAS jogadas no canto [0,0] e [2,2] OU [0,2] e [2,0]
    //     // nenhuma no centro
    //     // jogar no centro
    //     if(tab[0][0].equals(simbolo) && tab[2][2].equals(simbolo) && tab[1][1] == ""){
    //         System.out.println("Jogador Filipe escolheu a posição: 1,1");
    //         tab[1][1] = simbolo;
    //     } else if(tab[0][2].equals(simbolo) && tab[2][0].equals(simbolo) && tab[1][1] == ""){
    //         System.out.println("Jogador Filipe escolheu a posição: 1,1");
    //         tab[1][1] = simbolo;
    //     }

    //     this.showBoard(tab);

    // }

    // // Quando o tabuleiro já possui jogadas...
    // // Analisará se tem alguma jogada nos cantos
    // public void testaJogadaConsiderandoDuasNoCantoEcentroOcupado(){
    //     // Lógica para testar a inteligência do jogador Filipe
    //     System.out.println("Testando a inteligência do jogador Filipe...");
        
    //     String simbolo = "X";
    //     String [][] tab = {
    //         {"", "", "X"},
    //         {"O", "O", ""},
    //         {"X", "", ""}
    //     }; 

        

    // }



    private void showBoard(String[][] board){
        for (int i = 0; i < board.length; i++) { // linha
            // monstra o número da coluna
            if(i == 0){
                System.err.print(" ");
                for (int k = 0; k < board[i].length; k++) { // coluna
                    System.out.print("  "+k);
                }
                System.err.println();
            }

            // monsta o número da linha
            System.out.print(i+" "); 

            for (int j = 0; j < board[i].length; j++) { // coluna
                System.out.print(board[i][j]); // mostra o valor da célula

                // Mostra |
                if(j != board[j].length-1){
                    System.out.print(" | ");
                }
            }
            System.out.println(""); // pula linha

            // Mostra a divisão
            if(i != board[i].length-1) {
                System.out.print("  ---------");
            }

            System.out.println(""); // pula linha
        }
    }
    
}
