public abstract class Usuario {
    protected String id;

    public void setIdentificacao(String dado){
        this.id = dado;
    }

    public String getIdentificacao(){
        return this.id;
    }
    
}
