# Revisão 2 - Mini-Sistema iFood — Cenário Integrado de Revisão de Java OO  
Este cenário revisa os principais conceitos da disciplina em um único contexto coerente inspirado no iFood.  
O objetivo é que o aluno aplique **Herança, super(), Polimorfismo, Sobrecarga, Sobrescrita, Classe Abstrata, Interface, Classes Internas (não estática, estática e local), Classe Anônima e Tratamento de Exceções** sem ver código, apenas entendendo o que deve ser implementado.

---

## 🍽️ Descrição Geral do Cenário  
Você está modelando partes essenciais de um sistema de delivery (estilo iFood).  
Esse sistema envolve produtos vendidos, pedidos feitos por clientes, personalizações opcionais e notificações disparadas por mudanças de status.

Cada área do sistema pedirá que você utilize conscientemente um conceito de OO.

---

## 1. **HERANÇA**
### Situação que deve ser implementada:
- Criar uma **superclasse Produto**, contendo atributos básicos como nome, preço e restaurante.  
- Criar subclasses como **Prato**, **Bebida** e **Sobremesa**, cada uma com atributos próprios (por exemplo: tempo de preparo, temperatura, tamanho ou sabor adicional).  
- No construtor das subclasses, **utilizar `super()`** para inicializar os atributos herdados.  
- Demonstrar o uso de `super` para **chamar métodos da superclasse** e também para **acessar atributos herdados** quando houver conflito de nomes.  
- Mostrar claramente quando a subclasse estende e reutiliza comportamentos da superclasse.

---

## 2. **POLIMORFISMO, SOBRECARGA E SOBRESCRITA DE MÉTODOS**
### Situação que deve ser implementada:
- Criar um método genérico em Produto para exibir detalhes, e exigir que cada subclasse **sobrescreva** esse método com informações personalizadas.  
- Criar métodos de desconto ou cálculo de preço final com **sobrecarga**, recebendo diferentes tipos de parâmetros (percentual, valor fixo, cupom etc.).  
- Criar uma lista que armazene produtos genéricos e, ao percorrê-la, demonstrar comportamentos diferentes para cada tipo específico — evidenciando **polimorfismo** em ação.

---

## 3. **CLASSE ABSTRATA E INTERFACE**
### Situação que deve ser implementada:
- Tornar Produto uma **classe abstrata**, exigindo que toda subclasse informe sua categoria (ex.: prato, bebida, sobremesa) através de um método abstrato.  
- Criar uma **interface de Personalização**, indicando que certos produtos podem receber modificações (como adicionar molho, remover ingrediente, trocar acompanhamento).  
- Implementar essa interface apenas nas subclasses apropriadas, reforçando o design flexível e extensível.

---

## 4. **CLASSE INTERNA NÃO ESTÁTICA, CLASSE ESTÁTICA E CLASSE LOCAL**
### Situação que deve ser implementada:

### ✔ Classe Interna Não Estática
- Dentro da classe Pedido, criar uma classe interna chamada **ItemPedido**, representando um produto e sua quantidade.  
- Essa classe deve depender da instância de Pedido e só pode existir através dela, reforçando o vínculo lógico entre pedido e itens.

### ✔ Classe Estática (Nested Static Class)
- Criar dentro de Pedido uma classe **ResumoPedido** estatística, usada para gerar um resumo final (total de itens, valor total, estimativa de entrega).  
- Essa classe não depende da instância do pedido e pode ser criada independentemente, sendo apenas uma forma de organizar melhor o código.

### ✔ Classe Local (Local Class)
- Dentro de um método que calcula o tempo estimado de entrega, criar uma classe local que encapsule cálculos internos relacionados ao trânsito, distância ou fila de preparo.  
- Essa classe deve existir **somente** dentro do método específico.

---

## 5. **CLASSE ANÔNIMA**
### Situação que deve ser implementada:
- Criar uma interface para notificações de status do pedido (como “confirmado”, “a caminho”, “entregue”).  
- Ao atualizar o status do pedido, registrar uma **classe anônima** que implemente essa interface, definindo na hora o comportamento da notificação.  
- Essa implementação deve ser usada apenas naquele momento, sem necessidade de uma classe nomeada separada.

---

## 6. **TRATAMENTO DE EXCEÇÕES**
### Situação que deve ser implementada:
- Criar uma exceção específica para representar erros de operação no pedido, como quando o usuário tenta inserir uma quantidade negativa ou preço inválido.  
- Dentro do Pedido ou ItemPedido, validar os dados e **lançar exceções personalizadas** quando necessário.  
- Usar `try/catch` no ponto em que o pedido é montado, exibindo mensagens adequadas ao usuário.  
- O objetivo é reforçar que exceções ajudam a manter o sistema mais seguro e robusto.

---

## Conceitos avaliados
- Herança
- Polimorfismo, Sobrecarga e Sobrescrita de métodos
- Casse abstrata e Interface
- Classe interna e anônima; Tratamento de exceções