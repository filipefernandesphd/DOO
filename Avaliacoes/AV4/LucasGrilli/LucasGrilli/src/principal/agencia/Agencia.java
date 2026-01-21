package principal.agencia;

import java.util.ArrayList;

import principal.banco.Banco;
import principal.usuario.Cliente;

public class Agencia implements IAgencia{
	
	private String cidade;
	private String estado;
	private String codigoagencia;
	private ArrayList<Cliente> clientes;
	
	

	public Agencia(String cidade, String estado, String codigoagencia) {
		this.cidade = cidade;
		this.estado = estado;
		this.codigoagencia = codigoagencia;
	}

	@Override
	public String getCidade() {
		
		return this.cidade;
	}

	@Override
	public void setCidade(String cidade) {
		this.cidade = cidade;
		
	}

	@Override
	public String getEstado() {
		
		return this.estado;
	}

	@Override
	public void setEstado(String estado) {
		this.estado = estado;
		
	}

	@Override
	public String getCodigoAgencia() {
	
		return this.codigoagencia;
	}

	@Override
	public void setCodigoAgencia(String codigoagencia) {
		this.codigoagencia = codigoagencia;
		
	}
	public ArrayList<Cliente> getClientes() {
		// TODO Auto-generated method stub
		return this.clientes;
	}

	@Override
	public void setCliente(ArrayList<Cliente> clientes) {
		Banco.setCliente(clientes);
		
	}
	

	@Override
	public void cadastrarCliente(Cliente cliente) {
		this.clientes.add(cliente);
		
	}

	@Override
	public void transferencia(Cliente clienteorigem, Double valortransferencia, Cliente clientedestino) {
		// TODO Auto-generated method stub
		
	}



}
