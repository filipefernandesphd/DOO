public class Aluno {
    private String gmail;
    private int senha;

    public Aluno(String gmail,int senha) {
        this.gmail = gmail;
        this.senha = senha;
    }

    public String getGmail(){
        return gmail;
    }

    public void getIdentificacao(){
            System.out.println(gmail + "\n " + senha);
    }

    public int senha(){
        return senha;
    }
    
    public String setGmail(){
        return gmail;
    }

    public int getSenha(){
        return senha;
    }
}