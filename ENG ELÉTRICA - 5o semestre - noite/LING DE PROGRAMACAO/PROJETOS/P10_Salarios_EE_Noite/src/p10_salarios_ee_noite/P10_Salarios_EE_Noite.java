
package p10_salarios_ee_noite;

import java.util.Scanner;

public class P10_Salarios_EE_Noite {

    public static void main(String[] args) {
        // 1. declaração de variáveis:
        double salario, somaSalarios = 0.0;
        // 2. entrada de dados:
        Scanner sc = new Scanner(System.in);
        // 3. processamento:
        while ( true ) {
            System.out.println("Salário R$ ");
            salario = sc.nextDouble();
            if ( salario <= 0 ) {
                break;
            }
            somaSalarios = somaSalarios + salario;
        } // fim while
        // 4. saída de dados:
        System.out.println("Soma dos salários R$ "+somaSalarios);
        System.out.println("15% da soma dos salários R$ "+(somaSalarios*0.15));
    } // fim do main
    
}
