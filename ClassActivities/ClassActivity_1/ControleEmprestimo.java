import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class ControleEmprestimo {
  private ArrayList<Livro> livrosemprestados = new ArrayList<>();
  private Map<Usuario,Livro> listadeespera = new HashMap<>();

  public ArrayList<Livro> getLivrosEmprestados(){
    return this.livrosemprestados;
  }

  public Map<Usuario,Livro> getLivrosFilaDeEspera(){
    return this.listadeespera;
  }

  // Método para realizar o empréstimo
  public void realizarEmprestimo(Usuario usuario, Livro livro){
    // Verifica se o livro já está emprestado
    // Se o livro estiver disponível, deve-se realizar o empréstimo
    if( this.verificarCondicaoDeEmprestimoDeLivro(livro) ){
      if(usuario.efetivarEmprestimo(livro)){
        this.livrosemprestados.add(livro);
        GUI.emprestimoRealizado(usuario, livro);
      }
    }
  }

  // Verifica se um livro pode ser emprestado
  // Retorna true quando o livro pode ser emprestado
  // Retonar false quando o livro NÃO pode ser emprestado
  private boolean verificarCondicaoDeEmprestimoDeLivro(Livro livro){
    boolean r = false;
    
    if( this.livrosemprestados.isEmpty() ){
      r = true;
    }else{
      for (int i = 0; i < this.livrosemprestados.size(); i++) {
        if(this.livrosemprestados.get(i).equals(livro)){
          GUI.livroJaEmprestado(livro);
          r = false;
          break;
        }else{
          r = true;
        }
      }
    }

    return r;
  }

  // Devolução de livros
  public void devolverLivro(Usuario usuario, Livro livro){
    // Se a lista de livros emprestados estiver vazia
    if( this.livrosemprestados.isEmpty() ){
      GUI.semLivrosParaDevolucao();
    
    // Caso contrário
    }else{
      for (int i = 0; i < this.livrosemprestados.size(); i++) {
        if( this.livrosemprestados.get(i).equals(livro) ){
          // remove livro da lista geral de empréstimos
          this.livrosemprestados.remove(livro);  
          
          // remove livro de empréstimos do usuário
          usuario.cancelarEmprestimo(livro);     
          
          // verificar se o livro está na fila de espera, se sim, notificar o usuário
          for(Map.Entry<Usuario,Livro> lista : this.listadeespera.entrySet()){
            // Se o livro estiver na lista de espera
            if( lista.getValue().equals(livro) ){
              GUI.notificarUsuarioDaListaDeEspera(lista.getKey(), livro);
            }
          }

          // msg de conclusão
          GUI.devolucaoConcluida(livro);         
          break;
        }
      }
    }
  }

  // Lista de espera
  public void addLivroNaListaDeEspera(Usuario usuario, Livro livro){
    if( !this.verificarCondicaoDeEmprestimoDeLivro(livro) ){
      this.listadeespera.put(usuario, livro);
      GUI.livroAddedListaDeEspera(usuario, livro);
    }else{
      // Livro já está disponível e não precisa de estar na lista de espera
    }
  }

}
