package br.com.comercio.produto;

/**
 * Classe abstrata que implementa a interface {@link IProduto}.
 * Seu principal objetivo é fornecer uma base para a criação de kits de produtos.
 */
public abstract class KitProdutoAbstrato implements IProduto {
    /**
     * Nome do kit de produtos.
     */
    protected String nomeProduto;

    /**
     * Retorna o nome do kit de produtos.
     */
    protected Double precoProduto;  

    /**
     * Retorna o preço do kit de produtos.
     */
    protected Double estoque;       

    /**
     * Construtor padrão para a classe KitProdutoAbstrato.
     */
    public KitProdutoAbstrato() { /* Construtor vazio */ }
}
