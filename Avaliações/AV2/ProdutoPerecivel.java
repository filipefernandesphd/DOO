import java.time.LocalDate;

public class ProdutoPerecivel extends Produto {
    // Atributo específico para Produto Perecível
    private LocalDate dataValidade;

    // Método para definir a data de validade
    public void setDataValidade(LocalDate dataValidade) {
        this.dataValidade = dataValidade;
    }

    // Método para obter a data de validade
    public LocalDate getDataValidade() {
        return dataValidade;
    }

    // Sobrescrita do método exibirDetalhes
    public String exibirDetalhes() {
        return super.exibirDetalhes() + ", Data de Validade: " + dataValidade;
    }
}