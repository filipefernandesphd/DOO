package core;

import ia.Player;
import ui.Board;

public class Game implements IGame {
    private Board board;
    private String simboloPlayer1 = "X";
    private String simboloPlayer2 = "O";
    private static int INTERVALO = 2;

    public Game(Player player1, Player player2){
        this.board = new Board();
    }
}
