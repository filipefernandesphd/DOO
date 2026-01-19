package ia.Daniel;

public class JogadaVencedoraColuna implements EstrategiaJogada{
    @Override
    public boolean escolherJogada(String[][] board, String meuSimbolo, String simboloInimigo, int[][] posicao) {
        for (int j = 0; j < 3; j++) {
            int contSimbolo = 0;
            int linhaVazia = -1;

            for (int i = 0; i < 3; i++) {
                if (board[i][j].equals(meuSimbolo)) {
                    contSimbolo++;
                } else if (board[i][j].equals(" ")) {
                    linhaVazia = i;
                }
            }
            if (contSimbolo == 2 && linhaVazia != -1) {
                posicao[0][0] = linhaVazia;
                posicao[0][1] = j;
                
                return true;
            }
        }
        return false;
    }  
}