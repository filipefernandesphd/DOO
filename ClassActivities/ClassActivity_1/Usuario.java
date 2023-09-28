import java.util.ArrayList;

public abstract class Usuario {
    protected String nome;
    protected int id;
    protected int maxlivros;
    protected ArrayList<Livro> livrosemprestadosusuario = new ArrayList<Livro>(); //livros que estão emprestados para o usuário

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
        return this.livrosemprestadosusuario;
    } 

    // Método que vincula o usuário ao livro
    public boolean efetivarEmprestimo(Livro livro){
        boolean r = false;
    
        if( this.verificarLimiteEmprestimo() ){
          this.livrosemprestadosusuario.add(livro);
          r = true;
        }else{
          GUI.limiteMaxAtingido(this.nome, this.maxlivros);
        }
    
        return r;
    }

    protected boolean verificarLimiteEmprestimo(){
        boolean r = false;

        if( this.livrosemprestadosusuario.size() < this.maxlivros  ) {
            r = true;
        }

        return r;
    }

    public void cancelarEmprestimo(Livro livro){
        if( this.livrosemprestadosusuario.isEmpty() ){
            GUI.semLivrosParaDevolucao();
        }else{
            for (int i = 0; i < this.livrosemprestadosusuario.size(); i++) {
                if(this.livrosemprestadosusuario.get(i).equals(livro)){
                    this.livrosemprestadosusuario.remove(i);
                    break;
                }
            }
        }
    }

}
