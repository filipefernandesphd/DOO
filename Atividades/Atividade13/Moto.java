public class Moto extends Veiculo {
    private int cilindradas;

    // GET E SET cilindradas
    public int getCilindradas(){return this.cilindradas;}
    public void setCilindradas(int valor){this.cilindradas = valor;}

    @Override
    public void mostrarInformacoes() throws Exception {
        if(this.cilindradas == 0){
            throw new Exception("O número de cilindradas da moto deve ser informado!\n");
        }

        if(this.marca.isEmpty() || this.modelo.isEmpty() || this.anoFabricacao == 0 || this.quilometragem == 0){
            throw new Exception("As informacoes basicas da moto (marca, modelo, ano e km) devem ser cadastrados!\n");
        }

        System.out.println("INFORMAÇÕES");
        System.out.print("Marca/Modelo: "+this.marca+" ");
        System.out.println(this.modelo);
        System.out.println("Ano de fabricação: "+this.anoFabricacao);
        System.out.println("KM: "+this.quilometragem);
        System.out.println("Cilindradas: "+this.cilindradas);
        System.out.println("");
    }
}
