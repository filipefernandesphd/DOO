package br.com.sistema.provas.questao;

import java.util.ArrayList;

public class Bloco {
    private ArrayList<Questao> itemQuestao;

    public Bloco() {
        itemQuestao = new ArrayList<>();
    }

    public void adicionar(Questao qt) {
        itemQuestao.add(qt);
    }
}
