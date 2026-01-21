package Agencia;

import java.util.ArrayList;
import Usuario.*;

public class Agencia {
    private String cidade;
    private String estado;
    private String codigoagencia;    // quatro dígitos
    private ArrayList<Cliente> clientes = new ArrayList<Cliente>();

    /*
    * Método construtor
    *
    * @param cidade a cidade que a agência atende
    * @param estado da cidade em que a agência está
    * @param codigoagencia o código da agência
    */
    public Agencia(String cidade, String estado, String codigoagencia){
        this.cidade = cidade;
        this.estado = estado;
        this.codigoagencia = codigoagencia;
    }

    // Getters e Setters ------------------------------------------
    // Cidade
    public String getCidade(){ return this.cidade; }
    public void setCidade(String cidade){ this.cidade=cidade; } 

    // Estado 
    public String getEstado(){ return this.estado; }
    public void setEstado(String estado){ this.estado=estado; } 

    // Código agência 
    public String getCodigoAgencia(){ return this.codigoagencia; }
    public void setCodigoAgencia(String codigoagencia){ this.codigoagencia=codigoagencia; } 

    // Clientes
    public ArrayList<Cliente> getClientes(){ return this.clientes; }
    public void setCliente(ArrayList<Cliente> clientes){ this.clientes=clientes; } 


    // Métodos públicos ------------------------------------------
    /**
     * Vincula cliente à lista de clientes da agência e cria o número da conta
     * A criação da conta depende da implementação do método gerarConta() de cliente
     * @param cliente novo cliente da agência
     */
    public void cadastrarCliente(Cliente cliente){
        cliente.gerarConta(this.codigoagencia);
        this.clientes.add(cliente);
    }

    /**
     * Realizar transferências entre contas do banco
     * 
     * @param clienteorigem conta de origem que sairá o recurso
     * @param valortransferencia valor que será transferido
     * @param clientedestino conta de destino que receberá o recurso
     */
    public void transferencia(Cliente clienteorigem, Double valortransferencia, Cliente clientedestino){
        clienteorigem.transferenciaParaOutraConta(valortransferencia);
        clientedestino.receberTransferencia(valortransferencia);
    }
}
