package ui;

public class Board {
    private String[][] board = new String[3][3];

    public Board(){
        this._setboard();
    }

    // =======================================================
    // Métodos privados ======================================
    // =======================================================
    /*
    *   Inicia board do jogo com os espaços vazios 
    */
    private void _setboard(){
        for (int i = 0; i < this.board.length; i++) {
            for (int j = 0; j < this.board[i].length; j++) {
                this.board[i][j] = " ";
            }
        }
    }
    //=========================================================


    // =======================================================
    // Getters and Setters ===================================
    // =======================================================
    public void setBoard(String[][] board) {
        this.board = board;
    }

    public String[][] getBoard() {
        return board;
    }
    //=========================================================

    
    // =======================================================
    // Métodos públicos ======================================
    // =======================================================
    /*
    * Atualizar tabuleiro com a jogada passada
    * @param int[] coordenadas: linha e coluna da jogada
    * @param String simbolo: símbolo do jogador (X ou O)
    */
    public void update(int[] coordenadas, String simbolo){
        this.board[coordenadas[0]][coordenadas[1]] = simbolo;
    }

    /*
    * Mostra o board no terminal para o usuário
    */
    public void showBoard(){
        for (int i = 0; i < this.board.length; i++) { // linha
            // monstra o número da coluna
            if(i == 0){
                System.err.print(" ");
                for (int k = 0; k < this.board[i].length; k++) { // coluna
                    System.out.print("  "+k);
                }
                System.err.println();
            }

            // monsta o número da linha
            System.out.print(i+" "); 

            for (int j = 0; j < this.board[i].length; j++) { // coluna
                System.out.print(this.board[i][j]); // mostra o valor da célula

                // Mostra |
                if(j != this.board[j].length-1){
                    System.out.print(" | ");
                }
            }
            System.out.println(""); // pula linha

            // Mostra a divisão
            if(i != this.board[i].length-1) {
                System.out.print("  ---------");
            }

            System.out.println(""); // pula linha
        }
    }
}
