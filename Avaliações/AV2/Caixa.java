import java.util.ArrayList;

public class Caixa {
    // Atributos
    private String identificador;
    private ArrayList<Produto> produtosVendidos;

    // Método para definir o identificador do caixa
    public void setIdentificador(String identificador) {
        this.identificador = identificador;
    }

    // Método para obter o identificador do caixa
    public String getIdentificador() {
        return identificador;
    }

    // Método para inicializar a lista de produtos vendidos
    public void inicializarListaVendas() {
        this.produtosVendidos = new ArrayList<>();
    }

    // Método para registrar um produto vendido
    public void registrarVenda(Produto produto) {
        if (produtosVendidos == null) {
            inicializarListaVendas();
        }
        produtosVendidos.add(produto);
        System.out.println("Produto registrado no " + identificador + ": " + produto.exibirDetalhes());
    }

    // Método para exibir todos os produtos vendidos
    public void exibirVendas() {
        if (produtosVendidos == null || produtosVendidos.isEmpty()) {
            System.out.println("Nenhuma venda registrada no " + identificador);
            return;
        }

        System.out.println("\nRelatório de vendas - " + identificador);
        for (Produto produto : produtosVendidos) {
            System.out.println(produto.exibirDetalhes());
        }
    }
}