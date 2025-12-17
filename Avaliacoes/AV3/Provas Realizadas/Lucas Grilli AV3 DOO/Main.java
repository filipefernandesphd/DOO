import br.com.sistema.usuarios.Aluno;
import br.com.sistema.usuarios.Professor;

public class Main {
    public static void main(String args[]) {
        // Instanciação de usuários
        Aluno<String> aluno1 = new Aluno<>("alunoum@gmail.com");
        System.out.println(aluno1.getIdentificacao());

        Aluno<Integer> aluno2 = new Aluno<>("123");
        System.out.println(aluno2.getIdentificacao());

        Professor<String> prof1 = new Professor<>("professor1@gmail.com");
        System.out.println(prof1.getIdentificacao());

        Professor<Integer> prof2 = new Professor<>("984868");
        System.out.println(prof2.getIdentificacao());
        
        System.out.println("História");

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