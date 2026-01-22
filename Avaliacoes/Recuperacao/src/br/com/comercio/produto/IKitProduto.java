package br.com.comercio.produto;

import java.util.List;

/**
 * Interface que define as operações para kits de produtos.
 * Seu principal objetivo é permitir a manipulação de múltiplos produtos como um único conjunto.
 */
public interface IKitProduto {
    /**
     * Adiciona um produto ao kit de produtos.
     * @param produto que será adicionado ao kit de produtos.
     */
    void adicionarProduto(IProduto produto);

    /**
     * Remove um produto do kit de produtos.
     * @param produto que será removido do kit de produtos.
     */
    void removerProduto(IProduto produto);

    /**
     * Busca um produto no kit de produtos.
     * @param produto que será buscado no kit de produtos.
     * @return o produto encontrado no kit de produtos. Retorna null se o produto não for encontrado.
     */
    IProduto buscarProduto(IProduto produto);

    /**
     * Obtém a lista de produtos do kit de produtos.
     * @return uma List<IProduto> contendo os produtos do kit de produtos. Retorna null se o kit não conter produtos.
     */
    List<IProduto> obterProdutosDoKit();
}
