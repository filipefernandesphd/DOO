---
theme: slidev-theme-tahta
addons:
  - slidev-addon-citations
title: Modificador de Acesso - Public
aspectRatio: 16/10
info: |
  Aula sobre os tipos de modificador de acesso do Java: public
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
title: "Teoria"
---

---
layout: section
index: "01"
title: "Revisão"
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
index: "03"
title: Importante!
---

---
layout: default
title: package x import
---
- Usa-se `package` e `import` para acessar classes que estão em diferentes pastas.

---
layout: code
title: Exemplo (1)
---

```shell[font=extralarge]
|-- Main.java
|-- Veiculo/
    |-- Veiculo.java
```

---
layout: code
title: Exemplo (2)
---
```java[font=extralarge]
package Veiculo;

public class Veiculo {
  // implementação
}
```

---
layout: code
title: Exemplo (3)
---
```java[font=extralarge]
// sintaxe: pasta.classe
import Veiculo.Veiculo;

public class Main {
  public static void main(String[] args){
    Veiculo v = new Veiculo();
  }
}
```

---
layout: section
title: Desenvolvimento
index: "D"
---

---
layout: default
title: Concessionária
kicker: Prática guiada
---
- No projeto da concessionária, coloque as classes `Venda`, `Cliente` e `Carro` e em suas respectivas pastas. 
- Use `package` e `import` para realizar esta ação.
- Faça as devidas modificações para o programa continuar funcionando.

---
layout: section
index: "H"
title: Hands-on
---

---
layout: default
title: Enunciado padrão
kicker: Desafio
---
Para cada cenário:
- Coloque as classes em suas respectivas pastas. 
- Use `package` e `import` para realizar esta ação.
- Faça as devidas modificações para o programa continuar funcionando.

---
layout: panels
kicker: Cenários
title: Escolha um domínio
panels:
  - icon: "lucide:library"
    title: Sistema de biblioteca
    items:
      - Lista de livros emprestados
      - Adicionar, devolver e listar
  - icon: "lucide:landmark"
    title: Sistema bancário
    items:
      - Lista de contas do cliente
      - Cadastrar, encerrar e consultar
  - icon: "lucide:shopping-cart"
    title: E-commerce
    items:
      - Lista de produtos do carrinho
      - Adicionar, remover e calcular total
  - icon: "lucide:send"
    title: Mensagem
    items:
      - Lista de mensagens enviadas
      - Adicionar, remover e calcular total
---

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
