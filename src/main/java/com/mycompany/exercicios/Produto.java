package com.mycompany.exercicios;

public class Produto {
    public String nome;
    public Float preco;
    public Integer quantidadeEstoque;
    
    public Produto(String nome, Float preco, Integer quantidadeEstoque){
        this.nome = nome;
        this.preco = preco;
        this.quantidadeEstoque = quantidadeEstoque;
    }
    
    public String adicionarEstoque(Integer quantidade){
        if (quantidade > 0){
            this.quantidadeEstoque += quantidade;
            return "Estoque atualizado com sucesso!";
        }else{
            return "Valor invalido!";
        }
    }
    
    public String vender(Integer quantidade){
        if (quantidadeEstoque > 0){
            this.quantidadeEstoque -= quantidade;
            return "Venda concluida com sucesso";
        }else{
            return "Valor invalido!";
        }
    }
    
    public Float calcularValorEstoque(){
        return this.preco * this.quantidadeEstoque;
    }
    
    public String exibirResumo(){
        return "\nNome: " + this.nome + "\nPreço: " + this.preco +
"\nQuantidade no estoque: " + this.quantidadeEstoque;
    }
}
