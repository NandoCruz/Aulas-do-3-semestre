
package exerc12_teste_bcc_manha;

import java.util.InputMismatchException;
import java.util.Scanner;
import javax.swing.JOptionPane;

public class Exerc12_Teste_BCC_Manha {

    public static void main(String[] args) {
        int n1 = 0, n2 = 0, resto, quociente;
        while(n1 >= 0 && n2 >= 0) {
            try {
                String n1Dig = Util.entrada("Entre com n1:");
                n1 = Integer.parseInt(n1Dig); // conversão str2int
                String n2Dig = Util.entrada("Entre com n2:");
                n2 = Integer.parseInt(n2Dig); // conversão str2int
                
                resto = n1 % n2;
                quociente = n1 / n2;
                
                Util.saida(n1+" % "+n2+" = "+resto + "\n" + 
                           n1+" / "+n2+" = "+quociente,
                           "Resultado",
                           JOptionPane.INFORMATION_MESSAGE);
            } catch(ArithmeticException e) {
                Util.saida("Erro no cálculo aritmético."
                           + "\nDetalhes: " + e.getMessage(),
                           "Erro",
                           JOptionPane.ERROR_MESSAGE);  
            } catch(InputMismatchException | NumberFormatException e) {
                Util.saida("Erro no tipo de dados. "
                           + "Você está digitando números inteiros?" 
                           + "\nDetalhes: " + e.getMessage(),
                           "Erro",
                           JOptionPane.ERROR_MESSAGE);
//                e.printStackTrace();
            } 
        }
    }
    
}
