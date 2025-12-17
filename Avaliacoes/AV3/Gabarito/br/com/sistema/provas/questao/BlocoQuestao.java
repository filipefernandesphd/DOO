package br.com.sistema.provas.questao;

public abstract class BlocoQuestao {
    protected String descricao;

    BlocoQuestao(String descricao) {
        this.descricao = descricao;
    }
    
    public String getDescricao() {
        return this.descricao;
    }
}
