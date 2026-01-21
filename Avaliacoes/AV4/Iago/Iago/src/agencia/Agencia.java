package agencia;

import java.util.ArrayList;

import usuario.Cliente;

public class Agencia implements IAgencia{
	private String cidade;
	private String estado;
	private String codigoagencia;
	private static ArrayList<Cliente> clientes[];
	
	public Agencia(String cidade, String estado, String codigoagencia) {
	this.cidade = cidade;
	this.estado = estado;
	this.codigoagencia = codigoagencia;
	}

	public String getCidade() {
		return cidade;
	}

	public void setCidade(String cidade) {
		this.cidade = cidade;
	}

	public String getEstado() {
		return estado;
	}

	public void setEstado(String estado) {
		this.estado = estado;
	}

	public String getCodigoagencia() {
		return codigoagencia;
	}

	public void setCodigoagencia(String codigoagencia) {
		this.codigoagencia = codigoagencia;
	}

	public static ArrayList<Cliente>[] getClientes() {
		return clientes;
	}

	public static void setClientes(ArrayList<Cliente>[] clientes) {
		Agencia.clientes = clientes;
	}
	
	public void cadastrarCliente(Cliente cliente) {
		this.clientes.add(cliente);
		cliente.gerarConta();
	}
	
	public void transferencia(Cliente clienteorigem, double valortransferencia, Cliente clientedestino) {
		
	}
}
