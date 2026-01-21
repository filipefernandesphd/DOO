package usuario;

public class Cliente implements ICliente{
	String nome;
	double saldo;
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public String getNome() {
		return this.nome;
	}

	public double getSaldo() {
		return this.saldo;
	}
}
