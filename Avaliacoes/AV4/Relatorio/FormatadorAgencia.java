package Relatorio;

import Agencia.*;

public class FormatadorAgencia implements Formatador<Agencia> {
    /**
     * Definir cabeçalho padrão do relatório
     * @return cabeçalho
     */
    public String cabecalho(){
        String r = "";
        r += "RELATÓRIO DE AGÊNCIAS\n";
        r += "---------------------------------------------------------\n";
        r += "Código\t\tCidade\t\t\tEstado\n";

        return r;
    }

    /**
     * Converte T em String
     * @param obj objetivo do tipo T
     * @return T convertido em String
     */
    public String formatar(Agencia obj) {
        String r = "";              
        r += obj.getCodigoAgencia() + "\t\t";
        r += obj.getCidade() + "\t\t";
        r += obj.getEstado();
        return r;
    }
}
