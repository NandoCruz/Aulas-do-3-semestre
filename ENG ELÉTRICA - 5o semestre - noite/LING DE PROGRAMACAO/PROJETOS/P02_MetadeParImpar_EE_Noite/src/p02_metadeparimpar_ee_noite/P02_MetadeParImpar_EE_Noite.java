
package p02_metadeparimpar_ee_noite;

import java.util.Scanner;

public class P02_MetadeParImpar_EE_Noite {

    public static void main(String[] args) {
        // 1. declaração de variáveis:
        int n;
        int resto;
        // 2. entrada de dados:
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite um número inteiro:");
        n = sc.nextInt();
        // 3. processamento:
        resto = n % 2;
        if ( resto == 0 ) { // par
            System.out.println("Metade de "+n+" é " + (n/2.0));
        } else { // ímpar
            System.out.println("Dobro de "+n+" é " + (n*2));
        }
        
    } // fim do main
    
} // fim da classe
