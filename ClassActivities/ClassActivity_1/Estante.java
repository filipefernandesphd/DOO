import java.util.ArrayList;

public class Estante {
    private String nome;
    private int qtdmaxlivros;
    private ArrayList<Livro> livros = new ArrayList<>();

    Estante(String nome, int qtdmaxlivros){
        this.nome = nome;
        this.qtdmaxlivros = qtdmaxlivros;
    }

    public String getNome(){
        return this.nome;
    }

    public ArrayList<Livro> getLivros(){
        return this.livros;
    }

    // Guarda livro na estante
    public void guardarLivro(Livro livro){
        if(this.verificarLimiteEstante()){
            this.livros.add(livro);
            GUI.livroGuardadoNaEstante(this.nome, livro);
        }else{
            // A estante não comporta mais livros
            GUI.limiteMaxEstanteAtingido(this.nome, livro, this.qtdmaxlivros);
        }
    }

    // Retirar o livro por algum motivo
    // Um livro que é emprestado deve manter a informação da estante, a fim de que retorne para o mesmo lugar depois da devolução do livro 
    public void retirarLivro(Livro livro){
        for (int i = 0; i < this.livros.size(); i++) {
            if( this.livros.get(i).equals(livro) ){
                this.livros.remove(livro); // remove o livro da lista desta estante
                GUI.retirarLivroDaEstante(livro, this);
            }
        }
    }

    private boolean verificarLimiteEstante(){
        boolean r = false;
        
        if( this.livros.size() < this.qtdmaxlivros ){
            r = true;
        }

        return r;
    }
}