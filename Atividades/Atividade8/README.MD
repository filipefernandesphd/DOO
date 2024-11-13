# Atividade 8

## Exercício 1: Contador de Instâncias

1. Crie uma classe `ContadorInstancia` com:
   - Um atributo `static` chamado `numeroDeInstancias` que conta quantas instâncias dessa classe foram criadas.
   - Um construtor que incrementa `numeroDeInstancias` sempre que uma nova instância é criada.
   - Um método `static` chamado `getNumeroDeInstancias()` que retorna o valor atual de `numeroDeInstancias`.

2. Crie uma classe `Main` para testar. Instancie `ContadorInstancia` algumas vezes e chame o método `getNumeroDeInstancias()` para verificar o total de instâncias criadas.

---

## Exercício 2: Banco com Taxa de Juros

1. Crie uma classe `Banco` com:
   - Um atributo `static final` chamado `TAXA_DE_JUROS` com valor de `0.05` (5%).
   - Um atributo `final` chamado `numeroDaConta`, inicializado no construtor.
   - Um atributo `double` chamado `saldo`, que representa o saldo da conta.
   - Um método `static` chamado `calcularJurosAnuais(double saldo)` que calcula e retorna o valor dos juros aplicados ao saldo informado.

2. No método `main`, crie uma instância de `Banco`, inicialize o saldo, e use `calcularJurosAnuais()` para calcular o valor dos juros sobre o saldo da conta.

---

## Exercício 3: Configurações do Sistema

1. Crie uma classe `ConfiguracoesSistema` com:
   - Um atributo `static final` chamado `VERSAO` e defina um valor para ele, como `"1.0.0"`.
   - Um método `static` chamado `getVersao()` que retorna o valor de `VERSAO`.

2. No método `main`, imprima a versão do sistema chamando `ConfiguracoesSistema.getVersao()`.

---

## Exercício 4: Conversor de Moedas

1. Crie uma classe `ConversorMoedas` com:
   - Um atributo `static final` chamado `TAXA_DOLAR_REAL` com valor de `5.20`.
   - Um método `static` chamado `converterParaReais(double valorEmDolar)` que recebe um valor em dólares e retorna o valor convertido para reais usando `TAXA_DOLAR_REAL`.

2. No método `main`, simule a conversão de um valor em dólares para reais chamando o método `converterParaReais()`.

---

## Exercício 5: Cadastro de Produtos com ID Único

1. Crie uma classe `Produto` com:
   - Um atributo `static` chamado `contadorDeProdutos` que conta o total de produtos cadastrados.
   - Um atributo `final` chamado `id`, que representa o ID único do produto, inicializado no construtor e usando o `contadorDeProdutos`.
   - Um atributo `String` chamado `nome` e um `double` chamado `preco`, ambos inicializados no construtor.
   - Um método `static` chamado `getTotalProdutos()` que retorna o total de produtos cadastrados.

2. No método `main`, crie alguns objetos `Produto` e exiba o ID de cada produto e o total de produtos criados chamando `Produto.getTotalProdutos()`.

---

## Exercício 6: Biblioteca com Contador de Livros

1. Crie uma classe `Livro` com:
   - Um atributo `static` chamado `totalLivros` para contar quantos livros foram adicionados.
   - Um atributo `final` chamado `codigoISBN` para representar o ISBN do livro, que é definido no construtor.
   - Um atributo `String` chamado `titulo`.
   - Um método `static` chamado `getTotalLivros()` que retorna o total de livros cadastrados.

2. No método `main`, crie alguns objetos `Livro`, cada um com um ISBN e título. No final, exiba o total de livros cadastrados chamando `Livro.getTotalLivros()`.

---

Esses exercícios ajudam a praticar o uso de `static` para atributos e métodos compartilhados e `final` para constantes e valores imutáveis.