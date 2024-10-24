package Atividades.Atividade4;

import java.util.HashMap;

public class ConsultaAutomovel {

    public static void main(String[] args) {
        // HashMap para armazenar as informações dos automóveis (placa como chave)
        HashMap<String, HashMap<String, String>> automoveis = new HashMap<>();

        // Inicializar automóveis
        inicializarAutomoveis(automoveis);

        // Consultar automóveis pela placa
        consultarAutomovel("ABC1234", automoveis);  // Consulta por placa válida
        consultarAutomovel("XYZ9876", automoveis);  // Consulta por placa inválida
    }

    // Função para inicializar os automóveis com suas informações
    public static void inicializarAutomoveis(HashMap<String, HashMap<String, String>> automoveis) {
        HashMap<String, String> carro1 = new HashMap<>();
        carro1.put("modelo", "Toyota Corolla");
        carro1.put("ano", "2018");
        carro1.put("cor", "Prata");
        automoveis.put("ABC1234", carro1);  // Placa como chave

        HashMap<String, String> carro2 = new HashMap<>();
        carro2.put("modelo", "Honda Civic");
        carro2.put("ano", "2020");
        carro2.put("cor", "Preto");
        automoveis.put("DEF5678", carro2);  // Placa como chave
    }

    // Função para consultar os dados do automóvel pela placa
    public static void consultarAutomovel(String placa, HashMap<String, HashMap<String, String>> automoveis) {
        if (automoveis.containsKey(placa)) {
            HashMap<String, String> dadosCarro = automoveis.get(placa);
            System.out.println("\nInformações do automóvel com placa " + placa + ":");
            System.out.println("Modelo: " + dadosCarro.get("modelo"));
            System.out.println("Ano: " + dadosCarro.get("ano"));
            System.out.println("Cor: " + dadosCarro.get("cor"));
        } else {
            System.out.println("\nNenhum automóvel encontrado com a placa: " + placa);
        }
    }
}