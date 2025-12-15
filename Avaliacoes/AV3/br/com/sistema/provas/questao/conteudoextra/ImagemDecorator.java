package br.com.sistema.provas.questao.conteudoextra;

public class ImagemDecorator extends ExtraDecorator {
    public ImagemDecorator(IConteudoExtra conteudoextra) {
        super(conteudoextra);
    }

    public void setConteudo(String conteudo) {
        this.conteudo = this.conteudoextraDecorado.getConteudo() + "\n<img src='" + conteudo + "' />";
    }

    public String getConteudo() {
        return this.conteudo;
    }  
}
