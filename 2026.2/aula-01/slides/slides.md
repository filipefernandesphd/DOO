---
theme: slidev-theme-tahta
title: Da programação procedural para a orientação a objetos
aspectRatio: 4/3
info: |
  Introdução à mudança de paradigma da programação procedural para a
  programação orientada a objetos, com exemplos em Java.
themeConfig:
  variant: minimal
  lang: pt-BR
mdc: true
routerMode: hash
layout: academic-cover
---

---
layout: lead
index: "01"
kicker: Mudança de perspectiva
title: Você já sabe programar. Agora vai <em>enxergar</em> o problema de outro jeito.
subtitle: O código continua sendo Java; a forma de organizar ideias muda.
---

---
layout: agenda
kicker: Rota da aula
title: Do fluxo de instruções para um mundo de objetos
items:
  - topic: Reconhecer
    desc: como o paradigma procedural organiza um programa
  - topic: Modelar
    desc: objetos, propriedades e categorias
  - topic: Abstrair
    desc: escolher o que importa em cada contexto
  - topic: Comparar
    desc: duas formas de representar o mesmo problema
---

---
layout: define
kicker: Ponto de partida
term: Paradigma
definition: Uma forma de <span class="accent2">pensar, organizar e resolver</span> problemas com programas.
points:
  - A linguagem oferece recursos; o paradigma orienta como combiná-los
  - Um novo paradigma amplia seu repertório, não apaga o que você já sabe
---

---
layout: code-explain
kicker: O jeito que você já conhece
title: No procedural, os dados e as ações aparecem separados
notes:
  - <strong>Dados</strong> guardam a situação atual do programa.
  - <strong>Função</strong> recebe os dados e calcula a mudança.
  - <strong>Fluxo</strong> diz em que ordem tudo acontece.
---

```java {1-2|4-6|8-10}
int velocidade = 0;
String modelo = "Urbana";

static int acelerar(int velocidade) {
    return velocidade + 10;
}

velocidade = acelerar(velocidade);
System.out.println(velocidade);
```

<!-- Pergunte: onde está o dado? Onde está a ação? Quem coordena a ordem? -->

---
layout: vs
kicker: Duas lentes
title: O mesmo problema pode ser organizado de modos diferentes
label: ou
left:
  title: Procedural
  items:
    - Começa pelas tarefas
    - Dados circulam entre funções
    - O fluxo conduz a solução
right:
  title: Orientado a objetos
  items:
    - Começa pelas entidades
    - Dados e comportamentos ficam juntos
    - Objetos colaboram na solução
---

---
layout: statement
kicker: A virada
title: Em vez de perguntar apenas “qual é o próximo passo?”, perguntamos “quem deve fazer isso?”
---

---
layout: statement
kicker: Olhar para o mundo
title: Na natureza, tudo pode ser pensado como objeto — se conseguimos identificar e descrever.
---

---
layout: define
kicker: Ideia central
term: Objeto
definition: Qualquer coisa que possa ser <span class="accent2">identificada e descrita</span> por meio de suas propriedades.
points:
  - Pode ser concreto, como uma bicicleta
  - Pode ser conceitual, como uma conta bancária
  - Existe dentro do contexto que estamos modelando
---

---
layout: diagram
kicker: Olhar de modelagem
title: Quais objetos pertencem aos mesmos grupos?
note: Não existe uma única resposta: o critério escolhido faz parte da modelagem.
---

<Figure
  src="../../assets/objetos-para-classificar.png"
  alt="Doze objetos cotidianos organizados sem rótulos para uma atividade de classificação"
  caption="Em duplas: nomeiem os grupos e justifiquem as propriedades compartilhadas."
/>

<!--
[Sources]
- Imagem original gerada por IA para esta aula, sem ativos externos.

Evite revelar uma única resposta. Grupos plausíveis incluem meios de transporte,
plantas e utensílios, mas o critério adotado é parte da discussão.
-->

---
layout: define
kicker: Padrões que percebemos
term: Categoria
definition: Objetos que compartilham <span class="accent2">propriedades semelhantes</span> podem ser agrupados.
points:
  - O nome do grupo comunica uma ideia comum
  - As semelhanças dependem do critério escolhido
  - Na programação OO, uma classe descreve um tipo de objeto
