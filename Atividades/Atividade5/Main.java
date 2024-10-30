public class Main {
    public static void main (String[] args) {
        // Criando um objeto do tipo pessoa 
        Pessoa p1 = new Pessoa();
        p1.setNome("Joao das Couves");
        String nomep1 = p1.getNome();
        System.out.println(nomep1);

        // Criando um objeto do tipo pessoa 
        Pessoa p2 = new Pessoa();
        p2.setNome("Maria das Flores");       
        System.out.println(p2.getNome());

        // Criando objetos do tipo pessoa (foco: pai e mae)
        Pessoa paip1 = new Pessoa();
        Pessoa maep1 = new Pessoa();

        // Atribuindo nome aos pais
        paip1.setNome("Jose das Alfaces");
        maep1.setNome("Rosa Maria");

        // Vinculando os pais de p1
        p1.setPais(paip1, maep1);

        // Perguntando ao p1: Ce é fi di quem?
        p1.getPais();

        // Criando alguns pets
        Pet dog = new Pet();
        dog.setNome("Rambo");
        dog.setRaca("Caramelo");

        Pet cat = new Pet();
        cat.setNome("Tunico");
        cat.setRaca("Frajola");

        Pet spider = new Pet();
        spider.setNome("Peter Parcker");
        spider.setRaca("Viuva Negra");

        // Vinculando os pets aos donos
        p1.setPet(dog);
        p2.setPet(cat);
        p2.setPet(spider);

        System.out.println("\n\n"); // pula 3 linhas

        // Mostrar pets de uma pessoa
        // Exemplo: Fulano possui os seguites pets:
        //  NomePet1
        //  NomePet2
        // ...
        p1.getPets();
        p2.getPets();        
        paip1.getPets();
    }
}