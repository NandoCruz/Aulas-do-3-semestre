
package p02_projetoheroi_ads_noite;

public class P02_ProjetoHeroi_ADS_Noite {

    public static void main(String[] args) {
        // 6. criar objeto pelo construtor não parametrizado:
        Heroi batman = new Heroi();
        // 7. chamar o método de imprimirAtributos:
        batman.setAltura( 1.98 );
        batman.setForcaAtaque( 900 );
        batman.setGenero( "Masculino" );
        batman.imprimirAtributos();
        
        // 8. criar objeto pelo cosntrutor parametrizado:
        Heroi superman = new Heroi("Masculino", 1000, 1.81);
        superman.imprimirAtributos();
        
        System.out.println("----------------");
        // 9. chamando o método atacar:
        System.out.println("Ataque batman: " + batman.atacar());
        System.out.println("Ataque superman: " + 
                superman.atacar());
        
        
    } // fim do main
    
} // fim da classe
