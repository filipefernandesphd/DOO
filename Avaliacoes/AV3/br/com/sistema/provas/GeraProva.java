package br.com.sistema.provas;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import br.com.sistema.provas.questao.BlocoQuestao;
import br.com.sistema.provas.questao.Questao;
// import br.com.sistema.provas.questao.Questao.MultiplaEscolha;

public class GeraProva {
    private Prova prova;
    private Map<Integer,BlocoQuestao> questoes = new HashMap<Integer,BlocoQuestao>();
    private boolean questoesaleatorias = false;
    private String[] letrasalternativas = {"a","b","c","d","e"};

    public GeraProva(Prova prova){
        this.prova = prova;
    }

    // Quando as questões NÃO serão geradas aleatoriamente
    private Map<Integer,BlocoQuestao> provaGerada(){
        int numeroquestao = 1;

        for (int i = 0; i < this.prova.retornarQuestoes().size(); i++) {
            if(prova.retornarQuestoes().get(i) instanceof Questao){
                questoes.put(numeroquestao++, prova.retornarQuestoes().get(i));
            }else{
                questoes.put(-1, prova.retornarQuestoes().get(i)); // -1 no caso de ser um bloco
            }
        }

        return this.questoes;
    }

    public void inciar() {
        for (Map.Entry<Integer, BlocoQuestao> entry : this.provaGerada().entrySet()) {
            Integer id = entry.getKey();
            BlocoQuestao questao = entry.getValue();

            if(id==-1){ // Quando for bloco de questão
                System.out.println(questao.getDescricao());
            }else{
                Questao q = (Questao) questao;
                System.out.println(id + " - "+ q.getDescricao());

                System.out.println(q.mostrarConteudosExtras());
                
                // No caso da questão for múltipla escolha
                if(q.getAlternativas().size() > 0) {
                    for(int i = 0; i < q.getAlternativas().size(); i++){
                        System.out.println( letrasalternativas[i]+") "+ q.getAlternativas().get(i).getDescricao() );
                    }
                }else if (q.getAfirmacaoCorreta()) { // se verdadeiro ou false 
                    System.out.println("(  ) Verdadeiro \t (  ) Falso");
                }
            }
            System.out.println();
        }
    }

}
