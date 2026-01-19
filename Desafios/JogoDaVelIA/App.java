import core.Game;

import ia.*;

public class App {
    public static void main(String[] args) {
        // Substituir a implementação de cada um em jogador1 e jogador2
        // Finalistas
        ia.Player jogador1 = new ia.gabriel.Player("Gabriel");
        ia.Player jogador2 = new ia.Sparta.Player("Caio");

        Game game = new Game(jogador2, jogador1);
        game.start();
    }
}