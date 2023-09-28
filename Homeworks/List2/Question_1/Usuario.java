import java.util.ArrayList;

public class Usuario {
  private String nome;
  private int identificacao;
  private ArrayList<Livro> livrosEmprestados = new ArrayList<>();

  public void setNome(String nome){
    this.nome = nome;
  }

  public ArrayList<Livro> getLivrosEmprestados(){
    return this.livrosEmprestados;
  }

  public void adicionarLivroEmprestado(Livro livro){
    // verificar o status do livro (se estiver disponível, continar com o processo)
    // verificar a qtd de livros emprestados

    if( livro.getStatus() && livrosEmprestados.size() <= 3){
      // deve emprestar o livro
      livro.setStatus();
      this.livrosEmprestados.add(livro);
    }
  }

  public void devolverLivroEmprestado(Livro livro){
    //verificar se o livro já está emprestado
    for (int i = 0; i < livrosEmprestados.size(); i++) {
      if(livrosEmprestados.get(i).equals(livro)){
        livro.setStatus();
        livrosEmprestados.remove(i);
      }
    }
  }


}
