package br.pizzaria;

import br.pizzaria.equipamento.Forno;
import br.pizzaria.sabor.PizzaCalabresa;
import br.pizzaria.sabor.PizzaNapolitana;

public class Main {

    public static void main(String[] args) {
        Forno forno = new Forno();

        PizzaCalabresa calabresa = new PizzaCalabresa();
        forno.rechearBorda(calabresa, "Catupiry");
        forno.fabricar(calabresa);

        System.out.println("###############################");

        PizzaNapolitana napolitana = new PizzaNapolitana();
        forno.fabricar(napolitana);
    }
}
