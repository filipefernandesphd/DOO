package Usuario;

import Conta.Conta;

public abstract class Cliente implements ICliente{
    protected Conta conta;
    protected String nome;
    protected double saldo;

    public Conta getConta(){
        return this.conta;
    }
    public void setConta(Conta conta){
        this.conta = conta;
    }
    public String getNome(){
        return this.nome;
    }
    public void setNome(String nome){
        this.nome = nome;
    }
    public double getSaldo(){
        return this.saldo;
    }
    public void setSaldo(double saldo){
        this.saldo = saldo;
    }
    public void gerarConta(String codigoagencia){
        conta.setCodigoAgencia(codigoagencia);
    }
    public String obterNumeroConta(){
        return conta.getConta();
    }
    public int obterNumeroDigito(){
        return conta.getDigito();
    }
    public String obterNumeroContaCompleta(){
        String mensagem = "Número da Conta: " + this.obterNumeroConta() + " Dígito Verificador: " + this.obterNumeroDigito();
        return mensagem;
    }
    public void transferenciaParaOutraConta(Double valortransferencia){
        this.saldo = this.saldo - valortransferencia;
    }
    public void receberTransferencia(Double valortransferencia){
        this.saldo = this.saldo + valortransferencia;
    }
}
