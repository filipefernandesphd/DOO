package br.com.sistema.provas.questao.conteudoextra;

abstract class ExtraDecorator implements IConteudoExtra {
    protected String conteudo;
    protected IConteudoExtra conteudoextraDecorado;

    ExtraDecorator(IConteudoExtra conteudoextra) {
        this.conteudoextraDecorado = conteudoextra;
    }

    public void setConteudo(String conteudo) {
        this.conteudo = conteudo;
    }

    public String getConteudo() {
        return this.conteudoextraDecorado.getConteudo();
    }
}
