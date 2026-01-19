package ia.Daniel;
import java.util.Random;

public class JogadaAleatoria implements EstrategiaJogada {
    private static final Random random = new Random();

    @Override
    public boolean escolherJogada(String[][] tabuleiro, String meuSimbolo, String simboloInimigo, int[][] posicao) {
        int linha = random.nextInt(3);
        int coluna = random.nextInt(3);

        if ((!tabuleiro[linha][coluna].equals(meuSimbolo)) && (!tabuleiro[linha][coluna].equals(simboloInimigo))) {            
            posicao[0][0] = linha;
            posicao[0][1] = coluna;
            return true;
        }
        return false;
    }
}