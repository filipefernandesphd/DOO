class Carro {
    String modelo;
    int ano;
    Roda[] rodas = new Roda[4];

    String getModelo() { return this.modelo; }
    void setModelo(String modelo) { this.modelo = modelo; }
    
    int getAno() { return this.ano; }
    void setAno(int valorAno) { this.ano = valorAno; }
    
    void setRodas(Roda roda1, Roda roda2, Roda roda3, Roda roda4) {
        this.rodas[0] = roda1;
        this.rodas[1] = roda2;
        this.rodas[2] = roda3;
        this.rodas[3] = roda4;
    }

    Roda[] getRodas() { return this.rodas; }
}