package br.com.sistema.questao;

public class Questao {
    String cabecalho;

    Questao(String id){
        this.cabecalho=id;
    }
        
    public void adicionarTextoExtra(String txt){
        System.out.println(txt);
     }
    public void adicionarImagemExtra(String img){
        System.out.println("<img src='"+img+"'/>");
    }
    public void adicionarVideoExtra(String url){
        System.out.println("https://www.youtube.com/watch?v="+url);
    }

    
        Ut-KsHLoxSM
a) Pedro Álvares Cabral

        q1.adicionarMultiplaEscolha("Pedro Álvares Cabral", true);
        q1.adicionarMultiplaEscolha("Américo Vespúcio");
        q1.adicionarMultiplaEscolha("Cristóvão Colombo");
        q1.adicionarMultiplaEscolha("Pedro Vaz de Caminha");
        q1.adicionarMultiplaEscolha("Os povos indígenas");

}
