public class CursoInterativo extends Curso implements ICurso {
    public void iniciarCurso() {
        System.out.println("Curso interativo iniciado com sucesso!");
    }
    public void concluirCurso() {
        System.out.println("Curso interativo concluído com sucesso!");
    }   

    @Override
    public void exibirConteudo(){
        System.out.println("Este é um curso interativo!");
    }
}
