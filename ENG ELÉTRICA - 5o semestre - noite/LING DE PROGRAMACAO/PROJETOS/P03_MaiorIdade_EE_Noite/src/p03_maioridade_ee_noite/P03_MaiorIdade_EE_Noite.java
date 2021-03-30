
package p03_maioridade_ee_noite;

import java.util.Scanner;

public class P03_MaiorIdade_EE_Noite {

    public static void main(String[] args) {
        // 1. declaração de variáveis:
        int anoNasc, idade;
        // 2. entrada de dados:
        Scanner sc = new Scanner(System.in);
        System.out.println("Informe o seu ano de nascimento:");
        anoNasc = sc.nextInt();
        // 3. processamento / saída de dados:
        idade = 2020 - anoNasc;
        if ( idade >= 18 ) {
            System.out.println("Maior de idade ("+idade+" anos)");
        } else {
            System.out.println("Menor de idade ("+idade+" anos)");
        }
        
        
    } // fim do main
    
} // fim da classe
