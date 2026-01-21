package banco;
import java.util.ArrayList;

import agencia.*;
import usuario.*;

public final class Banco {
	public static final String NOMEBANCO = "Nova chance";
	private static ArrayList<Agencia> agencias[];
	private static ArrayList<Cliente> clientes[];
	
	public static void setAgencia(Agencia agencia) {
		Banco.agencias.add(agencia);
	}
	public static ArrayList<Agencia> getAgencias() {
		return agencias;
	}
	public static void setAgencias(ArrayList<Agencia>[] novasagencias) {
		Banco.agencias.addAll(novasagencias);
	}
	public static ArrayList<Cliente> getClientes() {
		return clientes;
	}
	public static void setClientes(ArrayList<Cliente>[] clientes) {
		Banco.clientes.addAll(clientes);
	}
	
	public static void setCliente(Cliente cliente) {
		Banco.clientes.add(cliente);
	}
}
