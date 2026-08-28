---
theme: slidev-theme-tahta
addons:
  - slidev-addon-citations
title: Modificador de Acesso - Default
aspectRatio: 16/10
info: |
  Aula sobre os tipos de modificador de acesso do Java: default
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
layout: section
index: "T"
title: Teoria
---

---
layout: section
index: "01"
title: Introdução
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
index: "02"
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
index: "D"
title: Desenvolvimento
---

---
layout: default
title: Desenvolvimento
---
Dentro da mesma pasta, crie uma classe usando o modificador `default` e verifique se a classe, seus atributos e métodos são acessados realmente por `Main.java`.

<!-- ---
layout: default
title: Referências
---
<BiblioList /> -->

---
layout: feature
kicker: Encerramento
title: Obrigado!
columns: 2
features:

- { icon: "lucide:globe", desc: filipefernandesphd.com }
- { icon: "lucide:instagram", desc: "@filipfernandesphd" }

---

---
layout: two-cols
title: Avaliação da Experiência de Aprendizagem
---

- **[Seu feedback é muito importante!](https://forms.gle/CMfL5oTm235FfuH59)**
- Obtenha o código da avaliação

::right::

<img
  src="../../assets/qrcode-avaliacao.png"
  alt="QR code da avaliação da experiência de aprendizagem"
/>