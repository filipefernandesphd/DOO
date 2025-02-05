public class CursoVideo extends Curso implements ICurso {
    // METHODS -----------
    public void iniciarCurso(){
        System.out.println("Curso em vídeo iniciado com sucesso!");
    }

    public void concluirCurso()  {
        this.concluido = true;
        System.out.println("Curso em vídeo concluído com sucesso!");
    }   

    @Override
    public void exibirConteudo() {
        System.out.println("Este é um curso em vídeo!");
    }
    // END METHODS -----------
}
