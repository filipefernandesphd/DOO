package core;

import ia.Player;
import ui.Board;
import ui.IO;

public class Game implements IGame {
    private boolean gaming = false;
    private Board board;
    private String simboloPlayer1 = "X";
    private String simboloPlayer2 = "O";
    private static int INTERVALO = 2;
    private Player player1;
    private Player player2;
    private int rodada = 0; // controla de quem é a vez de jogar
    private Player jogadorDaVez;
    private IO io;

    public Game(Player player1, Player player2){
        this.player1 = player1;
        this.player2 = player2;

        this.io = new IO();
    }

    @Override
    public void start() {
        // Inicia o tabuleiro
        this.board = new Board();

        // Inicia o jogo
        gaming = true;

        // Mensagem de início
        System.out.println();
        System.out.println("=== Início do Jogo da VelIA ===");
        System.out.println("Bem-vindos, " + this.player1.getNome() + " e " + this.player2.getNome() + "!");
        System.out.println(this.player1.getNome() + " jogará com '" + this.simboloPlayer1 + "' e " + this.player2.getNome() + " jogará com '" + this.simboloPlayer2 + "'.");
        System.out.println("Vamos começar!");
        System.out.println("===============================");
        System.out.println();

        while(gaming) {
            this.rodada++;
            board.showBoard(); 

            // quem é o jogador da vez?
            this.jogadorDaVez = (this.rodada % 2 == 1) ? player1 : player2; // jogador 1 joga nas rodadas ímpares

            // pergunta ao jogador da rodada qual será a jogada e a valida
            String jogada = this.io.lerJogada(jogadorDaVez);

            // recebe a jogada e verifica o resultado
            String jogadarealizada = verificaJogada(jogada);

            if(jogadarealizada == simboloPlayer1 || jogadarealizada == simboloPlayer2){
                System.out.println("O jogador " + this.jogadorDaVez.getNome() + " venceu!");
                board.showBoard();
                gaming = false;
            }else if (jogadarealizada == "velha") {
                System.out.println("Deu velha!");
                this.board = new Board(); // reinicia o tabuleiro
            }
        }
    }

    @Override
    public String verificaJogada(String jogada) {
        int linha = jogada.charAt(0) - '0'; // 0
        int coluna = jogada.charAt(1) - '0'; // 1
        String simbolo = "";

        // Loop para encontrar a posição no tabuleiro
        for (int i = 0; i < this.board.getBoard().length; i++) {
            for (int j = 0; j < this.board.getBoard()[i].length; j++) {
                
                // Verifica se a posição não possui jogada
                if(this.board.getBoard()[linha][coluna] != "X" && this.board.getBoard()[linha][coluna] != "O") {
                    // Verifica de quem é a vez de jogar
                    simbolo = (this.rodada % 2 == 1) ? this.simboloPlayer1 : this.simboloPlayer2;
                    
                    // Atualiza a posição com o símbolo do jogador da vez
                    this.board.getBoard()[linha][coluna] = simbolo;
                }else{ // Se sim, deve jogar novamente
                    return null;
                }

                // Retorna o status da jogada
                // Verificar se o jogador da vez venceu
                // Verificar linhas, colunas e diagonais
                if(this.verificarLinhasJogador() == simbolo || this.verificarColunasJogador() == simbolo || this.verificarDiagonaisJogador() == simbolo) {
                    return simbolo;
                }else if (this.rodada == 9) { // verifica se deu velha
                    return "velha";
                }else{
                    return "novajogada";
                }
            }
        }

        return null;
    }

