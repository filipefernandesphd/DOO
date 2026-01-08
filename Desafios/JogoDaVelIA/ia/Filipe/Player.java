package ia.Filipe;

public class Player implements ia.Player {
    private String nome;

    public Player(){}
    
    public Player(String nome) {
        this.nome = nome;
    }

    // =======================================================
    // Getters and Setters ===================================
    // =======================================================
    public String getNome() {
        return this.nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
    //=========================================================

    /*
    * Realiza a jogada no tabuleiro (board) na posição indicada
    * @param posicao A posição linha x coluna no tabuleiro
    */
    @Override
    public void jogar(int[][] posicao) {
        // Implementação da jogada do jogador Filipe
        System.out.println("Jogador Filipe jogou na posição: " + posicao[0][0] + ", " + posicao[0][1]);
    }
    
}
