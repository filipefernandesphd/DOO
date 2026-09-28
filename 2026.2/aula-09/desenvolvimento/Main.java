public class Main {
    public static void main (String[] args) {
        Carro carro = new Carro();
        
        carro.adicionarMotor(new Motor("híbrido"));

        carro.adicionarPorta( new Porta("dianteira", "direita") );
        carro.adicionarPorta( new Porta("dianteira", "esquerda") );
        carro.adicionarPorta( new Porta("traseira", "direita") );
        carro.adicionarPorta( new Porta("traseira", "esquerda") );
        
        carro.adicionarRoda( new Roda(16, "dianteira", "direita") );
        carro.adicionarRoda( new Roda(16, "dianteira", "esquerda") );
        carro.adicionarRoda( new Roda(16, "traseira", "direita") );
        carro.adicionarRoda( new Roda(16, "traseira", "esquerda") );
        
        System.out.println(carro.mostrarInformacoes());
    }
}