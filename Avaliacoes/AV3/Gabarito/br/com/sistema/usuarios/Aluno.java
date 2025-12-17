package br.com.sistema.usuarios;

public class Aluno<T> extends Usuario<T>{
    public Aluno(T identificacao){
        super(identificacao);
    }
}
