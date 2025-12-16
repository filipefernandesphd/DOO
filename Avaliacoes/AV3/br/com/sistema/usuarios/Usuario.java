package br.com.sistema.usuarios;

public abstract class Usuario<T> {
    protected T identificacao;

    public Usuario(T identificacao){
        this.identificacao = identificacao;
    }

    public T getIdentificacao(){
        return this.identificacao;
    }
}
