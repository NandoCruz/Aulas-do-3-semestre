
package p07_priultletra_ee_noite;

import java.util.Scanner;

public class P07_PriUltLetra_EE_Noite {

    public static void main(String[] args) {
        // 1. declaração de variáveis:
        String palavra, primeira, ultima;
        int tamanho;
        // 2. entrada de dados:
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite uma palavra:");
        palavra = sc.nextLine();
        // 3. processamento:
        tamanho  = palavra.length();
        primeira = palavra.charAt( 0 ) + "";
        ultima   = palavra.charAt( tamanho - 1 ) + "";
        // 4. saída:
        System.out.println("primeiro caractere: "+primeira+
                " / último caractere: "+ultima);
        
    } // fim do main 
    
} // fim da classe
