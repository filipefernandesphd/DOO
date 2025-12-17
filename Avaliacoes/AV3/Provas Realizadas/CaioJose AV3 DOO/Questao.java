public class Questao {
    private String texto;
    private String textoEx;
    private String imagem;
    private String video;
    private String escolha;
    private String escolhaCerta;
    private String respostaAberta;
    private String respostaCerta;
    private boolean certa;
    private int num;

    public Questao(String texto, String textoEx, String imagem, String video, String escolha, boolean certa) {
        this.texto = texto;
        this.textoEx = textoEx;
        this.imagem = imagem;
        this.video = video;
        this.escolha = escolha;
        this.certa = certa;
        this.num = 1;
        System.out.println(num+" - "+this.getTexto());
        num++;
    }
    public void adicionarTextoExtra(String textoEx){
        System.out.println(this.textoEx);
    }
    public void adicionarImagemExtra(String imagem){
        System.out.println(this.imagem);
    }
    public void adicionarVideoExtra(String video){
        System.out.println(this.video);
    }
    public void adicionarMultiplaEscolha(String escolha,boolean escolhaCerta){
        System.out.println(this.escolha);
        setEscolha(this.escolhaCerta);
    }
    public void adicionarVerdadeiroFalso(boolean ceta){
        System.out.println("( ) Verdadeiro ( ) Falso");
    }
    public void adicionarRespostaAberta(String respostaAberta){
        System.out.println(this.respostaAberta);
        
    }


    

    public String getTexto() {
        return texto;
    }
    public void setTexto(String texto) {
        this.texto = texto;
    }
    public String getTextoEx() {
        return textoEx;
    }
    public void setTextoEx(String textoEx) {
        this.textoEx = textoEx;
    }
    public String getImagem() {
        return imagem;
    }
    public void setImagem(String imagem) {
        this.imagem = imagem;
    }
    public String getVideo() {
        return video;
    }
    public void setVideo(String video) {
        this.video = video;
    }
    public String getEscolha() {
        return escolha;
    }
    public void setEscolha(String escolha) {
        this.escolha = escolha;
    }
    public boolean getCerta() {
        return certa;
    }
    public void setCerta(boolean certa) {
        this.certa = certa;
    }
    public int getNum() {
        return num;
    }
    public void setNum(int num) {
        this.num = num;
    }
    
    
}
