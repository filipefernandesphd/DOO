public class Main {
    public static void main(String args[]) {
        Bloco historia = new Bloco();
        Bloco question1 = new Bloco();
        Bloco question2 = new Bloco();
        Bloco question3 = new Bloco();

        // Instanciação de usuários
        Aluno aluno1 = new Aluno();
        aluno1.setIdentificacao("alunoum@gmail.com");
        System.out.println(aluno1.getIdentificacao());

        Aluno aluno2 = new Aluno();
        aluno2.setCodigo(123);
        System.out.println(aluno2.getIdentificacao());

        Professor prof1 = new Professor();
        prof1.setIdentificacao("professor1@gmail.com");
        System.out.println(prof1.getIdentificacao());

        Professor prof2 = new Professor();
         prof2.setCPF(984868);
        System.out.println(prof2.getCPF());
        
        System.out.println();

        // Questao 1
        Questao q1 = new Questao();
        q1.sethead("O Brasil foi alcançado em 1500 de maneira fortuita, durante uma expedição cujo destino original era outro.");
        System.out.println(q1.getHead());
        
        q1.adicionartextoextra("Quem descobriu o Brasil?");
        question1.adicionar(q1.mostrartextoextra());

        q1.adicionarimagemextra("https://x.com/govbr/status/988160591448739840");
        question1.adicionar(q1.mostrarimagemextra());

        q1.adicionarvideoextra("Ut-KsHLoxSM");
        question1.adicionar(q1.mostrarvideoextra());
        
        q1.adicionarMultiplaEscolha1("Pedro Álvares Cabral", true);
        question1.adicionar(q1.mostrarMultiplaEscolha1());

        q1.adicionarMultiplaEscolha2("Américo Vespúcio");
        question1.adicionar(q1.mostrarMultiplaEscolha2());

        q1.adicionarMultiplaEscolha3("Cristóvão Colombo");
        question1.adicionar(q1.mostrarMultiplaEscolha3());

        q1.adicionarMultiplaEscolha4("Pedro Vaz de Caminha");
        question1.adicionar(q1.mostrarMultiplaEscolha4());

        q1.adicionarMultiplaEscolha5("Os povos indígenas");
        question1.adicionar(q1.mostrarMultiplaEscolha5());

        // Questao 2
        Questao q2 = new Questao();
        q2.addStatement("A cidade de Manhuaçu já foi um república.");
        q2.adicionarVerdadeiroFalso(true);
        question2.adicionar(q2.mostrarVerdadeiroFalso());

        // Questao 3
         Questao q3 = new Questao();
        q3.adicionarAberta("Comente sobre o atual cenário político do Brasil.");
        question3.adicionar(q3.mostrarAberta());


        q3.adicionarRespostaAberta("Um caos!");
        question3.adicionar(q3.mostrarRespostaAberta());

        // Bloco história
        historia.setTitulo("História");
        System.out.println(historia.titulo);

        historia.adicionar(question1.mostrar());
        historia.adicionar(question2.mostrar());
        historia.adicionar(question3.mostrar());

        // Prova
        Prova prova1 = new Prova();
        prova1.adicionarQuestao("Historia");

        GeraProva prova1gerada = new GeraProva();
        prova1gerada.adicionarProva(prova1.mostrarQuestao());
        System.out.printf(prova1gerada.mostraProva());       
    }
}