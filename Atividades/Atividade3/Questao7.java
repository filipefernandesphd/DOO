// Desenvolva um programa que utilize um \texttt{HashMap} para armazenar as notas de um grupo de alunos, onde as chaves são os nomes dos alunos e os valores são as notas (valores decimais). O programa deve permitir que o usuário consulte a nota de um aluno pelo nome.

package Atividades.Atividade3;

import java.util.HashMap;
import java.util.Scanner;

public class Questao7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Criando um HashMap para armazenar as notas dos alunos
        HashMap<String, Double> notas = new HashMap<>();

        // Inserindo dados: nome e nota de 3 alunos
        for (int i = 0; i < 3; i++) {
            System.out.print("Digite o nome do aluno " + (i + 1) + ": ");
            String nome = scanner.next();

            System.out.print("Digite a nota do aluno " + (i + 1) + ": ");
            double nota = scanner.nextDouble();

            notas.put(nome, nota);
        }

        // Consulta de nota pelo nome do aluno
        System.out.print("Digite o nome do aluno para consultar a nota: ");
        String nomeConsulta = scanner.next();

        if (notas.containsKey(nomeConsulta)) {
            System.out.println("A nota de " + nomeConsulta + " é: " + notas.get(nomeConsulta));
        } else {
            System.out.println("Aluno não encontrado.");
        }
    }
}