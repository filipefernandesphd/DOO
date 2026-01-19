package ia.Sparta;

public class Player implements ia.Player {

    private final String nome;
    private String simboloJogador;
    private String simboloAdversario;

    public Player(String nome) {
        this.nome = nome;
        //nome ou atenas ou Sparta

        //essa classe chama oplayer, não apagar
    }

    //@override Getters 'n Setters
    @Override
    public String getNome() {
        return this.nome;
}

    @Override
    public String getSimboloJogador() {
        return this.simboloJogador;
    }

    @Override
    public void setSimboloJogador(String simbolojogador) {
        this.simboloJogador = simbolojogador;
    }

    @Override
    public String getSimboloAdversario() {
        return this.simboloAdversario;
    }

    @Override
    public void setSimboloAdversario(String simboloadversario) {
        this.simboloAdversario = simboloadversario;
    }



    //aqui é onde os métodos são usados
    @Override
    public int[] jogar(String[][] tabuleiro) {

    // procura vitória
    int[] vitoria = jogadaImportante(tabuleiro, this.simboloJogador);
    if (vitoria != null) {
        return vitoria;
    }

    // procura derrota
    int[] bloqueio = jogadaImportante(tabuleiro, this.simboloAdversario);
    if (bloqueio != null) {
        return bloqueio;
    }

    // derrota derrota e/ou fork
for (int i = 0; i < 3; i++) {
    for (int j = 0; j < 3; j++) {
        if (estaVazio(tabuleiro[i][j])) {
            if (criaFork(tabuleiro, i, j, this.simboloAdversario)) {
                return new int[]{i, j};
            }
        }
    }
}


    // Procura o meio
    if (estaVazio(tabuleiro[1][1])) {
        return new int[]{1, 1};
    }

    // procura as pontas
    int[][] cantos = {
        {0, 0}, {0, 2},
        {2, 0}, {2, 2}
    };

    for (int[] c : cantos) {
        if (estaVazio(tabuleiro[c[0]][c[1]])) {
            return c;
        }
    }

    // procura as bordas
    for (int i = 0; i < 3; i++) {
        for (int j = 0; j < 3; j++) {
            if (estaVazio(tabuleiro[i][j])) {
                return new int[]{i, j};
            }
        }
    }

    return new int[]{0, 0};
}



    private int[] jogadaImportante(String[][] tabuleiro, String simbolo) {

    // linhas
    for (int i = 0; i < 3; i++) {
        int[] pos = verificarTripla(
                tabuleiro[i][0], tabuleiro[i][1], tabuleiro[i][2],
                i, 0, i, 1, i, 2,
                simbolo
        );
        if (pos != null) return pos;
    }

    // colunas
    for (int j = 0; j < 3; j++) {
        int[] pos = verificarTripla(
                tabuleiro[0][j], tabuleiro[1][j], tabuleiro[2][j],
                0, j, 1, j, 2, j,
                simbolo
        );
        if (pos != null) return pos;
    }

    // diagonal principal
    int[] pos = verificarTripla(
            tabuleiro[0][0], tabuleiro[1][1], tabuleiro[2][2],
            0, 0, 1, 1, 2, 2,
            simbolo
    );
    if (pos != null) return pos;

    // diagonal secundária
    return verificarTripla(
            tabuleiro[0][2], tabuleiro[1][1], tabuleiro[2][0],
            0, 2, 1, 1, 2, 0,
            simbolo
    );
}

private int[] verificarTripla(
        String a, String b, String c,
        int ax, int ay, int bx, int by, int cx, int cy,
        String simbolo
) {
    int countSimbolo = 0;
    int countVazio = 0;
    int[] vazio = null;

    String[] casas = {a, b, c};
    int[][] coords = {{ax, ay}, {bx, by}, {cx, cy}};

    for (int i = 0; i < 3; i++) {
        if (simbolo.equals(casas[i])) {
            countSimbolo++;
        } else if (casas[i] == null || casas[i].equals("") || casas[i].equals(" ")) {
            countVazio++;
            vazio = coords[i];
        }
    }

    if (countSimbolo == 2 && countVazio == 1) {
        return vazio;
    }

    return null;
}
private boolean estaVazio(String casa) {
    return casa == null || casa.equals("") || casa.equals(" ");
}


//aqui verifica se tem fork
//fork é uma encruzilhada
private boolean criaFork(String[][] tabuleiro, int x, int y, String simbolo) {
    tabuleiro[x][y] = simbolo;
    int ameacas = contAmeacas(tabuleiro, simbolo);
    tabuleiro[x][y] = " ";
    return ameacas >= 2;
}

private int contAmeacas(String[][] tabuleiro, String simbolo) {
    int count = 0;

    for (int i = 0; i < 3; i++) {
        if (verificarTripla(tabuleiro[i][0], tabuleiro[i][1], tabuleiro[i][2],
                0,0,0,0,0,0, simbolo) != null) count++;
        if (verificarTripla(tabuleiro[0][i], tabuleiro[1][i], tabuleiro[2][i],
                0,0,0,0,0,0, simbolo) != null) count++;
    }

    if (verificarTripla(tabuleiro[0][0], tabuleiro[1][1], tabuleiro[2][2],
            0,0,0,0,0,0, simbolo) != null) count++;

    if (verificarTripla(tabuleiro[0][2], tabuleiro[1][1], tabuleiro[2][0],
            0,0,0,0,0,0, simbolo) != null) count++;

    return count;
}




}
