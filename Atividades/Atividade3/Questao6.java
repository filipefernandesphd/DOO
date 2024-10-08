// Crie um algoritmo que receba o nome e a idade de 5 pessoas e armazene esses dados em um \texttt{ArrayList}. O programa deve exibir o nome e a idade da pessoa mais velha.

package Atividades.Atividade3;

import java.util.ArrayList;
import java.util.Scanner;

public class Questao6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Criando um ArrayList para armazenar os nomes e idades
        ArrayList<String> nomes = new ArrayList<>();
        ArrayList<Integer> idades = new ArrayList<>();

        // Entrada de dados: nome e idade de 5 pessoas
        for (int i = 0; i < 5; i++) {
            System.out.print("Digite o nome da pessoa " + (i + 1) + ": ");
            String nome = scanner.next();
            nomes.add(nome);

            System.out.print("Digite a idade da pessoa " + (i + 1) + ": ");
            int idade = scanner.nextInt();
            idades.add(idade);
        }

        // Encontrando a pessoa mais velha
        int indiceMaisVelho = 0;
        for (int i = 1; i < idades.size(); i++) {
            if (idades.get(i) > idades.get(indiceMaisVelho)) {
                indiceMaisVelho = i;
            }
        }

        // Exibindo o nome e a idade da pessoa mais velha
        System.out.println("A pessoa mais velha é " + nomes.get(indiceMaisVelho) + " com " + idades.get(indiceMaisVelho) + " anos.");
    }
}