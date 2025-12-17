package provas;
public class Questao {
    Questao(String enunciado) {

    }
    public void adicionarRespostaAberta(String repostaaberta) {
        
    }

    public void adicionarVerdadeiroFalso(boolean afirmacaocorreta) {
        
    }

    public void adicionarMultiplaEscolha(String opcao, boolean caso) {
        if (caso != true) {
            caso = false;
        }
    }

    public void adicionarTextoExtra(String conteudo) {
        System.out.println(conteudo);
    }

    public void adicionarImagemExtra(String conteudo) {
        System.out.println(conteudo);
    }

    public void adicionarVideoExtra(String conteudo) {
        System.out.println(conteudo);
    }
}



class MultiplaEscolha {

}