# ATIVIDADE 12

## Questão 1: Calculadora

Implemente uma classe chamada `CalculadoraAvancada` que realiza operações matemáticas básicas. A classe deve conter métodos sobrecarregados para o cálculo de soma. Além disso, o programa deve lidar com exceções para evitar problemas como divisão por zero ou números inválidos.

### Requisitos
1. **Sobrecarga de Métodos**:
   - Crie três versões do método `soma`:
     - Soma de dois inteiros.
     - Soma de dois números reais (`double`).
     - Soma de uma lista de inteiros (`int[]`).
   
2. **Tratamento de Exceções**:
   - Crie um método chamado `divisao` que divide dois números reais (`double`). Este método deve lançar uma exceção caso o divisor seja 0.
   - No método principal (`main`), use `try-catch` para capturar e tratar a exceção lançada.

3. **Método Principal**:
   - No método `main`, teste todas as operações da classe `CalculadoraAvancada` e trate exceções que possam ocorrer.

---

## Questão 2: Sistema de Pagamentos com Sobrescrita e Tratamento de Exceções

Implemente um sistema de pagamentos utilizando classes e métodos sobrescritos. O sistema deve incluir diferentes tipos de pagamento (ex.: crédito e débito) e deve tratar exceções como valores inválidos ou saldo insuficiente.

### Requisitos
1. **Sobrescrita de Métodos**:
   - Crie uma classe base chamada `Pagamento` com um método `processarPagamento(double valor)`.
   - Crie duas subclasses: `PagamentoCredito` e `PagamentoDebito`, sobrescrevendo o método `processarPagamento` para implementar regras específicas:
     - **Pagamento no crédito**: Aceita qualquer valor.
     - **Pagamento no débito**: Lança uma exceção se o valor for maior que o saldo disponível.

2. **Tratamento de Exceções**:
   - Capture e trate a exceção de saldo insuficiente no método principal (`main`), exibindo uma mensagem informativa.

3. **Saldo no Débito**:
   - Inicialize o saldo do pagamento no débito com um valor fixo (ex.: 100.00).
   - Implemente um método para exibir o saldo restante após a operação.

4. **Método Principal**:
   - No método `main`, crie instâncias de `PagamentoCredito` e `PagamentoDebito`, processando pagamentos para ambos os tipos e tratando as exceções quando necessário.

---

## Questão 3: Gerenciamento de Contas Bancárias com Sobrecarga e Tratamento de Exceções

Implemente um sistema de gerenciamento de contas bancárias. A classe deve suportar múltiplas formas de saque utilizando métodos sobrecarregados e tratar exceções relacionadas a operações inválidas, como saldo insuficiente ou valores negativos.

### Requisitos

1. **Sobrecarga de Métodos**:
   - Implemente um método `sacar` com três versões:
     - Saque de um valor fixo (`double`).
     - Saque de um valor e uma taxa de serviço (`double valor, double taxa`).
     - Saque utilizando um cheque especial com limite adicional (`double valor, double limiteChequeEspecial`).

2. **Tratamento de Exceções**:
   - Crie uma exceção para tratar:
     - Tentativa de sacar um valor maior que o saldo e o limite disponível (no caso do cheque especial).
     - Tentativa de sacar valores negativos.

3. **Saldo Inicial**:
   - A classe `ContaBancaria` deve ter um saldo inicial configurado no construtor.

4. **Método Principal**:
   - No método `main`, teste todas as versões do método `sacar` e trate as exceções lançadas, exibindo mensagens apropriadas.

---

## Questão 4: Sistema de Gerenciamento de Produtos com Sobrescrita, Sobrecarga e Exceções

Implemente um sistema para gerenciar produtos em um estoque. O sistema deve permitir registrar novos produtos, atualizar informações de produtos existentes e lidar com exceções, como tentativas de registrar produtos com informações inválidas.

### Requisitos

1. **Sobrescrita de Métodos**:
   - Crie uma classe base chamada `Produto` com um método `calcularPrecoFinal(double taxa)`, que aplica uma taxa ao preço base.
   - Implemente duas subclasses:
     - **ProdutoEletronico**: Adiciona uma taxa extra de 10% ao preço final.
     - **ProdutoAlimenticio**: Reduz 5% do preço final, simulando desconto.

2. **Sobrecarga de Métodos**:
   - Crie duas versões do método `registrarProduto` na classe `Estoque`:
     - Um método que registra um produto apenas com nome e preço.
     - Outro método que registra um produto com nome, preço e quantidade em estoque.

3. **Tratamento de Exceções**:
   - Crie uma exceção que será lançada quando:
     - O nome do produto for nulo ou vazio.
     - O preço for menor ou igual a zero.

4. **Método Principal**:
   - No método `main`, crie uma instância de `Estoque`, registre produtos utilizando ambos os métodos sobrecarregados, calcule o preço final para produtos específicos e trate exceções lançadas ao tentar registrar produtos inválidos.
