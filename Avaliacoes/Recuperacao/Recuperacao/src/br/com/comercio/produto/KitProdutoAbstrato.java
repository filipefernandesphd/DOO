package br.com.comercio.produto;

/**
 * Classe abstrata que implementa a interface IProduto.
 * Seu principal objetivo é fornecer uma base para a criação de kits de produtos.
 */
public abstract class KitProdutoAbstrato implements IProduto {
    protected String nomeProduto;   // Nome do kit de produtos
    protected Double precoProduto;  // Preço do kit de produtos
    protected Double estoque;       // Estoque do kit de produtos
}
