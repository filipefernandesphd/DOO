import java.util.ArrayList;

public class Main{
    public static void main(String[] args) {
        // Instancia estante
        Estante estantea = new Estante("Estante A", 3);
        Estante estanteb = new Estante("Estante B", 10);
        Estante estantec = new Estante("Estante C", 5);

        // Instancia livros
        Livro livroa = new Livro();
        Livro livrob = new Livro();
        Livro livroc = new Livro();
        Livro livrod = new Livro();
        Livro livroe = new Livro();
        Livro livrof = new Livro();
        Livro livrog = new Livro();
        Livro livroh = new Livro();
        Livro livroi = new Livro();

        livroa.setNome("Livro A");
        livrob.setNome("Livro B");
        livroc.setNome("Livro C");
        livrod.setNome("Livro D");
        livroe.setNome("Livro E");
        livrof.setNome("Livro F");
        livrog.setNome("Livro G");
        livroh.setNome("Livro H");
        livroi.setNome("Livro I");

        livroa.setAutor("Autor A");
        livrob.setAutor("Autor B");
        livroc.setAutor("Autor C");
        livrod.setAutor("Autor D");
        livroe.setAutor("Autor E");
        livrof.setAutor("Autor F");
        livrog.setAutor("Autor G");
        livroh.setAutor("Autor H");
        livroi.setAutor("Autor I");

        livroa.setIsbn("123456789");
        livrob.setIsbn("456789123");
        livroc.setIsbn("001231458");
        livrod.setIsbn("124585484");
        livroe.setIsbn("111111111");
        livrof.setIsbn("222222222");
        livrog.setIsbn("333333333");
        livroh.setIsbn("444444444");
        livroi.setIsbn("555555555");

        System.out.println("--------------------\nAlocando Livros às Estantes\n--------------------");

        livroa.guardarNaEstante(estantea);
        livrob.guardarNaEstante(estantea);
        livroc.guardarNaEstante(estantea);
        livrod.guardarNaEstante(estantea);

        livrod.guardarNaEstante(estanteb);
        livroe.guardarNaEstante(estanteb);
        livrof.guardarNaEstante(estanteb);
        livrog.guardarNaEstante(estanteb);
       
        livroh.guardarNaEstante(estantec);
        livroi.guardarNaEstante(estantec);

        // Instancia estudante
        Estudante estudantea = new Estudante();
        estudantea.setNome("Estudante A");
        estudantea.setId(123);

        // Instancia professor
        Professor profa = new Professor();
        profa.setNome("Professor A");
        profa.setId(45);
        
        // Instancia administrativo
        Administrativo admina = new Administrativo();
        admina.setNome("Administrativo A");
        admina.setId(7);

        // Armazena usuários em uma lista
        ArrayList<Usuario> usuarios = new ArrayList<Usuario>();
        usuarios.add(estudantea);
        usuarios.add(profa);
        usuarios.add(admina);

        // Instancia o objeto que controlará os empréstimos
        ControleEmprestimo controleemprestimo = new ControleEmprestimo();

        
        // Realização de empréstimos
        System.out.println("--------------------\nRealização de Empréstimos\n--------------------");        
        controleemprestimo.realizarEmprestimo(estudantea, livroa);
        controleemprestimo.realizarEmprestimo(estudantea, livrob);
        controleemprestimo.realizarEmprestimo(estudantea, livroc);
        controleemprestimo.realizarEmprestimo(estudantea, livrod);
        controleemprestimo.realizarEmprestimo(profa, livrod);
        controleemprestimo.realizarEmprestimo(profa, livroa);
        controleemprestimo.realizarEmprestimo(profa, livrof);
        controleemprestimo.realizarEmprestimo(profa, livrog);
        controleemprestimo.realizarEmprestimo(profa, livroh);
        controleemprestimo.realizarEmprestimo(profa, livroi);


         // Lista de Espera
        System.out.println("--------------------\nLista de Espera\n--------------------");
        controleemprestimo.addLivroNaListaDeEspera(profa, livroa);


        // Devolução de livros
        System.out.println("--------------------\nDevolução de Livros\n--------------------");
        controleemprestimo.devolverLivro(estudantea, livroa);


        // Retirar livros das estantes
        System.out.println("--------------------\nRetirar Livros das Estantes\n--------------------");
        livroa.retirarDaEstante();


        // Retirar livros das estantes
        System.out.println("--------------------\nRealocar Livros às Estantes\n--------------------");
        livroa.moverParaEstante(estantec);
        

        // --------------------
        // Metódos para mostrar dados no console
        // --------------------
        System.out.println("--------------------\nRELATÓRIO GERAL\n--------------------");
        
        GUI.mostrarLivrosEmprestados(controleemprestimo.getLivrosEmprestados());
        
        GUI.mostrarUsuariosComLivrosEmprestados(usuarios);
        
        GUI.mostrarLivrosDaEstante(estantea);
        GUI.mostrarLivrosDaEstante(estanteb);
        GUI.mostrarLivrosDaEstante(estantec);
    }
}