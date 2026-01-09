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

                // loop diagonais situação vitória
                for(int k=0; k < diagonais.length; k++){   
                    if(diagonais[k][0] == i && diagonais[k][1] == j && tab[i][j].equals(simboloadversario)){
                        // incrementar pontuação
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
        // Prioridade 1: bloquear vitória do adversário
        if(linhaspontuadas.size() == 2 ){

            // Descobre qual é a linha mais frequente
            Map<Integer, Integer> contagem = new HashMap<>();

            for (int[] p : linhaspontuadas) {
                int x = p[0];  // pega o X do par
                contagem.put(x, contagem.getOrDefault(x, 0) + 1);
            }

            int linhaMaisFrequente = -1;
            int maiorFrequencia = 0;

            for (Map.Entry<Integer, Integer> entry : contagem.entrySet()) {
                int x = entry.getKey();
                int freq = entry.getValue();

                if (freq > maiorFrequencia) {
                    maiorFrequencia = freq;
                    linhaMaisFrequente = x;
                }
            }

            // System.out.println("X que mais se repete: " + linhaMaisFrequente);
            // System.out.println("Quantidade: " + maiorFrequencia);

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

        // Prioridade 2: fazer jogada estratégica para vitória  
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
