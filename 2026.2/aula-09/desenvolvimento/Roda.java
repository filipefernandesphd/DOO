public class Roda {
    private int aro;
    private String posicao; // dianteira ou traseira
    private String lado;    // esquedo ou direito
    
    public Roda(int aro, String posicao, String lado) {
        this.aro = aro;
        this.posicao = posicao;
        this.lado = lado;
    }
    
    public int getAro(){ return this.aro; }
    public String getPosicao(){ return this.posicao; }
    public String getLado(){ return this.lado; }
}