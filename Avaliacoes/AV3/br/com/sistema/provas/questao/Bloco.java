package br.com.sistema.provas.questao;

import java.util.ArrayList;

public class Bloco extends BlocoQuestao {   
    private ArrayList<BlocoQuestao> elementos;

    public Bloco(String descricao) {
        super(descricao);
        this.elementos = new ArrayList<BlocoQuestao>();
    }

    public void adicionar(BlocoQuestao elemento) {
        this.elementos.add(elemento);
    }
}
