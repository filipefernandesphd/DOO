package ia.Itaney;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import ia.*;

public class IaNey implements Player {

    private String nome;
    private String simboloJogador;
    private String simboloAdversario;
    private int indexJogada = 0;
    private Random random = new Random();

    public IaNey(String nome) {
        this.nome = nome;
    }

    @Override
    public String getNome() {
        return nome;
    }

    @Override
    public String getSimboloJogador() {
        return simboloJogador;
    }

    @Override
    public void setSimboloJogador(String simbolo) {
        this.simboloJogador = simbolo;
    }

    @Override
    public String getSimboloAdversario() {
        return simboloAdversario;
    }

    @Override
    public void setSimboloAdversario(String simbolo) {
        this.simboloAdversario = simbolo;
    }

    @Override
    public int[] jogar(String[][] tabuleiro) {
        // Objetivo aqui e resetar o estado do meu objeto , caso ja coloquem ele em outra partida seguida
        //Isso e necessario para as mecanicas dele de inicializacao ocorrerem novamente
        if (isTabuleiroVazio(tabuleiro)) {
            indexJogada = 0;
        }
        indexJogada++;

      
        if (indexJogada == 1) {
            return jogadaInicio(tabuleiro);
        }

        return defesa(tabuleiro);
    }

    private int[] jogadaInicio(String[][] tabuleiro) {
        // Se for 'O', tenta domina o meio se estive vazio
         if (tabuleiro[1][1].equals(" ") && getSimboloJogador().equals(String.valueOf('O'))) {
            return new int[] { 1, 1 };
        }

        // tenta jogar nos cantos
        return cornerStrategy(tabuleiro);
    }

    private int[] defesa(String[][] tabuleiro) {
        List<int[]> vazias = getCasasVazias(tabuleiro);

       
        for (int[] m : vazias) {
            if (isWinningMove(tabuleiro, m[0], m[1], simboloAdversario)) {
                return m;
            }
        }


        return ataque(tabuleiro);
    }

    private int[] ataque(String[][] tabuleiro) {
        List<int[]> vazias = getCasasVazias(tabuleiro);

        for (int[] m : vazias) {
            if (isWinningMove(tabuleiro, m[0], m[1], simboloJogador)) {
                return m;
            }
        }

        
        return finalizacao(tabuleiro);
    }

    private int[] finalizacao(String[][] tabuleiro) {
        if (tabuleiro[1][1].equals(" ")) {
            return new int[] { 1, 1 };
        }
        return cornerStrategy(tabuleiro);
    }

    private boolean isWinningMove(String[][] tab, int l, int c, String symb) {
        // matrizes sao objetos passados com referencia, logo para fazer hipoteses de vitoria
        // devemos fazer um backup do valor
        String backup = tab[l][c];
        tab[l][c] = symb;

        boolean venceu = false;

        // linha
        if (tab[l][0].equals(symb) && tab[l][1].equals(symb) && tab[l][2].equals(symb))
            venceu = true;
        // coluna
        else if (tab[0][c].equals(symb) && tab[1][c].equals(symb) && tab[2][c].equals(symb))
            venceu = true;
        // diagonais
        else if (l == c && tab[0][0].equals(symb) && tab[1][1].equals(symb) && tab[2][2].equals(symb))
            venceu = true;
        //l + c == 2 é necessario pra já filtrar diretamente se na segunda diagonal ele tem chance de vencer
        else if (l + c == 2 && tab[0][2].equals(symb) && tab[1][1].equals(symb) && tab[2][0].equals(symb))
            venceu = true;

        tab[l][c] = backup; // retornando o valor original
        return venceu;
    }

    private int[] cornerStrategy(String[][] tab) {
        int[][] cantos = { { 0, 0 }, { 0, 2 }, { 2, 0 }, { 2, 2 } };
        List<int[]> disponiveis = new ArrayList<>();

        for (int[] canto : cantos) {
            if (tab[canto[0]][canto[1]].equals(" ")) {
                disponiveis.add(canto);
            }
        }

        if (!disponiveis.isEmpty()) {
            return disponiveis.get(random.nextInt(disponiveis.size()));
        }
        return chute(tab);
    }

    private int[] chute(String[][] tab) {
        List<int[]> vazias = getCasasVazias(tab);
        return vazias.get(random.nextInt(vazias.size()));
    }

    private List<int[]> getCasasVazias(String[][] tab) {
        List<int[]> movimentos = new ArrayList<>();
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (tab[i][j].equals(" "))
                    movimentos.add(new int[] { i, j });
            }
        }
        return movimentos;
    }

    private boolean isTabuleiroVazio(String[][] tab) {
        for (String[] linha : tab) {
            for (String celula : linha) {
                if (!celula.equals(" "))
                    return false;
            }
        }
        return true;
    }
}