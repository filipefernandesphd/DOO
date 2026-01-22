package br.com.comercio.produto;

/**
 * Interface que define os métodos para manipulação de produtos.
 * Seu principal objetivo é garantir que todas as classes de produtos implementem os mesmos métodos básicos.
 */
public interface IProduto {
    /**
     * Retorna o nome do produto.
     * @return uma String contendo o nome do produto.
     */
    String getNomeProduto();

    /**
     * Define o nome do produto.
     * @param nomeProduto String que definirá o nome do produto.
     */
    public void setNomeProduto(String nomeProduto);

    /**
     * Retorna o preço do produto.
     * @return um Double contendo o preço do produto.
     */
    Double getPrecoProduto();

    /**
     * Define o preço do produto.
     * Observação: este método deve lançar uma exceção ao ser chamado em kit de produtos.
     * @param precoProduto Double que definirá o preço do produto.
     */
    void setPrecoProduto(Double precoProduto);

    /**
     * Retorna o estoque do produto.
     * @return um Double contendo o estoque do produto.
     */
    Double getEstoque();

    /**
     * Define o estoque do produto.
     * @param estoque Double que definirá o estoque do produto.
     */
    void setEstoque(Double estoque);
}
