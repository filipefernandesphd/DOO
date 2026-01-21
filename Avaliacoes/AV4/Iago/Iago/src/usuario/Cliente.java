package usuario;

import conta.*;


public abstract class Cliente implements ICliente{
	protected Conta conta;
	protected String nome;
	protected double saldo;
	
	
	public Conta getConta() {
		return conta;
	}
	public void setConta(Conta conta) {
		this.conta = conta;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public double getSaldo() {
		return saldo;
	}
	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}
	
	public void gerarConta(String codigoagencia) {
		this.conta = new Conta(codigoagencia);
	}
	
	public String obterNumeroConta() {
		return conta.getConta();
	}
	public int obterDigitoConta() {
		return conta.getDigito();
	}
	public void obterNumeroContaCompleta() {
		conta.getConta();
		conta.getDigito();
	}
	public void transferenciaParaOutraConta(Double valortransferencia) {
		
	}
	
	public void receberTransfernecia(double valortransferencia) {
		
	}
}
