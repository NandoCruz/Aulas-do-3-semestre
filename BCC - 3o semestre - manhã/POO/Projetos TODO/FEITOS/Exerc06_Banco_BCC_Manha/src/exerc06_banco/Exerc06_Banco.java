
package exerc06_banco;

import br.banco.transacao.PagamentoBoleto;
import br.banco.transacao.Transferencia;

public class Exerc06_Banco {

    public static void main(String[] args) {
        // DONE 05 - crie um objeto da classe PagamentoBoleto chamado boleto1
        PagamentoBoleto boleto1 = new PagamentoBoleto();
        // DONE 06 - através do objeto boleto1, acesse o método set dos atributos da classe e 
        //////////// atribua valores em todos eles, inclusive naqueles atributos que são herdados
        boleto1.setCedente("Cliente X");
        boleto1.setData("26/03/2020");
        boleto1.setDataVencimento("29/03/2020");
        boleto1.setDescricao("Boleto referente a taxa de condomínio.");
        boleto1.setLinhaDigitavel("2972 9 72819 19298129819 7218 92198729 1");
        boleto1.setValor(300.00);
        
        // DONE 07 - crie um objeto da classe Transferencia chamado transf1
        Transferencia transf1 = new Transferencia();
        
        // DONE 08 - através do objeto transf1, acesse o método set dos atributos da classe e 
        //////////// atribua valores em todos eles, inclusive naqueles atributos que são herdados
        transf1.setContaDestino("8978-9");
        transf1.setContaOrigem("11223-9");
        transf1.setData("26/03/2020");
        transf1.setDescricao("Transferência referente a empréstimo.");
        transf1.setValor(1000.00);
        
        // DONE 09 - chame a método emitirComprovante através do objeto boleto1
        boleto1.emitirComprovante();
        
        // DONE 10 - chame a método emitirComprovante através do objeto transf1
        transf1.emitirComprovante();
        
        // DONE 11 - execute o projeto!
        
        // DONE 12 - comente: os atributos da superclasse (Transferencia) são impressos? Justifique.
        //////////// R: Não, porque eles não foram chamados na classe específica, 
        // embora eles estejam sendo herdados
        
        // DONE 13 - comente: o que pode ser feito para resolver este problema?
        //////////// R: Para resolver esse problema, é necessário chamar os atributos
        // para imprimi-los.
        
        // DONE 14 - preste atenção para solucionar o problema! Depois, faça.
        // USAR O super
        
    }
    
}
