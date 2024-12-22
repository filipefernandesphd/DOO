# AV2

Um supermercado deseja implementar um sistema básico de ponto de vendas (PDV) para gerenciar os produtos vendidos e os caixas que realizam as vendas. O sistema precisa registrar as vendas de maneira organizada e facilitar o controle dos itens vendidos.

## Regras do Sistema:
1. O supermercado vende diferentes tipos de produtos, e todo produto tem um nome e um preço.
1. Existem dois tipos principais de produtos: Perecíveis e Não Perecíveis.
1. Os produtos Perecíveis possuem uma data de validade.
1. Os produtos Não Perecíveis possuem uma garantia de meses.
1. ada Caixa representa um atendente do supermercado que registra as compras. Um caixa tem um identificador (por exemplo, “Caixa 1”) e mantém uma lista de produtos vendidos.
1. Um Caixa pode registrar a venda de diferentes produtos (perecíveis ou não perecíveis). Quando um produto é vendido, ele deve ser adicionado à lista de produtos vendidos pelo caixa.

## Tarefas:

Com base no cenário descrito acima, implemente as classes necessárias aplicando os conceitos de herança, polimorfismo (sobrescrita de métodos) e composição (usando ArrayList ou algo do gênero).
1. Crie uma classe base para os produtos e as classes derivadas para Perecíveis e Não Perecíveis.
1. Implemente a classe Caixa que contém a lista de produtos vendidos e um método para registrar as vendas.
1. Utilize polimorfismo para exibir informações específicas dos produtos (por exemplo, a data de validade para perecíveis ou a garantia para não perecíveis) ao registrar uma venda.
1. Demonstre a funcionalidade do sistema com pelo menos 3 produtos de cada tipo sendo registrados por 1 caixa.
