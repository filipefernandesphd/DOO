package Banco;
import java.util.ArrayList;

import Agencia.*;
import Usuario.*;

public final class Banco {
    public static final String NOMEBANCO = "Nova Chance";
    private static ArrayList<Agencia> agencias = new ArrayList<Agencia>();
    private static ArrayList<Cliente> clientes = new ArrayList<Cliente>();

    // Getters e Setters ------------------------------------------
    // Agência
    public static ArrayList<Agencia> getAgencias(){ return agencias; }
    public static void setAgencia(Agencia agencia){ agencias.add(agencia); }
    public static void setAgencia(ArrayList<Agencia> novasagencias){ agencias.addAll(novasagencias); }

    // Cliente
    public static ArrayList<Cliente> getClientes(){ return clientes; }
    public static void setCliente(Cliente cliente){ clientes.add(cliente); }
    public static void setCliente(ArrayList<Cliente> novosclientes){ clientes.addAll(novosclientes); }
}
