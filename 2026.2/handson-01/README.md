# Hands-on 01

## Desenvolvimento Orientado a Objetos com Java

### Objetivo

Revisar e aplicar, de forma incremental, os conceitos fundamentais de desenvolvimento orientado a objetos em Java.

A atividade utiliza como domínio uma **plataforma de streaming de músicas**. Cada exercício evolui a implementação criada no exercício anterior.

> **Importante:** não crie um novo projeto para cada exercício. Evolua o mesmo código ao longo de toda a atividade.

---

# 1. Revisão conceitual

Responda às questões abaixo de forma objetiva.

1. O que é uma **classe** em orientação a objetos?

2. O que é um **objeto**?

3. Qual é a relação entre uma classe e seus objetos?

4. O que representa o **estado** de um objeto?

5. O que representa o **comportamento** de um objeto?

6. O que é um **atributo**?

7. O que é um **método**?

8. Qual é a diferença entre **atributo** e **parâmetro de método**?

9. Qual é a função de um **método construtor**?

10. Para que serve a classe `ArrayList` em Java?

11. Explique, de forma sucinta, a finalidade dos métodos abaixo de `ArrayList`:

    - `add`
    - `get`
    - `size`
    - `remove`
    - `contains`
    - `isEmpty`
    - `clear`
    - `set`

12. O que são **modificadores de acesso** em Java e qual é a sua principal finalidade?

13. Explique o modificador de acesso **`default`**. Em quais situações um atributo ou método com acesso `default` pode ser acessado?

14. Explique o modificador de acesso **`public`**. O que significa declarar uma classe, atributo, método ou construtor como `public`?

15. Explique o modificador de acesso **`private`**. Quem pode acessar diretamente um atributo ou método declarado como `private`?

16. Qual é a principal diferença entre os modificadores de acesso `default`, `public` e `private`?

17. O que é um método **getter** e qual é a sua finalidade?

18. O que é um método **setter** e qual é a sua finalidade?

19. Por que getters e setters podem ser utilizados quando os atributos de uma classe são declarados como `private`?

20. Qual é a vantagem de utilizar um setter em vez de permitir a alteração direta de um atributo?

21. Para que serve a declaração **`package`** em um arquivo Java?

22. Qual é a relação entre um `package` e a organização das classes de um projeto Java?

23. Para que serve a declaração **`import`** em Java?

24. Considere duas classes localizadas em pacotes diferentes. O que precisa ser observado para que uma delas possa utilizar a outra?

---

# 2. Exercício prático

## Domínio: plataforma de streaming de músicas

Considere uma plataforma de streaming na qual usuários podem ouvir músicas e organizar suas músicas em playlists.

A implementação será construída de forma incremental.

---

## Exercício 1 — Criando a classe `Musica`

Crie uma classe chamada `Musica`.

Neste momento, a classe pode permanecer vazia.

Crie também uma classe `Main` contendo o método `main`.

---

## Exercício 2 — Características de uma música

Uma música possui:

- título;
- artista;
- duração em segundos;
- informação indicando se foi curtida ou não.

Adicione à classe `Musica` atributos que representem essas informações.

Utilize os tipos de dados que considerar mais adequados.

---

## Exercício 3 — Comportamentos de uma música

Uma música deve ser capaz de:

- exibir suas informações;
- ser curtida;
- deixar de ser curtida.

Implemente na classe `Musica` os métodos:

- `exibirInformacoes()`;
- `curtir()`;
- `descurtir()`.

O método `exibirInformacoes()` deve mostrar no console as principais informações da música.

---

## Exercício 4 — Criando objetos

Na classe `Main`, crie pelo menos **três objetos** da classe `Musica`.

Atribua valores diferentes aos atributos de cada objeto.

Depois:

1. exiba as informações das músicas;
2. curta uma das músicas;
3. exiba novamente suas informações;
4. retire a curtida;
5. exiba novamente suas informações.

---

## Exercício 5 — Método construtor

Atualmente, os valores dos atributos são definidos depois da criação do objeto.

Modifique a classe `Musica` criando um método construtor que receba:

- título;
- artista;
- duração em segundos.

Toda nova música deve iniciar com a informação de curtida definida como `false`.

Atualize a classe `Main` para criar as músicas utilizando o construtor.

---

## Exercício 6 — Melhorando a classe `Musica`

Adicione à classe `Musica` um método chamado `duracaoEmMinutos()`.

Esse método deve converter a duração armazenada em segundos para minutos e retornar o resultado.

Atualize `exibirInformacoes()` para também apresentar a duração da música em minutos.

Teste a implementação na classe `Main`.

---

## Exercício 7 — Criando uma playlist

Crie uma classe chamada `Playlist`.

Uma playlist possui:

- um nome;
- várias músicas.

Utilize exclusivamente um `ArrayList<Musica>` para armazenar as músicas.

