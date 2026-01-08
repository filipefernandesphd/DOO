import core.Game;

import ia.Filipe.*;
import ui.Board;

public class App {
    public static void main(String[] args) {
        Player jogador1 = new ia.Filipe.Player("Filipe");
        Player jogador2 = new ia.Filipe.Player("José Filipe");

        Game game = new Game(jogador1, jogador2);
        game.start();
    }
}