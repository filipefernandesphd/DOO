package br.com.sistema.provas.questao.conteudoextra;

public class TextoDecorator extends ExtraDecorator {
    public TextoDecorator(IConteudoExtra conteudoextra) {
        super(conteudoextra);
    }

    public void setConteudo(String conteudo) {
        this.conteudo = this.conteudoextraDecorado.getConteudo() + "\n" + conteudo;
    }

    public String getConteudo() {
        return this.conteudo;
    }
}
