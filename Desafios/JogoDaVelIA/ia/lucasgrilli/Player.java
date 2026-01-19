package ia.lucasgrilli;


public class Player implements ia.Player{
	
	private String nome = "Lucas Grilli" ;
	private String simboloJogador;
	private String simboloAdversario;

	public Player(String nome){
		this.nome= nome;
	}

	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getSimboloJogador() {
		return simboloJogador;
	}
	public void setSimboloJogador(String simboloJogador) {
		this.simboloJogador = simboloJogador;
	}
	public String getSimboloAdversario() {
		return simboloAdversario;
	}
	public void setSimboloAdversario(String simboloAdversario) {
		this.simboloAdversario = simboloAdversario;
	}

	
	@Override
	public int[] jogar(String[][] tabuleiro) {
		
		fazerMelhorJogada(tabuleiro);
		
		
		
		int[] jogada = fazerMelhorJogada(tabuleiro);  ;

		return jogada;
	}
	
	 static int[] fazerMelhorJogada(String[][] tabuleiro) {
	        int melhorPontuacao = Integer.MIN_VALUE;
	        int melhorLinha = -10;
	        int melhorColuna = -10;
	        String jogador = verificarSimbolo(tabuleiro);
	        

	        // Testa todas as células vazias
	        for (int i = 0; i < 3; i++) {
	            for (int j = 0; j < 3; j++) {
	                if (tabuleiro[i][j] == " ") {
	                    // Simula a jogada
	                    tabuleiro[i][j] = jogador;
	                    
	                    // Calcula o valor dessa jogada chamando o Minimax
	                    int pontuacao = minimax(tabuleiro, 0, false);
	                    
	                    // Desfaz a jogada (backtracking)
	                    tabuleiro[i][j] = " ";

	                    // Se essa jogada for melhor que a anterior, guarda ela
	                    if (pontuacao > melhorPontuacao) {
	                        melhorPontuacao = pontuacao;
	                        melhorLinha = i;
	                        melhorColuna = j;
	                    }
	                }
	            }
	        }
	        int[] melhorJogada = {melhorLinha, melhorColuna};
	        return melhorJogada;
	    }
	



	static int minimax(String[][] tab, int profundidade, boolean isMaximizando) {
		  int pontuacao = avaliarTabuleiro(tab);
		  String jogador = "X";
		  String adversario = "O";
        // Se alguém ganhou, retorna a pontuação (+10 ou -10)
        if (pontuacao == 10) return pontuacao - profundidade; 
        if (pontuacao == -10) return pontuacao + profundidade; 
        if (!existemMovimentos(tab)) return 0; // Empate

        if (isMaximizando) {
            // Turno do Computador simulado
            int melhor = Integer.MIN_VALUE;
            for (int i = 0; i < 3; i++) {
                for (int j = 0; j < 3; j++) {
                    if (tab[i][j] == " ") {
                        tab[i][j] = jogador;
                        melhor = Math.max(melhor, minimax(tab, profundidade + 1, false));
                        tab[i][j] = " ";
                    }
                }
            }
            return melhor;
        } else {
            // Turno do Adversario simulado
            int melhor = Integer.MAX_VALUE;
            for (int i = 0; i < 3; i++) {
                for (int j = 0; j < 3; j++) {
                    if (tab[i][j] == " ") {
                        tab[i][j] = adversario;
                        melhor = Math.min(melhor, minimax(tab, profundidade + 1, true));
                        tab[i][j] = " ";
                    }
                }
            }
            return melhor;
        }
    }
	 static int avaliarTabuleiro(String[][] tabuleiro) {

		 	String jogador = verificarSimbolo(tabuleiro);
		 	String adversario = "O"; 
			if(jogador == "O") {
				adversario = "X";
			}
		  
	        for (int row = 0; row < 3; row++) {
	            if (tabuleiro[row][0] == tabuleiro[row][1] && tabuleiro[row][1] == tabuleiro[row][2]) {
	                if (tabuleiro[row][0] == jogador ) return +10;
	                else if (tabuleiro[row][0] == adversario) return -10;
	            }
	        }
	        // Verifica colunas
	        for (int col = 0; col < 3; col++) {
	            if (tabuleiro[0][col] == tabuleiro[1][col] && tabuleiro[1][col] == tabuleiro[2][col]) {
	                if (tabuleiro[0][col] == jogador) return +10;
	                else if (tabuleiro[0][col] == adversario) return -10;
	            }
	        }
	        // Verifica diagonais
	        if (tabuleiro[0][0] == tabuleiro[1][1] && tabuleiro[1][1] == tabuleiro[2][2]) {
	            if (tabuleiro[0][0] == jogador) return +10;
	            else if (tabuleiro[0][0] == adversario) return -10;
	        }
	        if (tabuleiro[0][2] == tabuleiro[1][1] && tabuleiro[1][1] == tabuleiro[2][0]) {
	            if (tabuleiro[0][2] == jogador) return +10;
	            else if (tabuleiro[0][2] == adversario) return -10;
	        }
	        return 0; // Ninguém ganhou ainda
	    }

	    static boolean existemMovimentos(String[][] tab) {
	        for (int i = 0; i < 3; i++)
	            for (int j = 0; j < 3; j++)
	                if (tab[i][j] == " ") return true;
	        return false;
	    }
		public static String verificarSimbolo(String[][] tabuleiro) {
		int x = 0;
		int o = 0;
		String simbolo;
		for (int i = 0; i < 3; i++) {
                for (int j = 0; j < 3; j++) {
                    if (tabuleiro[i][j] == "X"){
						x++;
					}
					else if (tabuleiro[i][j] == "O"){
						o++;
					}
					}
				}				

			if(x == o){
				simbolo="X";
			}
			else simbolo = "O";
		return simbolo;
	}
}