public class Questao {
    protected String head,subhead,img,video,question1,question2,question3,question4,question5,respostacorreta,simnao,statement,verfalso,openend,answer;

    public void sethead(String head){
        this.head = head;
    }

    public String getHead(){
        return this.head;
    }

    public void adicionartextoextra(String subhead){
        this.subhead = subhead;
    }

    public String mostrartextoextra(){
        return this.subhead;
    }

    public void adicionarimagemextra(String img){
        this.img = img;
    }

    public String mostrarimagemextra(){
        return this.img;
    }

    public void adicionarvideoextra(String mp4){
        this.video = mp4;
    }

    public String mostrarvideoextra(){
        return this.video;
    }

    public void adicionarMultiplaEscolha1(String question, boolean answer){
        this.question1 = question;

        if(answer == true)
            respostacorreta = question;

    }

    public String mostrarMultiplaEscolha1(){
        return (this.question1 + " ()");
    }

    public void adicionarMultiplaEscolha2(String question){
        this.question2 = question;

    }

    public String mostrarMultiplaEscolha2(){
        return (this.question2 + " ()  ");
    }

    public void adicionarMultiplaEscolha3(String question){
        this.question3 = question;

    }

    public String mostrarMultiplaEscolha3(){
        return (this.question2 + " ()  ");
    }

    public void adicionarMultiplaEscolha4(String question){
        this.question4 = question;

    }

    public String mostrarMultiplaEscolha4(){
        return (this.question4 + " ()");
    }

    public void adicionarMultiplaEscolha5(String question){
        this.question5 = question;

    }

    public String mostrarMultiplaEscolha5(){
        return (this.question5 + " ()");
    }

    public void addStatement(String question){
        this.statement = question;

    }

    public void adicionarVerdadeiroFalso(boolean answer){
        if(answer == true)
            simnao = (this.statement + " é verdadeiro");

        else
            simnao = (this.statement + " é falso");

        this.verfalso = "() verdadeiro  () falso";
    }

    public String mostrarVerdadeiroFalso(){
        return this.verfalso;
    }

    public void adicionarAberta(String questao){
        this.openend = questao;
    }

    public String mostrarAberta(){
        return this.openend;
    }

    public void adicionarRespostaAberta(String answer){
        this.answer = answer;
    }

    public String mostrarRespostaAberta(){
        return this.answer;
    }

}
