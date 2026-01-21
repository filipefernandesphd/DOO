package Agencia;

import java.util.ArrayList;

import Usuario.Cliente;

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
        return cidade;
    }

    @Override
    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    @Override
    public String getEstado() {
        return estado;
    }

    @Override
    public void setEstado(String estado) {
        this.estado = estado;
    }

    @Override
    public String getCodigoAgencia() {
        return codigoagencia;
    }

    @Override
    public void setCodigoAgencia(String codigoagencia) {
        this.codigoagencia = codigoagencia;
    }

    @Override
    public ArrayList<Object> getClientes() {
        //return ;
    }

    //Depende de conta
    @Override
    public void setCliente(ArrayList<Object> clientes) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public void cadastrarCliente(Object cliente) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public void transferencia(Object clienteorigem, Double valortransferencia, Object clientedestino) {
    }
    
}
