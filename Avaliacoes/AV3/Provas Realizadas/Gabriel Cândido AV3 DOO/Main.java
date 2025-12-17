public class Main {
    public static void main(String args[]) {
        // Instanciação de usuários
        Aluno<CharSequence> aluno1 = new Aluno<CharSequence>("alunoum@gmail.com");
        System.out.println(aluno1.getIdentificacao());

        Aluno<Integer> aluno2 = new Aluno<>(123);
        System.out.println(aluno2.getIdentificacao());

        Professor<CharSequence> prof1 = new Professor<CharSequence>("professor1@gmail.com");
        System.out.println(prof1.getIdentificacao());

        Professor<Integer> prof2 = new Professor<>(984868);
        System.out.println(prof2.getIdentificacao());

        System.out.println();

        System.out.println("História");

        System.out.println();

        // Questao 1
        Questao q1 = new Questao("1 - O Brasil foi alcançado em 1500 de maneira fortuita, durante uma expedição cujo destino original era outro.");
        
        System.out.println(q1.getEnunciado());
        q1.adicionarTextoExtra("Quem descobriu o Brasil?");
        q1.adicionarImagemExtra("https://x.com/govbr/status/988160591448739840");
        q1.adicionarVideoExtra("Ut-KsHLoxSM");
        
        q1.adicionarMultiplaEscolha("A) Pedro Álvares Cabral", true);
        q1.adicionarMultiplaEscolha("B) Américo Vespúcio", false);
        q1.adicionarMultiplaEscolha("C) Cristóvão Colombo", false);
        q1.adicionarMultiplaEscolha("D) Pedro Vaz de Caminha", false);
        q1.adicionarMultiplaEscolha("E) Os povos indígenas", false);
        
        System.out.println();
        // Questao 2
        Questao q2 = new Questao("2 - A cidade de Manhuaçu já foi uma república.");
        q2.adicionarVerdadeiroFalso(true);

        System.out.println();
        //Questao 3
        Questao q3 = new Questao("3 - Comente sobre o atual cenário político do Brasil.");
        q3.adicionarRespostaAberta("Um caos!");
    
        /*
        nao deu tempo de fazer :(
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
*/
       
    }
}