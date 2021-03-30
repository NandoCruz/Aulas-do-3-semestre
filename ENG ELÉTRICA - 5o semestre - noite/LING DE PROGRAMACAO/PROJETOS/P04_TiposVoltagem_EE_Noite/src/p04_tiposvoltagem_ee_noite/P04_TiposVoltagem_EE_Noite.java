
package p04_tiposvoltagem_ee_noite;

import java.util.Scanner;

public class P04_TiposVoltagem_EE_Noite {

    public static void main(String[] args) {
        // 1. declaração de variáveis:
        double kv;
        // 2. entrada de dados:
        Scanner sc = new Scanner(System.in);
        System.out.println("Entre com o valor do kv:");
        kv = sc.nextDouble();
        // 3. processamento / saída:
        if( kv < 1 ) {
            System.out.println("BT");
        } else if ( kv >= 1 && kv <= 50) {
            System.out.println("MT");
        } else if ( kv > 50 && kv <= 230) {
            System.out.println("AT");
        } else if( kv > 230 && kv <= 750) {
            System.out.println("EAT");
        } else {
            System.out.println("UAT");
        }
    
        
    } // fim do main
    
} // fim da classe
