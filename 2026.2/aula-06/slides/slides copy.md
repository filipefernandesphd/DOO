---
theme: slidev-theme-tahta
addons:
  - slidev-addon-citations
title: Modificadores de acesso
aspectRatio: 16/10
info: |
  Aula sobre os tipos de modificadores de acesso do Java: default, public, protected e private
themeConfig:
  variant: minimal
  lang: pt-BR
mdc: true
routerMode: hash
preloadImages: false
biblio:
  filename: references.bib
  show_full_bib: true
  show_id: false
layout: academic-cover
---


---
layout: statement
kicker: Modificador de acesso 
title: Controla quem pode acessar uma classe, atributo ou método
---

---
layout: default
title: Os quatro níveis de acesso
---

<Grid
  head
  :data="[
    ['Modificador', 'Mesma classe', 'Mesmo pacote', 'Subclasse em outro pacote', 'Qualquer classe'],
    ['default', '✅', '✅', '❌', '❌'],
    ['public', '✅', '✅', '✅', '✅'],
    ['private', '✅', '❌', '❌', '❌'],
    ['protected', '✅', '✅', '✅', '❌']
  ]"
/>

<Callout tone="warn" icon="lucide:triangle-alert">
<strong>default</strong> não é palavra-chave: acontece quando nenhum modificador é declarado.
</Callout>

---
theme: slidev-theme-tahta
themeConfig:
  variant: notebook
  lang: pt-BR
layout: section
title: default
index: "01"
kicker: Modificadores de acesso
subtitle: Acesso dentro do mesmo <span class="accent2">pacote (pasta)</span>
foot: Modificadores de acesso
---
---
layout: define
kicker: Modificador default
term: Qual é a principal função?
definition: Permitir acesso aos elementos por <span class="accent2">classes do mesmo pacote</span>.
points:
  - Não possui palavra-chave própria
  - É aplicado quando nenhum modificador de acesso é declarado
  - Também é chamado de package-private
foot: Modificadores de acesso
---
---
layout: default
kicker: Modificador default
title: Onde pode ser aplicado?
foot: Modificadores de acesso
---

<Grid
  head
  :data="[
    ['Elemento', 'Pode usar default?', 'Como declarar'],
    ['Classe top-level', '✅', 'Sem modificador'],
    ['Atributo', '✅', 'Sem modificador'],
    ['Método', '✅', 'Sem modificador']
  ]"
/>

<Callout icon="lucide:info">
Em Java, <strong>default</strong> não é escrito: a ausência de modificador define o acesso de pacote.
</Callout>

<!-- Reforce que "default" aqui significa ausência de modificador de acesso. -->
---
layout: code
kicker: Modificador default
title: Sintaxe
foot: Modificadores de acesso
---

```java[font=extralarge]
class Produto {
    String nome;

    void exibirNome() {
        System.out.println(nome);
    }
}
```

<!-- Mostre que classe, atributo e método não possuem palavra-chave de acesso. -->
---
kicker: Modificador default
title: Exemplo
---

```java[font=normal]
package loja;

class Produto {
    String nome = "Notebook";

    void exibirNome() {
        System.out.println(nome);
    }
}

class App {
    public static void main(String[] args) {
        Produto p = new Produto();
        System.out.println(p.nome);
        p.exibirNome();
    }
}
```

<!-- Se App estivesse em outro pacote, Produto e seus membros default não seriam acessíveis. -->
---
layout: section
title: public
index: "02"
kicker: Modificadores de acesso
subtitle: Acesso disponível para outras classes
foot: Modificadores de acesso
---
---
layout: define
kicker: Modificador public
term: Qual é a principal função?
definition: Tornar o elemento <span class="accent2">acessível por qualquer classe</span> que consiga referenciá-lo.
points:
  - É o nível de acesso menos restritivo
  - Permite acesso entre diferentes pacotes
  - É comum em operações que fazem parte da interface pública da classe
foot: Modificadores de acesso
---
---
layout: default
kicker: Modificador public
title: Onde pode ser aplicado?
foot: Modificadores de acesso
---

<Grid
  head
  :data="[
    ['Elemento', 'Pode usar public?', 'Exemplo'],
    ['Classe top-level', '✅', 'public class Produto'],
    ['Atributo', '✅', 'public String nome'],
    ['Método', '✅', 'public void exibir()']
  ]"
/>

<!-- <Callout icon="lucide:file-code">
Uma classe <strong>public</strong> de nível superior deve estar em um arquivo com o mesmo nome da classe.
</Callout> -->

<!-- Exemplo: public class Produto deve estar no arquivo Produto.java. -->
---
layout: code
kicker: Modificador public
title: Sintaxe
foot: Modificadores de acesso
---

