package br.com.comercio.carrinho;

import br.com.comercio.produto.IProduto;

/**
 * Classe que representa um item no carrinho de compras e implementa a interface {@link IItemCarrinho}.
 * Cada item é composto por um produto, a quantidade desse produto
 * e o preço total do item baseado na quantidade.
 */
public class ItemCarrinho implements IItemCarrinho {
    private IProduto produto;
    private int quantidade;
    private double precoTotalItem;

    /**
     * Construtor da classe ItemCarrinho.
     * @param produto objeto IProduto que representa o produto associado ao item.
     * @param quantidade inteiro que representa a quantidade do produto no item.
     */
    public ItemCarrinho(IProduto produto, int quantidade) {
        this.produto = produto;
        this.quantidade = quantidade;
    }

    /**
     * Retorna o produto associado ao item do carrinho.
     * @return um objeto IProduto representando o produto.
     */
    @Override
    public IProduto getProduto() {
        return produto;
    }

    /**
     * Define o produto associado ao item do carrinho.
     * @param produto objeto IProduto que definirá o produto.
     */
    @Override
    public void setProduto(IProduto produto) {
        this.produto = produto;
    }

    /**
     * Retorna a quantidade do produto no item do carrinho.
     * @return um inteiro representando a quantidade do produto.
     */
    @Override
    public int getQuantidade() {
        return quantidade;
    }

    /**
     * Define a quantidade do produto no item do carrinho.
     * @param quantidade inteiro que definirá a quantidade do produto.
     */
    @Override
    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    /**
     * Retorna o preço total do item no carrinho.
     * @return um double representando o preço total do item.
     */
    @Override
    public double getPrecoItemTotal() {
        precoTotalItem = produto.getPrecoProduto() * quantidade;
        return precoTotalItem;
    }
}
