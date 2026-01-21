package Usuario;

public class ClientePF extends Cliente implements IClientePF{
    private String CPF;
    private String datanascimento;

    public ClientePF(String nome, String CPF, String datanascimento, double saldo) {
        this.nome = nome;
        this.CPF = CPF;
        this.datanascimento = datanascimento;
        this.saldo = saldo;
    }

    @Override
    public String getCPF() {
        return CPF;
    }

    @Override
    public void setCPF(String CPF) {
        this.CPF = CPF;
    }

    @Override
    public String getDataNascimento() {
        return datanascimento;
    }

    @Override
    public void setDataNascimento(String datanascimento) {
        this.datanascimento = datanascimento;
    }

    @Override
    public void gerarConta(String codigoagencia) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public String obterNumeroConta() {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public String obterNumeroDigito() {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public String obterNumeroContaCompleta() {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public boolean transferenciaParaOutraConta(Double valortransferencia) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public double receberTransferencia(Double valortransferencia) {
        throw new UnsupportedOperationException("Not supported yet.");
    }
}