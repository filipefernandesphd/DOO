---
theme: slidev-theme-tahta
title: Da programação procedural para a orientação a objetos
aspectRatio: 16/10
info: |
  Da programação procedural para a orientação a objetos.
themeConfig:
  variant: minimal
  lang: pt-BR
mdc: true
routerMode: hash
layout: academic-cover
---

---
layout: default
kicker: Ementa
title: Algoritmos e Lógica de Programação
---

- Conceitos fundamentais sobre algoritmos
- Noções de lógica matemática
- Noções de uma linguagem de programação
- Variáveis
- Estruturas de seleção e repetição
- Funções, vetores e matrizes

---
layout: default
kicker: Algoritmos e Lógica de Programação
title: Habilidades
---

- Definir variáveis
- Definir funções
- Trabalhar com operadores aritméticos, de comparação e lógicos
- Usar condicionais, loops e desvios

---
layout: bigtype
kicker: Objetivo
title: Criar <em>algoritmos!</em>
---

---
layout: bigtype
title: O que são <em>algoritmos?</em>
---

---
layout: define
kicker: Definição
term: Algoritmo
definition: Uma <span class="accent2">sequência finita e ordenada de passos</span> para resolver um problema.
---

---
layout: bigtype
kicker: Paradigma
title: Paradigma <em>Procedural</em>
---

---
layout: code
kicker: Paradigma Procedural
title: Exemplo
---

````md magic-move
```java
public class Main {

    // Função que exibe um caractere por linha

    // Chamada da função
}
```
```java
public class Main {

    // Função que exibe um caractere por linha
    static void mostrarCaracteres(String texto) {
        for (int i = 0; i < texto.length(); i++) {
            System.out.println(texto.charAt(i));
        }
    }

    // Chamada da função
    public static void main(String[] args) {
        mostrarCaracteres("JAVA");
    }
}
```
````

---
layout: code
kicker: Paradigma Procedural
title: Outro exemplo
---

````md magic-move
```java
public class Main {
    public static void main(String[] args) {
        // Cria o leitor de dados
        // Lê o nome
        // Lê a data de nascimento
        // Cria as datas
        // Calcula a idade
        // Exibe o resultado
        // Fecha o leitor
    }
}
```
```java
import java.util.Scanner;
import java.time.LocalDate;
import java.time.Period;
public class Main {
    public static void main(String[] args) {
        // Cria o leitor de dados
        Scanner scanner = new Scanner(System.in);
        // Lê o nome
        System.out.print("Informe seu nome: ");
        String nome = scanner.nextLine();
        // Lê a data de nascimento
        System.out.print("Informe o ano de nascimento: ");
        int ano = scanner.nextInt();
        System.out.print("Informe o mês de nascimento: ");
        int mes = scanner.nextInt();
        System.out.print("Informe o dia de nascimento: ");
        int dia = scanner.nextInt();
        // Cria as datas
        LocalDate nascimento = LocalDate.of(ano, mes, dia);
        LocalDate hoje = LocalDate.now();
        // Calcula a idade
        int idade = Period.between(nascimento, hoje).getYears();
        // Exibe o resultado
        System.out.println(nome + " tem " + idade + " anos de idade.");
        // Fecha o leitor
        scanner.close();
    }
}
```
````

---
layout: bigtype
title: O que muda no Paradigma de <em>Orientação a Objetos?</em>
---

---
layout: statement
title: <em>Paradigma</em> é uma forma de pensar e organizar a maneira como um problema será resolvido.
---

---
layout: vs
kicker: Duas formas de organizar a solução
label: ou
left:
  title: Paradigma Procedural
  items:
    - Sequência de procedimentos
    - Instruções
right:
  title: Paradigma Orientado a Objetos
  items:
    - Objetos
    - Características
    - Comportamentos
---

---
layout: bigtype
title: O que é um <em>objeto?</em>
---

---
layout: diagram
---

<img
  class="aula-01-classification-image"
  src="../../assets/objetos-para-classificar.png"
  alt="Objetos cotidianos apresentados para uma atividade de classificação"
/>

---
layout: two-cols
title: Alguns objetos possuem <em>semelhanças?</em>
---

::right::

<img
  class="aula-01-classification-image"
  src="../../assets/objetos-para-classificar.png"
  alt="Objetos cotidianos apresentados para uma atividade de classificação"
/>

---
layout: default
title: Podemos <em>agrupá-los?</em>
---

<img
  class="aula-01-classification-image aula-01-classification-image--centered"
  src="../../assets/objetos-para-classificar.png"
  alt="Objetos cotidianos apresentados para uma atividade de classificação"
/>

---
layout: default
title: Quais aspectos foram analisados para <em>agrupá-los?</em>
---

<img
  class="aula-01-classification-image aula-01-classification-image--centered"
  src="../../assets/objetos-para-classificar.png"
  alt="Objetos cotidianos apresentados para uma atividade de classificação"
/>

---
layout: define
kicker: Definições
term: Objeto
definition: Unidade com <span class="accent2">identidade, estado e comportamento</span>, que compartilha propriedades com objetos da mesma classe.
points:
  - <strong>Classe:</strong> estrutura que define as propriedades comuns a um conjunto de objetos.
---

---
layout: default
kicker: Conclusão
title: O que vimos
---

- **Paradigma:** forma de pensar e organizar uma solução
- **Orientação a objetos:** solução organizada em objetos
- **Objeto:** identidade, estado e comportamento
- **Classe:** propriedades comuns a um conjunto de objetos

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
  class="aula-01-evaluation-qrcode"
  src="../../assets/qrcode-avaliacao.png"
  alt="QR code da avaliação da experiência de aprendizagem"
/>
