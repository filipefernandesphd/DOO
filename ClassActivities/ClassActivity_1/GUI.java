import java.util.ArrayList;

public class GUI {
    public static void mostrarLivrosEmprestados(ArrayList<Livro> livros){
        System.out.println("--------------------\nMostra todos os livros emprestados\n--------------------");

        if(!livros.isEmpty()){
            for (int i = 0; i < livros.size(); i++) {
                System.out.println(livros.get(i).getNome());
            }
        }else{
            System.out.println("Não há livros emprestados");
        }
    }

    public static void mostrarUsuariosComLivrosEmprestados(ArrayList<Usuario> usuarios){
        System.out.println("--------------------\nMostra os livros emprestados por usuário\n--------------------");

        for (int i = 0; i < usuarios.size(); i++) {
            if( !usuarios.get(i).getLivrosEmprestados().isEmpty() ){
                System.out.println(usuarios.get(i).getNome()+" possui os seguintes livros emprestados:");

                for (int j = 0; j < usuarios.get(i).getLivrosEmprestados().size(); j++) {
                    System.out.println("\t"+usuarios.get(i).getLivrosEmprestados().get(j).getNome());
                }
            }
        }
    }

    public static void emprestimoRealizado(Usuario usuario, Livro livro){
        System.out.println(livro.getNome()+" emprestado para "+usuario.getNome());
    }

    public static void livroJaEmprestado(Livro livro){
        System.out.println(livro.getNome()+" já está emprestado.");
    }

    public static void limiteMaxAtingido(String nome, int maxlivros){
        System.out.println(nome + " atingiu o limite de "+ maxlivros +" livros emprestados");
    }

    public static void semLivrosParaDevolucao(){
        System.out.println("Não existem livros para devolução");
    }

    public static void devolucaoConcluida(Livro livro){
        System.out.println(livro.getNome() + " devolvido com sucesso!");
    }

    public static void livroAddedListaDeEspera(Usuario usuario, Livro livro){
        System.out.println(livro.getNome() + " adicionado à lista de espera pelo " + usuario.getNome());
    }

    public static void notificarUsuarioDaListaDeEspera(Usuario usuario, Livro livro){
        System.out.println(usuario.getNome() + ", o livro " + livro.getNome() + " foi devolvido e disponível para empréstimo");
    }

    public static void livroGuardadoNaEstante(String nome, Livro livro){
        System.out.println(livro.getNome() + " guardado na estante " + nome);
    }

    public static void limiteMaxEstanteAtingido(String estante, Livro livro, int qtdmaxlivros){
        System.out.println("Não é possível guardar o livro "+livro.getNome()+" na estante "+estante+". O limite máximo de " + qtdmaxlivros + " livros foi atingido.");
    }

    public static void mostrarLivrosDaEstante(Estante estante){
        System.out.println("--------------------\nMostra os livros alocados na estante "+estante.getNome()+"\n--------------------");

        if( !estante.getLivros().isEmpty() ){
            for (int i = 0; i < estante.getLivros().size(); i++) {
                System.out.println(estante.getLivros().get(i).getNome());
            }
        }        
    }

    public static void retirarLivroDaEstante(Livro livro, Estante estante){
        System.out.println("Livro "+livro.getNome()+" retirado da estante " + estante.getNome());        
    }

    public static void livroMovidoComSucesso(Livro livro, Estante estante){
        System.out.println("Livro "+livro.getNome()+" realocado à estante " + estante.getNome());        
    }
}
