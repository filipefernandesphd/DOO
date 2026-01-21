package principal.ui.menu;

import java.util.ArrayList;
import java.util.Scanner;

import principal.agencia.*;
import principal.banco.*;
import principal.conta.*;
import principal.usuario.*;

public class Menu {
    private final Scanner scanner = new Scanner(System.in);
    private int opcao;
    private boolean terminal = true;
    private Relatorio<Agencia> relAgencias;
    private Relatorio<Cliente> relClientes;

    public Menu(ArrayList<Agencia> agencias, ArrayList<Cliente> clientes){
        this.relAgencias = new Relatorio<Agencia>(agencias, new FormatadorAgencia());
        this.relClientes = new Relatorio<Cliente>(clientes, new FormatadorCliente());
    }

    public void iniciar(){
        while(this.terminal){
            this.cabecalho();
            
            switch (this.opcao) {
                case 0:
                    System.out.println(this.relClientes.gerar());
                    break;

                case 1:
                    System.out.println(this.relAgencias.gerar());
                    break;

                case 2:
                    realizarTransferencia();
                    break;

                case 9:
                    this.scanner.close();
                    this.terminal = false;
                    break;
            }
        }
    }

    private void cabecalho(){
        System.out.println("============================================================");
        System.out.println("Bem-vindo ao BANCO "+Banco.NOMEBANCO.toUpperCase());
        System.out.println("============================================================");

        System.out.println("Escolha uma opção abaixo:");
        System.out.println("0 - Listar clientes do banco");
        System.out.println("1 - Listar agências do banco");
        System.out.println("2 - Realizar transferências");
        System.out.println("9 - Para sair");

        System.out.print("Digite sua opção: ");
        this.opcao = this.scanner.nextInt();
    }

    private void realizarTransferencia(){  /* implementação */  }
}
