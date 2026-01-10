package ia;

public interface Player {
    
    public String getNome();

    public String getSimboloJogador();
    public void setSimboloJogador(String simbolojogador);

    public String getSimboloAdversario();
    public void setSimboloAdversario(String simboloadversario);

    /*
    * Realiza a jogada no tabuleiro (board) na posição indicada
    * @param board Objeto tabuleiro
    * @return Retorna a coordenada da jogada. Ex: {i,j}, sendo i linha e j coluna
    */
    public int[] jogar(String[][] tabuleiro);
}
