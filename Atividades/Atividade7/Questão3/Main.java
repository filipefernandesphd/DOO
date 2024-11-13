

class Main {
    public static void main(String[] args) {
        Roda roda1 = new Roda();
        Roda roda2 = new Roda();
        Roda roda3 = new Roda();
        Roda roda4 = new Roda();

        roda1.setAro(20);
        roda1.setModelo("Liga leve");

        roda2.setAro(20);
        roda2.setModelo("Titanio");

        roda3.setAro(17);
        roda3.setModelo("Titanio");

        roda4.setAro(17);
        roda4.setModelo("Liga leve ");

        Carro carro1 = new Carro();

        carro1.setRodas(roda1, roda2, roda3, roda4);

        Roda[] rodasCarro1 = carro1.getRodas();
    
        mostrarRodasNoTerminal(rodasCarro1);
    }

    static void mostrarRodasNoTerminal(Roda[] rodas) {
        for (Roda roda : rodas) {
            System.out.println(roda.getModelo() + " aro " + roda.getAro());
        }       
    }
}