package Atividades.Atividade4;

import java.util.HashMap;
import java.util.Map;

public class Votacao {

    public static void main(String[] args) {
        // HashMap para armazenar os votos para prefeito
        HashMap<String, Integer> votosPrefeito = new HashMap<>();
        // HashMap para armazenar os votos para vereador
        HashMap<String, Integer> votosVereador = new HashMap<>();

        // Inicializar candidatos para prefeito e vereador
        inicializarCandidatos(votosPrefeito, votosVereador);

        // Simular votações
        votarPrefeito("Candidato Prefeito 1", votosPrefeito);
        votarPrefeito("Candidato Prefeito 2", votosPrefeito);
        votarPrefeito("Candidato Prefeito 1", votosPrefeito);

        votarVereador("Candidato Vereador 1", votosVereador);
        votarVereador("Candidato Vereador 2", votosVereador);
        votarVereador("Candidato Vereador 2", votosVereador);

        // Exibir resultados
        exibirResultados(votosPrefeito, "Prefeito");
        exibirResultados(votosVereador, "Vereador");
    }

    // Função para inicializar candidatos para prefeito e vereador
    public static void inicializarCandidatos(HashMap<String, Integer> votosPrefeito,
                                             HashMap<String, Integer> votosVereador) {
        // Candidatos para prefeito
        votosPrefeito.put("Candidato Prefeito 1", 0);
        votosPrefeito.put("Candidato Prefeito 2", 0);

        // Candidatos para vereador
        votosVereador.put("Candidato Vereador 1", 0);
        votosVereador.put("Candidato Vereador 2", 0);
    }

    // Função para registrar um voto para prefeito
    public static void votarPrefeito(String candidato, HashMap<String, Integer> votosPrefeito) {
        if (votosPrefeito.containsKey(candidato)) {
            votosPrefeito.put(candidato, votosPrefeito.get(candidato) + 1);
            System.out.println("Voto registrado para Prefeito: " + candidato);
        } else {
            System.out.println("Candidato para prefeito não encontrado.");
        }
    }

    // Função para registrar um voto para vereador
    public static void votarVereador(String candidato, HashMap<String, Integer> votosVereador) {
        if (votosVereador.containsKey(candidato)) {
            votosVereador.put(candidato, votosVereador.get(candidato) + 1);
            System.out.println("Voto registrado para Vereador: " + candidato);
        } else {
            System.out.println("Candidato para vereador não encontrado.");
        }
    }

    // Função para exibir os resultados da votação
    public static void exibirResultados(HashMap<String, Integer> votos, String cargo) {
        System.out.println("\nResultados para " + cargo + ":");
        for (Map.Entry<String, Integer> entry : votos.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue() + " votos");
        }
    }
}
