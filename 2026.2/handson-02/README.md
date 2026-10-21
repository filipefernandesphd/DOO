# Hands-on 02 — Gestão de eventos em Java

[← Cronograma do semestre](../)

## Objetivo

Modelar, implementar e explicar um pequeno sistema de gestão de eventos aplicando herança, `static`, `final`, multiplicidade, agregação, composição, sobrescrita, sobrecarga e polimorfismo.

Como no [hands-on 1](../handson-01/), você construirá o sistema de forma incremental. O domínio agora será a organização de eventos acadêmicos. São **40 questões em oito blocos e sete desafios integradores**.

## Como estudar

O pré-requisito é conseguir criar classes, construtores e objetos, usar `ArrayList`, organizar pacotes e proteger atributos com `private`, como no hands-on 1.

- Evolua **um único projeto** nas questões Q01 a Q40. As análises de código são experimentos isolados; não substituem seu projeto.
- Use `modelo` para as classes de domínio e `app` para `Main`. Classes públicas ficam em arquivos separados com o mesmo nome da classe.
- Em cada bloco, retome a teoria, analise um exemplo, justifique uma modelagem, desenvolva o incremento e experimente. O desenvolvimento pode ser discutido com o professor; a verificação deve ser feita por você.
- Antes de executar um exemplo, registre sua previsão. Depois, compare-a com a compilação ou execução e explique eventuais diferenças.
- Registre as respostas conceituais e decisões de modelagem em suas anotações. Para implementar, use Java básico, `ArrayList` e testes no console com `Main`.
- Não é necessário usar banco de dados, interface gráfica, frameworks, classes abstratas, interfaces ou tratamento formal de exceções.
- Nos testes do projeto, forneça argumentos válidos aos construtores. Operações que recusam alterações devem retornar `false` e preservar o estado; operações aceitas retornam `true`.
- Compare entidades pelo código. Use códigos inteiros positivos, únicos dentro de cada categoria, definidos manualmente nos testes. Não é necessário implementar `equals` e `hashCode` nesta atividade.
- Os sete desafios são **alternativas independentes**: salve a versão concluída na Q40 e retome essa mesma base antes de iniciar cada desafio.

Este é um roteiro de estudo para várias sessões. Não é necessário resolver as 47 atividades em uma única aula. Consulte as dicas somente depois de tentar e registre também suas dúvidas.

## Sumário

