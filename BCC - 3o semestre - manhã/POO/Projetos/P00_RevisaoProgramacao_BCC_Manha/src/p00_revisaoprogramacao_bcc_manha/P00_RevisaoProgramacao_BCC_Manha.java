package p00_revisaoprogramacao_bcc_manha;

import java.util.Scanner;

public class P00_RevisaoProgramacao_BCC_Manha {

    public static void main(String[] args) {
        double n, media, soma = 0.0, 
                menor = 0, maior = 0;
        int    qtd = 0;
        Scanner sc = new Scanner(System.in);
        
        while(true) {
            System.out.println("Número: ");
            n = sc.nextDouble();
            if( qtd == 0 ) {
                maior = n;
                menor = n;
            }
            if( n == 0 ) break;
            soma = soma + n;
            qtd++;
            if( n > maior ) 
                maior = n;
            if( n < menor )
                menor = n;
        } // fim do while
        media = soma / qtd;
        System.out.println("Média: " + media);
        System.out.println("Menor: " + menor);
        System.out.println("Maior: " + maior);
        
        
    } // fim main
    
} // fim classe
