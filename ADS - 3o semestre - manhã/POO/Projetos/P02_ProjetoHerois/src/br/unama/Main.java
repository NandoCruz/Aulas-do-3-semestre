package br.unama;

public class Main {

    public static void main(String[] args) {
        // criação de objeto através do construtor
        // não parametrizado:
        Heroi batman = new Heroi();
        batman.setNome( "Batman" );
        batman.setPeso( 81.5 );
        batman.setForcaDeAtaque( 900 );
        batman.imprimirAtributos();

        Heroi superman = new Heroi("Super Homem",
                79.6, 1000);
        superman.imprimirAtributos();

    } // fim do método main

} // fim da classe
