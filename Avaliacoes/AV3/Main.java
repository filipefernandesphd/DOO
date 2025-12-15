import br.com.sistema.usuarios.Aluno;
import br.com.sistema.usuarios.Professor;
import br.com.sistema.provas.questao.BlocoQuestao;
import br.com.sistema.provas.questao.Bloco;
import br.com.sistema.provas.questao.Questao;

import java.util.Map;

import br.com.sistema.provas.GeraProva;
import br.com.sistema.provas.Prova;


public class Main {
    public static void main(String args[]) {
        // Instanciação de usuários
        Aluno<String> aluno1 = new Aluno<String>("asdf@gmail.com");
        System.out.println(aluno1.getIdentificacao());

        Aluno<Integer> aluno2 = new Aluno<Integer>(123);
        System.out.println(aluno2.getIdentificacao());

        Professor<String> prof1 = new Professor<String>("asdf@gmail.com");
        System.out.println(prof1.getIdentificacao());

        Professor<Integer> prof2 = new Professor<Integer>(123);
        System.out.println(prof2.getIdentificacao());

        // Questao - Bloco
        Questao q1 = new Questao("Quem descobriu o Brasil?");
        q1.adicionarMultiplaEscolha("Pedro Álvares Cabral", true);
        q1.adicionarMultiplaEscolha("Índios");
        q1.adicionarMultiplaEscolha("Lula");
        q1.adicionarMultiplaEscolha("Pedro Vaz de Caminha");

        // Conteúdos extras
        q1.adicionarTextoExtra("Isso é uma informação extra!");
        q1.adicionarImagemExtra("https://x.com/govbr/status/988160591448739840");
        q1.adicionarVideoExtra("Ut-KsHLoxSM");
        // System.out.println(q1.mostrarConteudosExtras());

        Questao q2 = new Questao("A metade de dois mais dois é 3.");
        q2.adicionarVerdadeiroFalso(true);

        Questao q3 = new Questao("Comente sobre o atual cenário político do Brasil.");
        q3.adicionarRespostaAberta("Um caos!");

        Bloco b1 = new Bloco("História");
        b1.adicionar(q1);

        // Prova
        Prova prova1 = new Prova();
        prova1.adicionarQuestao(q1);
        prova1.adicionarQuestao(q2);
        prova1.adicionarQuestao(q3);
        prova1.adicionarQuestao(b1);

        GeraProva prova1gerada = new GeraProva(prova1);
        for (Map.Entry<Integer, BlocoQuestao> entry : prova1gerada.provaGerada().entrySet()) {
            Integer id = entry.getKey();
            BlocoQuestao questao = entry.getValue();

            System.out.println(id + " - "+ questao.getDescricao());
        }
    }
}
