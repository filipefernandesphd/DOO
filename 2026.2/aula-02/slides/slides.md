---
theme: slidev-theme-tahta
title: Estado, comportamento e identidade de um objeto
aspectRatio: 4/3
info: |
  Aula TDH sobre classe, objeto, estado, comportamento e identidade, com
  exemplos e atividades em Java.
themeConfig:
  variant: minimal
  lang: pt-BR
mdc: true
routerMode: hash
layout: academic-cover
---

---
layout: lead
index: "02"
kicker: A pergunta da aula
title: Objetos podem parecer iguais e ainda serem <em>diferentes</em>?
subtitle: Vamos responder com conceitos e código Java.
---

---
layout: feature
kicker: Ao final da aula
title: Você conseguirá reconhecer e programar os elementos básicos de OO
features:
  - icon: lucide:shapes
    title: Explicar
    desc: classe, objeto, estado, comportamento e identidade
  - icon: lucide:file-code-2
    title: Criar
    desc: uma classe pequena em Java
  - icon: lucide:copy-plus
    title: Instanciar
    desc: objetos independentes a partir da classe
  - icon: lucide:scan-search
    title: Relacionar
    desc: cada conceito ao trecho correspondente do código
---

---
layout: agenda
kicker: Metodologia TDH
title: Compreender, construir juntos e praticar com autonomia
items:
  - topic: Teoria
    desc: nomear os conceitos essenciais
  - topic: Desenvolvimento
    desc: construir e analisar uma classe com a turma
  - topic: Hands-on
    desc: modelar outro objeto e testar a solução
---

---
layout: section
index: "T"
kicker: Teoria
title: O que precisamos compreender
subtitle: Conceitos pequenos que se conectam em um modelo mental.
---

---
layout: steps
kicker: Antes de modelar
title: Decompor reduz o tamanho do problema que precisamos enxergar de uma vez
steps:
  - title: Observar o sistema
    desc: reconhecer entidades e objetivos
    icon: lucide:scan-eye
  - title: Dividir em partes
    desc: trabalhar com poucas ideias por vez
    icon: lucide:split
  - title: Definir responsabilidades
    desc: decidir quem sabe e quem faz
    icon: lucide:list-checks
---

---
layout: define
kicker: Escolha consciente
term: Abstração
definition: Considerar apenas o que é <span class="accent2">relevante no contexto</span>.
points:
  - Um app de biblioteca e um jogo descrevem uma pessoa de formas diferentes
  - O objetivo do software determina quais detalhes entram no modelo
---

---
layout: vs
kicker: Modelo e exemplar
title: Classe e objeto não são a mesma coisa
label: cria
left:
  title: Classe
  items:
    - Define propriedades
    - Define comportamentos
    - Funciona como um tipo
right:
  title: Objeto
  items:
    - É uma instância da classe
    - Possui valores próprios
    - Existe durante a execução
---

---
layout: code-explain
kicker: Primeiro contato
title: A classe descreve; o new cria um objeto
notes:
  - <strong>Classe</strong> — define o tipo <strong>Conta</strong>.
  - <strong>Propriedades</strong> — dados que cada conta guardará.
  - <strong>Objeto</strong> — uma instância criada na memória.
---

```java {1|2-3|6}
class Conta {
    String titular;
    double saldo;
}

Conta contaDaAna = new Conta();
```

---
layout: define
kicker: O que o objeto sabe
term: Estado
definition: O conjunto de propriedades de um objeto e os <span class="accent2">valores atuais</span> dessas propriedades.
points:
  - A estrutura vem da classe
  - Os valores pertencem a cada objeto
  - O estado pode mudar ao longo do tempo
---

---
layout: code-explain
kicker: Estado em Java
title: Os atributos guardam a situação atual do objeto
notes:
  - <strong>titular</strong> vale “Ana” neste objeto.
  - <strong>saldo</strong> vale 100,00 neste instante.
  - Outra conta pode ter valores completamente diferentes.
---

```java {1|2|4-6}
contaDaAna.titular = "Ana";
contaDaAna.saldo = 100.00;

Conta contaDoIvo = new Conta();
contaDoIvo.titular = "Ivo";
contaDoIvo.saldo = 100.00;
```

