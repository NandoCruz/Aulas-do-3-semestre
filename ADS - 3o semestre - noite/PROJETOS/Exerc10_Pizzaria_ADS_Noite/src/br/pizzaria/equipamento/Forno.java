
package br.pizzaria.equipamento;

import br.pizzaria.pizza.BordaRecheada;
import br.pizzaria.pizza.Pizza;

public class Forno {
    public void fabricar(Pizza pizza) {
        pizza.preparar();
        pizza.assar();
        pizza.cobrar();
    }
    public void definirBorda(BordaRecheada borda, String saborBorda) {
        borda.borda(saborBorda);
    }
}
