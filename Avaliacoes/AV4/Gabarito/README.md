# **AV4**

Em 2045, o planeta Terra sofreu um ataque extra-terrestre dizimando qualquer vestígio de tecnologia produzida no mundo.

Hoje, 21 de janeiro de 2059, você foi encarregado de implementar um protótipo de sistema  bancário para ajudar a fortalecer a soberania nacional, mesmo sendo um sistema via terminal. 

Obrigatoriamente, esse sistema bancário deve atender os requisitos abaixo:

### App.java
- Principal arquivo da aplicação. Seu código está no final da página.

### Banco
- Classe dentro do pacote `Banco` e com o mesmo nome
- Classe definida como `final`
- Atributo público, `static` e `final` do tipo String: NOMEBANCO. Seu valor é "Nova Chance"
- Atributo privado e `static` do tipo ArrayList, contendo objetos do tipo Agencia: agencias
- Atributo privado e `static` do tipo ArrayList, contendo objetos do tipo Cliente: clientes
- Métodos públicos e `static`
  - `getAgencias()`: deve retornar a lista de agências
  - `setAgencia(Agencia agencia)`: deve adicionar uma nova agência à lista de agências
  - `setAgencia(ArrayList<Agencia> novasagencias)`: deve adicionar uma nova lista de agências à lista de agências da classe. *DICA:* use o método `addAll()`
  - `getClientes()`: deve retornar a lista de clientes
  - `setCliente(Cliente cliente)`: deve adicionar um novo cliente à lista de clientes
  - `setCliente(ArrayList<Cliente> novosclientes)`: deve adicionar uma nova lista de clientes à lista de clientes da classe. *DICA:* use o método `addAll()`

### Agência
- Classe dentro do pacote `Agencia` e com mesmo nome
- Atributos privados do tipo String: cidade, estado, codigoagencia
- Atributo privado do tipo lista: clientes (é uma lista de objetos do tipo cliente)
- Método construtor com os parâmetros cidade, estado e codigoagencia
- Getters e Setters
- Métodos públicos:
  - `cadastrarCliente(Cliente cliente)`: vincula cliente à lista de clientes da agência e cria o número da conta. A criação da conta depende da implementação do método gerarConta() de cliente
  - `transferencia(Cliente clienteorigem, Double valortransferencia, Cliente clientedestino)`: realiza transferências entre contas do banco. `clienteorigem` é a conta de origem que sairá o recurso, `valortransferencia` valor que será transferido e `clientedestino` conta de destino que receberá o recurso
- No mesmo pacote, esta classe deve implementar a interface `IAgencia` abaixo:
```java
package Agencia;

import java.util.ArrayList;

import Usuario.Cliente;

interface IAgencia {
    // Getters e Setters
    public String getCidade();
    public void setCidade(String cidade);
    public String getEstado();
    public void setEstado(String estado);
    public String getCodigoAgencia();
    public void setCodigoAgencia(String codigoagencia); 
    public ArrayList<Cliente> getClientes();
    public void setCliente(ArrayList<Cliente> clientes);

    /**
     * Vincula cliente à lista de clientes da agência e cria o número da conta
     * A criação da conta depende da implementação do método gerarConta() de cliente
     * @param cliente novo cliente da agência
     */
    public void cadastrarCliente(Cliente cliente);

    /**
     * Realizar transferências entre contas do banco
     * 
     * @param clienteorigem conta de origem que sairá o recurso
     * @param valortransferencia valor que será transferido
     * @param clientedestino conta de destino que receberá o recurso
     */
    public void transferencia(Cliente clienteorigem, Double valortransferencia, Cliente clientedestino); 
}
```

### Conta
- Classe dentro do pacote `Conta` e com mesmo nome
- Atributos privados e do tipo String: codigoagencia e conta
- Atributo privado e do tipo inteiro: digito (é o dígito verificador da conta)
- Método construtor com o parâmetro codigoagencia
- Getters e Setters
- Método privado `gerarConta()`. Segue implementação:
```java
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
```
- No mesmo pacote, esta classe deve implementar a interface `IConta` abaixo:
```java
package Conta;

interface IConta {
    public String getCodigoAgencia();
    public void setCodigoAgencia(String codigoagencia);
    public String getConta();
    public void setConta(String conta);
    public int getDigito();
    public void setDigito(int digito);
}
```

### Clientes
- Classes dentro do pacote `Usuario`
- Há dois tipos de clientes: pessoa física e jurídica. Ambas são compostas por atributos e métodos quem devem ser herdados por uma classe abstrata

#### Classe Abstrata
- Classe com o nome de `Cliente`
- Atributo protegido do tipo Conta: conta
- Atributo protegido do String Conta: nome
- Atributo protegido do tipo Double: saldo
- Getters e Setters
- Métodos públicos:
  - `gerarConta(String codigoagencia)`: gera o número da conta do cliente. O atributo conta deve receber um novo objeto do tipo Conta. O parâmetro codigoagencia é número do código da agência
  - `obterNumeroConta()`: retorna somente o número da conta
  - `obterNumeroDigito()`: retorna somente o dígito da conta
  - `obterNumeroContaCompleta()`: retorna o número da conta e do dígito
  - `transferenciaParaOutraConta(Double valortransferencia)`: atualiza o saldo após transferência entre contas. Deve verificar se o valor da transferência é compatível com o saldo, ou seja, não pode aceitar transferência com valor menor do que o saldo. O parâmetro valortransferencia é o valor que será transferido
  - `receberTransferencia(Double valortransferencia)`: atualiza o saldo após transferência entre contas. O parâmetro valortransferencia é o valor que será transferido
