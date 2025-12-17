import java.util.Scanner;

public class Questao {
    private static final boolean Questao = false;
    Scanner teclado = new Scanner(System.in);

    public class multiplaEscolha{}

    private String conteudo;
    private String respostaAberta;
    boolean afirmacaoCorreta;

    public Questao(String string) {
        
    }

    public void adicionarRespostaAberta(String respostaAberta){
        System.out.println("Qual é sua resposa para questão");
        respostaAberta = teclado.nextLine();

    };

    public void adicionarVerdadeiroFalso(boolean afirmacaoCorreta){};

    public void adicionarMultiplaEscolha (){}

    public void adicionarTextoExtra(String string) {
       
       System.out.print ("adicionarTextoExtra");
    }

    public void adicionarImagemExtra(String string) {

       System.out.print ("adicionarImagemExtra");
    }

    public void adicionarVideoExtra(String string) {
        
        System.out.print ("adicionarVideoExtra");
    }

    public void adicionarMultiplaEscolha(String string) {
        
        System.out.print ("adicionarMultiplaEscolha");
    };


     
    
}
