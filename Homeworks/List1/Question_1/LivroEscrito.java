import java.util.ArrayList;

public class LivroEscrito {
  private Livro livro;
  private ArrayList<Autor> autores = new ArrayList<>();

  LivroEscrito(Livro livro){
    this.livro = livro;
  }

  public void adicionarAutor(Autor autor){
    this.autores.add(autor);
  }

  public ArrayList<Autor> getAutores(){
    return this.autores;
  }
}
