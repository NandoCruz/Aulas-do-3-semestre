
package exerc03_geometria;

import dimensao.bidimensional.TrianguloEquilatero;
import dimensao.bidimensional.TrianguloRetangulo;

public class Exerc03_Geometria {
    
    // DONE 1 dentro do pacote dimensao.bidimensional, crie uma classe chamada TrianguloEquilatero
    
    public static void main(String[] args) {
        TrianguloRetangulo tr1 = new TrianguloRetangulo();
        
        tr1.setCateto1(14.5);
        tr1.setCateto2(48.1);
        tr1.setHipotenusa(51.2);
        tr1.setAlturaHipotenusa(12.3);
        
        double areaTr1 = tr1.calcArea();
        System.out.println("Área do triângulo tr1: " + areaTr1);
        
        double perimetroTr1 = tr1.calcPerimetro();
        System.out.println("Perímetro do triângulo tr1: " + perimetroTr1); 

        TrianguloRetangulo tr2 = new TrianguloRetangulo(5.0,7.0,3.0,9.9);
        
        // DONE 10 aqui dentro do main, crie um objeto da classe TrianguloEquilatero (nome: te1)
        TrianguloEquilatero te1 = new TrianguloEquilatero();
        
        // DONE 11 através do set, atribua valor 6.33 para o atributo lado
        te1.setLado( 6.33 );
        // DONE 12 através do set, atribua valor 5.48 para o atributo altura
        te1.setAltura( 5.48 );
        
        // DONE 13 crie aqui uma variável double de nome areaTe1
        double areaTe1;
        // DONE 14 através do objeto te1, acesse o método calcArea() da classe TrianguloEquilatero
        ////////// e armazene o valor de retorno do método na variável areaTe1
        areaTe1 = te1.calcArea();
        // DONE 15 imprima o valor da área da seguinte forma: "Área do triângulo te1: <VALOR>"
        System.out.println("Área do triângulo te1: " + areaTe1);
        
        // DONE 16 crie aqui uma variável double de nome perimetroTe1
        double perimetroTe1;
        // DONE 17 através do objeto te1, acesse o método calcPerimetro() da classe TrianguloEquilatero
        perimetroTe1 = te1.calcPerimetro();
        ////////// e armazene o valor de retorno do método na variável perimetroTe1
        // DONE 16 imprima o valor do perímetro da seguinte forma: "Perímetro do triângulo te1: <VALOR>"
        System.out.printf("Perímetro do triângulo te1: %.2f \n\n", perimetroTe1);
        
        System.out.printf("%.2f - %.2f - %.2f - %.2f \n\n", areaTr1, perimetroTr1, 
                areaTe1, perimetroTe1);
    }
    
}
