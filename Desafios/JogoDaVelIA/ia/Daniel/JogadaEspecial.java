package ia.Daniel;

public class JogadaEspecial implements EstrategiaJogada{
    private boolean linhaQuaseCompleta(String[][] board, String simbolo, int i) {
        int contagem=0, vazio=0;

        for(int j = 0; j < 3; j++) {
            if (board[i][j].equals(simbolo)) {
                contagem++;
            }else if(board[i][j].equals(" ")) {
                vazio++;
            }            
        }
        if (contagem == 2 && vazio == 1) {
            return true;            
        }
        return false;
    }

    private boolean colunaQuaseCompleta(String[][] board, String simbolo, int j) {
        int contagem = 0, vazio = 0;

        for(int i = 0; i < 3; i++) {
            if (board[i][j].equals(simbolo)) {
                contagem++;
            } else if (board[i][j].equals(" ")) {
                vazio++;
            }
        }
        if ( contagem == 2 && vazio == 1) {
            return true;            
        }
        return false;
    }

    private boolean diagonalPrincipalQuaseCompleta(String[][] board, String simbolo) {
        int contagem = 0, vazio = 0;

        for(int i = 0; i < 3; i++) {
            if(board[i][i].equals(simbolo)) {
                contagem++;
            }else if(board[i][i].equals(" ")) {
                vazio++;
            }
        }
        if(contagem == 2 && vazio == 1) {
            return true;
        }
        return false;
    }

    private boolean diagonalSecundariaQuaseCompleta(String[][] board, String simbolo) {
        int contagem = 0, vazio = 0;

        for(int i = 0; i < 3; i++) {
            if(board[i][2 - i].equals(simbolo)) {
                contagem++;
            }else if(board[i][2 - i].equals(" ")) {
                vazio++;
            }
        }
        if (contagem == 2 && vazio == 1) {
            return true;            
        }
        return false;
    }    
    
    private int oportunidade(String[][] board, String simbolo) {
        int total = 0;
        for(int i=0; i < 3; i++) {
            if(linhaQuaseCompleta(board, simbolo, i)){
                total++;
            }
        }
        for(int j = 0; j < 3; j++) {
            if(colunaQuaseCompleta(board, simbolo, j)){
                total++;
            }
        }

        if (diagonalPrincipalQuaseCompleta(board, simbolo)) {
            total++;
        }
        if (diagonalSecundariaQuaseCompleta(board, simbolo)) {
            total++;
        }
        return total;
    }
    
    @Override
    public boolean escolherJogada(String[][] board, String meuSimbolo, String simboloInimigo, int[][] posicao) {
        for(int linha = 0; linha < 3; linha++) {
            for(int coluna = 0; coluna < 3; coluna++) {
                if(!board[linha][coluna].equals(" ")) {
                    continue; // Se a posição está ocupada, pule.
                }
                board[linha][coluna] = meuSimbolo; //Simulação para testar oportunidade de 2 ou mais oportunidade.

                int oportunidades = oportunidade(board, meuSimbolo);
                board[linha][coluna] = " "; //Removo o símbolo de teste.

                if (oportunidades >= 2) {
                    posicao[0][0] = linha;
                    posicao[0][1] = coluna;
                    
                    return true;
                }
            }
        }
        return false;
    }    
}