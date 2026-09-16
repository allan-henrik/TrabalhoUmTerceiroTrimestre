package com.mycompany.trabalhoumterceirotrimestre;
import com.mycompany.exercicios.Pessoa;
import com.mycompany.exercicios.Produto;
import com.mycompany.exercicios.Livro;
import com.mycompany.exercicios.Veiculo;
import com.mycompany.exercicios.CarteiraDigital;
public class TrabalhoUmTerceiroTrimestre {
    public static void main(String[] args) {
//  Ex1
//        Pessoa lucas = new Pessoa("Lucas de Sousa", 24, (float) 1.74);
//        
//        System.out.printf("%s", lucas.exibirDados());
//        System.out.printf("%s", lucas.fazerAniversario());
//        System.out.printf("%s", lucas.exibirDados());
//  Ex2
//        Produto uva = new Produto("Uva", (float) 10.99, 200);
//        
//        System.out.printf("%s\n", uva.adicionarEstoque(10));
//        System.out.printf("%s", uva.vender(20));
//        System.out.printf("%s", uva.calcularValorEstoque());
//        System.out.printf("%s", uva.exibirResumo());
//Ex3
//          Livro livro1 = new Livro("Principato", "Nicolas Chavier", 200, (float) 100.00);
//          Livro livro2 = new Livro("Mar Vermelho", "Alexandre Rofman", 278, (float) 150.00);
//          
//          System.out.printf("%s", livro1.exibirDetalhes());
//          System.out.printf("%s\n", livro1.aplicarDesconto(10));
//          System.out.printf("%s", livro2.exibirDetalhes());
//          System.out.printf("%s", livro2.aplicarDesconto(50));
//Ex4
//          Veiculo carro = new Veiculo("chevrolet", "Opala", 1992, 200);
//          
//          System.out.printf("O tempo de uso é de: %d\n", carro.calcularTempoDeUso(2026));
//          System.out.printf("A quilometragem atual é de: %d\n", carro.registrarViagem(20));
//          System.out.printf("%s", carro.exibirDados());

            CarteiraDigital num1 = new CarteiraDigital("Ana", (float)200.00, 3);
            
            System.out.printf("%s\n", num1.receber((float) 100.00));
            System.out.printf("%s\n", num1.pagar((float) 20.00));
            System.out.printf("%d\n", num1.consultarSaldo());
            System.out.printf("%s", num1.exibirExtrato());
    }
}
