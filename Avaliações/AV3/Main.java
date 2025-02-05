public class Main {
    public static void main(String[] args) {
        // Instâncias de alunos
        Aluno aluno1 = new Aluno();
        aluno1.setId(1);
        aluno1.setNome("Aluno 1");
        aluno1.setEmail("aluno1@gmail.com");

        Aluno aluno2 = new Aluno();
        aluno2.setId(2);
        aluno2.setNome("Aluno 2");
        aluno2.setEmail("aluno2@gmail.com");

        Aluno aluno3 = new Aluno();
        aluno3.setId(3);
        aluno3.setNome("Aluno 3");
        aluno3.setEmail("aluno3@gmail.com");

        // Instâncias de cursos
        CursoVideo cv1 = new CursoVideo();
        cv1.setNome("Curso Vídeo 1");

        CursoTexto ct1 = new CursoTexto();
        ct1.setNome("Curso Texto 1");

        CursoInterativo ci1 = new CursoInterativo();
        ci1.setNome("Curso Interativo 1");

        // Inscrição de alunos em cursos
        try {
            cv1.inscreverAluno(aluno1);
            ct1.inscreverAluno(aluno2, "DOO50");
            ci1.inscreverAluno(aluno3, true);
        } catch (Exception e) {
            System.err.println(e.getMessage());
        }

        System.out.println("");

        // Conclusão dos cursos
        cv1.concluirCurso();
        ct1.concluirCurso();
        ci1.concluirCurso();

        System.out.println("");

        // Tentativa de aluno1 se inscrever em um curso já concluído
        try {
            cv1.inscreverAluno(aluno1);
        } catch (Exception e) {
            System.err.println(e.getMessage());
        }

        System.out.println("");

        // Aluno acessar a um curso
        try {
            aluno1.acessarCurso(cv1);
            aluno2.acessarCurso(ci1);
        } catch (Exception e) {
            System.err.println(e.getMessage());
        }

    }
}
