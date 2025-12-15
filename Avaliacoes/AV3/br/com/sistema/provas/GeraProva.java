package br.com.sistema.provas;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

import br.com.sistema.provas.questao.BlocoQuestao;

public class GeraProva {
    private Prova prova;
    private Map<Integer,BlocoQuestao> questoes = new HashMap<Integer,BlocoQuestao>();
    private boolean questoesaleatorias = false;

    public GeraProva(Prova prova){
        this.prova = prova;
    }

    // Quando as questões NÃO serão geradas aleatoriamente
    public Map<Integer,BlocoQuestao> provaGerada(){
        return this.provaGeradaNaoAleatoria();
    }

    // Quando as questões SERÃO geradas aleatoriamente
    public void provaGerada(boolean questoesaleatorias){
        this.questoesaleatorias = questoesaleatorias;

        this.provaGeradaAleatoria();
    }

    private Map<Integer,BlocoQuestao> provaGeradaNaoAleatoria(){
        for (int i = 0; i < this.prova.retornarQuestoes().size(); i++) {
           questoes.put(i, prova.retornarQuestoes().get(i));
        }

        return this.questoes;
    }

    private void provaGeradaAleatoria(){
        // ArrayList<BlocoQuestao> questoes = prova.retornarQuestoes();
    }
}
