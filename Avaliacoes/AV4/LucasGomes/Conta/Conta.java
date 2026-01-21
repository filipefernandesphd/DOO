package Conta;

public class Conta implements IConta {
    private String codigoagencia;
    private String conta;
    private String digito;

    public void codigo(String codigoagencia){
        this.codigoagencia = codigoagencia;
    }

    public void setCodigoagencia(String codigoagencia) {
        this.codigoagencia = codigoagencia;
    }
    public String getCodigoagencia() {
        return codigoagencia;
    }
    public void setConta(String conta) {
        this.conta = conta;
    }
    public String getConta() {
        return conta;
    }
    public void setDigito(int digito) {
        this.digito = digito;
    }
    public String getDigito() {
        return digito;
    }

    private void gerarConta(){
        String  prefixo = this.codigoagencia.substring(0,2);

        long t = System.currentTimeMillis();

        long misturado = t ^ (t  >>> 16);

        int sufixoNumerico = (int) (Math.abs(misturado) % 1000);

        String sufixo = String.format("%03d", sufixoNumerico);

        this.conta = prefixo + prefixo;

        this.digito = (String) (Math.random() * 10);
    }

    
    }
