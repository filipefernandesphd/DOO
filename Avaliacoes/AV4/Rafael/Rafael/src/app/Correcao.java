package app;
import java.util.ArrayList;

import agencia.*;
import usuario.*;

public class Correcao {

    public static void corrigirBancoAgencias(ArrayList<Agencia> agencias){
        System.err.println();
        System.out.println("Conferência da implementação do Banco e das agências") ;
        for (Agencia agencia : agencias) {
            System.out.println(
                agencia.getCodigoAgencia()+" "+
                agencia.getCidade()+" "+
                agencia.getEstado()
            );
        }

        if(agencias.size() == 5){
            System.out.println("Banco e Agência implementados!");
        }

        System.out.println();
    }

    public static void corrigirBancoClientesContas(ArrayList<Cliente> clientes){
        System.err.println();
        System.out.println("Conferência da implementação do Banco, clientes e geração das contas") ;
        
        for (Cliente cliente : clientes) {

            if(cliente instanceof ClientePF){
                ClientePF clientePF = (ClientePF) cliente;
                System.out.println(
                    clientePF.getNome()+" "+ 
                    clientePF.getCPF()+" "+
                    clientePF.getDataNascimento()+" "+
                    clientePF.getSaldo()+" "+
                    clientePF.obterNumeroConta()+" "+
                    clientePF.obterNumeroDigito()+" "+
                    clientePF.obterNumeroContaCompleta()
                );
            }

            if(cliente instanceof ClientePJ){
                ClientePJ clientePJ = (ClientePJ) cliente;
                System.out.println(
                    clientePJ.getNome()+" "+ 
                    clientePJ.getCNPJ()+" "+ 
                    clientePJ.getDataRegistro()+" "+ 
                    clientePJ.getSaldo()+" "+
                    clientePJ.obterNumeroConta()+" "+
                    clientePJ.obterNumeroDigito()+" "+
                    clientePJ.obterNumeroContaCompleta()
                );
            }
        }

        if(clientes.size() == 3){
            System.out.println("Banco, Cliente e Conta implementados!");
        }
        System.out.println();
    }

}
