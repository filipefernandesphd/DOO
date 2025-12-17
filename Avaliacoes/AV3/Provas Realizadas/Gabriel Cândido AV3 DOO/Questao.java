public class Questao {
    private String enunciado;
    private String imagemExtra;
    private String videoExtra;
    private String textoExtra;


    public String getEnunciado() {
        return this.enunciado;
    }

    public void setEnunciado(String enun) {
        this.enunciado = enun;
    }


    public Questao(String msg){
        this.enunciado = msg;
    }

    void adicionarImagemExtra(String msg) {
        this.imagemExtra = msg;
    }

    void adicionarVideoExtra(String msg) {
        this.videoExtra = msg;
    }

    void adicionarTextoExtra(String msg) {
        this.videoExtra = msg;

    }

    public String getImagemExtra() {
        return this.imagemExtra;
    }

    public String getVideoExtra() {
        return this.videoExtra;
    }

    public String getTextoExtra() {
        return this.textoExtra;
    }

    void exibirInfo(){
        System.out.println(getEnunciado());
        System.out.println(getTextoExtra());
        System.out.println("<img src='" + getImagemExtra() + "'/>");
        System.out.println(getVideoExtra());
    }

    void adicionarMultiplaEscolha(String msg, boolean correta) {
        System.out.println(msg);
    }

    void adicionarMultiplaEscolha(String msg) {
        System.out.println(msg);
    }

    void adicionarVerdadeiroFalso(boolean correta){
        System.out.println(getEnunciado());
        System.out.println("() Verdadeiro () Falso");
    }

    void adicionarRespostaAberta(String resposta){
    System.out.println(getEnunciado());
    
    }
}
