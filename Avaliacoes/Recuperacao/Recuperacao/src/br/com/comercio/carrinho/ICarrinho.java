package br.com.comercio.carrinho;

import java.util.List;

import br.com.comercio.produto.IProduto;
import br.com.comercio.usuario.Usuario;

/**
 * Interface que define as operações de um carrinho de compras.
 * Seu principal objetivo é gerenciar os produtos adicionados ao carrinho,
 * permitindo adicionar, remover e alterar a quantidade de produtos,
 * bem como calcular o preço total dos itens no carrinho.
 */
public interface ICarrinho {
    /**
     * Retorna o cliente associado ao carrinho.
     * @return um objeto Usuario representando o cliente.
     */
    Usuario getCliente();

    /**
     * Define o cliente associado ao carrinho.
     * @param cliente objeto Usuario que definirá o cliente.
     */
    void setCliente(Usuario cliente);

    /**
     * Retorna a lista de itens no carrinho.
     * @return uma lista de objetos ItemCarrinho representando os itens no carrinho.
     */
    List<ItemCarrinho> getItens();

    /**
     * Adiciona um produto ao carrinho com a quantidade especificada.
     * @param produto objeto IProduto que será adicionado ao carrinho.
     * @param quantidade inteiro representando a quantidade do produto a ser adicionada.
     */
    void adicionarProduto(IProduto produto, int quantidade);

    /**
     * Remove um produto do carrinho.
     * @param produto objeto IProduto que será removido do carrinho.
     */
    void removerProduto(IProduto produto);

    /**
     * Muda a quantidade de um produto no carrinho.
     * @param produto objeto IProduto cuja quantidade será alterada.
     * @param novaQuantidade inteiro representando a nova quantidade do produto.
     */
    void mudarQuantidadeProduto(IProduto produto, int novaQuantidade);

    /**
     * Retorna o preço total do carrinho.
     * @return um double representando o preço total do carrinho.
     */
    double getPrecoTotalCarrinho();
}
