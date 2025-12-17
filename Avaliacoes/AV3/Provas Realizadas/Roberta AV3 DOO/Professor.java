public class Professor<T> extends Usuario{
    private T identificacao;
    public Professor(T identificacao){
        this.identificacao = identificacao;
    }
    public T getIdentificacao(){
        return this.identificacao;
    }
}
