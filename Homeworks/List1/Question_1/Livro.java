public class Livro {
  private String titulo;
  private boolean status; //true para disponível e false para emprestado

  Livro(String titulo){
    this.titulo = titulo;
    this.status = true;
  }

  public boolean getStatus(){
    return this.status;
  }

  public void setStatus(){
    this.status = !this.status;
  }
}
