package com.mycompany.exercicios;

public class CarteiraDigital {
    public String titular;
    public Float saldo;
    public Integer numTransacoes;
    
    public CarteiraDigital(String titular, Float saldo, Integer numTransacoes){
        this.titular = titular;
        this.saldo = saldo;
        this.numTransacoes = numTransacoes;
    }
    
    public String receber(Float valor){
        if(valor > 0){
            this.numTransacoes += 1;
            return "Valor inserido com sucesso: " + Float.toString(valor + this.saldo);
        }else{
            return "O valor inserido não é positivo";
        }
    }
    
    public String pagar(Float valor){
        if(valor > 0 && this.saldo > valor){
            return "Saldo apos pagar: " + Float.toString(this.saldo - valor);
        }else{
            return "Saldo insuficiente";
        }
    }
    
    public Integer consultarSaldo(){
        return this.numTransacoes;
    }
    
    public String exibirExtrato(){
        return "\nSaldo atual: " + this.saldo + "\nNúmero de transações: " + this.numTransacoes;
    }
}
