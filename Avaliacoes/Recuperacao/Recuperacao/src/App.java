import br.com.comercio.produto.*;
import br.com.comercio.usuario.*;
import br.com.comercio.carrinho.*;

public class App {
    /** 
     * @param args
     * @throws Exception
     */
    public static void main(String[] args) throws Exception {

        /**
         * CLIENTES
         */

        // Criar cliente
        Usuario cliente1 = new Usuario("Fulano de Tal", "fulano@email.com");
        Usuario cliente2 = new Usuario("Ciclano de Tal", "ciclano@gmail.com");

        // Setters e Getters do nome do cliente
        cliente1.setNome("Fulano X");
        cliente2.setNome("Ciclano Y");
        System.out.println(cliente1.getNome());
        System.out.println(cliente2.getNome());

        // Setters e Getters do email do cliente
        cliente1.setEmail("novofulano@email.com");
        cliente2.setEmail("novociclano@gmail.com");
        System.out.println(cliente1.getEmail());
        System.out.println(cliente2.getEmail());

        /**
         * PRODUTOS INDIVIDUAIS
         */

        // Cria produtos individuais
        Produto produto1 = new Produto("Produto AA", 10.0, 100.0);
        Produto produto2 = new Produto("Produto BB", 20.0, 20.0);
        Produto produto3 = new Produto("Produto C", 30.0, 80.0);

        // Setters e Getters dos nomes dos produtos individuais
        produto1.setNomeProduto("Produto A");
        produto2.setNomeProduto("Produto B");
        produto3.setNomeProduto("Produto C");
        System.out.println(produto1.getNomeProduto());
        System.out.println(produto2.getNomeProduto());
        System.out.println(produto3.getNomeProduto());

        // Setters e Getters dos preços dos produtos individuais
        produto1.setPrecoProduto(15.0);
        produto2.setPrecoProduto(25.0);
        produto3.setPrecoProduto(35.0);
        System.out.println(produto1.getPrecoProduto());
        System.out.println(produto2.getPrecoProduto());
        System.out.println(produto3.getPrecoProduto());

        // Setters e Getters dos estoques dos produtos individuais
        produto1.setEstoque(90.0);
        produto2.setEstoque(15.0);
        produto3.setEstoque(70.0);
        System.out.println(produto1.getEstoque());
        System.out.println(produto2.getEstoque());    
        System.out.println(produto3.getEstoque());

        /**
         * KIT DE PRODUTOS
         */

        // Cria kit de produtos
        KitProduto kit1 = new KitProduto("Kit 1");

        // Setters e Getters do nome do kit de produtos
        kit1.setNomeProduto("Kit de Produtos 1");
        System.out.println(kit1.getNomeProduto());

        // Adiciona produtos ao kit de produtos
        kit1.adicionarProduto(produto1);
        kit1.adicionarProduto(produto2);
        kit1.adicionarProduto(produto3);

        // Setters e Getters do preço do kit de produtos
        // kit1.setPrecoProduto(100.0); // Deve lançar uma exceção ao descomentar esta linha
        System.out.println(kit1.getPrecoProduto());

        // Setters e Getters do estoque do kit de produtos
        // kit1.setEstoque(50.0); // Deve lançar uma exceção ao descomentar esta linha
        // System.out.println(kit1.getEstoque()); // Deve lançar uma exceção ao descomentar esta linha

        // Retorna os produtos do kit de produtos
        System.out.println("Produto no kit:");
        for(IProduto produto : kit1.obterProdutosDoKit()){  
            System.out.println("\t" + produto.getNomeProduto());
        }

        // Remove um produto do kit de produtos
        kit1.removerProduto(produto1);

        // Retorna os produtos do kit de produtos após remover um produto
        System.out.println("Produto no kit:");
        for(IProduto produto : kit1.obterProdutosDoKit()){  
            System.out.println("\t" + produto.getNomeProduto());
        }
        
        // Busca um produto no kit de produtos
        IProduto produtoBuscado = kit1.buscarProduto(produto2);
        System.out.println(produtoBuscado.getNomeProduto());

        // Lança exceção ao buscar um produto que não está no kit de produtos
        IProduto produtoNaoExistente = kit1.buscarProduto(produto1);
        // System.out.println(produtoNaoExistente.getNomeProduto()); // Deve lançar uma exceção ao descomentar esta linha

        /**
         * CARRINHO DE COMPRAS
         */

        // Cria carrinho de compras
        Carrinho carrinho1 = new Carrinho(cliente1);

        // Setters e Getters do cliente do carrinho
        carrinho1.setCliente(cliente2);
        System.out.println(carrinho1.getCliente().getNome());

        // Adiciona produtos ao carrinho
        carrinho1.adicionarProduto(produto1, 2);
        carrinho1.adicionarProduto(kit1, 1);

        // Retorna os itens do carrinho
        for(ItemCarrinho item : carrinho1.getItens()){
            System.out.println("Item no carrinho: " + item.getProduto().getNomeProduto() + " - Quantidade: " + item.getQuantidade());
        }

        // Muda a quantidade de um produto no carrinho
        carrinho1.mudarQuantidadeProduto(produto1, 5);
        carrinho1.mudarQuantidadeProduto(kit1, 5);

        // Retorna os itens do carrinho após mudar a quantidade
        for(ItemCarrinho item : carrinho1.getItens()){
            System.out.println("Item no carrinho: " + item.getProduto().getNomeProduto() + " - Quantidade: " + item.getQuantidade());
        }

        // Retorna o preço total do carrinho
        System.out.println("Preço total do carrinho: " + carrinho1.getPrecoTotalCarrinho());
    }
}
