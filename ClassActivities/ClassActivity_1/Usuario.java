import java.util.ArrayList;

public abstract class Usuario {
    protected String nome;
    protected int id;
    protected ArrayList<Livro> livros = new ArrayList<>();

    public void setNome(String nome){
        this.nome = nome;
    }

    public String getNome(){
        return this.nome;
    }

    public void setId(int id){
        this.id = id;
    }

    public int getId(){
        return this.id;
    }

    public ArrayList<Livro> getLivrosEmprestados(){
        return this.livros;
    }

    public abstract void pedirEmprestimo(Livro livro);
}
