package br.pizzaria.sabor;

import br.pizzaria.pizza.Borda;
import br.pizzaria.pizza.Pizza;

public class PizzaNapolitana implements Pizza, Borda {
    @Override
    public void preparar() {
        System.out.println("molho, queijo, presunto, tomate, orégano");
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
    public void rechear(String recheio) {
        System.out.println("Sabor da borda: " + recheio);
    }
}
