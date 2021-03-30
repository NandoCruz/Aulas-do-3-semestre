
package p01_gorjeta_ads_manha;

import java.util.Scanner;

public class P01_Gorjeta_ADS_Manha {

    public static void main(String[] args) {
        // declaração de variáveis:
        double conta, gorjeta;
        Scanner sc = new Scanner(System.in);
        while(true) {
            // entrada de dados:
            System.out.println("Valor da conta:");
            conta = sc.nextDouble();
            if(conta <= 0) break;
            // processamento:
            gorjeta = conta * 1.1;
            // saída formatada:
            System.out.printf("Valor com gorjeta %.2f \n", gorjeta);
        }
        System.out.println("Erro! Valor inválido!");
        
    } // fim do main
    
} // fim da classe
