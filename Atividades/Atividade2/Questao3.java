// Crie um algoritmo para uma loja que, ao receber o valor de uma compra, aplica um desconto de 10% se o valor for maior que R$ 100,00. O programa deve imprimir o valor final com o desconto, se aplicável.

package Atividades.Atividade2;

import java.util.Scanner;

public class Questao3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Entrada do valor da compra
        System.out.print("Digite o valor da compra: ");
        double valorCompra = scanner.nextDouble();

        // Aplicando desconto se o valor for maior que R$100,00
        if (valorCompra > 100) {
            double valorFinal = valorCompra * 0.9; // Aplica 10% de desconto
            System.out.println("Valor com desconto: R$" + valorFinal);
        } else {
            System.out.println("Valor sem desconto: R$" + valorCompra);
        }
    }
}