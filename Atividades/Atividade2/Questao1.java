// Faça um algoritmo que peça ao usuário para digitar uma temperatura em graus Celsius e converta essa temperatura para Fahrenheit. Utilize tipos de dados apropriados para realizar a conversão e exiba o resultado.

package Atividades.Atividade2;

import java.util.Scanner;

public class Questao1 {
    public static void main(String[] args) {
        // Cria um scanner para entrada de dados
        Scanner scanner = new Scanner(System.in);

        // Entrada de temperatura em Celsius
        System.out.print("Digite a temperatura em Celsius: ");
        double celsius = scanner.nextDouble();

        // Conversão para Fahrenheit
        double fahrenheit = (celsius * 9/5) + 32;

        // Exibindo o resultado
        System.out.println("A temperatura em Fahrenheit é: " + fahrenheit);
    }
}