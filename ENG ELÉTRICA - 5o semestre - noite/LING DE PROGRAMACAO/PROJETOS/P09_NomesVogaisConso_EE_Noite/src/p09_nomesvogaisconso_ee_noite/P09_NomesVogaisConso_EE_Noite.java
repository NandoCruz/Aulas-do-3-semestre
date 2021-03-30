
package p09_nomesvogaisconso_ee_noite;

import java.util.Scanner;

public class P09_NomesVogaisConso_EE_Noite {

    public static void main(String[] args) {
        // 1. declaração de variáveis:
        String nome;
        int qtdVogais = 0, qtdConsoantes = 0;
        // 2. entrada de dados:
        Scanner sc = new Scanner(System.in);
        // 3. processamento:
        for ( int i = 1; i <= 10; i++ ) {
            System.out.println("Digite nome "+i+":");
            nome = sc.nextLine();
            char priChar = nome.toLowerCase().charAt(0);
            if ( priChar == 'a' || priChar == 'e' || priChar == 'i' || 
                 priChar == 'o' || priChar == 'u') {
                qtdVogais++;
            } else {
                qtdConsoantes++;
            }
        } // fim do for
        
        // 4. saída de dados (resultado):
        System.out.println("Qtd de nomes que iniciam com vogal: " + qtdVogais);
        System.out.println("Qtd de nomes que iniciam com consoantes: " + qtdConsoantes);
        
    } // fim do main
    
} // fim da classe
