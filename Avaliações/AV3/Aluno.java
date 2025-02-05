public class Aluno extends Usuario {

    public void acessarCurso(Curso curso) throws Exception {
        boolean acessoPermitido = true;

        for (Aluno aluno : curso.getAlunos()) {
            if( this != aluno ){
                acessoPermitido = false;
            }
        }

        if(!acessoPermitido) {
            throw new Exception(this.getNome() + ", você não tem acesso ao " + curso.getNome());
        }

        curso.exibirConteudo();
    }
}
