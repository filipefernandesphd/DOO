# Hands-on 01

Atividade de revisão dos conceitos OO: classe, objeto, atributos, métodos, método construtor e lista de objetos com `ArrayList`.

## Teoria

1. Explique, com suas palavras, a diferença entre **classe** e **objeto**. Dê um exemplo de uma classe e de dois objetos pertencentes a essa classe.
2. O que significa dizer que um objeto possui **identidade**? Explique por que dois objetos podem possuir exatamente os mesmos valores em seus atributos e, ainda assim, serem objetos diferentes.
3. O que é o **estado de um objeto**? Explique como os atributos de um objeto estão relacionados ao seu estado e apresente um exemplo.
4. O que representa o **comportamento de um objeto** em Orientação a Objetos? Como os métodos estão relacionados ao comportamento?
5. Considere um objeto da classe `ContaBancaria`. Dê exemplos da identidade, do estado e do comportamento desse objeto.
6. O que é um **atributo** em uma classe? Considere uma classe `Aluno` e proponha pelo menos quatro atributos que poderiam representar o estado de seus objetos.
7. O que é um **método** em Orientação a Objetos? Considere uma classe `Carro` e proponha três métodos que representem possíveis comportamentos de seus objetos.
8. Em um **diagrama de classes UML**, uma classe normalmente é representada por um retângulo dividido em três partes. Explique o que deve ser representado em cada uma dessas partes.
9. Considere a classe `Livro`, que possui os atributos `titulo`, `autor` e `disponivel`, além dos métodos `emprestar()` e `devolver()`. Represente essa classe utilizando a notação básica de um **diagrama de classes UML**.
10. Explique a diferença entre um **diagrama de classes** e um **diagrama de objetos**. Em seguida, considere a classe `Pessoa` com os atributos `nome` e `idade` e represente, em UML, um objeto dessa classe chamado `pessoa1`, com nome `"Ana"` e idade `20`.

## Prática

### Contexto

Você desenvolverá, de forma incremental, uma aplicação simples para gerenciamento de uma playlist de músicas.

Cada questão deve ser implementada a partir da solução construída na questão anterior. Portanto, **não crie um novo projeto para cada questão**: evolua continuamente o mesmo código.

---

#### 1. Criando a primeira classe

Crie uma classe chamada `Musica`.

Neste primeiro momento, a classe pode permanecer vazia.

Em seguida, crie uma classe `Main` contendo o método `main()` para executar e testar a aplicação.

---

#### 2. Adicionando atributos

Evolua a classe `Musica` adicionando os seguintes atributos:

- `titulo`, do tipo `String`;
- `artista`, do tipo `String`;
- `duracaoSegundos`, do tipo `int`;
- `curtida`, do tipo `boolean`.

Esses atributos devem representar o **estado** de cada música.

---

#### 3. Adicionando comportamentos

Adicione à classe `Musica` os seguintes métodos:

- `exibirInformacoes()`: deve exibir no console os dados da música;
- `curtir()`: deve alterar o atributo `curtida` para `true`;
- `descurtir()`: deve alterar o atributo `curtida` para `false`.

Teste os métodos na classe `Main`.

---

#### 4. Instanciando objetos

Na classe `Main`, crie pelo menos três objetos da classe `Musica`.

Atribua valores diferentes aos atributos de cada objeto.

Em seguida:

1. exiba as informações das três músicas;
2. curta uma das músicas;
3. exiba novamente suas informações para verificar a alteração de estado.

---

#### 5. Criando um método construtor

Melhore a classe `Musica` criando um construtor que receba:

- título;
- artista;
- duração em segundos.

O atributo `curtida` deve iniciar automaticamente com o valor `false`.

Modifique a classe `Main` para que os objetos sejam criados utilizando o construtor.

Exemplo esperado de criação:

```java
Musica musica1 = new Musica("...", "...", 180);
```

---

#### 6. Melhorando a implementação

Até este momento, os atributos da classe `Musica` podem ser alterados diretamente pela classe `Main`.

Melhore a implementação aplicando **encapsulamento**:

1. torne os atributos `private`;
2. crie métodos `get` quando forem necessários para consultar os valores;
3. mantenha as alterações relacionadas a `curtida` sendo realizadas pelos métodos `curtir()` e `descurtir()`.

Verifique se o restante do programa continua funcionando após a alteração.

---

#### 7. Criando uma playlist com ArrayList

Crie uma nova classe chamada `Playlist`.

A classe deve possuir:

- um atributo `nome`, do tipo `String`;
- um atributo para armazenar músicas utilizando exclusivamente `ArrayList<Musica>`.

Crie um construtor que receba o nome da playlist e inicialize o `ArrayList`.

Na classe `Main`, crie uma playlist chamada `"Minhas Favoritas"`.

---

#### 8. Adicionando músicas — add(), size() e get()

Na classe `Playlist`, implemente um método:

```java
adicionarMusica(Musica musica)
```

O método deve utilizar `add()` para adicionar uma música ao `ArrayList`.

Em seguida, implemente:

```java
quantidadeDeMusicas()
```

Esse método deve utilizar `size()` para retornar a quantidade de músicas existentes na playlist.

Implemente também:

```java
obterMusica(int indice)
```

Esse método deve utilizar `get()` para retornar uma música armazenada em determinada posição.

Na classe `Main`:

1. adicione pelo menos cinco músicas à playlist;
2. exiba a quantidade de músicas;
3. obtenha uma música pelo índice e exiba suas informações.

---

