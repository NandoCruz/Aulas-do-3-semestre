
package exerc10_pizzaria_ads_noite;

import br.pizzaria.equipamento.Forno;
import br.pizzaria.sabor.PizzaCalabresa;
import br.pizzaria.sabor.PizzaNapolitana;

public class Exerc10_Pizzaria_ADS_Noite {

    public static void main(String[] args) {
        Forno forno = new Forno();
        
        PizzaCalabresa calabresa = new PizzaCalabresa();
        forno.fabricar(calabresa);
        forno.definirBorda(calabresa, "Catupiry");
        
        System.out.println("#############################");
        PizzaNapolitana napolitada = new PizzaNapolitana();
        forno.fabricar(napolitada);
    }
    
}
