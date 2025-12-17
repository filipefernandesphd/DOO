package br.com.sistema.provas.questao.conteudoextra;

public class VideoDecorator extends ExtraDecorator {
    public VideoDecorator(IConteudoExtra conteudoextra) {
        super(conteudoextra);
    }

    public void setConteudo(String conteudo) {
        this.conteudo = this.conteudoextraDecorado.getConteudo() + "\nhttps://www.youtube.com/watch?v="+ conteudo;
    }

    public String getConteudo() {
        return this.conteudo;
    }    
}
