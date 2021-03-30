package br.unama;

public class Main {

    public static void main(String[] args) {
        // objeto com construtor não parametrizado:
        Carro c1 = new Carro();
        c1.imprimirAtributos();
        c1.setAnoFabricacao(2019);
        c1.setMarca("Ford Ka");
        c1.setQtdPortas(4);
        c1.imprimirAtributos();

        // objeto com construtor parametrizado:
        Carro c2 = new Carro(2017, 4, "Honda Fit");
        c2.imprimirAtributos();

        // chamando o método calcular consumo e imprimindo os resultados
        double consumoC1 = c1.calcConsumo(100);
        double consumoC2 = c2.calcConsumo(50);
        System.out.println("#############");
        System.out.println("Consumo do objeto c1: " + consumoC1);
        System.out.println("Consumo do objeto c2: " + consumoC2);
    } // fim do main

} // fim da classe
