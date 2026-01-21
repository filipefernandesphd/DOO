package Banco;
import java.util.ArrayList;

public final class Banco {
    public static final String NOMEBANCO = "Nova Chance";

    private static String Agencia;
    private static String Cliente;

    private static ArrayList<String>agencia = new ArrayList<String>();

    public static void setAgencia(String agencia) {
        Agencia = agencia;
    }

    public static String getAgencia() {
        return Agencia;
    }

    public static <Cliente> void setCliente(ArrayList<Cliente> novoclientes) {
       
    }

    public static String getCliente() {
        return Cliente;
    }

    public static String getNomebanco() {
        return NOMEBANCO;
    }
    
}   
