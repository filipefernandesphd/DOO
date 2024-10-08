// Faça um algoritmo que crie um array 2D (matriz) de inteiros com 3 linhas e 3 colunas. Preencha o array com valores fornecidos pelo usuário e depois exiba os valores na forma de uma matriz.

package Atividades.Atividade2;

import java.util.Scanner;

public class Questao8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Criando um array 2D (matriz) de inteiros com 3 linhas e 3 colunas
        int[][] matriz = new int[3][3];

        // Preenchendo o array com valores fornecidos pelo usuário
        System.out.println("Digite os valores para preencher a matriz 3x3:");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print("Digite o valor para posição [" + i + "][" + j + "]: ");
                matriz[i][j] = scanner.nextInt();
            }
        }

        // Exibindo os valores na forma de uma matriz
        System.out.println("A matriz é:");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(matriz[i][j] + " ");
            }
            System.out.println(); // Quebra de linha para a próxima linha da matriz
        }
    }
}