    private String verificarLinhasJogador() {
        String retorno = "";

        // Verifica de quem é a vez de jogar
        String simbolo = (this.rodada % 2 == 1) ? this.simboloPlayer1 : this.simboloPlayer2;

        // TODO: Mudar essa implementação para um loop
        if( 
            this.board.getBoard()[0][0] == simbolo &&
            this.board.getBoard()[0][1] == simbolo &&
            this.board.getBoard()[0][2] == simbolo
        ){
            retorno = simbolo;
        } else if (
            this.board.getBoard()[1][0] == simbolo &&
            this.board.getBoard()[1][1] == simbolo &&
            this.board.getBoard()[1][2] == simbolo
        ){
            retorno = simbolo;
        } else if (
            this.board.getBoard()[2][0] == simbolo &&
            this.board.getBoard()[2][1] == simbolo &&
            this.board.getBoard()[2][2] == simbolo
        ){
            retorno = simbolo;
        }

        // int contador = 0;
        // for (int i = 0; i < this.board.getBoard().length; i++) { // linha
        //     for (int j = 0; j < this.board.getBoard()[i].length; j++) { // coluna
        //         contador++;
        //         if(this.board.getBoard()[i][j] == simbolo) {
        //             if(contador == 3) {
        //                 // System.out.println("O jogador " + this.jogadorDaVez.getNome() + " venceu!");
        //                 // this.board.showBoard();
        //                 // this.gaming = false;
        //                 retorno = simbolo;
        //             }
        //         }else{
        //             contador = 0;
        //         }
        //     }
        // }

        return retorno;
    }

    private String verificarColunasJogador(){
        String retorno = "";

        // Verifica de quem é a vez de jogar
        String simbolo = (this.rodada % 2 == 1) ? this.simboloPlayer1 : this.simboloPlayer2;

        // TODO: Mudar essa implementação para um loop
        if(
            this.board.getBoard()[0][0] == simbolo &&
            this.board.getBoard()[1][0] == simbolo &&
            this.board.getBoard()[2][0] == simbolo
        ){
            retorno = simbolo;
        } else if (
            this.board.getBoard()[0][1] == simbolo &&
            this.board.getBoard()[1][1] == simbolo &&
            this.board.getBoard()[2][1] == simbolo
        ){
            retorno = simbolo;
        } else if (
            this.board.getBoard()[0][2] == simbolo &&
            this.board.getBoard()[1][2] == simbolo &&
            this.board.getBoard()[2][2] == simbolo
        ){
            retorno = simbolo;
        }

        // int contador = 0;
        // for (int j = 0; j < this.board.getBoard().length; j++) { // coluna
        //     for (int i = 0; i < this.board.getBoard()[j].length; i++) { // linha
        //         contador++;
        //         if(this.board.getBoard()[i][j] == simbolo) {
        //             if(contador == 3) {
        //                 // System.out.println("O jogador " + this.jogadorDaVez.getNome() + " venceu!");
        //                 // this.board.showBoard();
        //                 // this.gaming = false;
        //                 retorno = simbolo;
        //             }
        //         }else{
        //             contador = 0;
        //         }
        //     }
        // }
        return retorno;
    }

    private String verificarDiagonaisJogador(){
        String retorno = "";
        
        String simbolo = (this.rodada % 2 == 1) ? this.simboloPlayer1 : this.simboloPlayer2;

        // diagonal principal
        int contador = 0;
        for (int i = 0; i < this.board.getBoard().length; i++) {
            contador++;
            if(this.board.getBoard()[i][i] == simbolo) {
                if(contador == 3) {
                    // System.out.println("O jogador " + this.jogadorDaVez.getNome() + " venceu!");
                    // this.board.showBoard();
                    // this.gaming = false;   
                    retorno = simbolo;
                }
            }else{
                contador = 0;
            }
        }

        // diagonal secundária
        contador = 0;
        for (int i = 0; i < this.board.getBoard().length; i++) {
            contador++;
            if(this.board.getBoard()[i][(this.board.getBoard().length-1)-i] == simbolo) {
                if(contador == 3) {
                    // System.out.println("O jogador " + this.jogadorDaVez.getNome() + " venceu!");
                    // this.board.showBoard();
                    // this.gaming = false;   
                    retorno = simbolo;
                }
            }else{
                contador = 0;   
            }
        }
        return retorno;
    }

    @Override
    public boolean repetirJogo() {
        // TODO Auto-generated method stub
        return false;
    }
}
