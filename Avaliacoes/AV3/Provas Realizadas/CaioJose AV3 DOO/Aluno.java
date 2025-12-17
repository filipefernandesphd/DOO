public class Aluno extends Usuarios{
    private String aluno;

    @Override
    public void getIdentificacao(String aluno){
        System.out.println(this.getAluno());
    }



    public String getAluno() {
        return aluno;
    }
    public void setAluno(String aluno) {
        this.aluno = aluno;
    }
    

    
}
