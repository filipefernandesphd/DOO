package br.com.comercio.produto;

import java.util.List;
import java.util.ArrayList;

/**
 * Classe que representa um kit de produtos.
 * Esta classe estende a classe abstrata KitProdutoAbstrato e implementa os métodos definidos na interface IKitProduto.
 */
public class KitProduto extends KitProdutoAbstrato implements IKitProduto {
    private List<IProduto> produtosNoKit; // Lista para armazenar os produtos do kit

    /**
     * Construtor da classe KitProduto.
     * @param nomeProduto String que define o nome do kit de produtos.
     */
    public KitProduto(String nomeProduto) {
        this.nomeProduto = nomeProduto;
        this.produtosNoKit = new ArrayList<IProduto>();
    }

    /**
     * Métodos da classe abstrata KitProdutoAbstrato
     */

    /**
     * Retorna o nome do kit de produtos.
     * @return uma String contendo o nome do kit de produtos.
     */
    public String getNomeProduto(){ return this.nomeProduto; }

    /**
     * Define o nome do kit de produtos.
     * @param nomeProduto String que definirá o nome do kit de produtos.
     */
    public void setNomeProduto(String nomeProduto){ this.nomeProduto = nomeProduto; }

    /**
     * Retorna o preço do kit de produtos.
     * @return um Double contendo o preço do kit de produtos.
     */
    public Double getPrecoProduto(){
        if(this.produtosNoKit == null || this.produtosNoKit.isEmpty()){
            throw new IllegalStateException("O kit de produtos está vazio.");
        } else {
            Double precoTotal = 0.0;
            for(IProduto produto : this.produtosNoKit){
                precoTotal += produto.getPrecoProduto();
            }
            return precoTotal;
        }
    }

    /**
     * Este método lança uma exceção, pois kits de produtos não possuem preço individual.
     * @param precoProduto
     */
    public void setPrecoProduto(Double precoProduto){
        throw new UnsupportedOperationException("Kits de produtos não possuem preço individual.");
    }

    /**
     * Este método lança uma exceção, pois kits de produtos não possuem estoque individual.
     */
    public Double getEstoque(){
        throw new UnsupportedOperationException("Kits de produtos não possuem estoque individual.");
    }

    /**
     * Este método lança uma exceção, pois kits de produtos não possuem estoque individual.
     * @param estoque 
     */
    public void setEstoque(Double estoque){
        throw new UnsupportedOperationException("Kits de produtos não possuem estoque individual.");
    }

    /**
     * Métodos da interface IKitProduto
     */

    /**
     * Adiciona um produto ao kit de produtos.
     * @param produto que será adicionado ao kit de produtos.
     */
    public void adicionarProduto(IProduto produto){
        try {
            this.produtosNoKit.add(produto);
        } catch (Exception e) {
            System.err.println("Erro ao adicionar produto ao kit: " + e.getMessage());
        }
    }

    /**
     * Remove um produto do kit de produtos.
     * @param produto que será removido do kit de produtos.
     */
    public void removerProduto(IProduto produto){
        try {
            this.produtosNoKit.remove(produto);
        } catch (Exception e) {
            System.err.println("Erro ao remover produto do kit: " + e.getMessage());
        }
    }

    /**
     * Busca um produto no kit de produtos.
     * @param produto que será buscado no kit de produtos.
     * @return o produto encontrado no kit de produtos. Retorna null se o produto não for encontrado.
     */
    public IProduto buscarProduto(IProduto produto){     
        for(IProduto p : this.produtosNoKit){
            if(p.equals(produto)){
                return p;
            }
        }
        return null; // Retorna null se o produto não for encontrado
    }

    /**
     * Obtém a lista de produtos do kit de produtos.
     * @return uma List<IProduto> contendo os produtos do kit de produtos. Retorna null se o kit não conter produtos.
     */
    public List<IProduto> obterProdutosDoKit(){
        try {
            return this.produtosNoKit;
        } catch (Exception e) {
            System.err.println("Erro ao obter produtos do kit: " + e.getMessage());
            return null;
        }
    }
    
}
