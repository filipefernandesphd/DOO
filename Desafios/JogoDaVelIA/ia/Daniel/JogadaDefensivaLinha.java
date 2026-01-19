package ia.Daniel;

public class JogadaDefensivaLinha implements EstrategiaJogada {

    @Override
    public boolean escolherJogada(String[][] board, String meuSimbolo, String simboloInimigo, int[][] posicao) {
        for (int i = 0; i < 3; i++) {
            int contSimbolo = 0;
            int colunaLivre = -1;

            for (int j = 0; j < 3; j++) {
                if (board[i][j].equals(simboloInimigo)) {
                    contSimbolo++;
                } else if (board[i][j].equals(" ")) {
                    colunaLivre = j;
                }
            }
            if (contSimbolo == 2 && colunaLivre != -1) {
                posicao[0][0] = i;
                posicao[0][1] = colunaLivre;
                
                return true;
            }
        }
        return false;
    }
}