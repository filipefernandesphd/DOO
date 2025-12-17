package br.com.sistema.provas.questao;

public interface ITipoQuestao {
    public abstract void adicionarTextoExtra(String enunciado);
    public abstract void adicionarMultiplaEscolha(String opcao, boolean acerto);
    public abstract void adicionarVerdadeiroFalso(boolean opcao);
    public abstract void adicionarRespostaAberta(String resposta);

}
