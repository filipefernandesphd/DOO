package Relatorio;

import Usuario.Cliente;

public class FormatadorCliente implements Formatador<Cliente> {
    /**
     * Definir cabeçalho padrão do relatório
     * @return cabeçalho
     */
    public String cabecalho(){
        String r = "";
        r += "RELATÓRIO DE CLIENTES\n";
        r += "---------------------------------------------------------\n";
        r += "Código\t\tNome\t\t\tSaldo\n";

        return r;
    }

    /**
     * Converte T em String
     * @param obj objetivo do tipo T
     * @return T convertido em String
     */
    public String formatar(Cliente obj) {
        String r = "";              
        r += obj.obterNumeroContaCompleta() + "\t\t";
        r += obj.getNome() + "\t\t";
        r += obj.getSaldo();
        return r;
    }
}
