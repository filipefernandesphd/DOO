package Agencia;

import java.util.ArrayList;

public class Agencia {
    private String cidade;
    private String estado;
    private int codigoAgencia;

    private ArrayList<String>Cliente = new ArrayList<>(); 
    private Cliente cliente;    
    

    public void dadosAgencia(String cidade, String estado, int codigoAgencia){
        this.cidade = cidade;
        this.estado = estado;
        this.codigoAgencia = codigoAgencia;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    public String getCidade(){
        return cidade;
    }

    public void setEstado(String estado){
        this.estado = estado;
    }

    public String getEstado(){
        return estado;
    }

    public void setCodigoAgencia(int codigoAgencia) {
        this.codigoAgencia = codigoAgencia;
    }
    
    public int getCodigoAgencia(){
        return codigoAgencia;
    }

}