- No mesmo pacote, esta classe deve implementar a interface `ICliente` abaixo:
```java
package Usuario;

interface ICliente {
    public String getNome();
    public void setNome(String nome);
    public double getSaldo();
}
```

#### Pessoa Física
- Classe com o nome de `ClientePF`
- Atributos privados do tipo String: CPF e datanascimento
- Método construtor com os parâmetros: nome, CPF, datanascimento e saldo
- Getters e Setters
- No mesmo pacote, esta classe deve implementar a interface `ICliente` abaixo:
```java
package Usuario;

public interface IClientePF {
    public String getCPF();
    public void setCPF(String CPF);
    public String getDataNascimento();
    public void setDataNascimento(String datanascimento);  
}
```

#### Pessoa Jurídica
- Classe com o nome de `ClientePJ`
- Atributos privados do tipo String: CNPJ e dataregistro
- Método construtor com os parâmetros: nome, CNPJ, dataregistro e saldo
- Getters e Setters
- No mesmo pacote, esta classe deve implementar a interface `ICliente` abaixo:
```java
package Usuario;

public interface IClientePJ {
    public String getCNPJ();
    public void setCNPJ(String CNPJ);
    public String getDataRegistro();
    public void setDataRegistro(String dataregistro);  
} 
```

### Menu
- Classe dentro do pacote `UI`
- A classe `Menu` deve conter a estrutura padrão abaixo, porém deve implementar o método `realizarTransferencia` com o seguinte fluxo:
  - Informe a conta de origem: 
  - Informe o valor a ser transferido:
  - Informe a conta de destino: 
  - Resumo da operação
  - Saldo anterior de [nome do cliente de origem]: [saldo do cliente]
  - Saldo anterior de [nome do cliente de destino]: [saldo do cliente]
  - [nome do cliente de origem] transferiu [valor da transferência] para [nome do cliente de destino]
  - Saldo atualizado de [nome do cliente de origem]: [saldo do cliente]
  - Saldo atualizado de [nome do cliente de destino]: [saldo do cliente]
```java
package UI;

import java.util.ArrayList;
import java.util.Scanner;

import Agencia.*;
import Relatorio.*;
import Usuario.*;
import Banco.*;

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
```

### Relatório
- As classes devem estar dentro do pacote `Relatorio`

#### Formatador
- A interface `Formatador<T>` deve ter o seguinte código
```java
/**
 * Definir cabeçalho padrão do relatório
 * @return cabeçalho
 */
public String cabecalho();

/**
 * Converte T em String
 * @param obj objetivo do tipo T
 * @return T convertido em String
 */
public String formatar(T obj);
```

#### Formatador Agência
- Classe com o nome de `FormatadorAgencia`
- Deve implementar os métodos da interface `Formatador<T>`
- `String cabecalho()` deve produzir a saída:
```text
RELATÓRIO DE AGÊNCIAS
---------------------------------------------------------
Código          Cidade                  Estado
```
- `String formatar(Agencia obj)` deve produzir a saída:
```text
123             Manhuaçu                Minas Gerais
456             Belo Horizonte          Minas Gerais
878             Juiz de Fora            Minas Gerais
321             Itaperuna               Rio de Janeiro
171             Rio de Janeiro          Rio de Janeiro
```

#### Formatador Cliente
- Classe com o nome de `FormatadorCliente`
- Deve implementar os métodos da interface `Formatador<T>`
- `String cabecalho()` deve produzir a saída:
```text
RELATÓRIO DE CLIENTES
---------------------------------------------------------
Código          Nome                    Saldo
```
- `String formatar(Cliente obj)` deve produzir a saída:
```text
12022-5(*)         José das Couves         100.0
32100-0(*)         Maria das Flores                0.0
32100-1(*)         Loja das Roupas         10100.5
```
(*) o código deve ser gerado automaticamente


#### Relatorio
- Classe com nome de `Relatorio`, porém, deve ser genérica, ou seja, use `<T>`
- Atributos privados `final`
  - tipo `ArrayList<T>`: itens
  - tipo `Formatador<T>`: formatador
- Método construtor com um parâmetro do tipo `ArrayList<T>` e outro do tipo `Formatador<T>`
- Método público `String gerar()` deve ter a seguinte implementação
```java
String r = "";

// Cabeçalho
r += formatador.cabecalho();
r += "---------------------------------------------------------\n";

for (T item : itens) {
    r += formatador.formatar(item) + "\n";
}
return r;
```

### Critérios de Pontuação
- A avaliação será da seguinte forma:
  - Execução da linha **31** em `App.java` sem erros e comportamento conforme o esperado: **0.8pt**
  - Execução da linha **53** em `App.java` sem erros e comportamento conforme o esperado: **0.8pt**
  - Funcionamento conforme o esperado da opção **0** do menu: **0.7pt**
  - Funcionamento conforme o esperado da opção **1** do menu: **0.7pt**
  - Funcionamento conforme o esperado da opção **2** do menu: **1pt**

#### App.java
```java
import Usuario.*;
import Agencia.*;
import Banco.*;
import UI.Menu;

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
```