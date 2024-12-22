public class ProdutoNaoPerecivel extends Produto {
    // Atributo específico para Produto Não Perecível
    private int mesesGarantia;

    // Método para definir os meses de garantia
    public void setMesesGarantia(int mesesGarantia) {
        this.mesesGarantia = mesesGarantia;
    }

    // Método para obter os meses de garantia
    public int getMesesGarantia() {
        return mesesGarantia;
    }

    // Sobrescrita do método exibirDetalhes
    public String exibirDetalhes() {
        return super.exibirDetalhes() + ", Garantia: " + mesesGarantia + " meses";
    }
}