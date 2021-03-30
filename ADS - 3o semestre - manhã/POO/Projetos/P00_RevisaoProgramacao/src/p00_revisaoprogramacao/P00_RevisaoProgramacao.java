package p00_revisaoprogramacao;

import java.util.Scanner;

public class P00_RevisaoProgramacao {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // 1. declaração de variáveis:
        double numDigitado, soma = 0.0, 
                media, maior = Double.MIN_VALUE, 
                menor = Double.MAX_VALUE;
        int qtd = 0;
        // 2. entrada e processamento de dados:
        while(true) {
            System.out.println("Digite um número:");
            numDigitado = sc.nextDouble();
            if(numDigitado == 0){
                break;
            } else {
                soma = soma + numDigitado;
                qtd++;
                if(numDigitado > maior)
                    maior = numDigitado;
                if(numDigitado < menor)
                    menor = numDigitado;
            }
        } // fim do while
        media = soma / qtd;
        System.out.println("Média: " + media);
        System.out.println("Menor valor: " + menor);
        System.out.println("Maior valor: " + maior);
        
    } // fim do main
    
} // fim do programa
