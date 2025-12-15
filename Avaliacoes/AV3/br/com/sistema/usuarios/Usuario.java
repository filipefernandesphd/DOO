package br.com.sistema.usuarios;

abstract class Usuario<T> {
    protected T identificacao;

    Usuario(T identificacao){
        this.identificacao = identificacao;
    }

    public T getIdentificacao(){
        return this.identificacao;
    }
}
