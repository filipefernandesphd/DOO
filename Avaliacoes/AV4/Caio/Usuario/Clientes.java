package Usuario;

import Conta.Conta;

public abstract  class Clientes {
    protected Conta conta;
    protected String conta;
    protected double saldo;



    public gerarConta(String codigoagencia){
      this.conta = codigoagencia 
    }

    obterNumeroConta(){
      return conta;

    }
    obterNumeroDigito(){

    }

    obterNumeroContaCompleta(){

    }

    transferenciaParaOutraConta(Double valortransferencia){

    }

    receberTransferencia(Double valortransferencia){

    }
    /*
    Métodos públicos:
  - `gerarConta(String codigoagencia)`: gera o número da conta do cliente. O atributo conta deve receber um novo objeto do tipo Conta. O parâmetro codigoagencia é número do código da agência
  - `obterNumeroConta()`: retorna somente o número da conta
  - `obterNumeroDigito()`: retorna somente o dígito da conta
  - `obterNumeroContaCompleta()`: retorna o número da conta e do dígito
  - `transferenciaParaOutraConta(Double valortransferencia)`: atualiza o saldo após transferência entre contas. Deve verificar se o valor da transferência é compatível com o saldo, ou seja, não pode aceitar transferência com valor menor do que o saldo. O parâmetro valortransferencia é o valor que será transferido
  - `receberTransferencia(Double valortransferencia)`: atualiza o saldo após transferência entre contas. O parâmetro valortransferencia é o valor que será transferido
    */

}
