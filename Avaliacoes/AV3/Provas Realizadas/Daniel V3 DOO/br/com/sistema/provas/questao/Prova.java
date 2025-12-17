package br.com.sistema.provas.questao;

import java.util.ArrayList;

public class Prova {
    private ArrayList<Bloco> itemQuestoes;

    public Prova() {
        itemQuestoes = new ArrayList<>();
    }

    public void adicionarQuestao(Bloco questao) {
        itemQuestoes.add(questao);
    }

    /*public ArrayList<Bloco> retornarQuestoes() {
        for(int i=0; i < itemQuestoes.size(); i++) {
        }
            return ;            
    }*/
}