```java[font=extralarge]
public class Produto {
    public String nome;

    public void exibirNome() {
        System.out.println(nome);
    }
}
```

<!-- Destaque a palavra-chave public antes da classe, do atributo e do método. -->
---
kicker: Modificador public
title: Exemplo
---

```java[font=large]
// arquivo: loja/Produto.java
package loja;

public class Produto {
    public void exibirNome() {
        System.out.println("Notebook");
    }
}

// Em outro arquivo/pacote:
import loja.Produto;
Produto p = new Produto();
p.exibirNome();
```

<!-- Use os comentários finais apenas para mostrar que o acesso pode ocorrer de outro pacote. -->
---
layout: section
title: private
index: "03"
kicker: Modificadores de acesso
subtitle: Acesso restrito à própria classe
foot: Modificadores de acesso
---
---
layout: define
kicker: Modificador private
term: Qual é a principal função?
definition: Restringir o acesso ao elemento à <span class="accent2">própria classe que o declarou</span>.
points:
  - É o nível de acesso mais restritivo
  - É fundamental para ocultar detalhes internos da implementação
  - É amplamente utilizado no encapsulamento de atributos
foot: Modificadores de acesso
---
---
layout: default
kicker: Modificador private
title: Onde pode ser aplicado?
foot: Modificadores de acesso
---

<Grid
  head
  :data="[
    ['Elemento', 'Pode usar private?', 'Observação'],
    ['Classe top-level', '❌', 'Não permitido'],
    ['Atributo', '✅', 'Acesso somente na própria classe'],
    ['Método', '✅', 'Acesso somente na própria classe']
  ]"
/>

<Callout tone="warn" icon="lucide:triangle-alert">
Classes internas podem ser <strong>private</strong>. Veremos isso em outro momento.
</Callout>

<!-- Esta distinção evita que os alunos generalizem a regra de classes top-level para classes internas. -->
---
layout: code
kicker: Modificador private
title: Sintaxe
foot: Modificadores de acesso
---

```java[font=extralarge]
class Conta {
    private double saldo;

    private void validarSaldo() {
        System.out.println(saldo);
    }
}
```

<!-- A classe top-level não é private; apenas seus membros são. -->
---
kicker: Modificador private
title: Exemplo
---

```java[font=large]
class Conta {
    private double saldo;
}

class Main {
  public static void main(String[] args){
    Conta conta = new Conta();
    conta.saldo = 512.0; // Não conseguirá acessar!
  }
}
```

<!-- Conecte private ao encapsulamento: o estado fica protegido e as operações controlam o acesso. -->
---
layout: section
title: protected
index: "04"
kicker: Modificadores de acesso
subtitle: Acesso de pacote e acesso por <span class="accent2">herança</span>
foot: Modificadores de acesso
---
---
layout: define
kicker: Modificador protected
term: Qual é a principal função?
definition: Permitir acesso no <span class="accent2">mesmo pacote</span> e também por <span class="accent2">subclasses</span> localizadas em outros pacotes.
points:
  - Mais permissivo que private
  - Mais restritivo que public
  - É especialmente relevante quando estudamos herança
foot: Modificadores de acesso
---
---
layout: default
kicker: Modificador protected
title: Onde pode ser aplicado?
foot: Modificadores de acesso
---

<Grid
  head
  :data="[
    ['Elemento', 'Pode usar protected?', 'Observação'],
    ['Classe top-level', '❌', 'Não permitido'],
    ['Atributo', '✅', 'Mesmo pacote + subclasses'],
    ['Método', '✅', 'Mesmo pacote + subclasses']
  ]"
/>

<Callout tone="warn" icon="lucide:triangle-alert">
Classes internas podem ser <strong>protected</strong>. Veremos isso em outro momento.
</Callout>

<!-- Antecipe que protected ficará mais claro quando a turma estudar herança. -->
---
layout: code
kicker: Modificador protected
title: Sintaxe
foot: Modificadores de acesso
---

```java[font=extralarge]
class Pessoa {
    protected String nome;

    protected void apresentar() {
        System.out.println(nome);
    }
}
```

<!-- Destaque que protected pode ser aplicado a atributos e métodos. -->
---
layout: code-explain
kicker: Modificador protected
title: Exemplo
notes:
  - Vamos aprofundar no tópico <b>Herança</b>
---

```java[font=normal]
class Pessoa {
    protected String nome = "Ana";

    protected void apresentar() {
        System.out.println("Olá, " + nome);
    }
}

class Aluno extends Pessoa {
    void entrarNaAula() {
        apresentar();
        System.out.println(nome);
    }
}
```

<!-- Neste exemplo as classes estão no mesmo pacote; ao ensinar herança entre pacotes, explique a regra específica de acesso protected via subclasse. -->
