package ia.Daniel;

public class JogadaVencedoraLinha implements EstrategiaJogada{
    @Override
    public boolean escolherJogada(String[][] tabuleiro, String meuSimbolo, String simboloInimigo, int[][] posicao) {
        for (int i = 0; i < 3; i++) {
            int contSimbolo = 0;
            int colunaLivre = -1;

            for (int j = 0; j < 3; j++) {
                if (tabuleiro[i][j].equals(meuSimbolo)) {
                    contSimbolo++;
                } else if (tabuleiro[i][j].equals(" ")) {
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