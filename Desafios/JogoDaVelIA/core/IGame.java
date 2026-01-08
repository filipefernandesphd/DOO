package core;

public interface IGame {
    /*
    * Método principal que inicia o jogo 
    */
    public void start();

    /*
    * Verifica a jogada atual
    * Retorna "novajogada" se há mais jogadas e não houve vencedor
    * Retorna "velha" se deu empate
    * Retorna "X" ou "O" caso tenha um vencedor
    */
    String verificaJogada(String jogada);

    /*
    * Retorna 1 quando houver um vencedor
    * Retorna 0 quando não houver um vencedor
    * Esse método é chamado quando há empate ou quando chega ao final do jogo sem vencedor 
    */
   boolean repetirJogo();
}
