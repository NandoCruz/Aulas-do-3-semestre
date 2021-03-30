
package p01_projetonomeidade_ee_noite;

import java.util.Scanner;

public class P01_ProjetoNomeIdade_EE_Noite {

    public static void main(String[] args) {
        // 1. declaração de variáveis:
        String nome;
        int idade;
        // 2. entrada de dados:
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite o nome:");
        nome = sc.nextLine();
        System.out.println("Digite a idade:");
        idade = sc.nextInt();
        // 3. processamento e saída de dados:
        System.out.println(nome + " tem " + idade + " ano(s).");
        
    } // fim do main
    
} // fim da classe
