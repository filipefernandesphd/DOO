package Usuario;

import Conta.Conta;

public abstract class Cliente {
    protected Conta conta;
    protected Conta nome;
    protected double saldo;
    private String codigoagencia;
    
    public void setConta(Conta conta) {
        this.conta = conta;
    }
    public Conta getConta() {
        return conta;
    }
    public void setNome(Conta nome) {
        this.nome = nome;
    }
    public Conta getNome() {
        return nome;
    }
    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }
    public double getSaldo() {
        return saldo;
    }

    public void gerarConta(String codigoagencia){
        this.codigoagencia = codigoagencia;
    }
    public Conta obterNumeroConta(Conta conta){
        return conta;
    }
    public String obterNumeroDigito(String digito){
return digito;
    } 


}
