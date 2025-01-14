# ATIVIDADE 11

## Exercício 1: Biblioteca Digital

Uma biblioteca digital armazena diferentes tipos de publicações, como livros e revistas. Todas as publicações possuem um título, um autor e uma data de publicação. Livros podem ser emprestados, enquanto revistas apenas podem ser lidas no local (não podem ser emprestadas). Além disso, as publicações precisam exibir suas informações básicas, como título e autor.

Tarefa:
1.	Crie uma classe abstrata para representar uma publicação.
2.	Crie duas subclasses: uma para livros e outra para revistas.
3.	Implemente uma interface que permita o empréstimo de publicações, aplicada apenas aos livros.
4.	Crie uma função que exiba as informações de todas as publicações cadastradas e indique quais podem ser emprestadas.

## Exercício 2: Sistema de Controle de Veículos

Uma empresa de transporte precisa de um sistema para gerenciar seus veículos. Existem dois tipos de veículos: automóveis e bicicletas. Todos os veículos podem ser usados para transporte, mas apenas automóveis precisam de combustível para funcionar. Automóveis têm uma capacidade de carga, enquanto bicicletas não têm.

Tarefa:
1.	Crie uma classe abstrata que represente veículos.
2.	Implemente duas subclasses: uma para automóveis e outra para bicicletas.
3.	Use uma interface para definir o comportamento de reabastecimento, aplicado apenas aos automóveis.
4.	Crie uma função que exiba a capacidade de carga de cada veículo e se ele precisa de combustível.

## Exercício 3: Sistema de Pagamento de Funcionários

Uma empresa quer automatizar o pagamento de seus funcionários. Existem funcionários fixos e funcionários freelancers. Funcionários fixos têm um salário mensal fixo e benefícios. Freelancers recebem de acordo com o número de horas trabalhadas e a taxa por hora. Todos os funcionários podem ser promovidos, mas apenas os fixos recebem aumento de salário ao serem promovidos.

Tarefa:
1.	Crie uma classe abstrata para representar funcionários.
2.	Implemente subclasses para funcionários fixos e freelancers, diferenciando o cálculo do pagamento.
3.	Use uma interface para representar a possibilidade de promoção.
4.	Crie uma função que exiba o pagamento total de todos os funcionários e identifique quais são fixos e quais são freelancers.

## Exercício 4: Sistema de Controle de Transporte Urbano

Uma empresa de transporte urbano deseja um sistema para gerenciar diferentes tipos de transporte: ônibus, metrô e bicicletas compartilhadas. Todos os meios de transporte possuem um identificador e um método para iniciar uma viagem.
- Ônibus e metrô operam em linhas fixas e têm uma capacidade de passageiros, além de paradas específicas.
- Bicicletas compartilhadas não operam em linhas e não têm capacidade de passageiros, mas precisam ser destravadas antes de iniciar a viagem.
- Apenas ônibus e metrô fazem paradas, mas o metrô pode operar em modo expresso, pulando algumas paradas intermediárias.
- Todos os meios de transporte precisam ser rastreados durante a viagem, para que a central saiba onde estão em tempo real.

Tarefa:
1.	Crie uma classe abstrata que represente um meio de transporte.
2.	Crie três interfaces:
    - Operação em linha fixa: que define as linhas e paradas.
    - Destravamento: para meios de transporte que precisam ser destravados.
    - Rastreamento: que permite informar a localização em tempo real.
3.	Implemente subclasses para ônibus, metrô e bicicletas compartilhadas, utilizando as interfaces adequadas.
4.	Crie uma função que simule uma viagem para cada tipo de transporte, exibindo a linha (se houver), paradas realizadas e localização atual.

## Exercício 5: Sistema de Gestão de Produtos para E-commerce

Uma plataforma de e-commerce quer gerenciar produtos de diferentes categorias: eletrônicos, roupas e alimentos. Todos os produtos têm nome, preço e podem ser adicionados ao carrinho de compras.
- Produtos eletrônicos têm garantia e precisam ser testados antes de serem enviados ao cliente.
- Roupas podem ser personalizadas com diferentes tamanhos e cores.
- Alimentos têm data de validade e devem ser verificados antes de serem vendidos.
- Além disso, todos os produtos podem ter descontos aplicados, e o e-commerce quer exibir uma mensagem específica ao aplicar o desconto, dependendo do tipo de produto.

Tarefa:
1.	Crie uma classe abstrata que represente um produto.
2.	Crie três interfaces:
    - Testável: para produtos que precisam ser testados antes do envio.
    - Personalizável: para produtos que podem ser personalizados.
    - Verificável: para produtos que têm uma data de validade e precisam ser verificados.
3.	Implemente subclasses para eletrônicos, roupas e alimentos, utilizando as interfaces apropriadas.
4.	Crie uma função que adicione diferentes produtos ao carrinho, aplique descontos e exiba informações específicas sobre a personalização, garantia e validade de cada produto.