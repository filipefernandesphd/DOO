package br.com.comercio.produto;

/**
 * Classe que representa um produto individual.
 * Esta classe estende a classe abstrata KitProdutoAbstrato e implementa os métodos definidos na interface IProduto.
 */
public class Produto extends KitProdutoAbstrato {
    /**
     * Construtor da classe Produto.
     * @param nomeProduto String que definirá o nome do produto.
     * @param precoProduto Double que definirá o preço do produto.
     * @param estoque Double que definirá o estoque do produto.
     */
    public Produto(String nomeProduto, Double precoProduto, Double estoque) {
        this.nomeProduto = nomeProduto;
        this.precoProduto = precoProduto;
        this.estoque = estoque;
    }

    /**
     * Retorna o nome do produto.
     * @return uma String contendo o nome do produto.
     */
    public String getNomeProduto(){ return this.nomeProduto; }

    /**
     * Define o nome do produto.
     * @param nomeProduto String que definirá o nome do produto.
     */
    public void setNomeProduto(String nomeProduto){ this.nomeProduto = nomeProduto; }

    /**
     * Retorna o preço do produto.
     * @return um Double contendo o preço do produto.
     */
    public Double getPrecoProduto(){ return this.precoProduto; }

    /**
     * Define o preço do produto.
     * @param precoProduto Double que definirá o preço do produto.
     */
    public void setPrecoProduto(Double precoProduto){ this.precoProduto = precoProduto; } 
        
    /**
     * Retorna o estoque do produto.
     * @return um Double contendo o estoque do produto.
     */
    public Double getEstoque(){ return this.estoque; }

    /**
     * Define o estoque do produto.
     * @param estoque Double que definirá o estoque do produto.
     */
    public void setEstoque(Double estoque){
        try {
            this.estoque = estoque;
        } catch (Exception e) {
            System.out.println("Erro ao definir o estoque: " + e.getMessage());
        }
    }
}
