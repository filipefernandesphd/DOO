public class Questao {
    String quest;
    
    public Questao(String string) {
        
    }

    public void setQuest(String quest){
        this.quest = quest;
    }

    public String getQuest(){
        return quest;
    }

    public void adicionarTextoExtra(String string){
        System.out.println("Quem descobriu o Brasil?");
    }

    public void adicionarImagemExtra(String string){
        System.out.println("https://x.com/govbr/status/988160591448739840");
    }

    public void adicionarVideoExtra(String string){
        System.out.println("Ut-KsHLoxSM");
    }

    String adicionarMultiplaEscolha[];

    public void adicionarMultiplaEscolha1(String string){
            System.out.println("Pedro Álvares Cabral");
    }

    public void adicionarMultiplaEscolha2(String string){
            System.out.println("Américo Vespúcio");
    }

    public void adicionarMultiplaEscolha3(String string){
            System.out.println("Cristóvão Colombo");
    }

    public void adicionarMultiplaEscolha4(String string){
            System.out.println("Pedro Vaz de Caminha");
    }

    public void adicionarMultiplaEscolha5(String string){
            System.out.println("Pedro Álvares Cabral");
    }

    public void adicionarVerdadeiroFalso(Boolean boolean1){
        System.out.println(boolean1);
    }

    public void adicionarRespostaAberta(String string){
        System.out.println("Um caos");
    }

    public class Prova{
        
    }
}
