import java.util.ArrayList;

public class GUI {
    public static void mostrarLivrosEmprestados(ArrayList<Livro> livros){
        if(!livros.isEmpty()){
            for (int i = 0; i < livros.size(); i++) {
                System.out.println(livros.get(i).getNome());
            }
        }else{
            System.out.println("Não há livros emprestados");
        }
    }

    public static void mostrarUsuariosComLivrosEmprestados(ArrayList<Usuario> usuarios){
        for (int i = 0; i < usuarios.size(); i++) {
            if( !usuarios.get(i).getLivrosEmprestados().isEmpty() ){
                System.out.println(usuarios.get(i).getNome()+" possui os seguintes livros emprestados:");

                for (int j = 0; j < usuarios.get(i).getLivrosEmprestados().size(); j++) {
                    System.out.println("\t"+usuarios.get(i).getLivrosEmprestados().get(j).getNome());
                }
            }
        }
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

    public static void limiteMaxEstanteAtingido(String estante, int qtdmaxlivros){
        System.out.println("Não é possível guardar livros na estante "+estante+". O limite máximo é " + qtdmaxlivros);
    }

    public static void mostrarLivrosDaEstante(Estante estante){
        if( !estante.getLivros().isEmpty() ){
            System.out.println("Livros alocados na estante " + estante.getNome());
            for (int i = 0; i < estante.getLivros().size(); i++) {
                System.out.println("\t" + estante.getLivros().get(i).getNome());
            }
        }        
    }
}
