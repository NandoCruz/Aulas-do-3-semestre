
package exerc06_banco;

import br.banco.transacao.PagamentoBoleto;
import br.banco.transacao.Transacao;
import br.banco.transacao.Transferencia;

public class Exerc06_Banco {

    public static void main(String[] args) {
        // DONE 05 - crie um objeto da classe PagamentoBoleto chamado boleto1
        PagamentoBoleto boleto1 = new PagamentoBoleto();

        // DONE 06 - através do objeto boleto1, acesse o método set dos atributos da classe e
        // atribua valores em todos eles, inclusive naqueles atributos que são herdados
        boleto1.setCedente("Empresa XYZ");
        boleto1.setDataVencimento("05/04/2020");
        boleto1.setLinhaDigitavel("279 727227 934938 474747 2827200080000");
        boleto1.setData("31/03/2020");
        boleto1.setDescricao("Taxa de condomínio");
        boleto1.setValor(200.00);

        // DONE 07 - crie um objeto da classe Transferencia chamado transf1
        Transferencia transf1 = new Transferencia();

        // DONE 08 - através do objeto transf1, acesse o método set dos atributos da classe e
        //////////// atribua valores em todos eles, inclusive naqueles atributos que são herdados
        transf1.setContaDestino("0101-1");
        transf1.setContaOrigem("9988-0");
        transf1.setData("31/03/2020");
        transf1.setDescricao("Empréstimo parcela 1/3");
        transf1.setValor(1000.00);

        // DONE 09 - chame a método emitirComprovante através do objeto boleto1
        boleto1.emitirComprovante();
        System.out.println("--------------------");
        // DONE 10 - chame a método emitirComprovante através do objeto transf1
        transf1.emitirComprovante();

        // DONE 11 - execute o projeto!
        
        // DONE 12 - comente: os atributos da superclasse (Transferencia) são impressos? Justifique.
        // R: Não, porque não eles foram chamados dentro dos métodos específicos
        // das classes PagamentoBoleto e Transferencia
        
        // DONE 13 - comente: o que pode ser feito para resolver este problema?
        // R: devemos chamar o método emitirComprovante através
        // do objeto super na classe filha, dentro do método emitirComprovante
        
        // DONE 14 - preste atenção para solucionar o problema! Depois, faça.

        // Indo além do exercício:
        // Transacao t1 = new Transacao(); // gera erro, pois a classe Transacao é abstrata
        
    }
    
}
