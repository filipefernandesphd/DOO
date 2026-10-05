---
theme: slidev-theme-tahta
colorSchema: light
addons:
  - slidev-addon-citations
title: "Modificadores de estado: static e final"
aspectRatio: 16/10
info: |
  Modificadores de estado: static e final
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
title: "Teoria"
---

---
layout: section
index: "01"
title: "Introdução"
---

---
layout: vs
title: O que cada modificador controla?
left:
  title: Acesso
  items:
    - "<b>Quem pode acessar?<b>"
    - "public, protected e private"
right:
  title: Estado
  items:
    - "<b>Como o elemento se comporta?</b>"
    - "static e final"
---

---
layout: two-cols
title: Duas ideias centrais
---

**`static`**

Pertence à classe.

<!-- <Tags :items="['Compartilhamento', 'Sem instância']" /> -->

::right::

**`final`**

Imutável.

<!-- <Callout>Referência fixa permite objeto mutável.</Callout> -->

---
layout: section
index: "02"
title: "<em>static</em>"
---

---
layout: define
term: <em>static</em>
definition: "Um membro <em>static</em> pertence à classe, independentemente de seus objetos."
---

---
layout: default
title: Onde usar <em>static</em>?
---

<!-- | Classe | Objeto | Atributo | Método |
|---|---|---|---|
| Sim, aninhada | Na variável de classe | Sim | Sim | -->

<Grid
  head
  :data="[
    ['Classe', 'Objeto', 'Atributo', 'Método'],
    [ '✅', '❌', '✅', '✅'],
  ]"
/>

---
layout: default
kicker: STATIC
title: Classe
---

- Classe aninhada (veremos em outra aula)

```java[font=extralarge]
class Externa {
  static class Interna { }
}
```

---
layout: code
kicker: STATIC
title: Atributo
---

- Atributo da classe
- Todas as instâncias têm acesso

```java[font=extralarge]
class Carro {
  static int quantidade = 0;
}

// Dentro de main:
System.out.println(Carro.quantidade);
```

---
layout: code
kicker: STATIC
title: Exemplo
---

```java[font=large]
class Carro {
  static int quantidade = 0;
  
  Carro() {
    quantidade++;
  }
}

// Dentro de main:
Carro a = new Carro();
Carro b = new Carro();
System.out.println(Carro.quantidade); // 2
```

---
layout: code
kicker: STATIC
title: Método
---

- Método da classe
- Todas as instâncias têm acesso

```java[font=large]
class Calculadora {
  static int dobro(int valor) { return valor * 2; }
}

// Dentro de main:
int resultado = Calculadora.dobro(5);
```

---
layout: code
kicker: STATIC
title: Método
---

```java[font=large]
class Carro {
  private static int quantidade = 0;
  Carro() { quantidade++; }

  static int getQuantidade() {
    return quantidade;
  }
}

// Dentro de main:
Carro a = new Carro();
Carro b = new Carro();
System.out.println(Carro.getQuantidade()); // 2
```

---
layout: default
title: Resumo de <em>static</em>
---

| Elemento | Uso | Efeito | Exemplo |
|---|---|---|---|
| Classe | Aninhada | Sem instância externa | `static class Interna { }` |
| Atributo | Dado da classe | Uma cópia | `static int quantidade;` |
| Método | Operação da classe | Sem objeto e sem `this` | `static void calcular() { }` |

---
layout: section
index: "03"
title: "<em>final</em>"
---

---
layout: define
term: <em>final</em>
definition: "Impede reatribuição de variáveis, extensão de classes ou sobrescrita de métodos."
---

---
layout: default
title: Onde usar <em>final</em>?
---

<!-- | Classe | Objeto | Atributo | Método |
|---|---|---|---|
| Sim | Na referência | Sim | Sim |
| Sem subclasses | Referência fixa | Uma atribuição | Sem sobrescrita | -->


<Grid
  head
  :data="[
    ['Classe', 'Objeto', 'Atributo', 'Método'],
    [ '✅', '✅', '✅', '✅'],
  ]"
/>


---
layout: code
kicker: FINAL
title: Classe
---

- Impede criar subclasses.


