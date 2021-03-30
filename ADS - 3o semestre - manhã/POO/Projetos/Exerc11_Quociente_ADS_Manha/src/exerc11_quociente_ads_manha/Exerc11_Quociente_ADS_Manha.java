package exerc11_quociente_ads_manha;

import java.util.InputMismatchException;
import javax.swing.JOptionPane;

public class Exerc11_Quociente_ADS_Manha {

    public static void main(String[] args) {
        int n1 = 0, n2 = 0, quociente;
        while(n1 >= 0 && n2 >= 0) {
            try {
                String n1Dig = Util.entrada("Digite valor inteiro (n1):");
                n1 = Integer.parseInt( n1Dig ); // conversão de String para int
                String n2Dig = Util.entrada("Digite valor inteiro (n2):");
                n2 = Integer.parseInt( n2Dig ); // conversão de String para int

                quociente = n1 / n2;

                Util.saida(n1 + " / " + n2 + " = " + quociente, "Quociente", JOptionPane.INFORMATION_MESSAGE);
                
            } catch(InputMismatchException e) {
                Util.saida("O valor informado não um número inteiro.\n"
                        + "Detalhes: " + e.getMessage(), "Erro", JOptionPane.ERROR_MESSAGE);
            } catch(ArithmeticException e) {
                Util.saida("O cálculo não pode ser feito.\n"
                        + "Detalhes: " + e.getMessage(), "Erro", JOptionPane.ERROR_MESSAGE);
            } catch(Exception e) {
                Util.saida("Detalhes: " + e.getMessage(), "Erro", JOptionPane.ERROR_MESSAGE);
            }
        } // fim do while
    }
    
}
