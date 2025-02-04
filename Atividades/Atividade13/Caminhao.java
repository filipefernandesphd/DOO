public class Caminhao extends Veiculo {
    private double capacidadeCarga;
    private int eixos;

    // GET E SET capacidadeCarga
    public double getCapacidadeCarga(){return this.capacidadeCarga;}
    public void setCapacidadeCarga(double valor){this.capacidadeCarga = valor;}

    // GET E SET eixo
    public int getEixos(){return this.eixos;}
    public void setEixos(int valor){this.eixos = valor;}

    @Override
    public void mostrarInformacoes() throws Exception {
        if(this.capacidadeCarga == 0.0){
            throw new Exception("A capacidade total da carga do caminhao deve ser informada!\n");
        }

        if(this.eixos == 0){
            throw new Exception("O numero de eixos do caminhao deve ser informado!\n");
        }

        if(this.marca.isEmpty() || this.modelo.isEmpty() || this.anoFabricacao == 0 || this.quilometragem == 0){
            throw new Exception("As informacoes basicas do caminhado (marca, modelo, ano e km) devem ser cadastrados!\n");
        }
        
        System.out.println("INFORMAÇÕES");
        System.out.print("Marca/Modelo: "+this.marca+" ");
        System.out.println(this.modelo);
        System.out.println("Ano de fabricação: "+this.anoFabricacao);
        System.out.println("KM: "+this.quilometragem);
        System.out.println("Capacidade de Carga: "+this.capacidadeCarga);
        System.out.println("Nº de Eixos: "+this.eixos);
        System.out.println("");
    }
}
