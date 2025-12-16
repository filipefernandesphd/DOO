# Implementação da AV3

- Sempre que possível, todos os atributos devem ser privados;
- Sempre que possível, o estado dos objetos devem ser acessados por meio de `get` e `set`;

## *Usuário*

**Regras de negócio**

- Usuários podem ser tanto alunos quanto professores. Os alunos usam o sistema para fazer prova e professores usam para testar seus conhecimentos;
- Os usuários podem ser identificados no sistema tanto por email quanto por identificação; 

**Design**
- As classes devem estar em `br/com/sistema/usuarios`;
- Crie as classes `Aluno` e `Professor` como subclasse de `Usuario`;
- `Usuario`, `Aluno` e `Professor` podem ser acessadas de qualquer lugar;
- `Usuario` deve ter somente um construtor e o método `getIdentificacao`. Este método deve receber a identificação do usuário, que pode ser tanto `String` quanto `Integer`. Seu objetivo é retornar o valor da identifação que é informada quando o objeto é criado. 

## *Questões*

**Regras de negócio**

- Uma questão pode ser organizada em blocos. Por sua vez, um bloco pode conter infinitos sub-blocos;
- Uma questão pode ser do tipo verdadeiro ou falso, aberta ou múltipla escolha;

**Design**

- As classes devem estar em `br/com/sistema/provas/questao`;
- O padrão *composite* deve ser implementado nas classes `Questao` e `Bloco`;
- Todas as classes do pacote podem ser acessadas de qualquer lugar;
- Um objeto do tipo `Bloco` deve ser composto tanto por questões quanto por outros blocos;
- `Questao` deve implementar uma classe interna não estática (sugestão: `MultiplaEscolha`) relacionada a cada alternativa de múltipla escolha;
- Ao instanciar a alternatica de múltipla escolha, deve-se ter a opção de informar o enunciado somente ou o enunciado e se a alternativa é a certa ou não. 
- Toda alternativa instanciada já deve ser criada como alternativa falsa;
- `Questao` deve implementar os métodos:
    - `public void adicionarRespostaAberta(String repostaaberta)`: esse método é chamado quando a questão é discursiva. O parâmetro deve armazenar a resposta correta para auxiliar a correção;
    - `public void adicionarVerdadeiroFalso(boolean afirmacaocorreta)`: quando a questão é verdadeira ou falsa. O parâmetro deve atualizar a variável de controle para `true`, se a questão for verdadeira e `false` se for falsa;
    - `public void adicionarMultiplaEscolha()`: quando a questão for composta por alternativas de múltipla escolha. Esse método pode ser chamado de duas formas: a primeira informando somente o enunciado e a outra forma é informando o enunciado da alternativa e um `boolean` - indicando se a alternativa é a correta ou errada. 

## *Conteúdos Extras*

**Regras de negócio**

- Uma questão pode ser composta por conteúdos extras. Em outras palavras, uma vez que a questão tem um enunciado, podem ser adicionadas mais informações no enunciado do tipo texto, imagem e vídeo; 
- Não há limite para adicionar os conteúdos extras ao enunciado;

**Design**

- As classes devem estar em `br/com/sistema/provas/conteudoextra`;
- O padrão *decorator* deve ser implementado;
- A classe `ConteudoExtra` é a base da implementação;
- As classes `TextoDecorator`, `ImagemDecorator`, `VideoDecorator` possuem a responsabilidade de adicionar os conteúdos extras, conforme o seu propósito. 
- A classe `Questao` deve implementar os métodos:
    - `public void adicionarTextoExtra(String conteudo)`: chamar a classe `TextoDecorator` e decorar a questão com o conteúdo extra passado em `conteudo`; 
    - `public void adicionarImagemExtra(String conteudo)`: chamar a classe `ImagemDecorator` e decorar a questão com o conteúdo extra passado em `conteudo`, adicionando a tag html `img` (ex: `<img src='conteudo' />`);
    - `public void adicionarVideoExtra(String conteudo)`: chamar a classe `VideoDecorator` e decorar a questão com o conteúdo extra passado em `conteudo`, adicionando a url `https://www.youtube.com/watch?v=` (ex: `https://www.youtube.com/watch?v=conteudo`);

## *Prova*

**Regras de negócio**

