// Desenvolva um programa que peça ao usuário para inserir três notas (valores decimais). O programa deve calcular a média dessas notas e informar se o aluno foi aprovado (média maior ou igual a 7), está de recuperação (média entre 5 e 7) ou reprovado (média abaixo de 5).

package Atividades.Atividade3;

import java.util.Scanner;

public class Questao2 {
    public static void main(String[] args) {
        // Cria um scanner para entrada de dados
        Scanner scanner = new Scanner(System.in);

        // Entrada das três notas
        System.out.print("Digite a primeira nota: ");
        double nota1 = scanner.nextDouble();

        System.out.print("Digite a segunda nota: ");
        double nota2 = scanner.nextDouble();

        System.out.print("Digite a terceira nota: ");
        double nota3 = scanner.nextDouble();

        // Calculando a média
        double media = (nota1 + nota2 + nota3) / 3;

        // Verificando a situação do aluno
        if (media >= 7) {
            System.out.println("Aprovado com média: " + media);
        } else if (media >= 5) {
            System.out.println("Recuperação com média: " + media);
        } else {
            System.out.println("Reprovado com média: " + media);
        }
    }
}