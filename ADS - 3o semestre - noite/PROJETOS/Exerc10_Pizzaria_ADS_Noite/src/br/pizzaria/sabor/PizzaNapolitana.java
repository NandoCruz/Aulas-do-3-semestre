
package br.pizzaria.sabor;

import br.pizzaria.pizza.BordaRecheada;
import br.pizzaria.pizza.Pizza;

public class PizzaNapolitana implements Pizza, BordaRecheada {

    @Override
    public void preparar() {
        System.out.println("queijo, presunto, tomate, molho, orégano");
    }

    @Override
    public void assar() {
        System.out.println("19 minutos");
    }

    @Override
    public void cobrar() {
        System.out.println("R$ 38,00");
    }

    @Override
    public void borda(String sabor) {
        System.out.println("Sabor da borda: " + sabor);
    }
    
}
