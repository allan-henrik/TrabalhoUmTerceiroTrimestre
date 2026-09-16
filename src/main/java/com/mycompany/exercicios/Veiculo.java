package com.mycompany.exercicios;

public class Veiculo {
    public String marca;
    public String modelo;
    public Integer anoFabricasao;
    public Integer quilometragem;
    
    public Veiculo(String marca, String modelo, Integer anoFabricasao, Integer quilometragem){
        this.marca = marca;
        this.modelo = modelo;
        this.anoFabricasao = anoFabricasao;
        this.quilometragem = quilometragem;
    }
    
    public Integer calcularTempoDeUso(Integer ano){
        return ano -= this.anoFabricasao;
    }
    
    public Integer registrarViagem(Integer distancia){
        return distancia += this.quilometragem;
    }
    
    public String exibirDados(){
        return "\nMarca: " + this.marca + "\nModelo: " + this.modelo + "\nAno de fabricação: " + this.anoFabricasao + "\nQuilometragem: " + this.quilometragem;
    }
}
