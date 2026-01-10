import core.Game;

import ia.Filipe.*;

public class App {
    public static void main(String[] args) {
        Player jogador1 = new ia.Filipe.Player("FILIPE");
        Player jogador2 = new ia.Filipe.Player("JOSÉ");

        Game game = new Game(jogador1, jogador2);
        game.start();
    }
}