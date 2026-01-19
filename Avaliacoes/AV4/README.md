# **AV4**

Em 2045, o planeta Terra sofreu um ataque extra-terrestre dizimando qualquer vestígio de tecnologia produzida no mundo.

Hoje, 21 de janeiro de 2059, você foi encarregado de implementar um protótipo de sistema  bancário para ajudar a fortalecer a soberania nacional, mesmo sendo um sistema via terminal. 

Obrigatoriamente, esse sistema bancário deve atender os requisitos abaixo:

### Agência
- Classe dentro do pacote `Agencia`
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
- Classe dentro do pacote `Conta`
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

### App.java
- A partir da linha 47, faça a implementação conforme a opção do menu
- Opção 0: deve mostrar de todas as agências o nome, conta e saldo da conta dos clientes
- Opção 1: o objetivo é realizar a transferência entre contas. Por isso é fundamental que a opção anterior seja implementada. O fluxo de informações deve ser o seguinte:
  - Informe a conta de origem: 
  - Informe o valor a ser transferido:
  - Informe a conta de destino: 
  - Resumo da operação
  - Saldo anterior de [nome do cliente de origem]: [saldo do cliente]
  - Saldo anterior de [nome do cliente de destino]: [saldo do cliente]
  - [nome do cliente de origem] transferiu [valor da transferência] para [nome do cliente de destino]
  - Saldo atualizado de [nome do cliente de origem]: [saldo do cliente]
  - Saldo atualizado de [nome do cliente de destino]: [saldo do cliente]
- Opção 9: o programa deve ser finalizado


### Critérios de Pontuação
- Implementação conforme os requisitos de 
  - **Agência**: 1 pt 
  - **Clientes**: 1.5 pt
  - **Conta**: 1 pt
  - **App.java**: 0.5 pt