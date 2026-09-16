package com.mycompany.exercicios;

public class Livro {
    public String titulo;
    public String autor;
    public Integer numPaginas;
    public Float preco;
    
    public Livro(String titulo, String autor, Integer numPaginas, Float preco){
        this.titulo = titulo;
        this.autor = autor;
        this.numPaginas = numPaginas;
        this.preco = preco;
    }
    
    public String exibirDetalhes(){
        return "Titulo: " + this.titulo + "\nAutor: " + this.autor + "\nNumero de paginas: " + this.numPaginas + "\nPreço: " + this.preco;
    }
    
    public String aplicarDesconto(Integer percentual){
        if(percentual > 0 && percentual <= 50){
            return "\nDesconto aplicado com sucesso! Valor atual R$ " + (this.preco - (this.preco * percentual));
        }else{
            return "\nValor invalido!";
        }
    }
}
