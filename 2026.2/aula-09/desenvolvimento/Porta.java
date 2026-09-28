public class Porta {
    private String posicao; // dianteira ou traseira
    private String lado;    // esquedo ou direito
    
    public Porta(String posicao, String lado){
        this.posicao = posicao;
        this.lado = lado;
    }
    
    public String getPosicao(){ return this.posicao; }
    public String getLado(){ return this.lado; }
}