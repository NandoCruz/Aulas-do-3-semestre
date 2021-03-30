
package p06_trigonometria_ee_noite;

import java.util.Scanner;

public class P06_Trigonometria_EE_Noite {

    public static void main(String[] args) {
        // 1. declaração de variáveis:
        String op;
        double resultado = 0.0, angRad;
        // 2. entrada de dados:
        Scanner sc = new Scanner(System.in);
        System.out.println("Qual operação deseja fazer?");
        System.out.println("Digite uma opção: cosseno, seno, tangente");
        op = sc.nextLine();
        System.out.println("Informe o grau em radianos:");
        angRad = sc.nextDouble();
        
        // 3. processamento:
        if(op.equalsIgnoreCase("cosseno")) {
            resultado = Math.cos(angRad);
        } else if(op.equalsIgnoreCase("seno")) {
            resultado = Math.sin(angRad);
        } else if(op.equalsIgnoreCase("tangente")) {
            resultado = Math.tan(angRad);
        } else {
            System.out.println("Erro! Opção inválida.");
            System.exit(0); // aborta a execução do programa!
        }
        System.out.println("Resultado do(a) " + op + " é " + resultado);
        
    } // fim do main
    
} // fim da classe
