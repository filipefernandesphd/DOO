
import java.util.ArrayList;

import Usuario.Cliente;

public final class Banco {
    public static final String NOMEBANCO = "Nova Chance";
    private static ArrayList<Agencia> agencias;
    private static ArrayList<Cliente> clientes;

    public ArrayList<Agencia> getAgencias() {
        return agencias;
    }
    public void setAgencia(Agencia agencia) {
        this.agencias = agencia;
    }

    public void setAgencia(ArrayList<Agencia> novasagencias) {
        agencias.addAll(novasagencias);
    }

    public ArrayList<Cliente> getClientes() {
        return clientes;
    }
    public void setCliente(Cliente cliente) {
        this.clientes = cliente;
    }

    public void setCliente(ArrayList<Cliente> novosclientes) {
        clientes.addAll(novosclientes);
    }
}
