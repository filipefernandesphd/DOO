package Conta;

public class Conta implements IConta {
    private String codigoagencia;
    private String conta;
    private int digito;

    public Conta(String codigoagencia) {
        this.codigoagencia = codigoagencia;
    }

    public String getCodigoAgencia() {
        return this.codigoagencia;
    }

    public void setCodigoAgencia(String codigoagencia) {
        this.codigoagencia = codigoagencia;
    }

    public String getConta() {
        return this.conta;
    }

    public void setConta(String conta) {
        this.conta = conta;
    }

    public int getDigito() {
        return this.digito;
    }

    public void setDigito(int digito) {
        this.digito = digito;
    }

    private void gerarConta() {
        // Dois primeiros dígitos da agência
        String prefixo = this.codigoagencia.substring(0, 2);
        // Timestamp atual
        long t = System.currentTimeMillis();
        // Redução matemática do timestamp para 0..999
        long misturado = t ^ (t >>> 16);
        int sufixoNumerico = (int) (Math.abs(misturado) % 1000);
        // Garante sempre 3 dígitos
        String sufixo = String.format("%03d", sufixoNumerico);
        // Conta final: 5 dígitos
        this.conta = prefixo + sufixo;
        // Dígito aleatório
        this.digito = (int) (Math.random() * 10);

    }
}
