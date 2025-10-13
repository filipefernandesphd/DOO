# Atividade 14

## Exercício 1: Construtor básico
Crie uma classe chamada `Livro` com os seguintes atributos:
- `titulo` (String)
- `autor` (String)

Implemente um **construtor** que receba os dois atributos como parâmetros. Em seguida, crie um método `exibirDetalhes()` que imprima os dados do livro.

## Exercício 2: Construtor com valores padrão
Crie uma classe chamada `Aluno` com os seguintes atributos:
- `nome` (String)
- `matricula` (int)

Implemente dois construtores:
1. Um que receba todos os atributos como parâmetros.
2. Um construtor padrão (sem parâmetros) que atribua valores padrão: `"Sem nome"` e `0`.

Adicione um método `exibir()` para mostrar os dados do aluno.


## Exercício 3: Vários construtores
Crie uma classe `Produto` com os atributos:
- `nome` (String)
- `preco` (double)
- `quantidade` (int)

Implemente:
- Um construtor com todos os atributos.
- Um construtor que recebe apenas `nome` e `preco`, e define `quantidade = 1`.

Implemente o método `exibirProduto()` que mostre os dados do produto.

## Exercício 4: Reutilização com this()
Modifique a classe `Produto` do exercício anterior utilizando o comando `this()` para **reutilizar** construtores.

## Exercício 5: Construtor com validação
Crie a classe `ContaBancaria` com os seguintes atributos:
- `titular` (String)
- `saldo` (double)

No construtor:
- Valide que o saldo inicial não seja negativo. Caso seja, inicialize com `0.0`.

Implemente os métodos `depositar()`, `sacar()` e `exibirSaldo()`.

## Exercício 6: Construtores com composição
Crie duas classes:
- `Endereco`: atributos `rua`, `cidade`, `estado`.
- `Pessoa`: atributos `nome`, `idade`, `endereco` (do tipo `Endereco`).

Implemente os construtores para que seja possível criar uma `Pessoa` já com seu endereço.

Exiba as informações completas da pessoa e do endereço.
