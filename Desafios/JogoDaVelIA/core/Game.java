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
    private int partidas = 0;               // Controla a qtd de partidas
    private int tempopartida = 2000;        // Tempo para cada partida

    // Construtor ----------------------------
    public Game(Player player1, Player player2){
        this.player1 = player1;
        this.player2 = player2;

        this.player1.setSimboloJogador(this.simboloPlayer1);
        this.player1.setSimboloAdversario(this.simboloPlayer2);

        this.player2.setSimboloJogador(this.simboloPlayer2);
        this.player2.setSimboloAdversario(this.simboloPlayer1);
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
    * 
    * @param partidas é o número da partida atual
    */
    private Player selecionarJogador(){
        return (this.partidas % 2 == 1) ? this.player1 : this.player2;
    }

    private String verificarLinhasJogador() {
        String simbolo = this.selecionarJogador().getSimboloJogador();
        String[][] tabuleiro = this.board.getBoard();

        for (int i = 0; i < tabuleiro.length; i++) {
            if (simbolo.equals(tabuleiro[i][0])
                && simbolo.equals(tabuleiro[i][1])
                && simbolo.equals(tabuleiro[i][2])) {
                return simbolo;
            }
        }

        return "";
    }

    private String verificarColunasJogador(){
        String simbolo = this.selecionarJogador().getSimboloJogador();
        String[][] tabuleiro = this.board.getBoard();

        for (int j = 0; j < tabuleiro.length; j++) {
            if (simbolo.equals(tabuleiro[0][j])
                && simbolo.equals(tabuleiro[1][j])
                && simbolo.equals(tabuleiro[2][j])) {
                return simbolo;
            }
        }

        return "";
    }

    private String verificarDiagonaisJogador(){
        String retorno = "";
        
        // Verifica o símbolo do jogador
        String simbolo = this.selecionarJogador().getSimboloJogador();

        // diagonal principal
        int contador = 0;
        for (int i = 0; i < this.board.getBoard().length; i++) {
            contador++;
            if(simbolo.equals(this.board.getBoard()[i][i])) {
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
            if(simbolo.equals(this.board.getBoard()[i][(this.board.getBoard().length-1)-i])) {
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

    /*
    * Define o tempo de cada partida
    */
    private void tempoPartida() {
        try {
            Thread.sleep(this.tempopartida);
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
            this.gaming = false;
        }
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

        Player jogadorDaVez;    // Controla quem é o jogador da partida
        int[] jogadarealizada;  // Recebe a jogada realizada na partida
        
        while (this.gaming) {
            this.partidas++;
            
            // Seleciona o jogador da vez
            jogadorDaVez = this.selecionarJogador();  
            
            System.out.println("Partida: #" + this.partidas);
            System.out.println("Jogador da vez: "+jogadorDaVez.getNome()+" ("+jogadorDaVez.getSimboloJogador()+")");

            // Loop interno: garante que o jogador só sai da partida com uma jogada válida
            while (true) {
                // Jogador realizada sua jogada e retorna as coordenadas
                jogadarealizada = jogadorDaVez.jogar(this.board.getBoard());

                // Segurança contra null
                if (jogadarealizada == null || jogadarealizada.length < 2) {
                    System.out.println("Jogada inválida (null). Tente novamente.");
                    continue; // pede outra jogada sem contar nova partida
                }

                System.out.println("Jogada escolhida: " + "linha="+jogadarealizada[0]+"\tcoluna="+jogadarealizada[1]);

                String status = this.verificarJogada(jogadarealizada);

                switch(status){
                    case "repetir":
                         // Jogador tentou jogar em posição já feita
                        System.out.println("ALERTA! Tentativa de sobrescrita de jogada!");
                        System.out.println("O jogador "+jogadorDaVez.getNome()+" tentou substituir jogada já realizada. Por favor, tente novamente.");
                        System.out.println();
                        continue;

                    case "novajogada":
                        // Atualizar o tabuleiro com a jogada realizada
                        this.board.update(jogadarealizada, jogadorDaVez.getSimboloJogador());

                        // Mostrar o tabuleiro com a jogada escolhida
                        this.board.showBoard();

                        break; // sai do switch e vai sair do loop interno logo abaixo

                    case "velha":
                        // Atualizar o tabuleiro com a jogada realizada
                        this.board.update(jogadarealizada, jogadorDaVez.getSimboloJogador());

                        // Mostrar o tabuleiro com a jogada escolhida
                        this.board.showBoard();

                        System.out.println("DEU VELHA!");
                        
                        this.gaming = false;
                        break;

                    default:
                        // Atualizar o tabuleiro com a jogada realizada
                        this.board.update(jogadarealizada, jogadorDaVez.getSimboloJogador());

                        // Mostrar o tabuleiro com a jogada escolhida
                        this.board.showBoard();

                        if (status.equals(this.simboloPlayer1) || status.equals(this.simboloPlayer2)) {
                            System.out.println((jogadorDaVez.getNome() + " venceu !!!").toUpperCase());
                        }
                        this.gaming = false;
                        break;
                }

                // Sai do loop interno quando:
                // - jogada foi aplicada ("novajogada"), ou
                // - o jogo terminou ("velha" ou vencedor)
                break;
            }
            
            System.out.println();

            this.tempoPartida();
        }

    }

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
    public String verificarJogada(int[] jogada){
        // int linha = jogada.charAt(0) - '0'; // 0
        // int coluna = jogada.charAt(1) - '0'; // 1
        String retorno = "";
        int linha = jogada[0];  
        int coluna = jogada[1];
        String simbolo = this.selecionarJogador().getSimboloJogador();

        String valorAtual = this.board.getBoard()[linha][coluna];
        if (this.simboloPlayer1.equals(valorAtual) || this.simboloPlayer2.equals(valorAtual)) {
            return "repetir";
        }

        // Simula a jogada para verificar vitória/velha sem alterar o fluxo do start().
        this.board.getBoard()[linha][coluna] = simbolo;
        try {
            if (simbolo.equals(this.verificarLinhasJogador())
                || simbolo.equals(this.verificarColunasJogador())
                || simbolo.equals(this.verificarDiagonaisJogador())) {
                retorno = simbolo;
            } else if (this.partidas == 9) {
                retorno = "velha";
            } else {
                retorno = "novajogada";
            }
        } finally {
            this.board.getBoard()[linha][coluna] = valorAtual;
        }

        return retorno;
    }
   // -----------------------------------------------
}