---
layout: define
kicker: O que o objeto faz
term: Comportamento
definition: Como um objeto <span class="accent2">age e reage</span>, geralmente consultando ou alterando seu estado.
points:
  - Em Java, o comportamento aparece em métodos
  - Uma chamada de método envia uma solicitação ao objeto
  - O resultado pode ser visível ou uma mudança interna
---

---
layout: code-explain
kicker: Comportamento em Java
title: O método depositar altera o estado da conta
notes:
  - <strong>Entrada</strong> — o método recebe um valor.
  - <strong>Ação</strong> — atualiza o saldo do próprio objeto.
  - <strong>Mensagem</strong> — pedimos à conta que deposite 50.
---

```java {2|3|7}
class Conta {
    void depositar(double valor) {
        saldo += valor;
    }
}

contaDaAna.depositar(50.00);
```

---
layout: reference
kicker: Tipos de operação
title: Nem todo método faz a mesma coisa
items:
  - term: Modificador
    desc: altera o estado, como depositar
  - term: Seletor
    desc: consulta o estado sem alterá-lo, como consultarSaldo
  - term: Iterador
    desc: percorre partes de um objeto ou coleção
  - term: Construtor
    desc: cria o objeto e inicializa seu estado
  - term: Destrutor
    desc: libera recursos; em Java, a memória é gerenciada pelo garbage collector
---

---
layout: define
kicker: Quem é este objeto
term: Identidade
definition: A propriedade que distingue um objeto de <span class="accent2">todos os outros</span>.
points:
  - Dois objetos podem ter o mesmo estado
  - Mesmo assim, continuam sendo instâncias diferentes
  - A referência aponta para um objeto específico
---

---
layout: code-explain
kicker: Identidade em Java
title: Mesmo conteúdo não significa o mesmo objeto
notes:
  - Duas execuções de <strong>new</strong> criam duas instâncias.
  - Os dois objetos começam com o mesmo estado.
  - <strong>==</strong> compara as referências e revela identidades distintas.
---

```java {1-2|4-5|7}
Pessoa pessoa1 = new Pessoa("John");
Pessoa pessoa2 = new Pessoa("John");

System.out.println(pessoa1.nome.equals(pessoa2.nome)); // true
System.out.println(pessoa1 == pessoa2);                 // false

Pessoa apelido = pessoa1; // mesma identidade
```

---
layout: columns
kicker: Estrutura comum, existências diferentes
title: A classe descreve; cada objeto guarda seu estado e sua identidade
columns:
  - title: Classe Conta
    items:
      - atributo titular
      - atributo saldo
      - método depositar
  - title: contaDaAna
    items:
      - titular Ana
      - saldo 150
      - identidade própria
  - title: contaDoIvo
    items:
      - titular Ivo
      - saldo 100
      - identidade própria
---

---
layout: panels
kicker: Papéis e responsabilidades
title: Um bom objeto oferece serviços coerentes com seu papel
panels:
  - icon: lucide:landmark
    title: Papel
    items:
      - representar uma conta
      - proteger suas regras
  - icon: lucide:hand-coins
    title: Responsabilidades
    items:
      - receber depósitos
      - informar o saldo
  - icon: lucide:ban
    title: Não é responsabilidade
    items:
      - desenhar a tela
      - enviar e-mail
---

---
layout: default
kicker: Checkpoint da Teoria
title: Classifique cada trecho antes de revelar a resposta
---

```java
class Playlist {              // ?
    String nome;              // ?
    void adicionar(Musica m)  // ?
}

Playlist foco = new Playlist(); // ?
```

<v-clicks>

- classe
- estado
- comportamento
- objeto com identidade própria

</v-clicks>

---
layout: section
index: "D"
kicker: Desenvolvimento
title: Vamos construir uma classe juntos
subtitle: Vocês decidem; eu transformo as decisões em Java.
---

---
layout: default
kicker: Prática guiada
title: Vamos modelar um personagem de jogo
---

<v-clicks>

1. Qual é o estado mínimo para jogar?
2. Quais comportamentos alteram esse estado?
3. Como criaremos dois personagens diferentes?
4. Que teste mostra que cada objeto preserva seus valores?

</v-clicks>

<Callout icon="lucide:message-circle">Antes de escrever cada linha, escolha uma resposta com a turma.</Callout>

<!-- Resultado esperado: nome e energia; sofrerDano e recuperar; duas instanciações; imprimir ou comparar os estados depois das chamadas. -->

