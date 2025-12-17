import java.util.ArrayList;

public class Bloco implements BlocoQuestao{
    ArrayList <BlocoQuestao> bloco = new ArrayList<>();
    public void adicionar(BlocoQuestao b){
        bloco.add(b);
    } 
    public Bloco(String disciplina){

    }
}
