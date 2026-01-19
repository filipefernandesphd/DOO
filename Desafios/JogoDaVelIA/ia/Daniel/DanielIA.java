package ia.Daniel;

import ia.Player;

public class DanielIA implements Player {
    private String nome;
    private String meuSimbolo;
    private String simboloInimigo;

    public DanielIA(String nome) {
        this.nome = nome;
    }

    @Override
    public String getNome() {
        return nome;
    }

    @Override
    public String getSimboloJogador() {
        return meuSimbolo;
    }
    @Override
    public void setSimboloJogador(String simbolojogador) {
        this.meuSimbolo = simbolojogador;
    }

    @Override
    public String getSimboloAdversario() {
        return simboloInimigo;
    }
    @Override
    public void setSimboloAdversario(String simboloadversario) {
        this.simboloInimigo = simboloadversario;
    }

    private final EstrategiaJogada[] estrategiaJogada = {
        new JogadaVencedoraLinha(),
        new JogadaVencedoraColuna(),
        new JogadaVencedoraDiagonalPrimaria(),
        new JogadaVencedoraDiagonalSecundaria(),
        
        new JogadaEspecial(),        
        
        new JogadaDefensivaLinha(),
        new JogadaDefensivaColuna(),
        new JogadaDefensivaDiagonalPrimaria(),
        new JogadaDefensivaDiagonalSecundaria(),
        
        new JogadaAleatoria()
    };

    public int[] chutometro(String[][] tabuleiro) {
        int[][] posicao = new int[1][2];

        //Tentar jogar no centro inicialmente.
        if(tabuleiro[1][1].equals(" ")){
            posicao[0][0] = 1;
            posicao[0][1] = 1;

            int linha = posicao[0][0];
            int coluna = posicao[0][1];

            return new int[] { linha, coluna };
        }
        
        for (EstrategiaJogada estrategias : estrategiaJogada) {
            if (estrategias.escolherJogada(tabuleiro, meuSimbolo, simboloInimigo, posicao)) {
                int linha = posicao[0][0];
                int coluna = posicao[0][1];

                return new int[] { linha, coluna };
            }
        }
        return chute(tabuleiro);
    }

    public int[] chute(String[][] tabuleiro) {

        for (int i = 0; i < tabuleiro.length; i++) {
            for (int j = 0; j < tabuleiro[i].length; j++) {
                if ((tabuleiro[i][j].equals(" "))) {
                    return new int[] { i, j };
                }
            }
        }
        // arranjar um jeito de nao retornar null
        return null;
    }

    @Override
    public int[] jogar(String[][] tabuleiro) {
        return chutometro(tabuleiro);
    }
}