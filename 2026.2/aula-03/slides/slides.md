---
theme: slidev-theme-tahta
addons:
  - slidev-addon-citations
title: Classes, atributos e métodos
aspectRatio: 16/9
info: |
  Aula sobre classes, atributos e métodos.
themeConfig:
  variant: minimal
  lang: pt-BR
mdc: true
routerMode: hash
browserExporter: build
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
kicker: Teoria
title: Classes, atributos e métodos
---
---
layout: default
title: Definições
---
- **Classe:** modelo que define as características e os comportamentos comuns de um conjunto de objetos.
- **Atributos:** características ou propriedades que representam o estado de um objeto.
- **Métodos:** operações ou ações que representam o comportamento de um objeto.

---
layout: code
kicker: Estrutura básica
title: Implementação da classe
---

Arquivo: `NomeDaClasse.java`

```java[font=extralarge]
class NomeDaClasse {

}
```

---
layout: code
kicker: Estado
title: Implementação de atributos
---

Atributos são variáveis declaradas na classe.

```java[font=extralarge]
class NomeDaClasse {
  int nomeDoAtributo;
}
```

---
layout: code
kicker: Comportamento
title: Implementação de métodos
---

Métodos são funções associadas à classe.

```java[font=large]
class NomeDaClasse {
  TipoDeRetorno nomeDoMetodo(Tipo parametro) {
    // implementação...
  }
}
```

---
layout: code
kicker: Exemplo 1
title: Tipo de retorno do método
---

`void`: o método executa uma ação e não retorna valor.

```java[font=large]
void exibirMensagem() {
  System.out.println("Parangaricutirimicuaro");
  int soma = 2 + 3;
}
```

---
layout: code
kicker: Exemplo 2
title: Tipo de retorno do método
---

O tipo declarado indica o valor que o método retorna.

```java[font=large]
class Pessoa {
  int idade;

  int obterIdade() {
    return this.idade;
  }
}
```

---
layout: code
kicker: Dados de entrada
title: Parâmetros do método
---

Parâmetros são valores de entrada usados durante a execução do método.

```java[font=normal]
class Pessoa {
  String nome;
  int idade;

  void salvarPessoa(String novoNome, int novaIdade) {
    this.nome = novoNome;
    this.idade = novaIdade;
  }
}
```

---
layout: section
index: "D"
kicker: Desenvolvimento
title: Modelagem orientada
---

---
layout: default
kicker: Implemente
title: Sistema de vendas de carros
---

Modele um sistema para uma concessionária.

- Quais **classes** representam o domínio?
- Quais **atributos** descrevem cada classe?
- Quais **métodos** expressam seus comportamentos?

---
layout: section
index: "H"
kicker: Hands-on
title: Prática autônoma
---

---
layout: default
kicker: Implemente
title: Empréstimo de livros
---

Crie um sistema de empréstimo de livros de uma biblioteca.

- Defina as classes necessárias
- Declare seus atributos
- Implemente os métodos essenciais

---
layout: default
kicker: Outros cenários
title: Continue praticando
---

- Sistema de gerenciamento de contas bancárias
- Sistema de matrícula de alunos em uma escola
- Sistema de pedidos de uma lanchonete

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
