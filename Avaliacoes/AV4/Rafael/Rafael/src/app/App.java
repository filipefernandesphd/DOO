package app;

import usuario.*;
import agencia.*;
import banco.*;
import ui.Menu;
import java.util.ArrayList;
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
		// Cadastrar clientes
		Cliente jose = new ClientePF("José das Couves","123456789","01/01/2010",100.0);
		agenciaMnu.cadastrarCliente(jose);
		Cliente maria = new ClientePF("Maria das Flores","98765432","30/10/2020",0.0);
		agenciaIta.cadastrarCliente(maria);
		Cliente lojadasroupas = new ClientePJ("Loja das Roupas", "12345678/0001-9", "27/02/2040",10100.50);
		agenciaIta.cadastrarCliente(lojadasroupas);
		// Subgrupo de clientes (pessoa física)
		ArrayList<Cliente> clientesPF = new ArrayList<Cliente>();
		clientesPF.add(jose);
		clientesPF.add(maria);
		// Vincular clientes ao banco
		Banco.setCliente(clientesPF);
		Banco.setCliente(lojadasroupas);
		// CORREÇÃO DA IMPLEMENTAÇÃO
		// Correcao.corrigirBancoClientesContas(Banco.getClientes());
		// Menu
		Menu menu = new Menu(Banco.getAgencias(), Banco.getClientes());
		menu.iniciar();
		}
	}
