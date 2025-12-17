public class Questao {

    String conteudo;
    String questao;
    String rspostaaberta;
    boolean afirmacaocorreta;

    public void adicionarRespostaAberta(String respostaaberta);
    public void adicionarVerdadeiroFalso(boolean afirmacaocorreta);
    public void adicionarMultiplaEscolha();
    public void adicionarTextoExtra(String conteudo);
    public void adicionarImagemExtra(String conteudo);
    public void adicionarVideoExtra(String conteudo);
    public void getComposite();

}