---
layout: code-explain
kicker: Construção incremental
title: Primeiro definimos o estado e como ele nasce
notes:
  - <strong>Classe</strong> — o tipo que estamos criando.
  - <strong>Atributos</strong> — o estado escolhido pela turma.
  - <strong>Construtor</strong> — recebe e guarda o estado inicial.
---

```java {1|2-3|5-8}
class Personagem {
    String nome;
    int energia;

    Personagem(String nome, int energia) {
        this.nome = nome;
        this.energia = energia;
    }
}
```

---
layout: code
kicker: Construção incremental
title: Depois damos comportamento ao objeto
---

```java
void sofrerDano(int pontos) {
    energia -= pontos;
    energia = Math.max(energia, 0);
}
```

<!-- Pergunte por que energia negativa pode ser um estado inválido e quem deve proteger essa regra. -->

---
layout: code-explain
kicker: Teste guiado
title: Duas instâncias, duas identidades, dois estados
notes:
  - Cada <strong>new</strong> produz um objeto diferente.
  - A mensagem é enviada somente para <strong>mago</strong>.
  - O teste confirma que <strong>arqueira</strong> manteve seu estado.
---

```java {1-2|4|6-7}
Personagem mago = new Personagem("Mago", 100);
Personagem arqueira = new Personagem("Arqueira", 100);

mago.sofrerDano(30);

System.out.println(mago.energia);     // 70
System.out.println(arqueira.energia); // 100
```

---
layout: columns
kicker: Leitura do código
title: Agora conectamos cada conceito ao que acabamos de executar
columns:
  - title: Estado
    items:
      - nome
      - energia
      - valores 70 e 100
  - title: Comportamento
    items:
      - sofrerDano
      - alterar energia
      - proteger o limite zero
  - title: Identidade
    items:
      - mago
      - arqueira
      - dois objetos independentes
---

---
layout: section
index: "H"
kicker: Hands-on
title: Agora é com vocês
subtitle: Modele outro contexto sem copiar o personagem.
---

---
layout: default
kicker: Atividade autônoma
title: Crie uma classe Lampada em Java
---

**Objetivo**

Representar lâmpadas que controlam o próprio estado.

**Requisitos**

- estado: **cor**, **ligada** e **intensidade** de 0 a 100
- construtor que receba a cor e comece desligada
- comportamentos: **ligar()**, **desligar()** e **ajustarIntensidade(int valor)**
- dois objetos com cores diferentes
- alterar somente um objeto e imprimir o estado dos dois

---
layout: reference
kicker: Como verificar
title: Sua solução está pronta quando passa nestes testes
items:
  - term: Compila
    desc: a classe e o programa principal não apresentam erros
  - term: Preserva identidade
    desc: mudar uma lâmpada não muda a outra
  - term: Protege o estado
    desc: a intensidade nunca fica abaixo de 0 nem acima de 100
  - term: Explica
    desc: você aponta no código classe, objetos, estado e comportamentos
---

---
layout: default
kicker: Desafio opcional
title: Faça a lâmpada respeitar uma regra do mundo modelado
---

- Se estiver desligada, **ajustarIntensidade** deve manter a intensidade em **0**
- Ao ligar, recupere a última intensidade usada ou escolha um valor padrão
- Escreva um teste simples para provar a regra

<Callout tone="warn" icon="lucide:shield-check">A regra deve ficar dentro da classe, não espalhada no programa principal.</Callout>

---
layout: steps
kicker: Fechamento
title: Do modelo ao código
steps:
  - title: Classe
    desc: descreve estrutura e comportamentos comuns
    icon: lucide:box
  - title: Objeto
    desc: é uma instância concreta da classe
    icon: lucide:circle-dot
  - title: Estado
    desc: valores atuais das propriedades
    icon: lucide:gauge
  - title: Comportamento
    desc: ações oferecidas pelos métodos
    icon: lucide:play
  - title: Identidade
    desc: distingue uma instância das demais
    icon: lucide:fingerprint
---

---
layout: default
kicker: Ticket de saída
title: Mostre que você aprendeu
---

Escolha **três linhas** da sua classe **Lampada** e explique:

<v-clicks>

1. qual linha define parte do estado;
2. qual linha implementa um comportamento;
3. qual linha cria um objeto com identidade própria.

</v-clicks>

---
layout: end
title: Um objeto é quem ele é, guarda como está e sabe o que pode fazer
subtitle: Identidade + estado + comportamento.
---
