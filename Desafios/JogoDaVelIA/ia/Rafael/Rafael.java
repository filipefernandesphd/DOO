package ia.Rafael;

import ia.*;

public class Rafael implements Player {
	
	int passo = 0;
    private String nome = "Rafael", simboloAdversario, simboloJogador;

    public Rafael(String nome){
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public String getSimboloJogador() {
        return simboloJogador;
    }

    public void setSimboloJogador(String simbolojogador) {
        this.simboloJogador = simbolojogador;
    }

    public String getSimboloAdversario() {
        return simboloAdversario;
    }

    public void setSimboloAdversario(String simboloadversario) {
        this.simboloAdversario = simboloadversario;
    }

    public int[] jogar(String[][] tabuleiro) {

        if (passo == 0) {
            passo++;
            return new int[]{1, 1};
        }

        if (passo == 1) {
            passo++;
            return new int[]{1, 0};
        }

        if (passo == 2) {
            passo++;
            return new int[]{1, 2};
        }

        int i = (int)(Math.random() * 3);
        int j = (int)(Math.random() * 3);
        
        return new int[]{i, j};
    }

}
