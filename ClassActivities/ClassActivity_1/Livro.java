public class Livro {
    private String nome;
    private String autor;
    private String isbn;
    private Estante estante;

    public void setNome(String nome){
        this.nome = nome;
    }

    public String getNome(){
        return this.nome;
    }

    public void setAutor(String autor){
        this.autor = autor;
    }

    public String getAutor(){
        return this.autor;
    }

    public void setIsbn(String isbn){
        this.isbn = isbn;
    }

    public String getIsbn(){
        return this.isbn;
    }

    public void guardarNaEstante(Estante estante){
        this.estante = estante;
        this.estante.guardarLivro(this);
    }

    public void retirarDaEstante(){
        this.estante.retirarLivro(this);
        this.estante = null;
    }
}