Inicialize o `ArrayList` no construtor da classe `Playlist`.

---

## Exercício 8 — Adicionando e consultando músicas

Uma playlist deve permitir adicionar músicas.

Implemente um método:

```java
adicionarMusica(Musica musica)
```

Esse método deve utilizar `add`.

Depois, implemente comportamentos que permitam:

1. descobrir quantas músicas existem na playlist utilizando `size`;
2. recuperar uma música a partir de uma posição utilizando `get`.

Na classe `Main`, crie uma playlist, adicione pelo menos três músicas e teste as operações.

---

## Exercício 9 — Verificando e removendo músicas

Adicione à classe `Playlist` comportamentos que permitam:

1. verificar se determinada música pertence à playlist utilizando `contains`;
2. remover determinada música utilizando `remove`.

Teste os dois comportamentos na classe `Main`.

---

## Exercício 10 — Verificando se a playlist está vazia

Adicione um comportamento que informe se a playlist está vazia.

Utilize:

```java
isEmpty()
```

Teste o comportamento:

1. em uma playlist com músicas;
2. em uma playlist sem músicas.

---

## Exercício 11 — Substituindo uma música

Uma música adicionada incorretamente deve poder ser substituída por outra.

Adicione um comportamento que receba:

- a posição da música;
- a nova música.

Utilize:

```java
set()
```

Na classe `Main`, substitua uma música da playlist e confira o resultado utilizando `get`.

---

## Exercício 12 — Limpando a playlist

Adicione à classe `Playlist` um comportamento capaz de remover todas as músicas.

Utilize:

```java
clear()
```

Depois:

1. adicione algumas músicas;
2. mostre a quantidade de músicas;
3. limpe a playlist;
4. utilize `size` para verificar a quantidade;
5. utilize `isEmpty` para confirmar que a playlist está vazia.

---

# 3. Evoluindo o controle de acesso

A partir deste ponto, evolua **o mesmo projeto** desenvolvido nos exercícios anteriores.

---

## Exercício 13 — Acesso `public`

Organize o projeto em dois pacotes:

```text
modelo
app
```

Coloque as classes `Musica` e `Playlist` no pacote `modelo`.

Coloque a classe `Main` no pacote `app`.

Faça as adaptações necessárias para que `Main` consiga utilizar `Musica` e `Playlist`.

Para isso:

1. declare as classes `Musica` e `Playlist` como `public`;
2. declare como `public` os construtores que precisam ser utilizados pela classe `Main`;
3. declare como `public` os métodos que representam operações disponíveis para quem utiliza essas classes;
4. utilize `import` na classe `Main`.

Exemplo da organização esperada:

```text
src/
├── app/
│   └── Main.java
└── modelo/
    ├── Musica.java
    └── Playlist.java
```

Teste se a classe `Main` consegue criar músicas, criar uma playlist e executar suas operações.

---

## Exercício 14 — Protegendo os atributos com `private`

Até este momento, os atributos das classes podem ser acessados diretamente.

Modifique as classes `Musica` e `Playlist` para que **todos os seus atributos sejam `private`**.

Por exemplo:

```java
private String titulo;
```

Depois da alteração:

1. tente acessar diretamente um atributo da classe `Musica` a partir da classe `Main`;
2. observe o erro de compilação;
3. identifique por que o acesso deixou de ser permitido.

Não torne os atributos `public` novamente.

---

## Exercício 15 — Consultando informações com getters

Como os atributos agora são `private`, outras classes não podem consultá-los diretamente.

Crie métodos getters para os dados que precisam ser consultados.

Na classe `Musica`, crie getters para:

- título;
- artista;
- duração em segundos;
- informação de curtida.

Na classe `Playlist`, crie pelo menos um getter para o nome da playlist.

Exemplo:

```java
public String getTitulo() {
    return titulo;
}
```

Atualize a classe `Main` para consultar os dados utilizando os getters.

---

## Exercício 16 — Alterando informações com setters

Crie métodos setters para os atributos que podem ser alterados depois da criação do objeto.

Na classe `Musica`, permita alterar:

- título;
- artista;
- duração em segundos.

Na classe `Playlist`, permita alterar:

- nome.

Exemplo:

```java
public void setTitulo(String titulo) {
    this.titulo = titulo;
}
```

Adicione também as seguintes validações:

- o título não pode ser vazio;
- o artista não pode ser vazio;
- a duração deve ser maior que zero;
- o nome da playlist não pode ser vazio.

> Não crie um setter para substituir diretamente o `ArrayList` de músicas. As alterações na coleção devem continuar acontecendo pelos métodos da própria classe `Playlist`.

---

## Exercício 17 — Encapsulando a playlist

Revise a classe `Playlist`.

O `ArrayList<Musica>` deve permanecer `private`.

O código da classe `Main` não deve manipular diretamente a lista interna.

Toda interação com as músicas da playlist deve ocorrer por métodos `public` da classe `Playlist`.

