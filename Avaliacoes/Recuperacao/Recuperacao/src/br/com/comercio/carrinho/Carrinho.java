package br.com.comercio.carrinho;

import java.util.List;
import java.util.ArrayList;

import br.com.comercio.produto.IProduto;
import br.com.comercio.usuario.*;

/**
 * Implementação da interface ICarrinho representando um carrinho de compras.
 * Seu principal objetivo é gerenciar os produtos adicionados ao carrinho por um cliente específico.
 */
public class Carrinho implements ICarrinho {
    private Usuario cliente;            // Cliente associado ao carrinho
    private List<ItemCarrinho> itens;   // Lista de itens no carrinho
    private double precoTotalCarrinho;  // Preço total do carrinho

    /**
     * Construtor da classe Carrinho.
     * @param cliente objeto Usuario que representa o cliente associado ao carrinho.
     */
    public Carrinho(Usuario cliente) {
        this.cliente = cliente;
        this.itens = new ArrayList<ItemCarrinho>();
        this.precoTotalCarrinho = 0.0;
    }

    /**
     * Retorna o cliente associado ao carrinho.
     * @return um objeto Usuario representando o cliente.
     */
    public Usuario getCliente() { return cliente; }

    /**
     * Define o cliente associado ao carrinho.
     * @param cliente objeto Usuario que definirá o cliente.
     */
    public void setCliente(Usuario cliente) { this.cliente = cliente; }

    /**
     * Retorna a lista de itens no carrinho.
     * @return uma lista de objetos ItemCarrinho representando os itens no carrinho.
     */
    public List<ItemCarrinho> getItens() { return itens; }

    /**
     * Adiciona um produto ao carrinho com a quantidade especificada.
     * @param produto objeto IProduto que será adicionado ao carrinho.
     * @param quantidade inteiro representando a quantidade do produto a ser adicionada.
     */
    public void adicionarProduto(IProduto produto, int quantidade){
        this.itens.add(new ItemCarrinho(produto, quantidade));
    }
    
    /**
     * Remove um produto do carrinho.
     * @param produto objeto IProduto que será removido do carrinho.
     */
    public void removerProduto(IProduto produto){
        for (ItemCarrinho itemCarrinho : itens) {
            if (itemCarrinho.getProduto().equals(produto)) {
                this.itens.remove(itemCarrinho);
                break;
            }
        }
    }

    /**
     * Muda a quantidade de um produto no carrinho.
     * @param produto objeto IProduto cuja quantidade será alterada.
     * @param novaQuantidade inteiro representando a nova quantidade do produto.
     */
    public void mudarQuantidadeProduto(IProduto produto, int novaQuantidade){
        for (ItemCarrinho itemCarrinho : itens) {
            if (itemCarrinho.getProduto().equals(produto)) {
                itemCarrinho.setQuantidade(novaQuantidade);
                break;
            }
        }
    }

    /**
     * Retorna o preço total do carrinho.
     * @return um double representando o preço total do carrinho.
     */
    public double getPrecoTotalCarrinho(){
        for (ItemCarrinho itemCarrinho : itens) {
            this.precoTotalCarrinho += itemCarrinho.getPrecoItemTotal();
        }
        return this.precoTotalCarrinho;
    }
}
