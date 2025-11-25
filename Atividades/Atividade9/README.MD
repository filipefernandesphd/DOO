# Atividade 9

## Implemente polimorfismo nos cenários abaixo:

- **Exercício 1**: Um jogo possui diferentes tipos de heróis, como Magos, Guerreiros e Arqueiros. Cada herói possui uma habilidade especial que pode ser usada durante o jogo. 

- **Exercício 2**: Imagine uma orquestra com vários instrumentos musicais, como Violão, Piano e Flauta. Cada instrumento pode ser tocado, e cada um tem uma forma específica de emitir som. 

- **Exercício 3**: Um programa deve calcular a área de diferentes figuras geométricas, como Círculo, Retângulo e Triângulo. Cada figura tem uma forma particular de calcular sua área.

- **Exercício 4**: Imagine um sistema para gerenciar diferentes meios de transporte, como Carro, Bicicleta e Avião. Cada meio de transporte tem uma maneira específica de se mover. 

- **Exercício 5**: Uma empresa possui diferentes tipos de funcionários, como Gerentes, Desenvolvedores e Estagiários. Cada tipo de funcionário executa suas tarefas de forma particular. 

## Use o método `super()` nos cenários abaixo:

### Conceito: `super()` para chamar o construtor da classe pai

#### Exercício 6: Cadastro de Pessoas e Alunos
**Cenário:**  
Um sistema cadastra pessoas em geral e alunos especificamente. Cada aluno deve herdar o nome da pessoa.  
**Tarefa:**  
- Crie a classe `Pessoa` com atributo `nome` e construtor que o receba.  
- Crie a classe `Aluno` que estende `Pessoa`.  
- No construtor de `Aluno`, use `super(nome)` para inicializar o nome.  
- No `main`, crie um aluno e exiba o nome herdado.

#### Exercício 7: Veículo e Carro
**Cenário:**  
Um veículo possui um ano de fabricação. Um carro deve herdar essa informação.  
**Tarefa:**  
- Crie `Veiculo` com atributo `ano` e construtor que recebe esse valor.  
- Crie `Carro` extendendo `Veiculo`.  
- No construtor de `Carro`, invoque `super(ano)`.  
- Teste criando um carro e exibindo seu ano.

#### Exercício 8: Funcionário e Gerente
**Cenário:**  
Funcionários possuem um nome e um salário base. Gerentes herdam esses dados.  
**Tarefa:**  
- Crie `Funcionario(nome, salario)`.  
- Crie `Gerente(nome, salario, setor)` estendendo `Funcionario`.  
- Use `super(nome, salario)`.  
- Teste imprimindo nome, salário e setor do gerente.

### Conceito: `super` para acessar atributos da classe pai

#### Exercício 9: Produto e Eletrônico
**Cenário:**  
Um produto possui um preço padrão. Um eletrônico redefine o preço próprio, mas ainda precisa acessar o preço original.  
**Tarefa:**  
- Crie `Produto` com atributo `preco = 100`.  
- Crie `Eletronico` com atributo `preco = 300`.  
- No método `mostrarPrecos()` da classe filha, exiba:  
  - preço do eletrônico (`this.preco`)  
  - preço do produto (`super.preco`)  
- Teste no `main`.

#### Exercício 10: Animal e Cachorro
**Cenário:**  
Todos os animais têm um atributo `tipo = "Animal"`. O cachorro tem `tipo = "Cachorro"`.  
**Tarefa:**  
- Crie `Animal` com `tipo`.  
- Crie `Cachorro` com atributo `tipo` próprio.  
- Crie método `mostrarTipos()` que exibe `this.tipo` e `super.tipo`.  
- Teste para ver a diferença.

#### Exercício 11: Conta Bancária e Conta Poupança
**Cenário:**  
Uma conta bancária possui limite básico. A conta poupança redefine esse limite, mas precisa do limite original para cálculos.  
**Tarefa:**  
- Crie `Conta` com atributo `limite = 500`.  
- Crie `ContaPoupanca` com atributo `limite = 1000`.  
- Em `exibirLimites()`, mostre `limite` da classe filha e da classe pai com `super.limite`.  
- Teste no `main`.

### Conceito: `super` para acessar métodos da classe pai

#### Exercício 12: Impressão de Mensagens com Herança
**Cenário:**  
Uma classe imprime mensagem padrão. A classe filha deve acrescentar uma mensagem adicional.  
**Tarefa:**  
- Crie a classe `Mensagem` com método `mostrar()` imprimindo “Mensagem padrão”.  
- Crie `MensagemImportante` sobrescrevendo `mostrar()`.  
- Dentro do método sobrescrito, chame `super.mostrar()` e depois imprima “Mensagem importante!”.  
- Teste no `main`.

#### Exercício 13: Relatório e Relatório Detalhado
**Cenário:**  
Um relatório simples exibe título. Um relatório detalhado deve exibir o título + detalhes extras.  
**Tarefa:**  
- Crie `Relatorio` com método `imprimir()` que mostra “Relatório básico”.  
- Crie `RelatorioDetalhado` sobrescrevendo `imprimir()`.  
- Dentro da sobrescrita, chame `super.imprimir()` antes de imprimir informações extras.  
- Teste.

#### Exercício 14: Forma Geométrica e Círculo
**Cenário:**  
Uma forma geométrica calcula área genérica (valor fixo). O círculo deve calcular sua área, mas também exibir a área genérica antes.  
**Tarefa:**  
- Crie `Forma` com método `area()` retornando um valor simbólico, como `0`.  
- Crie `Circulo` sobrescrevendo `area()`.  
- Antes de retornar a área do círculo, exiba o valor de `super.area()`.  
- Teste o comportamento chamando `area()`.