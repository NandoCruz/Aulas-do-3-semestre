
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
        boleto1.setData("21/05/2020");
        boleto1.setDataVencimento("23/05/2020");
        boleto1.setDescricao("Boleto de prestação de serviço.");
        boleto1.setLinhaDigitavel("79877483243284832098487328943243");
        boleto1.setValor( 1900.80 );
        
        // DONE 07 - crie um objeto da classe Transferencia chamado transf1
        Transferencia transf1 = new Transferencia();
        // DONE 08 - através do objeto transf1, acesse o método set dos atributos da classe e 
        //////////// atribua valores em todos eles, inclusive naqueles atributos que são herdados
        transf1.setContaDestino("2167");
        transf1.setContaOrigem("09087223");
        transf1.setData("13/05/2020");
        transf1.setDescricao("Transferência de empréstimo.");
        transf1.setValor( 800.00 );
        
        // DONE 09 - chame a método emitirComprovante através do objeto boleto1
        boleto1.emitirComprovante();
        // DONE 10 - chame a método emitirComprovante através do objeto transf1
        transf1.emitirComprovante();
        
        // DONE 11 - execute o projeto!
        
        // DONE 12 - comente: os atributos da superclasse (Transferencia) são impressos? Justifique.
        //////////// R: não, porque o método emitirComprovante é da classe filha.
        
        // DONE 13 - comente: o que pode ser feito para resolver este problema?
        //////////// R: para resolver esse problema, devemos executar o método
        // emitirComprovante da classe Transacao dentro do método de mesmo nome
        // das classes filhas.
        
        // DONE 14 - preste atenção para solucionar o problema! Depois, faça.
        
    }
    
}
