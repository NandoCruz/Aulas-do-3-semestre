
package p01_numeroteste_ads_manha;

import java.util.Scanner;

public class P01_NumeroTeste_ADS_Manha {

    public static void main(String[] args) {
        Numero n = new Numero();
        Scanner sc = new Scanner(System.in);
        System.out.println("Entre com um número:");
        int numero = sc.nextInt();
        String resultado = n.posNegNulo(numero);
        System.out.println(numero + " é " + resultado);
        
    } // fim do main
    
} // fim da classe
