package ia.LucasGomes;

public class Player implements ia.Player {

    private String nome = "Lucas Gomes Não";
    private String SimboloJogador;
    private String SimboloAdversario;

    public Player(String nome){
        this.nome = nome;
    }

    private boolean ComecouComigo(String[][] tabuleiro) {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (!" ".equals(tabuleiro[i][j])) {
                    return false;
                }
            }
        }
        return true;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSimboloJogador() {
        return SimboloJogador;
    }

    public void setSimboloJogador(String SimboloJogador) {
        this.SimboloJogador = SimboloJogador;
    }

    public String getSimboloAdversario() {
        return SimboloAdversario;
    }

    public void setSimboloAdversario(String SimboloAdversario) {
        this.SimboloAdversario = SimboloAdversario;
    }

    private int[] jogadaUm(String[][] tabuleiro) {
        if (" ".equals(tabuleiro[0][2])) {
            return new int[]{0, 2};

        }
        if (SimboloAdversario.equals(tabuleiro[1][2])
                && " ".equals(tabuleiro[0][0])) {
            return new int[]{0, 0};

        }
        if (SimboloAdversario.equals(tabuleiro[0][1])
                && " ".equals(tabuleiro[2][0])) {
            return new int[]{2, 0};

        } 
        if (SimboloAdversario.equals(tabuleiro[1][1])
                && " ".equals(tabuleiro[2][0])) {
            return new int[]{2, 0};

        }
        if (SimboloAdversario.equals(tabuleiro[2][1])
                && " ".equals(tabuleiro[1][1])) {
            return new int[]{1, 1};
        }
        if (SimboloAdversario.equals(tabuleiro[0][0])
                && " ".equals(tabuleiro[2][0])) {
            return new int[]{2, 0};

        } else if (SimboloAdversario.equals(tabuleiro[2][2])
                && " ".equals(tabuleiro[0][0])) {
            return new int[]{0, 0};

        }
        if (SimboloAdversario.equals(tabuleiro[1][0])
                && " ".equals(tabuleiro[1][1])) {
            return new int[]{1, 1};

        }
        if (SimboloAdversario.equals(tabuleiro[2][0])
                && " ".equals(tabuleiro[0][0])) {
            return new int[]{0, 0};
        }else {
            for (int i = 0; i < 3; i++) {
                for (int j = 0; j < 3; j++) {
                    if (" ".equals(tabuleiro[i][j])) {
                        return new int[]{i, j};
                    }
                }
            }

        }

//-----------------------------------------------------
//-----------------------------------------------------------
        return null;
    }

    private int[] jogadaDois(String[][] tabuleiro) {
        if (SimboloAdversario.equals(tabuleiro[0][2])
                && " ".equals(tabuleiro[2][0])) {
            return new int[]{2, 0};
        }
        if (SimboloAdversario.equals(tabuleiro[0][0])
                && " ".equals(tabuleiro[0][1])) {
            return new int[]{0, 1};
        }
        if (SimboloAdversario.equals(tabuleiro[2][1]) 
        && " ".equals(tabuleiro[0][1])) {
            return new int[]{0, 1};
        }
        if (SimboloAdversario.equals(tabuleiro[2][0])
                && " ".equals(tabuleiro[0][2])) {
            return new int[]{0, 2};
        }
        if (SimboloAdversario.equals(tabuleiro[1][2])
                && " ".equals(tabuleiro[1][0])) {
            return new int[]{1, 0};
        }
        if (SimboloAdversario.equals(tabuleiro[0][1])
                && " ".equals(tabuleiro[2][1])) {
            return new int[]{2, 1};
        }
        if (SimboloAdversario.equals(tabuleiro[1][0])
                && " ".equals(tabuleiro[1][2])) {
            return new int[]{1, 2};
        }
        if (SimboloAdversario.equals(tabuleiro[1][1])
                && " ".equals(tabuleiro[2][2])) {
            return new int[]{2, 2};
        }
        if (SimboloAdversario.equals(tabuleiro[2][2])
                && " ".equals(tabuleiro[1][2])) {
            return new int[]{1, 2};
        } else {
            for (int i = 0; i < 3; i++) {
                for (int j = 0; j < 3; j++) {
                    if (" ".equals(tabuleiro[i][j])) {
                        return new int[]{i, j};
                    }
                }
            }
        }
        return null;
    }

    public int[] jogar(String[][] tabuleiro) {

        if (ComecouComigo(tabuleiro)) {
            return jogadaUm(tabuleiro);
        } else {
            return jogadaDois(tabuleiro);
        }
    }
}
