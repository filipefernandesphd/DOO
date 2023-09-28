class Main{
  public static void main(String[] args) {
    Livro livroa = new Livro("Livro A");
    Livro livrob = new Livro("Livro B");
    Livro livroc = new Livro("Livro C");

    Autor autora = new Autor("Autor A");
    Autor autorb = new Autor("Autor B");
    Autor autorc = new Autor("Autor C");

    LivroEscrito livroaescrito = new LivroEscrito(livroa);
    livroaescrito.adicionarAutor(autora);
    livroaescrito.adicionarAutor(autorb);

    Usuario usuarioa = new Usuario();
    Usuario usuariob = new Usuario();

    usuarioa.setNome("Usuário A");
    usuariob.setNome("Usuário B");

    usuarioa.adicionarLivroEmprestado(livroa);
    usuarioa.adicionarLivroEmprestado(livrob);

    usuarioa.devolverLivroEmprestado(livroa);

    for (int i = 0; i < usuarioa.getLivrosEmprestados().size(); i++) {
      Livro livro = usuarioa.getLivrosEmprestados().get(i);
      System.out.println(livro.getTitulo()+" - "+livro.getStatus());
    }

    System.out.println(livroa.getTitulo() +" - "+ livroa.getStatus());

  }
}