package Usuario;

public class ClientePJ extends Cliente implements IClientePJ {
    private String CNPJ;
    private String dataregistro;

    public ClientePJ(String nome, String CNPJ, String dataregistro, double saldo){
        this.nome = nome;
        this.CNPJ = CNPJ;
        this.dataregistro = dataregistro;
        this.saldo = saldo;
    }

    // Getters e Setters ------------------------------------------
    // CNPJ
    public String getCNPJ(){ return this.CNPJ; }
    public void setCNPJ(String CNPJ){ this.CNPJ=CNPJ; } 

    // Data de Registro
    public String getDataRegistro(){ return this.dataregistro; }
    public void setDataRegistro(String dataregistro){ this.dataregistro=dataregistro; }  
}
