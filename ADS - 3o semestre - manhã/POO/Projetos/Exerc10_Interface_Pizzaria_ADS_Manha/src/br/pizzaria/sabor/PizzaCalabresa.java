package br.pizzaria.sabor;

import br.pizzaria.pizza.Borda;
import br.pizzaria.pizza.Pizza;

public class PizzaCalabresa implements Pizza, Borda {
    @Override
    public void preparar() {
        System.out.println("molho, queijo, calabresa, cebola");
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
    public void rechear(String recheio) {
        System.out.println("Sabor da borda: " + recheio);
    }
}
