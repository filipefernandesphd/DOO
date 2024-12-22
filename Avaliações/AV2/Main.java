import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        // Criando objetos de ProdutoPerecivel
        ProdutoPerecivel leite = new ProdutoPerecivel();
        leite.setNome("Leite");
        leite.setPreco(4.50);
        leite.setDataValidade(LocalDate.of(2024, 7, 15));

        ProdutoPerecivel carne = new ProdutoPerecivel();
        carne.setNome("Carne Bovina");
        carne.setPreco(45.00);
        carne.setDataValidade(LocalDate.of(2024, 6, 20));

        ProdutoPerecivel iogurte = new ProdutoPerecivel();
        iogurte.setNome("Iogurte Natural");
        iogurte.setPreco(3.50);
        iogurte.setDataValidade(LocalDate.of(2024, 6, 25));

        // Criando objetos de ProdutoNaoPerecivel
        ProdutoNaoPerecivel panela = new ProdutoNaoPerecivel();
        panela.setNome("Panela de Ferro");
        panela.setPreco(120.00);
        panela.setMesesGarantia(24);

        ProdutoNaoPerecivel detergente = new ProdutoNaoPerecivel();
        detergente.setNome("Detergente Líquido");
        detergente.setPreco(2.50);
        detergente.setMesesGarantia(6);

        ProdutoNaoPerecivel escova = new ProdutoNaoPerecivel();
        escova.setNome("Escova de Dentes");
        escova.setPreco(5.00);
        escova.setMesesGarantia(12);

        // Criando o Caixa
        Caixa caixa1 = new Caixa();
        caixa1.setIdentificador("Caixa 1");

        // Registrando vendas no Caixa
        caixa1.registrarVenda(leite);
        caixa1.registrarVenda(carne);
        caixa1.registrarVenda(iogurte);
        caixa1.registrarVenda(panela);
        caixa1.registrarVenda(detergente);
        caixa1.registrarVenda(escova);

        // Exibindo relatório de vendas
        caixa1.exibirVendas();
    }
}