- [Minimundo e regras do projeto](#minimundo-e-regras-do-projeto)
- [Bloco 1 — Introdução à herança](#bloco-1-introducao-a-heranca)
- [Bloco 2 — Modificadores de estado: static e final](#bloco-2-modificadores-de-estado-static-e-final)
- [Bloco 3 — Multiplicidade](#bloco-3-multiplicidade)
- [Bloco 4 — Agregação](#bloco-4-agregacao)
- [Bloco 5 — Composição](#bloco-5-composicao)
- [Bloco 6 — Sobrescrita de métodos](#bloco-6-sobrescrita-de-metodos)
- [Bloco 7 — Sobrecarga de métodos](#bloco-7-sobrecarga-de-metodos)
- [Bloco 8 — Polimorfismo](#bloco-8-polimorfismo)
- [Sete desafios integradores](#sete-desafios-integradores)
- [Dicas para as questões](#dicas-para-as-questoes)
- [Dicas para os desafios](#dicas-para-os-desafios)
- [Checklist de aprendizagem](#checklist-de-aprendizagem)
- [Referências para consulta](#referencias-para-consulta)

## Minimundo e regras do projeto

Uma instituição mantém um catálogo de atividades que podem ser oferecidas em diferentes eventos. Cada atividade possui código, título e duração em minutos. Uma palestra informa quem a apresenta; uma oficina informa o material necessário. Ambas são atividades, mas poderão apresentar descrições próprias. Uma atividade cadastrada não representa uma sessão datada: é uma oferta reutilizável, que pode integrar mais de um evento.

Cada evento possui código e nome e seleciona atividades desse catálogo. O mesmo objeto que representa uma atividade pode ser selecionado por dois eventos. Retirar uma atividade de um evento não a elimina do catálogo nem altera as seleções dos outros eventos. Para manter os testes pequenos, cada evento admite até três atividades distintas.

Participantes são cadastrados independentemente dos eventos e possuem código e nome. Uma pessoa pode participar de várias atividades, e uma atividade pode receber várias pessoas. A inscrição registra a participação de uma pessoa em uma atividade **dentro de um evento específico**. Ela pertence exclusivamente àquele evento e não pode ser transferida ou compartilhada com outro.

No projeto-base, cada evento admite até duas inscrições por atividade. Esse limite é local ao evento: lotar uma oficina no evento A não ocupa vagas da mesma atividade no evento B. A mesma pessoa não pode se inscrever duas vezes na mesma atividade do mesmo evento, mas pode se inscrever em outra atividade ou na oferta de outro evento.

Ao cancelar uma inscrição, sua vaga é liberada. Uma atividade com inscrições deve ter sua remoção recusada. Cancelar um evento encerra suas inscrições e impede novas inclusões de atividades e novas inscrições. As atividades do catálogo e os participantes continuam cadastrados e podem ser usados em outros eventos.

Textos obrigatórios devem ser não nulos e não vazios após retirar espaços externos; durações devem ser positivas. Coleções internas não podem ser substituídas ou alteradas diretamente por `Main`. As regras serão implementadas gradualmente; cada questão indicará o que deve estar pronto naquele momento.

---

## Bloco 1 — Introdução à herança

**Retomada:** herança representa especialização. Uma oficina é uma atividade; um evento possui atividades. Em Java, uma classe tem uma única superclasse direta. Construtores não são herdados; `super(...)` permite chamar o construtor da superclasse.

### Q01 — O que pode ser especializado?

**Compreensão conceitual.** Explique classe, superclasse e subclasse usando o minimundo. Compare as afirmações “palestra é uma atividade” e “evento é uma atividade”. Discuta por que duas classes com um atributo chamado `nome` não precisam ter uma relação de herança.

**Verifique:** sua resposta deve distinguir especialização de uma relação entre objetos e apresentar uma justificativa de domínio, além da intenção de reaproveitar código.

### Q02 — Quem inicializa a parte comum?

**Análise de código.** Salve o exemplo isolado como `Main.java`. Preveja a ordem e o conteúdo das mensagens antes de executá-lo.

```java
class Atividade {
    private String titulo;

    Atividade(String titulo) {
        this.titulo = titulo;
        System.out.println("Atividade: " + titulo);
    }

    public String getTitulo() { return titulo; }
}

class Oficina extends Atividade {
    Oficina(String titulo) {
        super(titulo);
        System.out.println("Oficina criada");
    }
}

public class Main {
    public static void main(String[] args) {
        Oficina oficina = new Oficina("Modelagem OO");
        System.out.println(oficina.getTitulo());
    }
}
```

Depois, remova somente `super(titulo)` e tente compilar novamente. Explique o diagnóstico considerando os construtores disponíveis. Investigue também por que a subclasse consegue chamar o getter, mas não acessar diretamente `titulo`.

**Verifique:** registre a execução original e o motivo do erro na variação, sem tornar o atributo público.

### Q03 — Uma hierarquia pequena e justificada

**Modelagem.** Produza um diagrama de classes com `Atividade`, `Palestra` e `Oficina`. Distribua código, título, duração, palestrante e material necessário. Indique a generalização e as visibilidades. Descreva o que cada construtor deve receber.

**Verifique:** os dados comuns devem ter uma única declaração; os específicos devem ficar na especialização adequada. O diagrama deve permitir identificar o que uma oficina herda e o que acrescenta.

### Q04 — Construindo a primeira versão

**Implementação incremental.** Inicie o projeto com a hierarquia da Q03 e `app.Main`.

- Mantenha os atributos `private` e inicialize-os por construtores públicos.
- Faça os construtores das subclasses encaminharem os dados comuns com `super(...)`.
- Ofereça getters e alterações controladas para os textos e a duração, respeitando as regras do minimundo. O código é informado na criação e não precisa de setter.
- Implemente em `Atividade` um método público `String descrever()` com código, título e duração. Neste bloco, as subclasses apenas herdam esse método.
- Em `Main`, crie uma palestra e uma oficina e consulte seus dados comuns e específicos.

**Verifique:** `Main` deve funcionar a partir de outro pacote, usando somente a interface pública. Uma alteração inválida de título ou duração deve preservar o valor anterior.

### Q05 — Mudança comum, efeitos diferentes

**Experimentação.** Crie duas oficinas com valores diferentes. Altere o título de uma e compare as duas descrições. Acrescente em `Atividade` um método público que retorne a duração em horas como número decimal e use-o nos dois objetos, sem repeti-lo nas subclasses.

**Verifique:** a alteração do primeiro objeto não modifica o segundo. Uma duração de 90 minutos deve corresponder a 1,5 hora. Explique por que esse método pode ficar na superclasse.

## Bloco 2 — Modificadores de estado: static e final

**Retomada:** um membro `static` pertence à classe. Uma variável `final` recebe valor uma única vez; se o valor for uma referência, o objeto referenciado ainda poderá mudar. Em uma classe, `final` impede subclasses; em um método, impede sobrescrita. Sobrescrever é fornecer, na subclasse, uma implementação de um método de instância herdado; isso será praticado no bloco 6.

### Q06 — O que pertence à classe?

**Compreensão conceitual.** Classifique os seguintes dados: título de uma oficina, total de atividades criadas, código permanente de uma atividade e duração mínima permitida. Justifique o uso ou a ausência de `static` e `final` em cada caso. Explique por que `static` não significa imutável e por que `static final` combina duas decisões diferentes.

**Verifique:** sua classificação deve distinguir dados de cada objeto, dados compartilhados, referência fixa e valor constante.

### Q07 — Referência fixa, lista mutável

**Análise de código.** Preveja a saída. O exemplo é isolado e não representa a implementação completa do catálogo.

```java
import java.util.ArrayList;

public class Main {
    private static int criadas;

    public static void main(String[] args) {
        final ArrayList<String> titulos = new ArrayList<>();
        titulos.add("Palestra");
        criadas++;
        titulos.add("Oficina");
        criadas++;
        titulos.remove("Palestra");
        System.out.println(titulos.size() + ":" + criadas);
        // titulos = new ArrayList<>();
    }
}
```

Descomente somente a última atribuição e compile novamente. Explique por que remover um elemento e substituir a lista inteira têm consequências diferentes. Discuta por que o contador não representa necessariamente o número de objetos atualmente acessíveis.

**Verifique:** registre o resultado original e a causa do erro intencional da variação.

### Q08 — Identidade e contagem da hierarquia

**Decisão de projeto.** Defina onde guardar um contador que considere cada palestra ou oficina construída como **uma** atividade criada. Proponha a declaração do código permanente, do contador e da constante `DURACAO_MINIMA`, de valor 1. Explique onde inicializar cada dado e quais consultas serão públicas.

**Verifique:** seu projeto não deve contar duas vezes um objeto por passar pelos construtores da superclasse e da subclasse. O contador representa criações concluídas nos testes, não inscrições nem vínculos com eventos.

### Q09 — Protegendo identidade e contando criações

**Implementação incremental.** Aplique a decisão da Q08. Torne o código de `Atividade` um atributo `final`, inicializado no construtor. Acrescente a constante `static final` e um contador privado `static`, consultado por um método público estático. Centralize o incremento no construtor de `Atividade`, usando argumentos válidos neste exercício.

Mantenha o título mutável por operação validada. Declare uma referência local a uma oficina como `final` e altere seu título por essa operação.

**Verifique:** duas palestras e uma oficina, em uma execução nova, devem produzir três incrementos. Alterar títulos ou adicionar referências a uma coleção não deve incrementar o contador.

### Q10 — Onde final impede uma mudança?

**Experimentação.** Trabalhe com uma tentativa por vez e remova os erros intencionais antes de continuar o projeto.

- Tente reatribuir o código `final` de uma atividade em um método da própria classe.
- Tente reatribuir a referência local `final` criada na Q09.
- Torne temporariamente `Atividade` uma classe `final` e compile suas subclasses.
- Declare `getCodigo()` como método `final` e tente declarar a mesma assinatura em `Oficina`.

**Verifique:** explique o impedimento de cada tentativa. Ao terminar, mantenha `Atividade` extensível, o código permanente, `getCodigo()` final e nenhuma tentativa inválida no projeto. Comprove novamente que o título ainda pode mudar.

## Bloco 3 — Multiplicidade

**Retomada:** a multiplicidade informa quantos objetos podem estar relacionados a **um objeto do outro extremo**. `1` indica exatamente um; `0..1`, presença opcional; `0..*`, nenhum ou vários; `1..*`, pelo menos um. O limite pode ser um intervalo como `0..3`. Uma coleção não impõe sozinha todas essas regras.

### Q11 — Lendo nos dois sentidos

**Compreensão conceitual.** Traduza para frases as relações abaixo. Leia cada uma nos dois sentidos e forneça um exemplo válido e um inválido.

| Relação | Multiplicidade junto à primeira entidade | Multiplicidade junto à segunda entidade |
|---|---|---|
| Evento — Inscrição | `1` | `0..*` |
| Participante — Inscrição | `1` | `0..*` |
| Evento — Atividade | `0..*` | `0..3` |

Explique ainda como representar um monitor opcional de uma oficina e a exigência de pelo menos uma atividade em um evento publicado. Essas duas situações são hipóteses de modelagem desta questão e não precisam ser implementadas no projeto-base.

**Verifique:** a quantidade escrita junto a `Inscrição` deve ser interpretada a partir de um evento ou participante, conforme a relação. Diferencie limites por relação e regras adicionais, como duas inscrições por atividade em cada evento.

### Q12 — O tamanho da coleção garante o domínio?

**Análise de código.** Preveja a saída e explique o que o `ArrayList` permite neste exemplo isolado.

```java
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<String> atividades = new ArrayList<>();
        atividades.add("Oficina");
        atividades.add("Oficina");
        atividades.add(null);
        System.out.println(atividades.size());
        atividades.clear();
        System.out.println(atividades.isEmpty());
    }
}
```

Um evento que armazena atividades dessa forma já garante ausência de duplicidade, proibição de `null` e limite de três atividades? Em que momento e em qual objeto essas regras deveriam ser verificadas?

**Verifique:** separe o comportamento da estrutura de dados das restrições do sistema. Sua justificativa deve considerar inclusão e remoção.

### Q13 — Participação é uma relação com contexto

**Modelagem.** Amplie o diagrama com `Evento`, `Participante` e `Inscricao`. Cada inscrição conecta exatamente um evento, um participante e uma atividade. Represente as multiplicidades nos dois extremos de cada relação e registre a restrição de que a atividade escolhida precisa estar selecionada no evento.

Explique por que guardar somente uma lista de participantes dentro da atividade do catálogo perderia a informação sobre **em qual evento** cada inscrição ocorreu.

**Verifique:** seu modelo deve permitir que Ana frequente duas atividades e que a mesma oficina receba inscrições independentes nos eventos A e B. Registre onde há uma relação muitos para muitos e como `Inscricao` a representa.

### Q14 — Controlando quantas atividades entram

**Implementação incremental.** Crie `Evento` com código permanente, nome e coleção privada `ArrayList<Atividade>`. Defina `LIMITE_ATIVIDADES` como constante pública de valor 3. Crie também `Participante`, com código permanente e nome, para preparar a próxima etapa.

Em `Evento`, implemente `boolean adicionarAtividade(Atividade atividade)`, consulta da quantidade e consulta por posição. Recuse `null`, código de atividade já selecionado e inclusão além do limite. Use posições válidas nos testes de consulta. Ainda não implemente inscrições: elas serão acrescentadas na Q24.

**Verifique:** um evento vazio é válido. Só operações públicas de `Evento` podem alterar sua coleção; não ofereça um getter que devolva a lista interna.

### Q15 — Testando fronteiras da multiplicidade

**Experimentação.** Em uma execução nova, crie quatro atividades e um evento. Teste o evento vazio, as três primeiras inclusões, uma inclusão repetida, a tentativa de incluir a quarta atividade e a tentativa de incluir `null`.

**Verifique:** a quantidade final deve continuar em três. Registre o retorno e a quantidade antes e depois de cada tentativa. O contador de criações deve considerar as quatro atividades construídas, inclusive aquela que não entrou no evento.

## Bloco 4 — Agregação

**Retomada:** agregação compartilhada representa uma relação todo-parte definida no modelo. Aqui, um evento reúne ofertas de atividades que continuam existindo no catálogo e podem integrar outros eventos. Na UML, o losango vazio fica junto ao todo. A escolha dessa notação exige justificar o agrupamento; uma referência Java, sozinha, não determina agregação.

### Q16 — Parte de um agrupamento ou apenas associada?

**Compreensão conceitual.** Compare “o evento reúne atividades” e “o participante consulta a página do evento”. Qual frase expressa um agrupamento todo-parte no modelo adotado? Por que a segunda pode ser uma associação simples?

Explique o que deve acontecer com uma atividade quando seu vínculo com um evento é removido. Discuta se declarar `ArrayList<Atividade>` é suficiente para classificar a relação.

**Verifique:** apresente uma justificativa baseada em significado, compartilhamento e independência das partes, sem usar apenas a sintaxe do código.

### Q17 — Copiar a lista é copiar os objetos?

**Análise de código.** Preveja as duas linhas de saída. As classes simplificadas servem somente a este experimento.

```java
import java.util.ArrayList;

class Atividade {
    private String titulo;
    Atividade(String titulo) { this.titulo = titulo; }
    public String getTitulo() { return titulo; }
    public void setTitulo(String titulo) { this.titulo = titulo; }
}

public class Main {
    public static void main(String[] args) {
        Atividade oficina = new Atividade("Java");
        ArrayList<Atividade> eventoA = new ArrayList<>();
        eventoA.add(oficina);
        ArrayList<Atividade> eventoB = new ArrayList<>(eventoA);
        eventoA.clear();
        oficina.setTitulo("Java OO");
        System.out.println(eventoA.size() + ":" + eventoB.size());
        System.out.println(eventoB.get(0).getTitulo());
    }
}
```

Explique quais coleções são diferentes e qual objeto continua compartilhado. Qual seria a consequência de confundir essa cópia da coleção com a criação de atividades independentes?

**Verifique:** justifique a saída em termos de referências e estado dos objetos.

### Q18 — Selecionando o mesmo catálogo

**Modelagem.** Dois eventos selecionam a mesma oficina do catálogo. Atualize o diagrama para explicitar a agregação e as multiplicidades. Desenhe também um pequeno diagrama de objetos, em papel ou ferramenta de sua preferência, mostrando dois eventos apontando para **uma única oficina**.

**Verifique:** o losango deve ficar no extremo correto. Explique por que o código e o título da oficina não precisam ser duplicados para cada seleção.

### Q19 — Removendo o vínculo

**Implementação incremental.** Acrescente a `Evento` a operação `boolean removerAtividade(int codigo)`. Neste estágio ainda não há inscrições: remova somente o vínculo com uma atividade selecionada e retorne `false` se o código não estiver presente.

Em `Main`, mantenha um catálogo como `ArrayList<Atividade>`, separado dos eventos, e selecione a mesma referência em dois eventos. A operação de seleção deve usar o objeto recebido, sem construir uma cópia da atividade.

**Verifique:** remover de um evento não altera o catálogo, o outro evento nem o contador de criações. Na Q24 você acrescentará a restrição de remoção quando existirem inscrições.

### Q20 — Observando a independência das partes

**Experimentação.** Selecione uma oficina em dois eventos e altere seu título pela operação validada. Consulte-a nos dois eventos. Depois, remova-a somente do primeiro e faça novas consultas.

**Verifique:** antes da remoção, ambos observam o título atualizado. Depois, somente o vínculo do primeiro desaparece; o segundo e o catálogo ainda permitem consultar a mesma oficina. Explique como esse resultado sustenta a regra de agregação escolhida.

## Bloco 5 — Composição

**Retomada:** na composição, uma parte pertence a no máximo um todo por vez, e o modelo atribui ao todo responsabilidade pelo ciclo de vida das partes. Aqui, uma inscrição válida só existe no contexto de seu evento. O losango preenchido fica junto ao todo. Java não oferece uma palavra-chave para composição: o projeto deve proteger essa regra.

Cancelar um evento é uma operação do domínio. Atribuir `null` a uma variável apenas remove aquela referência e não prova a destruição imediata de nenhum objeto. A coleta de lixo depende da acessibilidade dos objetos e não será usada como teste desta atividade.

### Q21 — Quem responde pela inscrição?

**Compreensão conceitual.** Compare a relação evento–atividade com evento–inscrição. Justifique por que as regras do minimundo adotam agregação na primeira e composição na segunda. Explique por que um participante não desaparece quando sua inscrição é cancelada.

**Verifique:** sua resposta deve abordar propriedade exclusiva, criação e cancelamento. Diferencie cancelar uma inscrição, cancelar o evento e simplesmente atribuir `null` a uma variável local.

### Q22 — Uma coleção exposta protege a composição?

**Análise de código.** Preveja a saída e identifique os problemas deste exemplo isolado.

```java
import java.util.ArrayList;

class Inscricao {
    private final String participante;
    Inscricao(String participante) { this.participante = participante; }
}

class Evento {
    private final ArrayList<Inscricao> inscricoes = new ArrayList<>();
    public ArrayList<Inscricao> getInscricoes() { return inscricoes; }
}

public class Main {
    public static void main(String[] args) {
        Evento a = new Evento();
        Evento b = new Evento();
        Inscricao inscricao = new Inscricao("Ana");
        a.getInscricoes().add(inscricao);
        b.getInscricoes().add(inscricao);
        System.out.println(a.getInscricoes().size() + ":" + b.getInscricoes().size());
        a.getInscricoes().clear();
        System.out.println(b.getInscricoes().size());
    }
}
```

O fato de a lista ser `private final` impede alterações externas? A mesma inscrição foi aceita em quantos eventos? Proponha mudanças na interface pública para preservar as regras, sem escrever ainda a implementação completa.

**Verifique:** identifique tanto o compartilhamento indevido da parte quanto a possibilidade de contornar validações pela coleção exposta.

### Q23 — Projetando posse e ciclo de vida

**Modelagem.** Acrescente a composição entre `Evento` e `Inscricao` ao diagrama. Cada inscrição deve referenciar seu evento, seu participante e sua atividade; essas referências não poderão ser trocadas. Participantes e atividades continuam independentes e podem ser referenciados por várias inscrições.

Descreva quem cria a inscrição, quem pode cancelá-la e quais consultas permitirão conferir o sistema sem expor sua coleção interna. Justifique por que receber uma inscrição pronta e aceitá-la em qualquer evento fragilizaria esse contrato.

**Verifique:** o desenho e as operações propostas devem garantir exatamente um evento por inscrição e preservar os objetos independentes após o cancelamento.

### Q24 — Inscrevendo por meio do evento

**Implementação incremental.** Crie `Inscricao` em `modelo`, com referências `final` ao evento, participante e atividade. Seu construtor terá acesso de pacote; neste projeto, estabeleça que somente `Evento` o utiliza. Não ofereça operação pública para anexar uma inscrição pronta ou alterar seu proprietário.

Acrescente a `Evento` uma coleção privada de inscrições, a constante `LIMITE_INSCRICOES_POR_ATIVIDADE`, de valor 2, e as operações abaixo.

- `boolean inscrever(Participante participante, Atividade atividade)`: cria internamente a inscrição após validar evento não cancelado, argumentos não nulos, atividade selecionada, ausência de duplicidade por códigos de participante e atividade e disponibilidade de vaga naquele evento.
- `boolean cancelarInscricao(Participante participante, Atividade atividade)`: remove a inscrição correspondente, liberando a vaga; recusa argumentos nulos e inscrição inexistente.
- `int quantidadeInscricoes(Atividade atividade)` e consulta da quantidade total: permitem conferir as contagens sem devolver a lista ou suas partes. Para atividade nula ou não selecionada, a primeira consulta retorna zero.
- `boolean cancelarEvento()`: cancela todas as inscrições e marca o evento como cancelado. Uma segunda tentativa retorna `false`.

Atualize as inclusões e remoções de atividades para recusarem alterações em evento cancelado. Acrescente à remoção a verificação de que não existem inscrições na atividade. Consultas continuam disponíveis após o cancelamento.

**Verifique:** nenhuma recusa deve deixar uma inscrição parcial ou mudar contadores e coleções. O catálogo e os participantes não são apagados. O construtor com acesso de pacote reduz o acesso de clientes; a responsabilidade de criação dentro de `modelo` também é uma regra de projeto que você deve respeitar.

### Q25 — Cancelar no domínio e observar os efeitos

**Experimentação.** Cadastre três participantes e selecione a mesma oficina nos eventos A e B. Execute os cenários na ordem indicada, partindo de ambos sem inscrições.

| Ação | O que conferir |
|---|---|
| Inscrever Ana e Bia na oficina do evento A | Duas inscrições em A; nenhuma em B. |
| Repetir Ana em A | Recusa e contagem preservada. |
| Inscrever Caio em A | Recusa por lotação; contagem preservada. |
| Inscrever Ana na mesma oficina do evento B | Aceitação independente da lotação em A. |
| Remover a oficina de A | Recusa porque existem inscrições. |
| Cancelar Bia em A e inscrever Caio em A | A vaga liberada pode ser ocupada; A volta a ter duas inscrições. |
| Cancelar o evento A | Zero inscrições em A; a inscrição de B permanece. |
| Tentar nova inscrição e nova seleção de atividade em A | Recusa; catálogo e participantes permanecem utilizáveis. |

Teste também atividade não selecionada e argumentos nulos nas operações de inscrição, verificando a recusa sem alteração de estado.

**Verifique:** registre retornos e contagens. Explique a composição usando esses efeitos observáveis do domínio, sem depender de `System.gc()` ou de supor destruição imediata em memória.

## Bloco 6 — Sobrescrita de métodos

**Retomada:** uma subclasse pode especializar um método de instância herdado mantendo uma assinatura compatível. `@Override` permite ao compilador conferir essa intenção. Alterar os parâmetros pode criar uma sobrecarga, que será estudada no próximo bloco. Métodos `private` não são herdados nem sobrescritos; métodos `final` não podem ser sobrescritos.

### Q26 — Herdar ou especializar um comportamento?

**Compreensão conceitual.** Uma descrição geral informa código, título e duração. A descrição de uma palestra também deve informar o palestrante; a de uma oficina, o material necessário. Explique por que sobrescrever `descrever()` pode ser adequado e por que não é necessário duplicar os atributos comuns nas subclasses.

**Verifique:** sua resposta deve distinguir herdar sem alteração, sobrescrever e chamar a implementação da superclasse para reaproveitar parte do comportamento.

### Q27 — O método que parecia uma sobrescrita

**Análise de código.** Preveja as duas linhas da execução e explique qual método atende a cada chamada.

```java
class Atividade {
    public String descrever() { return "Atividade"; }
}

class Oficina extends Atividade {
    public String descrever(String prefixo) {
        return prefixo + "Oficina";
    }
}

public class Main {
    public static void main(String[] args) {
        Oficina oficina = new Oficina();
        System.out.println(oficina.descrever());
        System.out.println(oficina.descrever("Tipo: "));
    }
}
```

Acrescente `@Override` imediatamente antes de `descrever(String prefixo)` e tente compilar. Explique o diagnóstico e proponha a assinatura adequada para especializar a chamada sem argumentos, sem fornecer a solução inteira do sistema.

**Verifique:** diferencie nome igual de assinatura compatível. Remova ou corrija a tentativa inválida antes de seguir.

### Q28 — Um contrato comum para as descrições

**Decisão de projeto.** Defina o contrato de `descrever()` na hierarquia: assinatura, visibilidade, dados comuns obrigatórios e informações próprias de cada subtipo. Avalie duas possibilidades: reconstruir toda a descrição nas subclasses ou complementar o resultado de `super.descrever()`.

**Verifique:** justifique a alternativa escolhida e indique como uma mudança no formato comum deve chegar às descrições específicas. O cliente deve continuar recebendo uma `String`, sem precisar conhecer os atributos internos.

### Q29 — Especializando palestras e oficinas

**Implementação incremental.** Sobrescreva `public String descrever()` em `Palestra` e `Oficina`, usando `@Override`. Preserve código, título e duração e acrescente os dados específicos. Use `super.descrever()` para reaproveitar a parte comum.

Mantenha as validações, a identidade permanente e o método `final getCodigo()` dos blocos anteriores.

**Verifique:** uma alteração no título deve aparecer na descrição especializada, e cada descrição deve conter os dados do respectivo objeto. A execução não deve contar uma nova atividade apenas por descrevê-la.

### Q30 — Quando o compilador protege o contrato

**Experimentação.** Teste separadamente estas alterações em uma cópia da hierarquia, registrando o diagnóstico e depois restaurando o código correto.

- Trocar a visibilidade do `descrever()` da subclasse de `public` para `private`.
- Trocar o retorno da subclasse de `String` para `int`, mantendo nome e parâmetros.
- Declarar `descrever()` como `final` na superclasse, mantendo as sobrescritas.
- Retirar somente `@Override` de uma sobrescrita correta e executar novamente.

**Verifique:** explique quais alterações impedem compilação e qual apenas retira uma verificação explícita da intenção. O projeto final deve manter `@Override`, visibilidade pública e retornos compatíveis.

## Bloco 7 — Sobrecarga de métodos

**Retomada:** métodos sobrecarregados compartilham o nome, mas diferem na lista de parâmetros. Para os exemplos desta atividade, observe quantidade, tipos e ordem dos tipos dos parâmetros. Nomes dos parâmetros e tipo de retorno, isoladamente, não criam outra assinatura. A escolha da sobrecarga considera os tipos conhecidos na compilação.

### Q31 — Um nome, diferentes formas de pedir

**Compreensão conceitual.** Um evento precisa permitir busca de atividade por código inteiro e por título textual. Explique por que essas duas operações podem compartilhar o nome `buscarAtividade`. Compare essa situação com a especialização de `descrever()` nas subclasses.

**Verifique:** proponha as duas assinaturas, identifique o que as diferencia e explique por que mudar apenas o nome de um parâmetro não seria suficiente.

### Q32 — O argumento muda a escolha

**Análise de código.** Preveja a saída e explique a diferença entre o número `10` e o texto `"10"`.

```java
public class Main {
    static String buscar(int codigo) {
        return "codigo=" + codigo;
    }

    static String buscar(String titulo) {
        return "titulo=" + titulo;
    }

    public static void main(String[] args) {
        System.out.println(buscar(10));
        System.out.println(buscar("10"));
    }
}
```

Depois, tente acrescentar à mesma classe `static int buscar(int codigo) { return codigo; }`, sem remover os métodos existentes. Explique por que a nova declaração é inválida, mesmo retornando outro tipo.

**Verifique:** registre a previsão, a saída e o diagnóstico da declaração intencionalmente inválida.

### Q33 — Projetando uma busca previsível

**Decisão de projeto.** Especifique o contrato das duas buscas no evento. Adote código exato para a busca inteira e título exato, com comparação `String.equals`, para a textual. Na ausência de resultado, retorne `null`; para título nulo, também retorne `null`. Havendo títulos repetidos, retorne a primeira atividade na ordem de seleção.

Explique como a chamada será escolhida e como `Main` deve conferir a ausência antes de usar o resultado. Decida quais testes demonstram que a busca devolve a atividade selecionada, sem criar outra.

**Verifique:** suas anotações devem cobrir entrada, resultado, ausência, repetição de título e preservação da identidade.

### Q34 — Duas buscas, o mesmo evento

**Implementação incremental.** Implemente em `Evento` as duas operações públicas `Atividade buscarAtividade(int codigo)` e `Atividade buscarAtividade(String titulo)`, seguindo o contrato da Q33. Preserve a coleção privada e sua ordem.

**Verifique:** as duas buscas podem encontrar o mesmo objeto por critérios diferentes. Consultar não modifica as seleções, inscrições ou o contador de criações.

### Q35 — Código, texto e ausência

**Experimentação.** Em um evento novo, selecione uma atividade de código 10 e título `Introdução ao Java`, e outra de código 20 e título `10`. Compare `buscarAtividade(10)` com `buscarAtividade("10")`. Teste também código ausente, título ausente e título nulo.

Depois, renomeie a segunda atividade para `Introdução ao Java` e confira a regra da primeira ocorrência. Não altere os códigos.

**Verifique:** registre o código do objeto encontrado em cada consulta, ou a ausência. Explique por que usar o mesmo nome de método não torna as duas consultas equivalentes.

## Bloco 8 — Polimorfismo

**Retomada:** uma referência de superclasse pode apontar para um objeto de subclasse. Para métodos de instância sobrescritos, a implementação executada depende do tipo real do objeto. O tipo declarado continua determinando quais operações podem ser chamadas. Esse despacho dinâmico é diferente da escolha de sobrecargas e da ocultação de métodos `static`.

### Q36 — O que a referência permite fazer?

**Compreensão conceitual.** Considere `Atividade atividade = new Oficina(...)` no seu projeto, completando os argumentos conforme seu construtor. Diferencie tipo declarado da variável e tipo real do objeto. Explique qual `descrever()` é executado e por que um getter exclusivo de oficina não fica automaticamente disponível pela variável `atividade`.

**Verifique:** relacione as operações acessíveis ao contrato da superclasse e o comportamento sobrescrito ao objeto efetivamente criado. Não é necessário usar conversões de tipo para resolver o projeto.

### Q37 — Instância e método estático não despacham da mesma forma

**Análise de código.** Preveja as três linhas de saída deste exemplo isolado.

```java
class Atividade {
    public String descrever() { return "Descricao geral"; }
    public static String categoria() { return "Atividade"; }
}

class Oficina extends Atividade {
    @Override
    public String descrever() { return "Descricao de oficina"; }
    public static String categoria() { return "Oficina"; }
}

public class Main {
    public static void main(String[] args) {
        Atividade atividade = new Oficina();
        System.out.println(atividade.descrever());
        System.out.println(atividade.categoria());
        System.out.println(Oficina.categoria());
    }
}
```

A chamada de `categoria()` pela variável foi usada propositalmente para análise. Reescreva-a qualificando a classe que determina essa chamada. Acrescente temporariamente `@Override` ao método `static` da subclasse e tente compilar.

**Verifique:** diferencie sobrescrita de método de instância e ocultação de método de classe. Explique também por que a anotação da variação é inválida.

### Q38 — Um cliente que trabalha com atividades

**Decisão de projeto.** Uma listagem deve descrever todas as atividades selecionadas sem testar se cada uma é palestra ou oficina. Proponha como percorrer uma coleção `ArrayList<Atividade>` e qual operação comum chamar. Compare essa proposta com uma sequência de `if` por tipo.

Descreva o que precisaria mudar caso surgisse uma visita técnica com ponto de encontro próprio.

**Verifique:** seu desenho deve manter as particularidades nas subclasses e permitir reaproveitar a listagem. Não use `instanceof`, conversões de tipo ou comparações de nomes de classes para selecionar o comportamento.

### Q39 — Listagem polimórfica do catálogo e do evento

**Implementação incremental.** Faça `Main` percorrer o catálogo heterogêneo como `ArrayList<Atividade>` e imprimir `descrever()` de cada elemento. Acrescente em `Evento` uma operação pública de listagem que percorra internamente suas atividades e use o mesmo contrato.

Use pelo menos uma palestra e uma oficina. Mantenha as buscas sobrecarregadas e obtenha por elas referências de tipo `Atividade`, chamando `descrever()` quando houver resultado.

**Verifique:** cada objeto deve apresentar seu conteúdo específico mesmo quando consultado pela superclasse. A listagem do evento não pode exigir que `Main` receba ou manipule sua coleção interna.

### Q40 — Uma nova especialização sem reescrever o cliente

**Experimentação integradora.** Acrescente `VisitaTecnica`, uma especialização com ponto de encontro obrigatório e descrição própria. Crie um evento novo com palestra, oficina e visita técnica; outro evento pode selecionar a mesma oficina.

- Execute as listagens existentes sem acrescentar condicionais por tipo.
- Busque a visita por código e título e compare as referências encontradas.
- Faça inscrições, teste duplicidade, lotação, liberação de vaga e cancelamento de um dos eventos.
- Confira se o outro evento, os participantes e o catálogo continuam utilizáveis.
- Confira o incremento do contador considerando somente os objetos de atividade efetivamente construídos nesta execução.
- Revise seu diagrama e registre uma explicação de cada um dos oito tópicos usando um ponto do seu código.

**Verifique:** todos os comportamentos anteriores devem continuar funcionando. A nova especialização deve entrar nas listagens sem mudar a lógica que chama `descrever()`. Salve esta versão como **projeto-base** dos desafios seguintes.

---

## Sete desafios integradores

Cada desafio começa na versão salva na Q40. **D02 não depende de D01**, e essa independência vale para todos os desafios. Reutilizar corretamente a hierarquia, as buscas e os relacionamentos do projeto-base é parte da atividade; não é necessário inventar uma nova herança para cada recurso.

### Entregáveis e critérios comuns

Para cada desafio escolhido, entregue uma justificativa de modelagem, o diagrama atualizado, o incremento em Java e uma demonstração em `Main` com resultados esperados e observados. Na justificativa, identifique pelo menos uma evidência de cada linha da matriz abaixo. **Sim** significa obrigatório naquele desafio.

| Tópico | Evidência a demonstrar | D01 | D02 | D03 | D04 | D05 | D06 | D07 |
|---|---|---|---|---|---|---|---|---|
| Herança | Especializações válidas de atividade e inicialização dos dados comuns. | Sim | Sim | Sim | Sim | Sim | Sim | Sim |
| `static` e `final` | Contagem de atividades criadas, constantes e identidade permanente preservadas. | Sim | Sim | Sim | Sim | Sim | Sim | Sim |
| Multiplicidade | Limites nos dois extremos e teste de pelo menos uma fronteira. | Sim | Sim | Sim | Sim | Sim | Sim | Sim |
| Agregação | Uma atividade compartilhada entre eventos continua no catálogo após desvinculação. | Sim | Sim | Sim | Sim | Sim | Sim | Sim |
| Composição | Inscrições exclusivas do evento e efeito do cancelamento, incluindo partes novas quando existirem. | Sim | Sim | Sim | Sim | Sim | Sim | Sim |
| Sobrescrita | Descrições próprias das subclasses com `@Override`. | Sim | Sim | Sim | Sim | Sim | Sim | Sim |
| Sobrecarga | Buscas por código e título demonstradas com os dois tipos de argumento. | Sim | Sim | Sim | Sim | Sim | Sim | Sim |
| Polimorfismo | Listagem heterogênea usa o contrato comum, sem condicionais por tipo. | Sim | Sim | Sim | Sim | Sim | Sim | Sim |

Teste também as recusas específicas de cada desafio e confira que elas preservam o estado. Utilize participantes e atividades fictícios. Os resultados podem ser apresentados no console; não é necessário produzir arquivos de certificados ou relatórios.

### D01 — Painéis e mesas-redondas

**Minimundo.** A semana acadêmica ampliou seus formatos. Um painel tem um moderador identificado pelo nome. Uma mesa-redonda reúne convidados previamente cadastrados como participantes, que continuam existindo mesmo quando deixam a mesa. A organização só confirma uma mesa quando ela tem entre dois e quatro convidados distintos. Os eventos continuam selecionando ofertas do catálogo, sem se tornarem proprietários delas.

**Tarefa e requisitos.** Acrescente os dois formatos como especializações de atividade, com descrições próprias. Permita montar uma mesa ainda não confirmada, incluir e remover convidados e confirmar a organização somente quando a quantidade for válida. Uma remoção posterior deve atualizar a condição de confirmação: com menos de dois convidados, a mesa volta a ficar não confirmada. Não permita mais de quatro convidados nem códigos repetidos. O evento só pode selecionar uma mesa já confirmada; recuse remoção de convidado que a deixaria não confirmada enquanto ela estiver selecionada em algum evento. Defina como manter essa informação de seleção coerente, sem criar cópias da atividade.

**Cenários de verificação.** Tente confirmar com um convidado; confirme com dois; tente adicionar o quinto e repetir um convidado; selecione a mesa em dois eventos e tente reduzi-la a um convidado. Depois de desvinculá-la dos dois eventos, a redução pode ocorrer e deve retirar a confirmação. Confira que os participantes continuam cadastrados. Demonstre as oito evidências comuns também com os novos formatos.

### D02 — Trilhas temáticas

**Minimundo.** Um evento organiza sua programação em trilhas, como Desenvolvimento e Pesquisa. Cada trilha só tem significado dentro daquele evento. Uma atividade selecionada pode aparecer em várias trilhas do mesmo evento e continuar presente em outros eventos. Retirar uma atividade de uma trilha não a retira da programação geral.

**Tarefa e requisitos.** Faça o evento criar e controlar suas trilhas, cada uma com código permanente, nome e zero ou mais atividades selecionadas nele. Recuse duplicidade dentro da mesma trilha e atividades externas à seleção do evento. Permita excluir uma trilha sem eliminar atividades do catálogo. Recuse a remoção de uma atividade da seleção geral enquanto houver inscrições ou vínculos com trilhas. Cancelar o evento deve encerrar inscrições e suas trilhas, preservando o catálogo.

**Cenários de verificação.** Inclua a mesma oficina em duas trilhas; remova de uma e consulte a outra; tente incluir uma atividade não selecionada; tente remover da programação uma atividade ainda vinculada; exclua uma trilha e cancele o evento. Demonstre as oito evidências comuns e justifique a diferença entre a posse da trilha e as referências às atividades.

### D03 — Salas e lotação

**Minimundo.** Salas são cadastradas independentemente dos eventos e têm código, nome e capacidade positiva. Para oferecer uma atividade, um evento registra uma alocação em uma sala. A alocação pertence àquele evento; a sala permanece disponível para outros eventos. Para simplificar, considere que todas as atividades de um mesmo evento acontecem simultaneamente e que eventos distintos ocorrem em datas diferentes.

**Tarefa e requisitos.** Cada atividade selecionada pode ter no máximo uma alocação no evento. Uma sala não pode receber duas atividades do mesmo evento. Antes da primeira inscrição, exija uma alocação. O limite efetivo de inscrições será o menor entre a capacidade da sala e o limite-base de duas inscrições por atividade. Recuse troca de sala se a nova capacidade for inferior à quantidade já inscrita. Permita remover uma alocação somente sem inscrições e encerre as alocações ao cancelar o evento. A remoção de uma atividade sem inscrições também deve retirar sua alocação.

**Cenários de verificação.** Tente inscrever sem alocação; use uma sala de capacidade 1 e tente a segunda inscrição; use uma sala de capacidade 10 e confira que o limite-base continua valendo; tente alocar duas atividades na mesma sala do evento; teste uma troca incompatível e o cancelamento. Demonstre as oito evidências comuns e a reutilização da sala em outro evento.

### D04 — Lista de espera

**Minimundo.** Um evento passou a aceitar interessados mesmo depois de esgotar as vagas de uma atividade. Essas inscrições ficam pendentes em uma fila e não ocupam vagas. Quando uma inscrição confirmada é cancelada, o primeiro interessado pendente daquela atividade no mesmo evento recebe a vaga. A fila de outro evento não participa dessa escolha.

**Tarefa e requisitos.** Diferencie inscrições confirmadas e pendentes, mantendo sua propriedade exclusiva. Sem vaga, uma solicitação válida entra no final da fila. Não permita duplicidade entre os dois estados. Cancele uma inscrição pendente sem promover ninguém; ao cancelar uma confirmada, promova somente a primeira pendente da mesma atividade. Preserve consultas separadas de confirmadas e pendentes: a quantidade total inclui ambas, enquanto a verificação de lotação considera apenas confirmadas. A remoção de atividade deve ser recusada enquanto houver inscrição em qualquer estado. Cancelar o evento elimina ambas sem executar promoções.

**Cenários de verificação.** Preencha duas vagas e inscreva mais dois participantes; cancele uma confirmação e confira a ordem de promoção; cancele um pendente; tente cadastrar novamente alguém já confirmado; repita o processo em outro evento para demonstrar a independência. Demonstre as oito evidências comuns e o cancelamento com a fila ainda preenchida.

### D05 — Credenciamento e presença

**Minimundo.** A equipe precisa saber quais inscritos compareceram às atividades. Cada inscrição pode possuir no máximo um registro de presença, criado pelo próprio sistema quando o participante se apresenta. O registro só tem validade no contexto daquela inscrição. Uma pessoa cadastrada, mas não inscrita naquela atividade e naquele evento, não pode ser credenciada ali.

**Tarefa e requisitos.** Acrescente o registro de presença sob responsabilidade da inscrição e uma operação pública do evento para solicitar o credenciamento. Recuse inscrição inexistente, presença repetida e evento cancelado. Gere um resumo por atividade com sua descrição polimórfica, quantidade de inscritos, presentes e ausentes. Cancelar uma inscrição ou seu evento deve encerrar a validade de seus registros; não elimine o participante do cadastro.

**Cenários de verificação.** Inscreva duas pessoas em uma oficina; credencie uma; repita seu credenciamento; tente credenciar alguém sem inscrição e alguém inscrito apenas no outro evento. Confira os totais antes e depois de cancelar a inscrição que tinha presença. Demonstre as oito evidências comuns e as multiplicidades adicionais.

### D06 — Certificados por participação

**Minimundo.** O evento emite certificados conforme os minutos acompanhados na atividade. Palestras exigem pelo menos 75% da duração; oficinas e visitas técnicas exigem 100%. Os minutos são informados pela organização por inscrição, e cada inscrição pode possuir um único certificado. O certificado depende da validade da inscrição e não é um arquivo PDF nesta atividade.

**Tarefa e requisitos.** Parta do projeto-base, sem depender do credenciamento de D05. Registre minutos inteiros entre zero e a duração da atividade e recuse valores fora desse intervalo. Defina as porcentagens como constantes. Faça a própria hierarquia informar a exigência por um método de instância, especializando o comportamento quando necessário, para que a emissão não selecione regras com `if` por tipo. Exija `minutos acompanhados × 100 >= duração × percentual mínimo`, sem arredondar para conceder benefício. Crie o certificado internamente somente após validar o critério; recuse emissão duplicada e evento cancelado. Cancelar a inscrição encerra a validade do certificado. Neste desafio, mantenha a duração da oferta fixa depois da primeira inscrição.

**Cenários de verificação.** Em uma palestra de 100 minutos, compare 74 e 75 minutos acompanhados; em uma oficina de 100, compare 99 e 100; confira uma visita técnica. Teste minutos negativos, superiores à duração, emissão repetida e cancelamento. Demonstre as oito evidências comuns, inclusive as duas formas de busca antes da emissão.

### D07 — Pacotes de atividades

**Minimundo.** Um evento oferece pacotes para facilitar a inscrição em um conjunto de atividades. Um pacote pertence exclusivamente ao evento que o criou e reúne de uma a três atividades já selecionadas ali. As mesmas atividades podem aparecer em diferentes pacotes. O pacote é uma opção de inscrição em lote; as inscrições resultantes continuam sendo as inscrições individuais do projeto-base.

**Tarefa e requisitos.** Faça o evento criar pacotes com código permanente e conjunto fixo de atividades válidas, sem códigos repetidos. A operação `inscreverPacote(Participante participante, Pacote pacote)` deve aceitar somente pacote do próprio evento. Primeiro confira todas as atividades; somente depois crie as inscrições. Se qualquer atividade estiver lotada ou o participante já estiver inscrito em qualquer uma delas, recuse o pacote inteiro, sem criar inscrições parciais. Recuse a remoção de uma atividade ainda usada por um pacote. Permita excluir o pacote sem cancelar inscrições já realizadas; elas continuam sob controle do evento. Cancelar o evento encerra inscrições e pacotes. Produza um resumo com descrições polimórficas e a soma das durações, contando uma vez cada atividade do pacote.

**Cenários de verificação.** Inscreva em um pacote de duas atividades disponíveis; repita a operação; teste outro participante quando apenas uma das atividades estiver lotada; teste um pacote de outro evento e um conjunto com atividade repetida. Compare todas as contagens antes e depois das recusas. Demonstre as oito evidências comuns e explique por que excluir um pacote não elimina atividades nem inscrições válidas.

---

## Dicas para as questões

Procure a dica pelo código da questão depois de registrar sua primeira tentativa. As dicas orientam a investigação; a justificativa e a implementação continuam sendo suas.

- **Q01:** experimente completar a frase “todo objeto de B também é um objeto de A” e confira se ela faz sentido no domínio.
- **Q02:** acompanhe a entrada nos construtores antes de acompanhar a chamada do getter. Ao retirar a chamada explícita, investigue qual construtor o compilador tenta usar.
- **Q03:** se um atributo aparece com o mesmo significado em todas as especializações, pergunte se ele pode ser declarado uma única vez.
- **Q04:** diferencie o trabalho de inicializar a parte comum e o trabalho de inicializar os dados específicos. Chame `super(...)` no início do construtor.
- **Q05:** confira o tipo dos operandos da divisão para não perder a parte decimal do resultado.
- **Q06:** faça duas perguntas separadas: “a quem este dado pertence?” e “ele pode receber outro valor depois?”.
- **Q07:** acompanhe a variável, o objeto coleção e os elementos como coisas distintas. O contador só muda nas instruções que o alteram.
- **Q08:** percorra o caminho de construção de uma subclasse e identifique um ponto comum executado uma única vez por objeto.
- **Q09:** meça o contador antes e depois de criar objetos; repita a consulta depois de apenas movimentar referências.
- **Q10:** observe qual elemento recebeu `final`: variável, atributo, método ou classe. Cada posição restringe uma operação diferente.
- **Q11:** leia a quantidade de um extremo começando por “para um objeto do outro extremo”.
- **Q12:** confira a documentação de `ArrayList` antes de atribuir a ele regras que pertencem ao seu domínio.
- **Q13:** tente responder “em qual evento?” usando apenas as duas entidades participantes da relação; procure a informação que está faltando.
- **Q14:** verifique todas as condições de recusa antes de alterar a coleção.
- **Q15:** teste exatamente o limite e a primeira tentativa além dele, anotando quantidade antes e depois.
- **Q16:** duas entidades relacionadas nem sempre formam um todo e suas partes. Justifique o significado do agrupamento.
- **Q17:** desenhe as duas listas e as referências armazenadas nelas antes de considerar a alteração do título.
- **Q18:** dê nomes diferentes aos eventos e um único nome ao objeto da oficina no diagrama de objetos.
- **Q19:** diferencie retirar uma referência de uma coleção e alterar o objeto referenciado.
- **Q20:** consulte por caminhos diferentes o objeto que recebeu a alteração e observe onde permanecem vínculos.
- **Q21:** identifique qual informação perde sua validade no domínio quando o evento é cancelado.
- **Q22:** procure operações executadas pelo cliente que deveriam passar pelas validações de `Evento`.
- **Q23:** examine quem recebe uma parte pronta, quem decide seu proprietário e quem pode alterar essa decisão.
- **Q24:** confira a disponibilidade no contexto do evento e da atividade. Só construa a parte depois de aprovar todas as condições.
- **Q25:** anote separadamente o estado de A e B. Uma ação em A só deve afetar B se houver regra explícita para isso.
- **Q26:** separe o conteúdo comum da descrição e o complemento que só a especialização conhece.
- **Q27:** compare as listas de parâmetros antes de decidir se duas declarações têm a mesma assinatura.
- **Q28:** imagine uma mudança na apresentação da duração e conte quantas implementações precisariam ser ajustadas.
- **Q29:** use o resultado da implementação herdada como parte da construção da descrição específica.
- **Q30:** o compilador distingue o contrato do método e a anotação usada para declarar sua intenção.
- **Q31:** pense em duas formas de fornecer o critério de busca, sem mudar o significado geral da operação.
- **Q32:** confira o tipo de cada argumento, inclusive as aspas. Depois compare as assinaturas das declarações propostas.
- **Q33:** descreva explicitamente o resultado para uma busca sem correspondência antes de escrever o laço.
- **Q34:** percorra a coleção preservando a ordem e devolva a referência selecionada, sem criar outra atividade.
- **Q35:** imprima o código do resultado, não apenas seu título, para distinguir os objetos encontrados.
- **Q36:** separe “o que o compilador permite chamar” de “qual implementação será executada”.
- **Q37:** acompanhe as chamadas de instância e as chamadas de classe em colunas separadas nas suas anotações.
- **Q38:** identifique uma operação que todas as atividades prometem oferecer e deixe cada objeto responder por seu conteúdo.
- **Q39:** o tipo da variável usada no percurso pode continuar sendo o da superclasse, mesmo com objetos diferentes na coleção.
- **Q40:** procure alterações na listagem que só existiriam por causa do novo tipo. Revise o contrato comum se elas forem necessárias.

## Dicas para os desafios

- **D01:** modele também a informação “selecionada em eventos”, pois a mudança em uma atividade compartilhada pode afetar mais de um contexto. Diferencie esse vínculo do contador de objetos criados.
- **D02:** separe a propriedade da trilha dos vínculos das atividades. Revise todas as operações que podem deixar uma referência sem correspondência na seleção do evento.
- **D03:** a sala descreve uma capacidade física; a alocação relaciona essa sala ao contexto de uma oferta. Confira os dois limites antes da inscrição.
- **D04:** registre a ordem de chegada e filtre a promoção pela atividade e pelo evento. Nem todo cancelamento libera uma vaga confirmada.
- **D05:** localize primeiro a inscrição válida. A existência de um cadastro de participante, isoladamente, não autoriza uma presença.
- **D06:** faça a exigência chegar pela interface comum da atividade. Compare o limiar sem arredondamento e defina quem controla a validade do certificado.
- **D07:** separe a conferência do pacote inteiro da etapa que altera as inscrições. Uma recusa na última atividade não pode deixar as primeiras já inscritas.

## Checklist de aprendizagem

- [ ] Justifico uma herança pelo significado do domínio e inicializo a parte comum com `super(...)`.
- [ ] Preservo atributos privados e altero o estado somente por operações validadas.
- [ ] Distingo estado de classe e de instância e explico o que meu contador realmente conta.
- [ ] Uso `final` corretamente em identidade, referências, métodos e experimentos com classes.
- [ ] Leio multiplicidades nos dois sentidos e testo limites, duplicidades e ausência de vínculo.
- [ ] Justifico a agregação e demonstro uma atividade compartilhada entre eventos.
- [ ] Protejo a propriedade das inscrições e explico a composição pelo ciclo de vida do domínio.
- [ ] Não confundo cancelamento de uma entidade com atribuição de `null` ou coleta de lixo.
- [ ] Sobrescrevo métodos com `@Override`, mantendo assinatura e visibilidade compatíveis.
- [ ] Implemento e uso sobrecargas sem tentar diferenciá-las apenas pelo retorno.
- [ ] Distingo tipo declarado, tipo real, escolha de sobrecarga e despacho dinâmico.
- [ ] Demonstro polimorfismo em uma coleção heterogênea sem condicionais por tipo.
- [ ] Diferencio ocultação de método `static` e sobrescrita de método de instância.
- [ ] Mantenho as coleções internas protegidas e não publico um caminho que contorne suas validações.
- [ ] Consigo explicar uma recusa mostrando que o estado anterior foi preservado.
- [ ] Concluí os oito blocos e salvei a versão-base antes de iniciar os desafios independentes.
- [ ] No desafio realizado, apresentei as oito evidências da matriz e os resultados dos cenários propostos.

## Referências para consulta

- [Java Language Specification, capítulo 8 — Classes](https://docs.oracle.com/javase/specs/jls/se25/html/jls-8.html): membros estáticos, herança, construtores, sobrescrita, ocultação, sobrecarga e restrições de `final`.
- [Java Language Specification, seção 4.12.4 — Variáveis final](https://docs.oracle.com/javase/specs/jls/se25/html/jls-4.html#jls-4.12.4): valor fixo da referência e mutabilidade do objeto referenciado.
- [Java Language Specification, seção 15.12 — Invocação de métodos](https://docs.oracle.com/javase/specs/jls/se25/html/jls-15.html#jls-15.12): resolução das chamadas e execução de métodos de instância.
- [Documentação de ArrayList](https://docs.oracle.com/en/java/javase/25/docs/api/java.base/java/util/ArrayList.html): operações e comportamento da coleção.
- [OMG — UML 2.5.1](https://www.omg.org/spec/UML/2.5.1): especificação de multiplicidade, associações, agregação e composição. A semântica da agregação compartilhada deve ser explicitada no modelo, como nas regras deste roteiro.

[← Voltar ao sumário](#sumario)
