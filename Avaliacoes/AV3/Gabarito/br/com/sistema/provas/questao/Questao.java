package br.com.sistema.provas.questao;

import java.util.ArrayList;

import br.com.sistema.provas.questao.conteudoextra.IConteudoExtra;
import br.com.sistema.provas.questao.conteudoextra.ConteudoExtra;
import br.com.sistema.provas.questao.conteudoextra.TextoDecorator;
import br.com.sistema.provas.questao.conteudoextra.ImagemDecorator;
import br.com.sistema.provas.questao.conteudoextra.VideoDecorator;

public class Questao extends BlocoQuestao {
    private ArrayList<MultiplaEscolha> alternativas = new ArrayList<MultiplaEscolha>();     // para múltipla escolha
    private String repostaaberta;           // quando a questão for aberta
    private boolean afirmacaocorreta;       // no caso de ser verdadeiro ou false
    private IConteudoExtra conteudoextra;   // acrescenta conteúdos extras ao enunciado da questão (implementa decorator)

    public Questao(String descricao) {
        super(descricao);
        this.conteudoextra = new ConteudoExtra();
    }

    // =======================================
    // Obter opções de resposta 
    // =======================================
    public ArrayList<MultiplaEscolha> getAlternativas(){
        return this.alternativas;
    }
    
    public String getRespotaAberta(){
        return this.repostaaberta;
    }

    public boolean getAfirmacaoCorreta() {
        return this.afirmacaocorreta;
    }

    // =======================================
    // Adicicionar opções de resposta 
    // =======================================
    public void adicionarRespostaAberta(String repostaaberta){
        this.repostaaberta = repostaaberta;
    }

    public void adicionarVerdadeiroFalso(boolean afirmacaocorreta){
        this.afirmacaocorreta = afirmacaocorreta;
    }

    public void adicionarMultiplaEscolha(String descricao){
        this.alternativas.add(new MultiplaEscolha(descricao));
    }

    public void adicionarMultiplaEscolha(String descricao, boolean correta){
        this.alternativas.add(new MultiplaEscolha(descricao, correta));
    }

    public class MultiplaEscolha {
        private String descricao;
        private boolean correta = false;

        public MultiplaEscolha(String descricao){
            this.descricao = descricao;
        }

        public MultiplaEscolha(String descricao, boolean correta){
            this.correta = correta;
            this.descricao = descricao;
        }

        public String getDescricao() {
            return this.descricao;
        }
    }

    // =======================================
    // Adicicionar conteúdos extras
    // (via decorator) 
    // =======================================

    public void adicionarTextoExtra(String conteudo){
        this.conteudoextra = new TextoDecorator(this.conteudoextra);
        this.conteudoextra.setConteudo(conteudo);
    }

    public void adicionarImagemExtra(String conteudo){
        this.conteudoextra = new ImagemDecorator(this.conteudoextra);
        this.conteudoextra.setConteudo(conteudo);
    }

    public void adicionarVideoExtra(String conteudo){
        this.conteudoextra = new VideoDecorator(this.conteudoextra);
        this.conteudoextra.setConteudo(conteudo);
    }

    public String mostrarConteudosExtras() {
        return this.conteudoextra.getConteudo();
    }
}
