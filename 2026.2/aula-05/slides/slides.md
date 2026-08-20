---
theme: slidev-theme-tahta
addons:
  - slidev-addon-citations
title: Lista de objetos
aspectRatio: 16/10
info: |
  Aula sobre listas de objetos com ArrayList em Java.
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
layout: define
kicker: Sem complicação
term: Lista
definition: É uma coleção que guarda <span class="accent2">vários objetos em sequência</span> e permite acessar cada um deles.
points:
  - Reúne objetos do mesmo tipo
  - Pode crescer ou diminuir durante a execução
  - Mantém a ordem em que os elementos foram adicionados
---

---
layout: statement
kicker: Por que usar?
title: Quando a quantidade de objetos varia, uma lista acompanha o programa sem exigir um tamanho fixo.
---

---
layout: code
kicker: Sintaxe básica
title: Criando um ArrayList
---

```java[font=extralarge]
import java.util.ArrayList;
import java.util.List;

List<Cliente> clientes = new ArrayList<>();
clientes.add(new Cliente("Lia"));
```

---
layout: code
kicker: Exemplo concreto
title: Uma lista de carros
---

```java[font=extralarge]
List<Carro> carros = new ArrayList<>();

carros.add(new Carro("Onix", 2024));
carros.add(new Carro("Argo", 2023));

System.out.println(carros.size()); // 2
System.out.println(carros.get(0).modelo);
```

---
layout: code
kicker: Percorrendo a lista
title: O for-each visita cada objeto
---

```java[font=extralarge]
for (Carro carro : carros) {
  carro.exibirDados();
}
```

---
layout: code
kicker: Outro exemplo
title: Adicionar, localizar e remover produtos
---

```java[font=extralarge]
List<Produto> produtos = new ArrayList<>();
produtos.add(new Produto("Mouse", 89.90));
produtos.add(new Produto("Teclado", 149.90));

Produto primeiro = produtos.get(0);
produtos.remove(primeiro);

System.out.println(produtos.size()); // 1
```

---
layout: section
index: "D"
title: Desenvolvimento
---

---
layout: default
kicker: Prática guiada
title: Venda de vários carros
---

Uma concessionária precisa registrar a venda de **quantos carros o cliente
escolher**.

1. Crie as classes `Cliente`, `Carro` e `Venda`.
2. Em `Venda`, declare uma `List<Carro>`.
3. Implemente um método para adicionar carros à venda.
4. Percorra a lista e exiba cada veículo comprado.
5. Calcule e mostre o valor total da venda.

---
layout: code
kicker: Estrutura inicial
title: A venda mantém sua própria lista
---

```java[font=extralarge]
class Venda {
  Cliente cliente;
  List<Carro> carros = new ArrayList<>();

  void adicionarCarro(Carro carro) {
    carros.add(carro);
  }
}
```

---
layout: section
index: "H"
title: Hands-on
---

---
layout: default
kicker: Desafio
title: Enunciado padrão
---

Para cada cenário:

1. Modele a classe principal e a classe dos objetos armazenados.
2. Declare uma `List<Tipo>` e inicialize-a com `ArrayList`.
3. Implemente métodos para adicionar e remover objetos.
4. Percorra a lista com `for-each` e exiba os dados.
5. Demonstre o programa com pelo menos três objetos.

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
