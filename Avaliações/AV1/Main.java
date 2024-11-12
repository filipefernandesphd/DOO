public class Main {
    public static void main(String[] args) {
        Livro livro1 = new Livro();
        livro1.setTitulo("Origens");

        Livro livro2 = new Livro();
        livro2.setTitulo("Breve respostas para grandes questões");

        Livro livro3 = new Livro();
        livro3.setTitulo("A física do futuro");
        
        Biblioteca bib = new Biblioteca();
        bib.adicionarLivro(livro1);
        bib.adicionarLivro(livro2);
        bib.adicionarLivro(livro3);

        bib.mostrarLivros();
    }
}
