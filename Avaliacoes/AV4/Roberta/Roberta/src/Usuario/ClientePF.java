package Usuario;

public class ClientePF extends Cliente implements IClientePF{
    private String CPF;
    private String datanascimento;
    
    public ClientePF(String nome, String CPF, String datanascimento, double saldo){
        this.nome = nome;
        this.CPF = CPF;
        this.datanascimento = datanascimento;
        this.saldo = saldo;
    }
    public String getCPF(){
        return this.CPF;
    }

    public void setCPF(String CPF){
        this.CPF = CPF;
    }

    public String getDataNascimento(){
        return this.datanascimento;
    }

    public void setDataNascimento(String datanascimento){
        this.datanascimento = datanascimento;
    }
}
