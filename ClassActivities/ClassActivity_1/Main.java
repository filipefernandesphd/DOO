public class Main{
    public static void main(String[] args) {
        Livro livroa = new Livro();
        Livro livrob = new Livro();
        Livro livroc = new Livro();
        Livro livrod = new Livro();

        livroa.setNome("Livro A");
        livrob.setNome("Livro B");
        livroc.setNome("Livro C");
        livrod.setNome("Livro D");

        livroa.setAutor("Autor A");
        livrob.setAutor("Autor B");
        livroc.setAutor("Autor C");
        livrod.setAutor("Autor D");

        livroa.setIsbn("123456789");
        livrob.setIsbn("456789123");
        livroc.setIsbn("001231458");
        livrod.setIsbn("124585484");

        Estudante estudantea = new Estudante();
        estudantea.setNome("Estudante A");
        estudantea.setId(123);

        Professor profa = new Professor();
        profa.setNome("Professor A");
        profa.setId(45);

        Administrativo admina = new Administrativo();
        admina.setNome("Administrativo A");
        admina.setId(7);

        Estante estantea = new Estante();
        Estante estanteb = new Estante();
        Estante estantec = new Estante();

        estudantea.pedirEmprestimo(livroa);
        estudantea.pedirEmprestimo(livroc);
        estudantea.pedirEmprestimo(livrod);
        
        estudantea.pedirEmprestimo(livroa);

        GUI.mostrarLivrosEmprestados( estudantea.getLivrosEmprestados() );
    }
}