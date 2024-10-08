// Faça um algoritmo que peça ao usuário para digitar um número e verifique se esse número é par ou ímpar. O programa deve, também, verificar se o número é primo.

package Atividades.Atividade2;

import java.util.Scanner;

public class Questao4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Entrada do número
        System.out.print("Digite um número: ");
        int numero = scanner.nextInt();

        // Verificando se é par ou ímpar
        if (numero % 2 == 0) {
            System.out.println("O número é par.");
        } else {
            System.out.println("O número é ímpar.");
        }

        // Verificando se é primo
        if (isPrimo(numero)) {
            System.out.println("O número é primo.");
        } else {
            System.out.println("O número não é primo.");
        }
    }

    // Função para verificar se o número é primo
    public static boolean isPrimo(int numero) {
        if (numero <= 1) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(numero); i++) {
            if (numero % i == 0) {
                return false;
            }
        }
        return true;
    }
}