package core;

import ia.Player;
import ui.Board;

public class Game implements IGame {
    // Atributos ----------------------------
    private Player player1;                 // Jogador 1
    private Player player2;                 // Jogador 2
    private String simboloPlayer1 = "X";    // Símbolo jogador 1
    private String simboloPlayer2 = "O";    // Símbolo jogador 2
    private Board board;                    // Tabuleiro
    private boolean gaming = false;         // Status do jogo

    // Construtor ----------------------------
    public Game(Player player1, Player player2){
        this.player1 = player1;
        this.player2 = player2;

        this.player1.setSimboloJogador(simboloPlayer1);
        this.player1.setSimboloAdversario(simboloPlayer2);

        this.player2.setSimboloJogador(simboloPlayer2);
        this.player2.setSimboloAdversario(simboloPlayer1);
    }

    // Getters and Setters ----------------------------
    
    // ------------------------------------------------

    // Métodos públicos ----------------------------
    /*
    * Mesagem de início do jogo
    */
    private void mensagemInicioJogo(){
        System.out.println();
        System.out.println("=== Início do Jogo da VelIA ===");
        System.out.println("Bem-vindos, " + this.player1.getNome() + " e " + this.player2.getNome() + "!");
        System.out.println(this.player1.getNome() + " jogará com '" + this.simboloPlayer1 + "' e " + this.player2.getNome() + " jogará com '" + this.simboloPlayer2 + "'.");
        System.out.println("Vamos começar!");
        System.out.println("===============================");
        System.out.println();
    }

    /*
    * Seleciona o jogador da vez
    * @param partidas é o número da partida atual
    */
    private Player selecionarJogador(int partidas){
        return (partidas % 2 == 1) ? this.player1 : this.player2;
    }
    // ------------------------------------------------

    // Métodos públicos ----------------------------
    /*
    * Método principal que inicia o jogo 
    */
   @Override
    public void start(){
        // Inicia o tabuleiro
        this.board = new Board();

        // Inicia o jogo
        this.gaming = true;

        // Mensagem de início
        this.mensagemInicioJogo();

        int partidas = 0;       // Controla a qtd de partidas
        Player jodadorDaVez;    // Controla quem é o jogador da partida
        int[] jogadarealizada;  // Recebe a jogada realizada na partida
        
        while (gaming) {
            partidas++;
            this.board.showBoard();

            // Seleciona o jogador da vez
            jodadorDaVez = this.selecionarJogador(partidas);  

            // Jogador realizada sua jogada e retorna as coordenadas
            jogadarealizada = jodadorDaVez.jogar(this.board.getBoard());

            // Atualiza o tabuleiro com a jogada realizada
            this.board.update(jogadarealizada, jodadorDaVez.getSimboloJogador());

            // System.out.println("Jogada realizada: " + jogadarealizada[0]+""+jogadarealizada[1]);

            // Mostra o tabuleiro com a jogada escolhida
            this.board.showBoard();

            // TODO
            // this.verificaJogada(simboloPlayer1)

            gaming = false;
        }

    }

    /*
    * Verifica a jogada atual
    * Retorna "novajogada" se há mais jogadas e não houve vencedor
    * Retorna "velha" se deu empate
    * Retorna "X" ou "O" caso tenha um vencedor
    */
    public String verificaJogada(String jogada){ return null;}

    /*
    * Retorna 1 quando houver um vencedor
    * Retorna 0 quando não houver um vencedor
    * Esse método é chamado quando há empate ou quando chega ao final do jogo sem vencedor 
    */
   public boolean repetirJogo(){ return true; }
   // -----------------------------------------------
}
