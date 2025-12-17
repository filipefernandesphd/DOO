public class Professor {
    private String gmail;
    private int senha;

    public Professor(String gmail,int senha) {
        this.gmail = gmail;
        this.senha = senha;
    }
    
    public String setGmail(){
        return gmail;
    }

    public int setSenha(){
        return senha;
    }

    public void getIdentificacao(){
            System.out.println(gmail + "\n " + senha);
    }
}