public class Carro {
    private Motor motor;
    private Porta[] portas;
    private Roda[] rodas;
    private int indicePorta;    // utilizar o método UsarIndicePorta
    private int indiceRoda;     // utilizar o método UsarIndiceRoda
    
    public Carro() {
        portas = new Porta[4];
        rodas = new Roda[4];
        this.indicePorta = 0;
        this.indiceRoda = 0;
    }
    
    private int UsarIndicePorta(){
        return this.indicePorta++;
    }
    
    private int UsarIndiceRoda(){
        return this.indiceRoda++;
    }
    
    public void adicionarMotor(Motor motor){
        this.motor = motor;
    }
    
    public void adicionarPorta(Porta porta){
        this.portas[this.UsarIndicePorta()] = porta;
    }
    
    public void adicionarRoda(Roda roda){
        this.rodas[this.UsarIndiceRoda()] = roda;
    }
    
    public String mostrarInformacoes(){
        String info = "";
        
        info += "PORTAS \n";
        for(Porta porta : this.portas){
            if(porta != null){
                info += porta.getPosicao() + "\n";  
                info += porta.getLado() + "\n"; 
                info += "-------- \n";
            }
        }
        
        info += "\nRODAS\n";
        for(Roda roda : this.rodas){
            if(roda != null){
                info += roda.getAro() + "\n"; 
                info += roda.getPosicao() + "\n";  
                info += roda.getLado() + "\n"; 
                info += "-------- \n";
            }
        }
        
        return info;
    }
}