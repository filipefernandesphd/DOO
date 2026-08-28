---
theme: slidev-theme-tahta
addons:
  - slidev-addon-citations
title: Modificador de Acesso - Private
aspectRatio: 16/10
info: |
  Aula sobre os tipos de modificador de acesso do Java: private
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
title: Importante!
index: "04"
---

---
layout: code
title: Métodos getters e setters
---
- Boa prática de programação
- **Motivo**: estados <span class="accent2">nunca</span> podem ser acessados diretamente
```java[font=extralarge]
carro.preco = 123000.0; // errado
```

---
layout: code
title: Sintaxe
kicker: Métodos getters e setters
---
```java[font=extralarge]
String getNome(){
  return this.nome;
}

void setNome(String nome){
  this.nome = nome;
}
```

---
layout: code
title: Exemplo (1)
kicker: Métodos getters e setters
---
```java[font=large]
package Veiculo;

public class Veiculo {
  private double preco;

  public double getPreco(){
    return this.preco;
  }

  public void setPreco(double preco){
    this.preco = preco;
  }
}
```

---
layout: code
title: Exemplo (2)
kicker: Métodos getters e setters
---

```java[font=large]
import Veiculo.Veiculo;

public class App{
  public static void main(String[] args){
    Veiculo v1 = new Veiculo();
    v1.setPreco(100000.0);

    System.out.println("Preço: " + v1.getPreco());
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
- No projeto da concessionária, coloque `private` para todos os atributos e crie métodos `getters` e `setters` para cada um deles.
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
- Coloque `private` para todos os atributos e crie métodos `getters` e `setters` para cada um deles.
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
