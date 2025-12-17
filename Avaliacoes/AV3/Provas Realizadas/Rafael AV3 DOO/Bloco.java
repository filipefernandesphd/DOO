public class Bloco {
    protected String titulo,question;

    public void setTitulo(String titulo){
        this.titulo = titulo;
    }

    public String getTitulo(){
        return this.titulo;
    }

    public void adicionar(String add){
        this.question += add + "\n";
    }

    public String mostrar(){
        return this.question;
    }
}
