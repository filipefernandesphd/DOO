public class FrotaVeiculos {
    public static void main(String[] args) {
        Carro c1 = new Carro();
        Moto m1 = new Moto();
        Caminhao cm1 = new Caminhao();

        c1.cadastrarVeiculo("Volks", "Polo" , 2025, 0);
        c1.setNumPortas(4);

        m1.cadastrarVeiculo("Honda", "Biz");
        cm1.cadastrarVeiculo("Volvo", "FH 540 6x4", 255230.0);

        System.err.println("");

        try {
            c1.mostrarInformacoes();
        } catch (Exception e) {
            System.err.println(e.getMessage());
        }

        try {
            m1.mostrarInformacoes();
        } catch (Exception e) {
            System.err.println(e.getMessage());
        }

        try {
            cm1.mostrarInformacoes();
        } catch (Exception e) {
            System.err.println(e.getMessage());
        } 
    }
}
