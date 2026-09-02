---
theme: slidev-theme-tahta
addons:
  - slidev-addon-citations
title: Instanciação de objetos e método construtor
aspectRatio: 16/10
info: |
  Aula sobre instanciação de objetos e método construtor em Java.
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
title: Teoria
---

---
layout: section
index: "01"
title: Instanciação de objetos
---

---
layout: define
kicker: Sem complicação
term: Instanciação
definition: É quando o molde da classe vira um <span class="accent2">objeto de verdade</span> na memória.
points:
  - A classe descreve como o objeto será
  - O operador <span class="accent2">new</span> cria uma nova instância
  - Cada instância mantém seus próprios dados (<em>estado</em>)
---

---
layout: code
kicker: Sintaxe
title: Criando um objeto em Java
---

```java[font=extralarge]
Cliente cliente = new Cliente();
```

---
layout: code
kicker: Exemplo concreto
title: Dois objetos da mesma classe
---

```java[font=large]
class Jogador {
  String apelido;
}

class Main {
  public static void main(String[] args)
    Jogador jogador1 = new Jogador();
    Jogador jogador2 = new Jogador();

    jogador1.apelido = "Byte";
    jogador2.apelido = "Pixel";
}
```

---
layout: statement
kicker: Ideia-chave
title: Uma classe pode gerar vários objetos, cada um com seu próprio estado
---

---
layout: section
index: "02"
title: Método Construtor
---

---
layout: define
kicker: Sem complicação
term: Método construtor
definition: É a <span class="accent2">configuração inicial</span> que roda automaticamente quando o objeto nasce.
points:
  - <span class="accent2">Tem exatamente o mesmo nome da classe</span>
  - Não declara tipo de retorno, nem mesmo void
  - Recebe os dados necessários para iniciar o objeto
---

---
layout: code
kicker: Sintaxe
---

```java[font=extralarge]
class Cliente {
  String nome;
  int idade;

  Cliente(String nome, int idade) {
    this.nome = nome;
    this.idade = idade;
  }
}
```

---
layout: code
kicker: Exemplo concreto
---

```java[font=large]
class Cliente {
  String nome;
  int idade;

  Cliente(String nome, int idade) {
    this.nome = nome;
    this.idade = idade;
    System.out.println(nome + " — " + idade + " anos");
  }
}

Cliente cliente = new Cliente("Lia", 19);
```

---
layout: steps
kicker: O que acontece?
title: Da classe ao objeto
steps:
  - { title: new, desc: reserva espaço para o objeto, icon: "lucide:box" }
  - { title: Construtor, desc: recebe os valores iniciais, icon: "lucide:wrench" }
  - { title: this, desc: atualiza os atributos da instância, icon: "lucide:badge-check" }
  - { title: Referência, desc: permite acessar o objeto criado, icon: "lucide:mouse-pointer-2" }
---

---
layout: section
index: "D"
title: Desenvolvimento
---

---
layout: panels
kicker: Prática guiada
title: Construa, instancie e confira
panels:
  - icon: "lucide:user-round"
    title: Cliente
    items:
      - Parâmetros nome, cpf e email
      - Atribua os valores com this
      - Exiba os parâmetros recebidos
  - icon: "lucide:car-front"
    title: Carro
    items:
      - Parâmetros modelo, marca e ano
      - Atribua os valores com this
      - Exiba os parâmetros recebidos
---

<!-- ---
layout: default
kicker: Implemente
title: Critérios para concluir
---

<v-clicks>

- Declare os atributos de cada classe
- Implemente um construtor com todos os parâmetros
- Use `this` para diferenciar atributos e parâmetros
- Instancie pelo menos um objeto de cada classe
- Confira no console os valores informados

</v-clicks> -->

---
layout: section
index: "H"
title: Hands-on
---

---
layout: default
kicker: Hands-on
title: Faça para cada domínio
---

- Implemente a classe e seus atributos.
- Crie um construtor que receba todos os valores iniciais.
- Atribua os parâmetros aos atributos usando `this`.
- Exiba no console os valores recebidos pelo construtor.
- Instancie dois objetos com dados diferentes.

---
layout: panels
kicker: Cenários
title: Escolha um domínio
panels:
  - icon: "lucide:library"
    title: Sistema de biblioteca
    items:
      - Classe Livro
      - título, autor e ano
  - icon: "lucide:landmark"
    title: Sistema bancário
    items:
      - Classe ContaBancaria
      - titular, número e saldo
  - icon: "lucide:shopping-cart"
    title: E-commerce
    items:
      - Classe Produto
      - nome, preço e estoque
  - icon: "lucide:send"
    title: Mensagens
    items:
      - Classe Mensagem
      - id, remetente, destinatário, mensagem
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
