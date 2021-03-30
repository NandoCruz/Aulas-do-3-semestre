
package exerc02_geometria;

import dimensao.bidimensional.TrianguloRetangulo;

public class Exerc02_Geometria {

    public static void main(String[] args) {
        TrianguloRetangulo tr1 = new TrianguloRetangulo();
        
        // DONE 4 apague as linhas de acesso direto aos atributos
        // sabemos que este tipo de acesso é prejudical para o projeto, 
        // porque precisamos proteger a classe contra valores inválidos
        
        // DONE 5 através do set, atribua valor 14.5 para o atributo cateto1
        tr1.setCateto1( 14.5 );
        // DONE 6 através do set, atribua valor 48.1 para o atributo cateto2
        tr1.setCateto2( 48.1 );
        // DONE 7 através do set, atribua valor 51.2 para o atributo hipotenusa
        tr1.setHipotenusa( 51.2 );
        // DONE 8 através do set, atribua valor 12.3 para o atributo alturaHipotenusa
        tr1.setAlturaHipotenusa( 12.3 );
        
        // DONE 9 comente: as atribuições deram certo? Por quê?
        // R: Sim, porque os métodos "set" são públicos e podem ser acessos nesta classe
        
        // DONE 10 crie aqui uma variável double de nome areaTr1
        double areaTr1;
        // DONE 11 através do objeto tr1, acesse o método calcArea() da classe TrianguloRetangulo 
        ////////// e armazene o valor de retorno do método na variável areaTr1
        areaTr1 = tr1.calcArea();
        // DONE 12 imprima o valor da área da seguinte forma: "Área do triângulo tr1: <VALOR>"
        System.out.println("Área do triângulo tr1: " + areaTr1);
        // DONE 13 comente: por que está dando erro?
        // R: o erro ocorre, porque o método calcArea() está configurado como
        // default na classe TrianguloRetangulo
        // DONE 14 comente: o que pode ser feito para resolver este erro?
        // R: para resolver esse erro, é preciso declarar o método como "public"
        
        // DONE 16 crie aqui uma variável double de nome perimetroTr1
        double perimetroTr1;
        // DONE 17 através do objeto tr1, acesse o método calcPerimetro() da classe TrianguloRetangulo 
        ////////// e armazene o valor de retorno do método na variável perimetroTr1
        perimetroTr1 = tr1.calcPerimetro();
        // DONE 18 imprima o valor do perímetro da seguinte forma: "Perímetro do triângulo tr1: <VALOR>"
        System.out.println("Perímetro do triângulo tr1: " + perimetroTr1);
        // DONE 19 comente: por que está dando erro?
        // R: o erro ocorre, porque o método calcPerimetro() está configurado como
        // default na classe TrianguloRetangulo
        // DONE 20 comente: o que pode ser feito para resolver este erro?
        // R: para resolver esse erro, é preciso declarar o método como "public"
        
        // DONE 21 crie um outro objeto através do construtor, passando um valor inválido
        TrianguloRetangulo tr2 = new TrianguloRetangulo(-3, -4, -9, -1);
        
        // DONE 22 através do objeto da tarefa anterior, chame os métodos calcArea() e calcPerimetro()
        double areaTr2 = tr2.calcArea();
        double perimTr2 = tr2.calcPerimetro();
        // DONE 23 imprima os valores dos cálculos
        System.out.println("Área tr2: " + areaTr2);
        System.out.println("Perímetro tr2: " + perimTr2);
        
        // DONE 24 comente: o que acontece? o que fazer para consertar este problema?
        // R: valores inválidos são calculados. Para consertar esse problema,
        // é necessário chamar os métodos de set (atribuição) dentro do construtor
        // parametrizado!
        
    }
    
}
