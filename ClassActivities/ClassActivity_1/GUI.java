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
}
