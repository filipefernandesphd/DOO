import java.util.ArrayList;

class Biblioteca {
    ArrayList<Livro> livros = new ArrayList<>();

    void adicionarLivro(Livro livro) {
        livros.add(livro);
    }

    void mostrarLivros() {
        System.out.println("Livros na biblioteca:");
        for (Livro livro : livros) {
            System.out.println(livro.getTitulo());
        }
    }
}
