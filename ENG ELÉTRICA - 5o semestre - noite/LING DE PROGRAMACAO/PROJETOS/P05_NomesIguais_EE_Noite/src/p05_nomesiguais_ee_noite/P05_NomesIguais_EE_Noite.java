
package p05_nomesiguais_ee_noite;

import java.util.Scanner;

public class P05_NomesIguais_EE_Noite {

    public static void main(String[] args) {
        // 1. declaração de variáveis:
        String nome1, nome2;
        int    tamNome1, tamNome2;
        // 2. entrada de dados:
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite o 1o nome:");
        nome1 = sc.nextLine();
        System.out.println("Digite o 2o nome:");
        nome2 = sc.nextLine();
        // 3. processamento:
        nome1 = nome1.trim();
        nome2 = nome2.trim();
        tamNome1 = nome1.length();
        tamNome2 = nome2.length();
        if ( nome1.equalsIgnoreCase(nome2) ) {
            System.out.println("Nomes iguais.");
        } else {
            System.out.println("Nomes diferentes.");
        }
        System.out.println(nome1+" possui "+tamNome1+" caracteres.");
        System.out.println(nome2+" possui "+tamNome2+" caracteres.");
        
    } // fim do main
    
} // fim do main
