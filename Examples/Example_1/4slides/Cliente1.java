class Cliente{
  public static void main(String[] args) {
    // Instanciação do clube do livro
    ClubeLivro clubelivro = new ClubeLivro("Amantes da Leitura");
    // Instanciação de membros
    Membro membro1 = new Membro("José das Couves");
    Membro membro2 = new Membro("Maria da Silva");
    // Instanciação de livros
    Livro livroa = new Livro("Livro A");
    Livro livrob = new Livro("Livro B");
    Livro livroc = new Livro("Livro C");
    // Adiciona membros ao clube
    clubelivro.addMembro(membro1);
    clubelivro.addMembro(membro2);
    // Adiciona livros ao clube
    clubelivro.addLivro(livroa);
    clubelivro.addLivro(livrob);
    clubelivro.addLivro(livroc);