import ia.Player;
import core.Game;

public class App {
    public static void main(String[] args) {
        Player jogador1 = new /* Classe implementada do jogador 1 */; // jogador 1
        Player jogador2 = new /* Classe implementada do jogador 2 */; // jogador 2

        Game game = new Game(jogador1, jogador2);
        game.start();
    }
}