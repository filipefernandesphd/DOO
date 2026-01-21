package principal.banco;

import java.util.ArrayList;

import principal.agencia.Agencia;
import principal.usuario.Cliente;

public final class Banco {
	public static final String nomebanco = "Nova Chance";
	private static ArrayList<Agencia> agencias;
	private static ArrayList<Cliente> cliente;
	
	
	
	public static ArrayList<Agencia> getAgencias() {
		return agencias;
	}
	
	public static void setAgencia(Agencia agencia ) {
		agencias.add(agencia);
		
	}
	public static void setAgencia(ArrayList<Agencia> agencias) {
		agencias.addAll(agencias) ;
	}

	

	public static ArrayList<Cliente> getCliente() {
		return cliente;
	}
	public static void setCliente(ArrayList<Cliente> cliente) {
		agencias.addAll(agencias);
	}
	public static String getNomebanco() {
		return nomebanco;
	}
	
	
}
