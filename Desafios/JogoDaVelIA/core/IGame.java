package core;

public interface IGame {
    /*
    * Método principal que inicia o jogo 
    */
    public void start();

    /*
    * Verifica o estado do jogo após a realização de uma jogada.
    *
    * @param jogada a coordenada da jogada no formato {@code {x, y}}
    *   Pré-condição: assume-se que a posição é válida e está dentro dos limites do tabuleiro.
    * 
    * @return retorna uma {@code String} indicando o estado do jogo:
    *   - {@code "repetir"} se o jogador tentar sobrescrever jogada
    *   - {@code "novajogada"} se ainda há jogadas possíveis e não houve vencedor
    *   - {@code "velha"} se o jogo terminou em empate
    *   - {@code "X"} ou {@code "O"} caso algum jogador tenha vencido
    */
    String verificarJogada(int[] jogada);
}
