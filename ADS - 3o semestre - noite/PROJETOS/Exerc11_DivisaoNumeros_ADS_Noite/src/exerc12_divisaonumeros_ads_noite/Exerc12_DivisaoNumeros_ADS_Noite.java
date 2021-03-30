package exerc12_divisaonumeros_ads_noite;

import javax.swing.JOptionPane;

public class Exerc12_DivisaoNumeros_ADS_Noite {

    public static void main(String[] args) {
        int n1 = 0, n2 = 0, divisao;
        while (n1 >= 0 && n2 >= 0) {
            try {
                // entradas:
                String n1Dig = Util.entrada("Digite um número int maior que zero:");
                String n2Dig = Util.entrada("Digite outro número int maior que zero:");
                // conversão de dados:
                n1 = Integer.parseInt(n1Dig.replace(",", "."));
                n2 = Integer.parseInt(n2Dig.replace(",", "."));
                // processamento:
                divisao = n1 / n2;
                // saída:
                Util.saida(n1 + " / " + n2 + " = " + divisao, "Resultado", 
                        JOptionPane.INFORMATION_MESSAGE);
            } catch (ArithmeticException e) {
                Util.saida("Erro no cálculo matemático.\nVocê está tentando dividir por zero?",
                        "Erro!", JOptionPane.ERROR_MESSAGE);
            } catch (NumberFormatException e) {
                Util.saida( "Erro de formatação do número.\nVocê informou números inteiros?",
                        "Erro!", JOptionPane.ERROR_MESSAGE);
            } catch (Exception e) {
                Util.saida(e.getMessage(), "Erro!", JOptionPane.ERROR_MESSAGE);
            }
            
        } // fim do while

        System.out.println( Integer.parseInt("alan") );
    }
    
}
