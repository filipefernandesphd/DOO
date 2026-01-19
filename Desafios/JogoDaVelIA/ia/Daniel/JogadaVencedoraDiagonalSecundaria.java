package ia.Daniel;

public class JogadaVencedoraDiagonalSecundaria implements EstrategiaJogada{
    @Override
    public boolean escolherJogada(String[][] board, String meuSimbolo, String simboloInimigo, int[][] posicao) {
        int[][] diagonalPrincipal = {
            { 0, 2 }, 
            { 1, 1 }, 
            { 2, 0 }
        };

        int contSimbolo = 0;
        int linhaVazia = -1;
        int colunaVazia = -1;

        for (int i = 0; i < diagonalPrincipal.length; i++) {
                int linha = diagonalPrincipal[i][0];
                int coluna = diagonalPrincipal[i][1];
                
                if (board[linha][coluna].equals(meuSimbolo)) {
                    contSimbolo++;
                } else if (board[linha][coluna].equals(" ")) {
                    linhaVazia = linha;
                    colunaVazia = coluna;
                }
            }
            if (contSimbolo == 2 && colunaVazia != -1) {
                posicao[0][0] = linhaVazia;
                posicao[0][1] = colunaVazia;
                
                return true;
            }
        return false;
    }    
}