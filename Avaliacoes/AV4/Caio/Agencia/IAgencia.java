package Agencia;

import java.util.ArrayList;

import Usuario.Cliente;

interface IAgencia {
    // Getters e Setters
    public String getCidade();
    public void setCidade(String cidade);
    public String getEstado();
    public void setEstado(String estado);
    public String getCodigoAgencia();
    public void setCodigoAgencia(String codigoagencia); 
    public ArrayList<Cliente> getClientes();
    public void setCliente(ArrayList<Cliente> clientes);

    /**
     * Vincula cliente à lista de clientes da agência e cria o número da conta
     * A criação da conta depende da implementação do método gerarConta() de cliente
     * @param cliente novo cliente da agência
     */
    public void cadastrarCliente(Cliente cliente);

    /**
     * Realizar transferências entre contas do banco
     * 
     * @param clienteorigem conta de origem que sairá o recurso
     * @param valortransferencia valor que será transferido
     * @param clientedestino conta de destino que receberá o recurso
     */
    public void transferencia(Cliente clienteorigem, Double valortransferencia, Cliente clientedestino); 
}