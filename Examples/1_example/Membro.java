import java.util.ArrayList;

public class Membro {
  private String nome; 
  private ArrayList<Livro> listalivros = new ArrayList<Livro>();

  Membro(String nome){
    this.nome = nome;
  }

  public String getNome() {
    return this.nome;
  }

  public void pegarLivroEmprestado(Livro livro){
    listalivros.add(livro);
  }
}
