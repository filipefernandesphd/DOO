public class Aluno<T> extends Usuario{
    private T identificacao;
    public Aluno(T identificacao){
        this.identificacao = identificacao;
    }
    public T getIdentificacao(){
        return this.identificacao;
    }
}
