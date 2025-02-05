# ENUNCIADO DA AV3

## Classes Abstratas:
- Crie uma classe abstrata chamada `Usuario`, com atributos comuns como `nome`, `email` e `id`.
- Implemente as seguintes subclasses que herdam de Usuario:
    - `Aluno`
    - `Instrutor`
    - `Administrador`

## Interfaces:
- Crie uma interface chamada ICurso com os métodos:
    - `void iniciarCurso()`
    - `void concluirCurso()`
- As classes que representam cursos devem implementar essa interface.

## Sobrecarga de Métodos:
- Implemente métodos sobrecarregados na classe Curso para inscrição de alunos:
    - `inscreverAluno(Aluno aluno)`
    - `inscreverAluno(Aluno aluno, boolean comCertificado)`
    - `inscreverAluno(Aluno aluno, String codigoPromocional)`

## Sobrescrita de Métodos:
- Crie uma classe base chamada `Curso` e as subclasses:
    - `CursoVideo`
    - `CursoTexto`
    - `CursoInterativo`
- Cada uma dessas subclasses deve sobrescrever o método exibirConteudo() de forma específica para o tipo de curso.

## Tratamento de Exceções:
- Implemente tratamento de exceções para as seguintes situações:
    - Tentativa de inscrição em um curso já concluído.
    - Acesso a um curso por um usuário não autorizado.
    - ~~Erros na criação de cursos com dados inválidos.~~ **(ANULADA!)**
