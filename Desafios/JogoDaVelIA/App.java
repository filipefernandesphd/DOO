import core.Game;

import ia.*;

public class App {
    public static void main(String[] args) {
        // Minha implementação
        // Player jogador1 = new ia.Filipe.Player("FILIPE");
        // Player jogador2 = new ia.Filipe.Player("JOSÉ");

        // Combate
        ia.Player jogador1 = new ia.gabriel.Player("Gabriel");
        ia.Player jogador2 = new ia.Itaney.IaNey("Itaney");

        Game game = new Game(jogador2, jogador1);
        game.start();
    }
}