package ui;

import ia.Player;
import java.util.Scanner;

public class IO {
    private Scanner scanner;

    public IO(){
        this.scanner = new Scanner(System.in);
    }

    // TODO: Validar com Exceção futuramente
    public String lerJogada(Player player){
        while (true) {
            System.out.print("Jogador " + player.getNome() + ", faça sua jogada (formato: 01, 12, 20): ");
            String entrada = this.scanner.nextLine().trim();

            try {
                // Tem que ter exatamente 2 caracteres
                if (entrada.length() != 2) {
                    throw new IllegalArgumentException("Digite exatamente dois dígitos (ex: 01, 12, 20).");
                }

                // Ambos precisam ser dígitos
                if (!Character.isDigit(entrada.charAt(0)) || !Character.isDigit(entrada.charAt(1))) {
                    throw new IllegalArgumentException("A jogada deve conter apenas números (ex: 01, 12, 20).");
                }

                int linha = entrada.charAt(0) - '0';
                int coluna = entrada.charAt(1) - '0';

                // Ambos devem estar entre 0 e 2
                if (linha < 0 || linha > 2 || coluna < 0 || coluna > 2) {
                    throw new IllegalArgumentException("Os números devem estar entre 0 e 2.");
                }

                // Se passou por tudo, é válido
                return entrada;

            } catch (IllegalArgumentException e) {
                System.out.println("Entrada inválida: " + e.getMessage());
            }
        }
    }
}
