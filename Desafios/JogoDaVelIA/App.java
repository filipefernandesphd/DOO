import core.Game;

import ia.Filipe.*;
import ui.Board;

public class App {
    public static void main(String[] args) {
        // Player jogador1 = new ia.Filipe.Player("Filipe");
        // Player jogador2 = new ia.Filipe.Player("José Filipe");

        // Game game = new Game(jogador1, jogador2);
        // game.start();

        Player jogadorTeste = new ia.Filipe.Player("Teste");
        
        // jogadorTeste.testaJogadaNosCantos();
        // jogadorTeste.testaJogadaNoCentro();
        // jogadorTeste.testaJogadaConsiderandoUmaNoCanto();
        // jogadorTeste.testaJogadaConsiderandoDuasNoCantoEcentroVazio();

        String [][] tab = {
            {"", "", ""},
            {"", "O", ""},
            {"O", "", ""}
        };

        jogadorTeste.testaInteligencia(tab, "X", "O");

    }
}