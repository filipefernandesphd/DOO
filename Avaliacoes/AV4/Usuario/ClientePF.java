package Usuario;

public class ClientePF extends Cliente implements IClientePF {
    private String CPF;
    private String datanascimento;

    /*
    * Método construtor
    *
    * @param nome nome do cliente
    * @param CPF cpf do cliente
    * @param datanascimento data de nascimento do cliente
    */
    public ClientePF(String nome, String CPF, String datanascimento, double saldo){
        this.nome = nome;
        this.CPF = CPF;
        this.datanascimento = datanascimento;
        this.saldo = saldo;
    }

    // Getters e Setters ------------------------------------------
    // CPF
    public String getCPF(){ return this.CPF; }
    public void setCPF(String CPF){ this.CPF=CPF; } 

    // Data de Nascimento
    public String getDataNascimento(){ return this.datanascimento; }
    public void setDataNascimento(String datanascimento){ this.datanascimento=datanascimento; }   

}