Garanta que existam métodos públicos para:

- adicionar uma música;
- obter uma música por posição;
- obter a quantidade de músicas;
- verificar se uma música está presente;
- remover uma música;
- verificar se a playlist está vazia;
- substituir uma música;
- limpar a playlist.

Ao final, revise a classe `Main` e elimine qualquer acesso direto aos atributos das classes.

---

# 4. Desafio final

## Streaming de músicas — versão encapsulada

Implemente uma versão final do sistema de playlist utilizando tudo o que foi desenvolvido durante a atividade.

O sistema deve possuir as classes:

```text
modelo.Musica
modelo.Playlist
app.Main
```

### `Musica`

Cada música deve possuir:

- título;
- artista;
- duração em segundos;
- estado indicando se está curtida.

Todos os atributos devem ser `private`.

A classe deve possuir:

- construtor;
- getters;
- setters para os dados que podem ser alterados;
- validações nos setters;
- `curtir()`;
- `descurtir()`;
- `duracaoEmMinutos()`;
- `exibirInformacoes()`.

A classe e os métodos que precisam ser utilizados por outras classes devem possuir acesso `public`.

### `Playlist`

Cada playlist deve possuir:

- nome;
- um `ArrayList<Musica>` privado.

A classe deve oferecer métodos públicos para manipular a coleção sem permitir acesso direto ao `ArrayList`.

Durante a implementação, utilize obrigatoriamente os seguintes métodos de `ArrayList`:

```text
add
get
size
remove
contains
isEmpty
clear
set
```

A classe também deve possuir:

- construtor;
- getter e setter para o nome;
- validação para impedir nome vazio.

### `Main`

Na classe `Main`:

1. crie pelo menos cinco músicas;
2. crie uma playlist;
3. adicione as músicas;
4. exiba a quantidade de músicas;
5. consulte músicas por posição;
6. verifique se determinada música está presente;
7. remova uma música;
8. substitua uma música;
9. teste a playlist vazia e não vazia;
10. limpe a playlist;
11. altere dados utilizando setters;
12. consulte dados utilizando getters.

A classe `Main` deve estar em um pacote diferente das classes de domínio e utilizar `import` para acessá-las.

> O objetivo do desafio é garantir que o código cliente utilize a interface pública das classes e não dependa do acesso direto ao estado interno dos objetos.

---

# 5. Bônus — Gere um novo domínio com IA

Escolha uma ferramenta de IA generativa e utilize o prompt abaixo para gerar um novo exercício em um domínio diferente.

Depois, implemente em Java o sistema descrito pela IA aplicando os mesmos conceitos utilizados nesta atividade.

## Prompt

```text
Atue como professor especialista em Desenvolvimento Orientado a Objetos e Java.

Crie um exercício prático baseado em um único minimundo, diferente de plataforma de streaming de músicas.

O minimundo deve ser apresentado exclusivamente como um texto de domínio, em formato de redação, descrevendo entidades, características, comportamentos e relações existentes nesse contexto.

NÃO diga diretamente ao aluno quais classes, atributos, métodos ou objetos devem ser criados.
NÃO apresente código.
NÃO apresente solução.
NÃO utilize diagramas.
NÃO transforme a descrição em uma lista de instruções de programação.

O texto deve conter informações suficientes para que o aluno consiga, a partir da interpretação do minimundo:

- identificar classes e objetos;
- identificar características que possam ser representadas como atributos;
- identificar comportamentos que possam ser representados como métodos;
- perceber quais informações devem ser fornecidas na criação dos objetos;
- identificar uma entidade que mantenha uma coleção de outros objetos;
- utilizar ArrayList para representar essa coleção;
- realizar operações equivalentes a adicionar, consultar, contar, remover, verificar existência, verificar se a coleção está vazia, substituir e limpar elementos;
- identificar dados que não devem ser acessados diretamente por outras classes;
- perceber quais operações precisam estar disponíveis publicamente;
- consultar informações de objetos sem acessar diretamente seu estado interno;
- alterar, de forma controlada e validada, informações que possam ser modificadas.

O domínio escolhido deve ser conhecido por estudantes universitários e permitir uma implementação pequena em Java.

Ao final, apresente somente o texto do minimundo.
```

---

## Checklist

Ao concluir a atividade, verifique se você utilizou:

- [ ] classes;
- [ ] objetos;
- [ ] atributos;
- [ ] métodos;
- [ ] construtores;
- [ ] `ArrayList`;
- [ ] `add`;
- [ ] `get`;
- [ ] `size`;
- [ ] `remove`;
- [ ] `contains`;
- [ ] `isEmpty`;
- [ ] `clear`;
- [ ] `set`;
- [ ] `public`;
- [ ] `private`;
- [ ] getters;
- [ ] setters;
- [ ] validações;
- [ ] pacotes;
- [ ] `import`.
