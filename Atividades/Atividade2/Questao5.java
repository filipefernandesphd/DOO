// Desenvolva um programa que crie um array de 5 números inteiros. O programa deve permitir que o usuário preencha os valores do array, e depois exiba a soma de todos os números armazenados no array.

package Atividades.Atividade2;

import java.util.Scanner;

public class Questao5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Criando um array de inteiros com 5 posições
        int[] numeros = new int[5];

        // Entrada de dados para preencher o array
        System.out.println("Digite 5 números:");
        for (int i = 0; i < numeros.length; i++) {
            numeros[i] = scanner.nextInt();
        }

        // Calculando a soma dos números no array
        int soma = 0;
        for (int numero : numeros) {
            soma += numero;
        }

        // Exibindo a soma dos números
        System.out.println("A soma dos números é: " + soma);
    }
}