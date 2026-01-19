import Usuario.*;
import Agencia.*;

import java.util.ArrayList;
import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        // Agências
        Agencia agenciaMnu = new Agencia("Manhuaçu", "Minas Gerais", "123");
        Agencia agenciaIta = new Agencia("Itaperuna", "Rio de Janeiro", "321");
        
        ArrayList<Agencia> agencias = new ArrayList<Agencia>();
        agencias.add(agenciaMnu);
        agencias.add(agenciaIta);

        // Clientes de Manhuaçu
        Cliente jose = new ClientePF("José das Couves","123456789","01/01/2010",100.0);
        
        // Cadastrar cliente na agência de Manhuaçu
        agenciaMnu.cadastrarCliente(jose);

        // Clientes de Itaperuna
        Cliente maria = new ClientePF("Maria das Flores","98765432","30/10/2020",0.0);
        Cliente lojadasroupas = new ClientePJ("Loja das Roupas", "12345678/0001-9", "27/02/2040",10100.50);

        // Cadastrar clientes na agência de Itaperuna
        agenciaIta.cadastrarCliente(maria);
        agenciaIta.cadastrarCliente(lojadasroupas);

        // Iniciar o terminal
        System.out.println("============================================================");
        System.out.println("Bem-vindo ao BANCO NOVA CHANCE");
        System.out.println("============================================================");
    
        boolean terminal = true;
        while(terminal){
            System.out.println("Escolha uma opção abaixo:");
            System.out.println("0 - Listar clientes de todas as agências");
            System.out.println("1 - Realizar transferências");
            System.out.println("9 - Para sair");

            Scanner scanner = new Scanner(System.in);
            System.out.print("Digite sua opção: ");
            int opcao = scanner.nextInt();

            switch (opcao) {
                // 0 - Listar clientes de todas as agências
                case 0:
                    for (Agencia agencia : agencias) {
                        for (Cliente cliente : agencia.getClientes()) {
                            System.out.println("Nome: "+cliente.getNome());
                            System.out.println("Conta: "+cliente.obterNumeroContaCompleta());
                            System.out.println("Saldo: "+cliente.getSaldo());
                            System.out.println();
                        }
                    }                    
                    break;
                
                // 1 - Realizar transferências
                case 1:
                    System.out.print("Informe a conta de origem: ");
                    String contaorigem = scanner.next();

                    System.out.print("Informe o valor a ser transferido: ");
                    Double valortransferencia = scanner.nextDouble();

                    System.out.print("Informe a conta de destino: ");
                    String contadestino = scanner.next();

                    Agencia agenciaorigem = null;
                    Cliente clienteorigem = null;
                    Cliente clientedestino = null;
                    // Buscar quem são os clientes para mostrar o saldo final
                    for (Agencia agencia : agencias) {
                        for (Cliente cliente : agencia.getClientes()) {
                            if(contaorigem.equals(cliente.obterNumeroContaCompleta())){
                                agenciaorigem = agencia;
                                clienteorigem = cliente;
                            }

                            if(contadestino.equals(cliente.obterNumeroContaCompleta())){
                                clientedestino = cliente;
                            }
                        }
                    }

                    System.out.println();
                    System.out.println("Resumo da operação");
                    System.out.println("Saldo anterior de "+clienteorigem.getNome()+": "+clienteorigem.getSaldo());
                    System.out.println("Saldo anterior de "+clientedestino.getNome()+": "+clientedestino.getSaldo());

                    agenciaorigem.transferencia(clienteorigem, valortransferencia, clientedestino);

                    System.out.println(clienteorigem.getNome()+" transferiu "+valortransferencia+" para "+clientedestino.getNome());
                    System.out.println("Saldo atualizado de "+clienteorigem.getNome()+": "+clienteorigem.getSaldo());
                    System.out.println("Saldo atualizado de "+clientedestino.getNome()+": "+clientedestino.getSaldo());

                    System.out.println();
                break;

            // Sair
            case 9:    
                scanner.close();
                terminal = false;
            }
        }
    }
}