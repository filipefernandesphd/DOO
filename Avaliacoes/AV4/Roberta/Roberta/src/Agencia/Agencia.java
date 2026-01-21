package Agencia;

import java.util.ArrayList;

import Usuario.*;

public class Agencia implements IAgencia {
    private String cidade;
    private String estado;
    private String codigoagencia;

    public Agencia(String cidade, String estado, String codigoagencia) {
        this.cidade = cidade;
        this.estado = estado;
        this.codigoagencia = codigoagencia;
    }

    public String getCidade() {
        return this.cidade;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    public String getEstado() {
        return this.estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public String getCodigoAgencia() {
        return this.codigoagencia;
    }

    public void setCodigoAgencia(String codigoagencia) {
        this.codigoagencia = codigoagencia;
    }

    public ArrayList<Cliente> getClientes() {
        
        return clientes;
        
    }

    public void setCliente(ArrayList<Cliente> clientes){
        Cliente cliente;
        for(Cliente : clientes){
            clientes.add(cliente);
        }
    }

    public void cadastrarCliente(Cliente cliente) {
        this.setCliente(getClientes());
    }

    public void transferencia(Cliente clienteorigem, Double valortransferencia, Cliente clientedestino) {
        clienteorigem.transferenciaParaOutraConta(valortransferencia);
        clientedestino.receberTransferencia(valortransferencia);
    }

}