---

---
layout: panels
kicker: Um objeto, várias leituras
title: A categoria muda quando o critério muda
panels:
  - icon: lucide:bike
    title: Transporte
    items:
      - bicicleta
      - carro
      - ônibus
  - icon: lucide:leaf
    title: Seres vivos
    items:
      - samambaia
      - cacto
      - girassol
  - icon: lucide:package
    title: Objetos fabricados
    items:
      - bicicleta
      - caneca
      - cadeira
---

---
layout: default
kicker: Espaço reservado
title: Exemplos para discutir em sala
ghost: "?"
---

<!-- Slide propositalmente livre para o professor inserir imagens de exemplos. -->

---
layout: define
kicker: Habilidade essencial
term: Abstração
definition: Considerar apenas o que é <span class="accent2">relevante no contexto</span>.
points:
  - Não é ignorar detalhes ao acaso
  - É escolher detalhes que ajudam a resolver o problema atual
  - Outro contexto pode exigir outra representação do mesmo objeto
---

---
layout: columns
kicker: Contexto decide
title: A mesma pessoa, abstrações diferentes
columns:
  - title: Biblioteca
    items:
      - matrícula
      - livros emprestados
      - data de devolução
  - title: Jogo
    items:
      - apelido
      - energia
      - pontuação
  - title: Restaurante
    items:
      - número da mesa
      - pedido
      - valor da conta
---

---
layout: statement
kicker: Pergunta de abstração
title: A cor dos olhos é importante para uma biblioteca? E para um criador de avatares?
---

---
layout: code
kicker: A nova organização
title: O objeto reúne dados e ações que fazem sentido juntos
---

```java
class Bicicleta {
    String modelo;
    int velocidade;

    void acelerar() {
        velocidade += 10;
    }
}
```

<!-- Antecipe classe sem esgotar o tema. A próxima aula nomeará estado, comportamento e identidade. -->

---
layout: columns
kicker: Modelo mental
title: A categoria descreve; cada objeto concretiza
columns:
  - title: Classe Bicicleta
    items:
      - descreve modelo e velocidade
      - oferece o comportamento acelerar
      - organiza o que é comum
  - title: Bicicleta azul
    items:
      - modelo Urbana
      - velocidade 0
      - identidade própria
  - title: Bicicleta vermelha
    items:
      - modelo Trilha
      - velocidade 20
      - identidade própria
---

---
layout: compare
kicker: Mesmo problema, outra estrutura
title: A mudança está no centro da organização
columns: [Pergunta, Procedural, Orientado a objetos]
rows:
  - metric: Ponto de partida
    before: O que o programa faz?
    after: Quem participa do problema?
  - metric: Organização
    before: Funções e dados
    after: Objetos com responsabilidades
  - metric: Colaboração
    before: Chamadas em sequência
    after: Mensagens entre objetos
---

---
layout: bigtype
kicker: Conclusão 1
title: OO não é só uma nova sintaxe. É uma nova forma de <em>modelar</em>.
---

---
layout: steps
kicker: Conclusão 2
title: O caminho que percorremos
steps:
  - title: Identificar
    desc: reconhecer objetos no contexto
    icon: lucide:scan-search
  - title: Descrever
    desc: selecionar propriedades relevantes
    icon: lucide:list-filter
  - title: Agrupar
    desc: encontrar semelhanças e categorias
    icon: lucide:boxes
  - title: Colaborar
    desc: distribuir responsabilidades
    icon: lucide:network
---

---
layout: default
kicker: Verificação de saída
title: Explique em 30 segundos
---

<v-clicks>

- Um objeto que você observou hoje
- Duas propriedades relevantes em um contexto escolhido
- Uma propriedade que você descartaria nesse mesmo contexto
- Uma diferença entre pensar proceduralmente e pensar em objetos

</v-clicks>

<!-- Peça respostas curtas de diferentes estudantes; use as divergências para reforçar que abstração depende do contexto. -->

---
layout: end
title: Todo objeto tem estado, comportamento e identidade
subtitle: Vamos traduzir essas três ideias para código Java.
---