```java[font=extralarge]
final class Pessoa { }

class Cliente extends Pessoa { } // ERRO
```

---
layout: code
kicker: FINAL
title: Exemplo
---

```java[font=large]
final class Recibo {
  void imprimir() {
    System.out.println("Venda registrada");
  }
}

// Dentro de main:
Recibo recibo = new Recibo();
recibo.imprimir();
```

---
layout: code
kicker: FINAL
title: Objeto
---

- A variável não pode apontar para outro objeto.
- O estado do objeto ainda pode mudar.


```java[font=large]
class Pessoa { String nome = "Ana"; }

// Dentro de main:
final Pessoa p = new Pessoa();
p = new Pessoa(); // ERRO
p.nome = "José das Couves"; // OK
```

---
layout: code
kicker: FINAL
title: Atributo
---

- Imagine que é uma `constante`.
- Não admite segunda retribuição.
- Boa prática: colocar tudo em caixa alta.

```java[font=large]
class Pessoa {
  private final String CPF;

  Pessoa(String cpf) {
    this.CPF = cpf;
  }
}
```

---
layout: code
kicker: FINAL
title: Exemplo
---

```java[font=extralarge]
class Carro {
  final int ANO;
  Carro(int ano) { this.ANO = ano; }
}

// Dentro de main:
Carro carro = new Carro(2020);
carro.ANO = 2021; // ERRO
```

---
layout: code
kicker: FINAL
title: Método
---

- Impede sobrescrita nas subclasses (veremos em outra aula)


```java[font=extralarge]
class Pessoa {
  public final void apresentar() {
    System.out.println("Sou uma pessoa");
  }
}
```

---
layout: default
title: Resumo de <em>final</em>
---

| Elemento | Uso | Efeito | Exemplo |
|---|---|---|---|
| Classe | Bloquear extensão | Sem subclasses | `final class Pessoa { }` |
| Objeto | Fixar referência | Estado pode mudar | `final Pessoa p = new Pessoa();` |
| Atributo | Atribuir uma vez | Sem reatribuição | `final String CPF;` |
| Método | Bloquear sobrescrita | Sem override | `final void calcular() { }` |

---
layout: code
title: <em>static</em> e <em>final</em> juntos
---
- static: um valor da classe.
- final: valor não reatribuído.
- **"constante da classe"**.

```java[font=large]
class Loja {
  static final int LIMITE_PARCELAS = 12;
}

// Dentro de main:
System.out.println(Loja.LIMITE_PARCELAS);
```

---
layout: section
index: "D"
title: "Desenvolvimento"
---

---
layout: default
title: Adaptar a concessionária
---

- Em `Carro`, crie `private static int quantidade`.
- Incremente no construtor e crie `getQuantidade()` estático.
- Torne o ano de fabricação `final`; inicialize no construtor.
- Em `Main`, declare `carro1` como `final`.

---
layout: section
index: "H"
title: "Hands-On"
---

---
layout: default
title: Sistema de biblioteca
---

- Em `Livro`, conte instâncias com um atributo `static`.
- Crie `static getQuantidade()` para consultar o contador.
- Defina o ISBN como `final`, recebido no construtor.

<Callout>Crie dois livros: contador 2; ISBN sem setter.</Callout>

---
layout: default
title: Sistema bancário
---

- Em `Conta`, crie `static final int LIMITE_SAQUES = 3`.
- Defina o número da conta como `final` no construtor.
- Mantenha o saldo como atributo de instância mutável.

<Callout>Duas contas: números fixos e saldos independentes.</Callout>

---
layout: default
title: E-commerce
---

- Em `Pedido`, conte instâncias com um atributo `static`.
- Consulte o total por um método `static`.
- Declare uma referência local a um pedido como `final`.

<Callout>Adicione itens ao pedido; tente reatribuir a referência.</Callout>

---
layout: default
title: Aplicativo de mensagens
---

- Em `Mensagem`, crie `static final int LIMITE_CARACTERES = 280`.
- Defina o remetente como referência `final` no construtor.
- Use o limite para validar o tamanho do texto.

<Callout>Teste 280 e 281 caracteres; mantenha o remetente fixo.</Callout>

---
layout: default
title: Referências
---
<BiblioList />

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
