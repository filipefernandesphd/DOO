import java.util.ArrayList;

public class Usuario {
  private String nome;
  private int identificacao;
  private ArrayList<Livro> livrosEmprestados = new ArrayList<>();

  public void setNome(String nome){
    this.nome = nome;
  }

  public void adicionarLivroEmprestado(Livro livro){
    livro.setStatus();
    this.livrosEmprestados.add(livro);
  }
}
