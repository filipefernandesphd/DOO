package ia;

public interface Player {
    
    public String getNome();

    /*
    * Realiza a jogada no tabuleiro (board) na posição indicada
    * @param posicao A posição linha x coluna no tabuleiro
    */
    public void jogar(int[][] posicao);
}
