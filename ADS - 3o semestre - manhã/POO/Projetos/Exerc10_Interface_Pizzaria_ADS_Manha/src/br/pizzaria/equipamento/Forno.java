package br.pizzaria.equipamento;

import br.pizzaria.pizza.Borda;
import br.pizzaria.pizza.Pizza;

public class Forno {
    public void fabricar(Pizza pizza) {
        pizza.preparar();
        pizza.assar();
        pizza.cobrar();
    }
    public void rechearBorda(Borda borda, String recheio) {
        borda.rechear(recheio);
    }
}
