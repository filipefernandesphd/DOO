public class Carro extends Veiculo {
    private int numPortas;
    private double capacidadePortaMalas;

    // GET E SET numPortas
    public int getNumPortas(){return this.numPortas;}
    public void setNumPortas(int valor){this.numPortas = valor;}

    // GET E SET capacidadePortaMalas
    public double getCapacidadePortaMalas(){return this.capacidadePortaMalas;}
    public void setCapacidadePortaMalas(double valor){this.capacidadePortaMalas = valor;}

    @Override
    public void mostrarInformacoes() throws Exception {
        if(this.numPortas == 0){
            throw new Exception("O número de portas do carro deve ser informado!\n");
        }

        if(this.capacidadePortaMalas == 0.0){
            throw new Exception("A capacidade do porta malas do carro deve ser informada!\n");
        }

        if(this.marca.isEmpty() || this.modelo.isEmpty() || this.anoFabricacao == 0 || this.quilometragem == 0){
            throw new Exception("As informacoes basicas do carro (marca, modelo, ano e km) devem ser cadastrados!\n");
        }

        System.out.println("INFORMAÇÕES");
        System.out.print("Marca/Modelo: "+this.marca+" ");
        System.out.println(this.modelo);
        System.out.println("Ano de fabricação: "+this.anoFabricacao);
        System.out.println("KM: "+this.quilometragem);
        System.out.println("N° de portas: "+this.numPortas);
        System.out.println("Capacidade do Porta Malas: "+this.capacidadePortaMalas);
        System.out.println("");
    }
}
