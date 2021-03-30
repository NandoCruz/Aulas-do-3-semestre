
package exerc06_banco;

import br.banco.transacao.PagamentoBoleto;
import br.banco.transacao.Transferencia;

public class Exerc06_Banco {

    public static void main(String[] args) {
        // DONE 05 - crie um objeto da classe PagamentoBoleto chamado boleto1
        PagamentoBoleto boleto1 = new PagamentoBoleto();
        // DONE 06 - através do objeto boleto1, acesse o método set dos atributos da classe e 
        //////////// atribua valores em todos eles, inclusive naqueles atributos que são herdados
        boleto1.setCedente("Empresa XYZ");
        boleto1.setDataVencimento("05/04/2020");
        boleto1.setLinhaDigitavel("2798 8 922998 829 832983928 3829832");
        boleto1.setData("30/03/2020");
        boleto1.setDescricao("Boleto referente a mensalidade do mês 04");
        boleto1.setValor(800.00);
        
        // DONE 07 - crie um objeto da classe Transferencia chamado transf1
        Transferencia transf1 = new Transferencia();
        // DONE 08 - através do objeto transf1, acesse o método set dos atributos da classe e 
        //////////// atribua valores em todos eles, inclusive naqueles atributos que são herdados
        transf1.setContaDestino("01199-0");
        transf1.setContaOrigem("1233");
        transf1.setData("30/03/2020");
        transf1.setDescricao("Transferência do empréstimo");
        transf1.setValor(1000.00);
        
        // DONE 09 - chame a método emitirComprovante através do objeto boleto1
        boleto1.emitirComprovante();
        // DONE 10 - chame a método emitirComprovante através do objeto transf1
        transf1.emitirComprovante();
        
        // DONE 11 - execute o projeto!
        
        // DONE 12 - comente: os atributos da superclasse (Transacao) são impressos? Justifique.
        //////////// R: Não, porque eles não são chamados nas classes filhas.
        
        // DONE 13 - comente: o que pode ser feito para resolver este problema?
        //////////// R: Podemos chamar os métodos gets da superclasse dentro do 
        // emitirComprovante de cada classe
        
        // DONE 14 - preste atenção para solucionar o problema! Depois, faça.
        
    }
    
}