#### 9. Verificando e removendo músicas — contains() e remove()

Na classe `Playlist`, implemente:

```java
contemMusica(Musica musica)
```

O método deve utilizar `contains()` e retornar `true` ou `false`.

Implemente também:

```java
removerMusica(Musica musica)
```

O método deve utilizar `remove()`.

Na classe `Main`:

1. verifique se determinada música está na playlist;
2. remova essa música;
3. verifique novamente se ela está presente;
4. exiba a nova quantidade de músicas.

---

#### 10. Verificando uma playlist vazia — isEmpty()

Implemente na classe `Playlist` o método:

```java
estaVazia()
```

O método deve utilizar `isEmpty()` para informar se existem músicas na playlist.

Na classe `Main`, exiba uma mensagem diferente para cada situação:

- `"A playlist está vazia."`
- `"A playlist possui músicas."`

---

#### 11. Substituindo uma música — set()

Implemente na classe `Playlist`:

```java
substituirMusica(int indice, Musica novaMusica)
```

O método deve utilizar `set()` para substituir a música existente em determinada posição.

Na classe `Main`:

1. escolha uma posição da playlist;
2. exiba a música existente nessa posição;
3. substitua-a por outra música;
4. exiba novamente a música da posição para comprovar a alteração.

---

#### 12. Limpando a playlist — clear()

Implemente na classe `Playlist`:

```java
limparPlaylist()
```

O método deve utilizar `clear()` para remover todas as músicas.

Na classe `Main`:

1. exiba a quantidade de músicas antes da operação;
2. execute `limparPlaylist()`;
3. verifique a quantidade novamente;
4. utilize `estaVazia()` para confirmar que a playlist ficou vazia.

---

### Desafio final

Organize a classe `Playlist` para oferecer os seguintes comportamentos:

- adicionar música;
- obter música por índice;
- verificar quantidade de músicas;
- verificar se uma música está presente;
- remover música;
- verificar se a playlist está vazia;
- substituir uma música;
- limpar a playlist.

A classe `Main` deve criar objetos e utilizar esses métodos para demonstrar o funcionamento completo da aplicação.

Durante a implementação, utilize obrigatoriamente os seguintes métodos de `ArrayList`:

- `add()`
- `get()`
- `size()`
- `remove()`
- `contains()`
- `isEmpty()`
- `clear()`
- `set()`

## Bônus

Execute o prompt abaixo na IA de sua preferência para gerar exercícios e praticar mais.

```markdown
Atue como professor especialista em Desenvolvimento Orientado a Objetos com Java.

Crie um exercício prático baseado em um **domínio conhecido e fácil de compreender por estudantes da Geração Z**.

O exercício deve ser apresentado **exclusivamente como um texto corrido em formato de redação de minimundo**, descrevendo as regras, elementos, características e comportamentos existentes nesse domínio.

#### Regras para elaboração do minimundo

* NÃO diga diretamente ao aluno o que ele deve programar.
* NÃO utilize instruções como:

  * "crie uma classe";
  * "crie um atributo";
  * "crie um método";
  * "instancie um objeto";
  * "crie um construtor";
  * "utilize ArrayList".
* NÃO apresente código Java.
* NÃO apresente pseudocódigo.
* NÃO apresente a solução.
* NÃO identifique explicitamente quais elementos do texto devem se tornar classes, atributos ou métodos.
* Descreva apenas como o domínio funciona no mundo real ou no sistema proposto.
* O texto deve fornecer informações suficientes para que o aluno consiga identificar sozinho os elementos necessários para construir a solução usando Orientação a Objetos.

#### Conhecimentos que o exercício deve permitir aplicar

O minimundo deve ser projetado de maneira que, ao interpretá-lo, o aluno consiga desenvolver uma solução que envolva:

* classes;
* objetos;
* atributos;
* métodos;
* métodos construtores;
* relacionamento entre objetos;
* uma coleção de objetos utilizando `ArrayList`.

A relação envolvendo `ArrayList` deve surgir naturalmente no domínio por meio de situações em que **um elemento possui ou gerencia vários outros elementos**.

Por exemplo, o texto poderia dizer:

> Uma playlist possui um nome e reúne várias músicas. Cada música possui informações como título, artista e duração. Novas músicas podem ser adicionadas à playlist, enquanto músicas que não forem mais desejadas podem ser removidas.

Observe que o texto descreve apenas o domínio. Ele NÃO deve dizer que `Playlist` deve ser uma classe, que as músicas devem ser armazenadas em um `ArrayList` ou que adicionar uma música deve ser implementado como um método.

#### Complexidade

Considere alunos que estão tendo seus primeiros contatos com Java e Orientação a Objetos.

Portanto:

* utilize um domínio simples;
* trabalhe com aproximadamente 2 ou 3 entidades principais;
* evite herança, interfaces, classes abstratas, polimorfismo, exceções e recursos avançados;
* apresente diferentes estados e comportamentos para os elementos do domínio;
* inclua pelo menos uma relação de "um para vários";
* permita criar vários objetos com valores diferentes;
* permita que o estado de alguns objetos seja alterado por meio de seus comportamentos.

#### Saída

Apresente somente:

1. um título com o nome do domínio;
2. o texto do minimundo em formato de redação, com aproximadamente 3 a 5 parágrafos.

O minimundo deve ser suficientemente detalhado para que o aluno precise **interpretar o problema e transformar os elementos do domínio em uma solução orientada a objetos**, em vez de simplesmente seguir instruções explícitas de programação.
```
