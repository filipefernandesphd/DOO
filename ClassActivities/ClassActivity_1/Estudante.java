public class Estudante extends Usuario {
    public void pedirEmprestimo(Livro livro){
       
        if( this.livros.isEmpty() ){
            this.livros.add(livro);
        }else{
            boolean thereisbook = false;

            for (int i = 0; i < this.livros.size(); i++) {
                if( this.livros.get(i).equals(livro) ){
                    System.out.println( livro.getNome() + " não pode ser emprestado" );
                    thereisbook = true;
                }
            }
            
            if(!thereisbook){
                this.livros.add(livro);
            }
        }

    }
}
