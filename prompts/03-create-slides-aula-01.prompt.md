TEAREFA:

Refaça os slides da aula-01. Ou seja, exclua tudo que vc tem e SOMENTE considere o que será passado aqui.

INSTRUCOES:

Evite explicações nos slides. Seja pontual. A explicação é por minha conta. Coloque frases bem diretas.

Abaixo, vou colocar algumas ideias e/ou exatamente os conteudos que eu quero. Minhas ideias ficarão entre colchetes. Analise o tipo de conteudo e aplique o melhor layout para o template.

Vou colocar SLIDES para saber quando inicia/termina um. Eu posso colocar algumas tags do slidev.

CONTEUDO:

SLIDES

title: Algoritmos e Lógica de Programação

kicker: Ementa

[Crie uma lista de topicos]\: Estudo dos conceitos fundamentais sobre algoritmos. Noções de lógica matemática. Noções de uma linguagem de programação. Estruturas básicas para construção de algoritmos como Variáveis, Estruturas de Seleção e Repetição. Funções. Manipulação de vetores e matrizes.

SLIDES

title: Habilidades

kicker: Algoritmos e Lógica de Programação

Lista: Definir variáveis, definir funções, trabalhar com operadores (aritméticos, operadores de comparacao, operadores logicos etc) e estrutura de controle (condicionais, loops e desvio) ...

SLIDES

title: Objetivo

[em destaque] Criar algoritmos!

SLIDES

[titulo destacado] O que são algoritmos?

SLIDES

kicker: Definição

[titulo destacado] **Algoritmo** é uma **sequência finita e ordenada de passos para resolver um problema.**

SLIDES

title: Paradigma

[enfase] Paradigma Procedural

SLIDES

title: Exemplo

kicker: Paradigma Procedural

[codigo java com fonte grande]

public class Main {

    // Função que retorna um caracter por linha

    static void mostrarCaracteres(String texto) {
        for (int i = 0; i < texto.length(); i++) {
            System.out.println(texto.charAt(i));
        }
    }

   public static void main(String[] args) {
        mostrarCaracteres("JAVA");
    }
}

SLIDES

title: Outro exemplo

kicker: Paradigma Procedural

[codigo java - aplique magic move para os codigos abaixo - dentro dos slides, vou colocar MAGICMOVE#n, onde n é a sequencia de codigos]

MAGICMOVE#1

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

MAGICMOVE#2

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

SLIDES

[titulo c destaque] O que muda no Paradigma de Orientação a Objetos?

SLIDES

[enfase] **Paradigma é uma forma de pensar e organizar a maneira como um problema será resolvido.**

SLIDES

[coluna 1]

**Paradigma Procedural**

Organiza a solução em uma sequência de procedimentos e instruções

[coluna 2]

**Paradigma Orientado a Objetos**

Organiza a solução em **objetos** que possuem características e comportamentos.

SLIDES

[titulo c destaque] O que é um **objeto**?

SLIDES

[insira a imagem 2026.2/assets/objetos-para-classificar.png]

SLIDES

[coluna 1]

Alguns objetos possuem semelhanças?

[coluna 2]

[insira a imagem 2026.2/assets/objetos-para-classificar.png]

SLIDES

[coluna 1]

Podemos agrupá-los?

[coluna 2]

[insira a imagem 2026.2/assets/objetos-para-classificar.png]

SLIDES

[coluna 1]

Quais aspectos foram analisados para agrupá-los?

[coluna 2]

[insira a imagem 2026.2/assets/objetos-para-classificar.png]

SLIDES

title: Definições

**Objeto:** unidade com **identidade**, **estado** e **comportamento**, que compartilha propriedades com objetos da mesma classe.

**Classe:** estrutura que define as **propriedades** comuns a um conjunto de objetos.

SLIDES

title: Conclusão

[liste em topicos em sucientos para os alunos frizarem o que foi visto: o que é paradigma, paradigma orientado a objetos, objeto, classe]
