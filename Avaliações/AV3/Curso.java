import java.util.ArrayList;

public abstract class Curso {
    protected String nome;
    protected boolean concluido = false;
    protected boolean comCertificado = false;
    protected String codigoPromocional;
    protected ArrayList<Aluno> alunos = new ArrayList<Aluno>();

    // GET AND SET -----------
    public String getNome() { return this.nome ;}
    public void setNome(String valor) { this.nome = valor; }

    public boolean getConcluido() { return this.concluido ;}
    public void setConcluido(boolean valor) { this.concluido = valor; }

    public String getCodigoPromocional() { return this.codigoPromocional ;}
    public void setCodigoPromocional(String valor) { this.codigoPromocional = valor; }

    public boolean getComCertificado() { return this.comCertificado ;}
    public void setComCertificado(boolean valor) { this.comCertificado = valor; }

    public ArrayList<Aluno> getAlunos() { return this.alunos ;}
    public void setAlunos(Aluno aluno) { this.alunos.add(aluno); }
    // END GET AND SET -----------

    // METHODS -----------
    // Método para verificar se um aluno está inscrito no curso
    protected void verificarInscricaoAluno(Aluno aluno) throws Exception {
        for (Aluno a : alunos) {
            if(a == aluno){
                throw new Exception(a.getNome() + " já está inscrito neste curso!");
            }
        }
    }

    protected void inscreverAluno(Aluno aluno) throws Exception {
        this.verificarInscricaoAluno(aluno);

        alunos.add(aluno);
        System.out.println(aluno.getNome() + " inscrito em " + this.nome);
    }

    protected void inscreverAluno(Aluno aluno, boolean comCertificado) throws Exception {
        this.verificarInscricaoAluno(aluno);

        alunos.add(aluno);
        this.comCertificado = comCertificado;
        
        if(this.comCertificado){
            System.out.println(aluno.getNome() + " inscrito em "+ this.nome +" com certificado.");
        }else{
            System.out.println(aluno.getNome() + " inscrito em "+ this.nome +" sem certificado.");
        }
    }

    protected void inscreverAluno(Aluno aluno, String codigoPromocional) throws Exception {
        this.verificarInscricaoAluno(aluno);

        alunos.add(aluno);
        this.codigoPromocional = codigoPromocional;
        System.out.println(aluno.getNome() + " inscrito em "+ this.nome +" com código promocional " + this.codigoPromocional);
    }

    protected abstract void exibirConteudo();

    // END METHODS -----------
}
