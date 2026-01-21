package Usuario;

public class ClientePJ extends Cliente implements IClientePJ{
    private String CNPJ;
    private String dataregistro;

    public ClientePJ(String nome, String CNPJ, String dataregistro, double saldo) {
        this.nome = nome;
        this.CNPJ = CNPJ;
        this.dataregistro = dataregistro;
        this.saldo = saldo;
    }

    @Override
    public String getCNPJ() {
        return CNPJ;
    }

    @Override
    public void setCNPJ(String CNPJ) {
        this.CNPJ = CNPJ;
    }

    @Override
    public String getDataRegistro() {
        return dataregistro;
    }

    @Override
    public void setDataRegistro(String dataregistro) {
        this.dataregistro = dataregistro;
    }
    
}
