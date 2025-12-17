package br.com.sistema.provas.questao;

import java.util.ArrayList;

public class Questao {
    private boolean verdadeiroOuFalso;
    private String enunciadoQuestao;

    public Questao(String enunciadoQuestao) {
        this.enunciadoQuestao = enunciadoQuestao;
        setVerdadeiroOuFalso(false);
    }

    public boolean getVerdadeiroOuFalso() {
        return verdadeiroOuFalso;
    }
    public void setVerdadeiroOuFalso(boolean verdadeiroOuFalso) {
        this.verdadeiroOuFalso = verdadeiroOuFalso;
    }

    public class MultiplicaEscolha {
        protected boolean acertividade;
        protected ArrayList<String> alternativas;

        public MultiplicaEscolha() {
            alternativas = new ArrayList<>();
            this.setAcertividade(false);
        }

        public boolean getAcertividade() {
            return acertividade;
        }
        public void setAcertividade(boolean acertividade) {
            this.acertividade = acertividade;
        }

        public void adicionarMultiplaEscolha(String alternativa) {
            alternativas.add(alternativa);
        }
    }

    public void adicionarRespostaAberta(String respostaAberta) {
        System.out.println(respostaAberta);
    }

    public void adicionarVerdadeiroFalso(boolean afirmacaoCorreta) {
        setVerdadeiroOuFalso(afirmacaoCorreta);
    }
}