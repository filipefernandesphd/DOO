public abstract class Usuario<T> {
    protected T identificacao;
    
    T getIdentificacao() {
    return this.identificacao;
    }

    void setIdentificacao(T identific) {
        this.identificacao = identific;
    }

    void exibirInfo() {
        System.out.println(getIdentificacao());
    }
}