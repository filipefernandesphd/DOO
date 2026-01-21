package Banco;
import java.util.ArrayList;
import Agencia.*;
import Usuario.*;
public final class Banco {
    public final String NOMEBANCO = "Nova Chance";
    private static ArrayList<Agencia> agencias = new ArrayList<Agencia>();
    private static ArrayList<Cliente> clientes = new ArrayList<Cliente>();

    public static Agencia getAgencias(){
        for (Agencia: agencias)
            return agencias;
        
    }
    public static void setAgencias(Agencia agencia){
        agencias.add(agencia);
    }
    public static void setAgencias(ArrayList<Agencia> novasagencias ){
        novasagencias.addAll(agencias);
    }
    public static Cliente getClientes(){
        for (Cliente: clientes)
            return clientes;
    }
    public static void setClientes(Cliente cliente){
        clientes.add(cliente);
    }
    public static void setAgencias(ArrayList<Cliente> novosclientes ){
        novosclientes.addAll(clientes);
    }
}
