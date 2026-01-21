package principal;



import java.util.ArrayList;

import principal.agencia.Agencia;
import principal.banco.Banco;

public class App {
    public static void main(String[] args) {
        // Cadastrar agências
        // Minas Gerais
        Agencia agenciaMnu = new Agencia("Manhuaçu", "Minas Gerais", "123");
        Agencia agenciaBh = new Agencia("Belo Horizonte", "Minas Gerais", "456");
        Agencia agenciaJf = new Agencia("Juiz de Fora", "Minas Gerais", "878");
        // Subgrupo de agências (apenas de Minas Gerais)
        ArrayList<Agencia> agenciasMG = new ArrayList<Agencia>();
        agenciasMG.add(agenciaMnu);
        agenciasMG.add(agenciaBh);
        agenciasMG.add(agenciaJf);

        // Rio de Janeiro
        Agencia agenciaIta = new Agencia("Itaperuna", "Rio de Janeiro", "321");
        Agencia agenciaRj = new Agencia("Rio de Janeiro", "Rio de Janeiro", "171");

        // Vincular agências ao banco
        Banco.setAgencia(agenciasMG);
        Banco.setAgencia(agenciaIta);
        Banco.setAgencia(agenciaRj);

        // CORREÇÃO DA IMPLEMENTAÇÃO
        // Correcao.corrigirBancoAgencias(Banco.getAgencias());

    } 
}