- Uma prova deve ser composta por questões e blocos de questões;
- Ao iniciar a prova, deve mostrar em tela o boco da questões e, sucessivamente, as questões formatadas, conforme o tipo de cada uma. Por exemplo, se a questão for de múltipla escolha, mostrar as alternativas com as letras na fremte (a, b, c etc..), caso seja verdadeiro ou falso, mostrar as opções ( ) Verdadeiro ( ) Falso. Se a questão for aberta, somente o enunciado deve ser mostrado. 
- Além disso, os conteúdos extras de cada questão também devem ser mostrados. 

**Design**

- As classes `Prova` e `ProvaGerada` devem estar na pasta `br/com/sistema/provas/`;
- `Prova` deve implementar somente os métodos:
    - `public void adicionarQuestao(BlocoQuestao questao)`: adicionar uma questão à lista de questões;
    - `public ArrayList<BlocoQuestao> retornarQuestoes()`: retornar a lista de questões;
- `ProvaGerada` implementa a lógica para mostrar as questões da prova em tela por meio do principal método `iniciar()`. Ele deve numerar as questões, bem como colocar as letras das alternativas de múltipla escolha na ordem. 

**DICA**
> Talvez você precise converter uma variável do tipo *SuperClasse* para *SubClasse* 
>
> Sendo assim, faça `SubClasse subclasse = (SubClasse) super`
>
> Exemplo:
```java
SuperClasse super = new SuperClasse(); // objeto criado do tipo da super classe`
SubClasse subclasse = (SubClasse) super; // mesmo objeto, porém convertido para o tipo da sua subclasse
```

## Execução do Programa

- O programa deve ser desenvolvido baseado no `Main.java` abaixo. Porém, algumas implementações foram perdidadas e devem ser implementadas novamente.

```java
public class Main {
    public static void main(String args[]) {
        // Instanciação de usuários
        aluno1 = new Aluno<>("alunoum@gmail.com");
        System.out.println(aluno1.getIdentificacao());

        Aluno<> aluno2 = new (123);
        System.out.println(aluno2.getIdentificacao());

        prof1 = new Professor<>("professor1@gmail.com");
        System.out.println(prof1.getIdentificacao());

        Integer prof2 = new <Integer>(984868);
        System.out.println(prof2.getIdentificacao());
        
        System.out.println();

        // Questao 1
        Questao q1 = new Questao("O Brasil foi alcançado em 1500 de maneira fortuita, durante uma expedição cujo destino original era outro.");
        
        q1.adicionarTextoExtra("Quem descobriu o Brasil?");
        q1.adicionarImagemExtra("https://x.com/govbr/status/988160591448739840");
        q1.adicionarVideoExtra("Ut-KsHLoxSM");
        
        q1.adicionarMultiplaEscolha("Pedro Álvares Cabral", true);
        q1.adicionarMultiplaEscolha("Américo Vespúcio");
        q1.adicionarMultiplaEscolha("Cristóvão Colombo");
        q1.adicionarMultiplaEscolha("Pedro Vaz de Caminha");
        q1.adicionarMultiplaEscolha("Os povos indígenas");

        // Questao 2
        Questao q2 = new Questao("A cidade de Manhuaçu já foi um república.");
        q2.adicionarVerdadeiroFalso(true);

        // Questao 3
        Questao q3 = new Questao("Comente sobre o atual cenário político do Brasil.");
        q3.adicionarRespostaAberta("Um caos!");

        // Bloco história
        Bloco historia = new Bloco("História");
        historia.adicionar(q1);
        historia.adicionar(q2);
        historia.adicionar(q3);

        // Prova
        Prova prova1 = new Prova();
        prova1.adicionarQuestao(historia);
        prova1.adicionarQuestao(q1);
        prova1.adicionarQuestao(q2);
        prova1.adicionarQuestao(q3);

        GeraProva prova1gerada = new GeraProva(prova1);
        ;       
    }
}
```
- A saída produzida deve ser:
```text
alunoum@gmail.com
123
professor1@gmail.com
984868

História

1 - O Brasil foi alcançado em 1500 de maneira fortuita, durante uma expedição cujo destino original era outro.

Quem descobriu o Brasil?
<img src='https://x.com/govbr/status/988160591448739840' />
https://www.youtube.com/watch?v=Ut-KsHLoxSM
a) Pedro Álvares Cabral
b) Américo Vespúcio
c) Cristóvão Colombo
d) Pedro Vaz de Caminha
e) Os povos indígenas

2 - A cidade de Manhuaçu já foi um república.

(  ) Verdadeiro          (  ) Falso

3 - Comente sobre o atual cenário político do Brasil.
```