package principal.usuario;

import principal.conta.Conta;

public abstract class Cliente implements ICliente {
	
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
	
	
	
}
