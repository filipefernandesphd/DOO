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
        String retorno = "";

        // Verifica o símbolo do jogador
        String simbolo = this.selecionarJogador().getSimboloJogador();

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

        return retorno;
    }

    private String verificarColunasJogador(){
        String retorno = "";

        // Verifica o símbolo do jogador
        String simbolo = this.selecionarJogador().getSimboloJogador();

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

        return retorno;
    }

    private String verificarDiagonaisJogador(){
        String retorno = "";
        
        // Verifica o símbolo do jogador
        String simbolo = this.selecionarJogador().getSimboloJogador();

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
                        System.out.println("velha");
                        this.gaming = false;
                        break;

                    default:
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
        String simbolo = null;

        for (int i = 0; i < this.board.getBoard().length; i++) {
            for (int j = 0; j < this.board.getBoard().length; j++) {              
                
                // Verifica se a posição não possui jogada
                if(this.board.getBoard()[linha][coluna] != this.simboloPlayer1 && this.board.getBoard()[linha][coluna] != this.simboloPlayer2) {
                    // Verifica o símbolo do jogador da vez
                    simbolo = this.selecionarJogador().getSimboloJogador();
                    
                    // Atualiza a posição com o símbolo do jogador da vez
                    // this.board.getBoard()[linha][coluna] = simbolo;

                    retorno = "novajogada";
                }else if (this.board.getBoard()[linha][coluna] == this.simboloPlayer1 || this.board.getBoard()[linha][coluna] == this.simboloPlayer2){ // Se sim, deve jogar novamente
                    retorno = "repetir";
                }

                // Retorna o status da jogada
                // Verificar se o jogador da vez venceu
                // Verificar linhas, colunas e diagonais
                if(this.verificarLinhasJogador() == simbolo || this.verificarColunasJogador() == simbolo || this.verificarDiagonaisJogador() == simbolo) {
                    retorno = simbolo;
                }else if (this.partidas == 9) { // verifica se deu velha
                    retorno = "velha";
                }
            }
        }

        return retorno;
    }

    /*
    * Retorna 1 quando houver um vencedor
    * Retorna 0 quando não houver um vencedor
    * Esse método é chamado quando há empate ou quando chega ao final do jogo sem vencedor 
    */
   public boolean repetirJogo(){ return true; }
   // -----------------------------------------------
}
