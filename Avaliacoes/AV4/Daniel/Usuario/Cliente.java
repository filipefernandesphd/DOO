package Usuario;

public abstract class Cliente implements ICliente{
    protected Conta conta;
    protected String nome;
    protected double saldo;

    @Override
    public String getNome() {
        return nome;
    }

    @Override
    public void setNome(String nome) {
        this.nome = nome;
    }

    @Override
    public double getSaldo() {
        return saldo;
    }

    public abstract void gerarConta(String codigoagencia);
    public abstract String obterNumeroConta();
    public abstract String obterNumeroDigito();
    public abstract String obterNumeroContaCompleta();
    public abstract boolean transferenciaParaOutraConta (Double valortransferencia);
    public abstract double receberTransferencia(Double valortransferencia); 
}