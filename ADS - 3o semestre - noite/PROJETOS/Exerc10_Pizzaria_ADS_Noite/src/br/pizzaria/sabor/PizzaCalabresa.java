
package br.pizzaria.sabor;

import br.pizzaria.pizza.BordaRecheada;
import br.pizzaria.pizza.Pizza;

public class PizzaCalabresa implements Pizza, BordaRecheada {

    @Override
    public void preparar() {
        System.out.println("queijo, calabresa, molho, tomate");
    }

    @Override
    public void assar() {
        System.out.println("15 minutos");
    }

    @Override
    public void cobrar() {
        System.out.println("R$ 32,00");
    }

    @Override
    public void borda(String sabor) {
        System.out.println("Sabor da borda: " + sabor);
    }
    
}
