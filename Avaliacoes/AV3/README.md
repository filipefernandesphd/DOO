# Código-fonte da AV3

Código desenvolvido para a avialação AV3. 

O objetivo é criar um sistema de prova online. Os principais conceitos envolvidos são: 
- Padrões de projeto composite e decorator
- Classes genéricas
- Agregação e composição
- Paralelismo
- Modificadores de acesso
- Herança e polimorfismo

## Informações para a prova:

- Todos os atributos devem ser privados;
- O estado do objeto deve ser acessado por meio de `get` e `set`;

### *Usuário*

**Regras de negócio**

- Usuários podem ser tanto alunos quanto professores. Os alunos usam o sistema para fazer prova e professores usam para testar seus conhecimentos;
- Os usuários podem ser identificados no sistema tanto por email quanto por identificação; 

**Design**
- As classes devem estar em `br/com/sistema/usuarios`;
- Crie as classes `Aluno` e `Professor` como subclasse de `Usuario`;
- `Usuario` deve estar visível somente no pacote;
- `Aluno` e `Professor` podem ser acessadas de qualquer lugar;
- `Usuario` deve ter somente um construtor e o método `getIdentificacao`. Este método deve receber a identificação do usuário, que pode ser tanto `String` quanto `Integer`. Seu objetivo é retornar o valor da identifação que é informada quando o objeto é criado. 

### *Questões*

**Regras de negócio**

- Uma questão pode ser organizada em blocos. Por sua vez, um bloco pode conter infinitos sub-blocos;
- Uma questão pode ser do tipo verdadeiro ou falso, aberta ou múltipla escolha;

**Design**

- As classes devem estar em `br/com/sistema/provas/questao`;
- O padrão *composite* deve ser implementado nas classes `Questao` e `Bloco`;
- Todas as classes do pacote podem ser acessadas de qualquer lugar;
- Um objeto do tipo `Bloco` deve ser composto tanto por questões quanto por outros blocos;
- `Questao` deve implementar uma classe interna não estática privada (sugestão: `MultiplaEscolha`) relacionada a cada alternativa de múltipla escolha;
- Ao instanciar a alternatica de múltipla escolha, deve-se ter a opção de informar o enunciado somente ou o enunciado e se a alternativa é a certa ou não. 
- Toda alternativa instanciada já deve ser criada como alternativa falsa;
- `Questao` deve implementar os métodos:
    - `public void adicionarRespostaAberta(String repostaaberta)`: esse método é chamado quando a questão é discursiva. O parâmetro deve armazenar a resposta correta para auxiliar a correção;
    - `public void adicionarVerdadeiroFalso(boolean afirmacaocorreta)`: quando a questão é verdadeira ou falsa. O parâmetro deve atualizar a variável de controle para `true`, se a questão for verdadeira e `false` se for falsa;
    - `public void adicionarMultiplaEscolha()`: quando a questão for composta por alternativas de múltipla escolha. Esse método pode ser chamado de duas formas: a primeira informando somente o enunciado e a outra forma é informando o enunciado da alternativa e um `boolean` - indicando se a alternativa é a correta ou errada. 

### *Conteúdos Extras*

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