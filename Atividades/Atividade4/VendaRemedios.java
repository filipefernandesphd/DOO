package Atividades.Atividade4;

import java.util.HashMap;
import java.util.Map;

public class VendaRemedios {

    public static void main(String[] args) {
        // HashMap para armazenar os clientes e suas prescrições
        HashMap<String, HashMap<String, String>> clientes = new HashMap<>();
        // HashMap para armazenar os remédios e seus preços
        HashMap<String, Integer> remedios = new HashMap<>();
        // HashMap para registrar vendas
        HashMap<String, String> vendas = new HashMap<>();
        // Caixa da farmácia
        int caixa = 0;

        // Inicializar clientes com suas prescrições
        inicializarClientes(clientes);

        // Inicializar remédios e seus preços
        inicializarRemedios(remedios);

        // Simulando vendas de remédios para clientes
        caixa = realizarVenda("cliente1", "remedio1", clientes, remedios, vendas, caixa);
        caixa = realizarVenda("cliente2", "remedio2", clientes, remedios, vendas, caixa);

        // Exibir todas as vendas realizadas
        exibirVendas(vendas, clientes);

        // Exibir o total no caixa
        exibirCaixa(caixa);
    }

    // Função para inicializar os clientes com suas prescrições
    public static void inicializarClientes(HashMap<String, HashMap<String, String>> clientes) {
        HashMap<String, String> cliente1 = new HashMap<>();
        cliente1.put("nome", "João Silva");
        cliente1.put("prescricao", "Remédio A");

        HashMap<String, String> cliente2 = new HashMap<>();
        cliente2.put("nome", "Maria Oliveira");
        cliente2.put("prescricao", "Remédio B");

        clientes.put("cliente1", cliente1);
        clientes.put("cliente2", cliente2);
    }

    // Função para inicializar os remédios e seus preços
    public static void inicializarRemedios(HashMap<String, Integer> remedios) {
        remedios.put("remedio1", 50);  // Remédio A custa 50 reais
        remedios.put("remedio2", 100); // Remédio B custa 100 reais
    }

    // Função para realizar uma venda e atualizar o caixa
    public static int realizarVenda(String clienteId, String remedioId,
                                    HashMap<String, HashMap<String, String>> clientes,
                                    HashMap<String, Integer> remedios,
                                    HashMap<String, String> vendas, int caixa) {
        if (clientes.containsKey(clienteId) && remedios.containsKey(remedioId)) {
            vendas.put(clienteId, remedioId);
            int precoRemedio = remedios.get(remedioId);
            caixa += precoRemedio;
            System.out.println("\nVenda realizada: " + clientes.get(clienteId).get("nome") +
                    " comprou o remédio por R$ " + precoRemedio);
        }
        return caixa;
    }

    // Função para exibir as vendas realizadas
    public static void exibirVendas(HashMap<String, String> vendas,
                                    HashMap<String, HashMap<String, String>> clientes) {
        System.out.println("\nVendas realizadas:");
        for (Map.Entry<String, String> venda : vendas.entrySet()) {
            String clienteId = venda.getKey();
            System.out.println("Cliente: " + clientes.get(clienteId).get("nome") +
                    " | Prescrição: " + clientes.get(clienteId).get("prescricao"));
        }
    }

    // Função para exibir o valor total no caixa
    public static void exibirCaixa(int caixa) {
        System.out.println("\nTotal em caixa: R$ " + caixa);
    }
}
