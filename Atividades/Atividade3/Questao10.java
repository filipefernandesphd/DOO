// Desenvolva um programa que peça ao usuário para inserir um número e utilize um laço \texttt{for} para imprimir todos os números de 1 até o número informado. O programa deve, também, indicar quais desses números são múltiplos de 3.

package Atividades.Atividade3;

import java.util.Scanner;

public class Questao10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Entrada do número até onde o laço for deve contar
        System.out.print("Digite um número: ");
        int numero = scanner.nextInt();

        // Usando um laço for para imprimir os números de 1 até o número inserido
        for (int i = 1; i <= numero; i++) {
            System.out.print(i);

            // Verificando se o número é múltiplo de 3
            if (i % 3 == 0) {
                System.out.print(" (múltiplo de 3)");
            }

            System.out.println(); // Quebra de linha
        }
    }
}