package br.com.sistema.provas;

import br.com.sistema.provas.questao.BlocoQuestao;
import java.util.ArrayList;

public class Prova {
    protected ArrayList<BlocoQuestao> questoes = new ArrayList<BlocoQuestao>();

    public void adicionarQuestao(BlocoQuestao questao){
        this.questoes.add(questao);
    }

    public ArrayList<BlocoQuestao> retornarQuestoes() {
        return this.questoes;
    }
}
