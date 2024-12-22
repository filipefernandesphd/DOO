public class Produto {
    // Atributos
    private String nome;
    private double preco;

    // Método para definir o nome
    public void setNome(String nome) {
        this.nome = nome;
    }

    // Método para obter o nome
    public String getNome() {
        return nome;
    }

    // Método para definir o preço
    public void setPreco(double preco) {
        this.preco = preco;
    }

    // Método para obter o preço
    public double getPreco() {
        return preco;
    }

    // Método para exibir os detalhes do produto
    public String exibirDetalhes() {
        return "Produto: " + nome + ", Preço: R$ " + String.format("%.2f", preco);
    }
}