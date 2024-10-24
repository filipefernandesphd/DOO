package Atividades.Atividade4;

import java.util.HashMap;
import java.util.Map;

public class VendaCarros {

    public static void main(String[] args) {
        // HashMap para armazenar os "atributos" de clientes
        HashMap<String, HashMap<String, String>> clientes = new HashMap<>();
        // HashMap para armazenar os "atributos" dos carros
        HashMap<String, HashMap<String, String>> carros = new HashMap<>();
        // HashMap para armazenar os preços dos carros
        HashMap<String, Integer> precosCarros = new HashMap<>();
        // HashMap para simular a venda (relacionamento entre cliente e carro)
        HashMap<String, String> vendas = new HashMap<>();
        // Caixa da loja
        int caixa = 0;

        // Inicializar clientes
        HashMap<String, String> cliente1 = new HashMap<>();
        cliente1.put("nome", "João Silva");
        clientes.put("cliente1", cliente1);

        HashMap<String, String> cliente2 = new HashMap<>();
        cliente2.put("nome", "Maria Oliveira");
        clientes.put("cliente2", cliente2);

        HashMap<String, String> cliente3 = new HashMap<>();
        cliente3.put("nome", "Carlos Souza");
        clientes.put("cliente3", cliente3);

        // Inicializar carros
        HashMap<String, String> carro1 = new HashMap<>();
        carro1.put("modelo", "Toyota Corolla");
        carros.put("carro1", carro1);
        precosCarros.put("carro1", 90000); // preço em reais

        HashMap<String, String> carro2 = new HashMap<>();
        carro2.put("modelo", "Honda Civic");
        carros.put("carro2", carro2);
        precosCarros.put("carro2", 85000);

        HashMap<String, String> carro3 = new HashMap<>();
        carro3.put("modelo", "Ford Mustang");
        carros.put("carro3", carro3);
        precosCarros.put("carro3", 250000);

        // Simulando vendas e atualizando o caixa
        caixa = realizarVenda("cliente1", "carro1", clientes, carros, vendas, precosCarros, caixa);
        caixa = realizarVenda("cliente2", "carro2", clientes, carros, vendas, precosCarros, caixa);
        caixa = realizarVenda("cliente3", "carro3", clientes, carros, vendas, precosCarros, caixa);

        // Exibir todas as vendas
        exibirVendas(vendas, clientes, carros);

        // Exibir caixa total
        exibirCaixa(caixa);
    }


    // Função para realizar a venda, atualizar o caixa e adicionar ao HashMap de vendas
    public static int realizarVenda(String clienteId, String carroId,
                                    HashMap<String, HashMap<String, String>> clientes,
                                    HashMap<String, HashMap<String, String>> carros,
                                    HashMap<String, String> vendas,
                                    HashMap<String, Integer> precosCarros, int caixa) {
        if (clientes.containsKey(clienteId) && carros.containsKey(carroId)) {
            vendas.put(clienteId, carroId);
            int precoCarro = precosCarros.get(carroId);
            caixa += precoCarro;
            System.out.println("\nVenda realizada: " + clientes.get(clienteId).get("nome") +
                    " comprou " + carros.get(carroId).get("modelo") + " por R$ " + precoCarro);
        }
        return caixa;
    }

    // Função para exibir todas as vendas realizadas
    public static void exibirVendas(HashMap<String, String> vendas, HashMap<String, HashMap<String, String>> clientes,
                                    HashMap<String, HashMap<String, String>> carros) {
        System.out.println("\nVendas realizadas:");
        for (Map.Entry<String, String> venda : vendas.entrySet()) {
            String clienteId = venda.getKey();
            String carroId = venda.getValue();
            System.out.println("Cliente: " + clientes.get(clienteId).get("nome") +
                    " | Carro: " + carros.get(carroId).get("modelo"));
        }
    }

    // Função para exibir o valor total no caixa
    public static void exibirCaixa(int caixa) {
        System.out.println("\nTotal em caixa: R$ " + caixa);
    }
}