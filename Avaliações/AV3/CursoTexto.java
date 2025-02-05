public class CursoTexto extends Curso implements ICurso {
    public void iniciarCurso() {
        System.out.println("Curso em texto iniciado com sucesso!");
    }
    public void concluirCurso() {
        System.out.println("Curso em texto concluído com sucesso!");
    }   

    @Override
    public void exibirConteudo(){
        System.out.println("Este é um curso em texto!");
    }
}
