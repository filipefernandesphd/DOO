// Crie um programa que peça ao usuário para digitar um número e, usando a estrutura de controle \texttt{switch}, verifique se o número corresponde a um dia da semana (1 = Domingo, 2 = Segunda, ..., 7 = Sábado). Exiba o nome do dia correspondente ou informe se o número é inválido.

package Atividades.Atividade3;

import java.util.Scanner;

public class Questao9 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Entrada do número correspondente ao dia da semana
        System.out.print("Digite um número (1 a 7) correspondente a um dia da semana: ");
        int dia = scanner.nextInt();

        // Verificando o dia da semana usando switch
        switch (dia) {
            case 1:
                System.out.println("Domingo");
                break;
            case 2:
                System.out.println("Segunda-feira");
                break;
            case 3:
                System.out.println("Terça-feira");
                break;
            case 4:
                System.out.println("Quarta-feira");
                break;
            case 5:
                System.out.println("Quinta-feira");
                break;
            case 6:
                System.out.println("Sexta-feira");
                break;
            case 7:
                System.out.println("Sábado");
                break;
            default:
                System.out.println("Número inválido. Por favor, insira um número entre 1 e 7.");
        }
    }
}