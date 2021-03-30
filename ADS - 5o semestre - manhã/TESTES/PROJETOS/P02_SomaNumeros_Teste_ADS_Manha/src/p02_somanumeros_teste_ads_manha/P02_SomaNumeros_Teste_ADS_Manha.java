
package p02_somanumeros_teste_ads_manha;

import java.util.Scanner;

public class P02_SomaNumeros_Teste_ADS_Manha {

    public static void main(String[] args) {
        Dados d = new Dados();
        Scanner sc = new Scanner(System.in);
        while(true) {
            System.out.println("Informe uma string de números "
                    + "separados por vírgula (/s para sair)");
            String numeros = sc.nextLine();
            if(numeros.equalsIgnoreCase("/s")) break;
            d.setDados( numeros );
            System.out.println("Somatório: " + d.somaDados());
        }
    } // fim do main
    
}



