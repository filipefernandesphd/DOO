package Usuario;

import Conta.*;

public abstract class Cliente implements ICliente {
    protected Conta conta;
    protected String nome;
    protected Double saldo;

    // Getters e Setters ------------------------------------------    
    // Nome
    public String getNome(){ return this.nome; }
    public void setNome(String nome){ this.nome=nome; }

    // Saldo
    public double getSaldo(){ return this.saldo; }

    // Métodos públicos ------------------------------------------
    /**
     * Gera o número da conta do cliente
     * 
     * @param codigoagencia código da agência
     */
    public void gerarConta(String codigoagencia){
        this.conta = new Conta(codigoagencia);
    }

    /**
     * 
     * @return retorna somente o número da conta
     */
    public String obterNumeroConta(){ return this.conta.getConta(); }
    
    /**
     * 
     * @return retorna somente o dígito da conta
     */
    public int obterNumeroDigito(){ return this.conta.getDigito(); }
    
    /**
     * 
     * @return retorna o número da conta e do dígito
     */
    public String obterNumeroContaCompleta(){ return this.obterNumeroConta()+"-"+this.obterNumeroDigito(); }

    /**
     * Atualizar saldo após transferência entre contas
     * 
     * @param valortransferencia valor a ser transferido
     */
    public void transferenciaParaOutraConta(Double valortransferencia){
        if(valortransferencia <= this.saldo){
            this.saldo -= valortransferencia;
        }else{
            System.out.println("Não é possível realizar transferência");
        }
    }

    /**
     * Atualizar saldo após transferência entre contas
     * 
     * @param valortransferencia valor a ser transferido
     */
    public void receberTransferencia(Double valortransferencia){
        this.saldo += valortransferencia;
    }
}
