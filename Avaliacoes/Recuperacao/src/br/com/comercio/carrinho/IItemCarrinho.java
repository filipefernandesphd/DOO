package br.com.comercio.carrinho;

import br.com.comercio.produto.IProduto;

/**
 * Interface que define as operações de um item no carrinho de compras.
 * Seu principal objetivo é gerenciar o produto e a quantidade associada a esse item,
 * bem como calcular o preço total do item com base na quantidade.
 */
public interface IItemCarrinho {
    /**
     * Retorna o produto associado ao item do carrinho.
     * @return um objeto IProduto representando o produto.
     */
    IProduto getProduto();

    /**
     * Define o produto associado ao item do carrinho.
     * @param produto objeto IProduto que definirá o produto.
     */
    void setProduto(IProduto produto);

    /**
     * Retorna a quantidade do produto no item do carrinho.
     * @return um inteiro representando a quantidade do produto.
     */
    int getQuantidade();

    /**
     * Define a quantidade do produto no item do carrinho.
     * @param quantidade inteiro que definirá a quantidade do produto.
     */
    void setQuantidade(int quantidade);

    /**
     * Retorna o preço total do item no carrinho.
     * @return um double representando o preço total do item.
     */
    double getPrecoItemTotal();
}
