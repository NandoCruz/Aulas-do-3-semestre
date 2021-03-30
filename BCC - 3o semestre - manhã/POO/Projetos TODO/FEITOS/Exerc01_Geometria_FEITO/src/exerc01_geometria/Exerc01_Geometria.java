
package exerc01_geometria;

import dimensao.bidimensional.TrianguloRetangulo;

public class Exerc01_Geometria {
    
    // DONE 1 crie um pacote chamado dimensao
    // DONE 2 dentro do pacote dimensao, crie outro pacote chamado bidimensional
    // DONE 3 dentro do pacote dimensao.bidimensional, crie a classe TrianguloRetangulo

    public static void main(String[] args) {
        // DONE 12 crie aqui um objeto da classe TrianguloRetangulo
        TrianguloRetangulo tr1 = new TrianguloRetangulo();
        // DONE 13 escreva como comentário: por que aconteceu um erro na criação do objeto?
        // R: O erro ocorre porque a classe TrianguloRetangulo está
        // configurada como default e faz parte de outro pacote
        
        // DONE 14 escreva como comentário: o que pode ser feito para resolver o erro?
        // R: Para resolver esse erro, devemos declarar a classe TrianguloRetangulo
        // como "public" ou no mesmo pacote desta classe (desorganizado)
        
        // DONE 15 altere o modificador da classe TrianguloRetangulo para public
        // DONE 16 escreva como comentário: por que o erro continua?
        // R: O erro permanece porque é preciso fazer a importação
        // da classe TrianguloRetangulo que faz parte de outro pacote
        
        // DONE 17 adicione a importação da classe TrianguloRetangulo (clique na lâmpada ao lado)
        
        // DONE 18 através do objeto, atribua valor dentro dos atributos diretamente
        tr1.cateto1 = 1.5;
        tr1.cateto2 = 2.5;
        tr1.hipotenusa = 4.25;
        tr1.alturaHipotenusa = 3.0;
        // DONE 19 escreva como comentário: é possível realizar esta atribuição? Justifique.
        // R: Não, porque os atributos estão declarados como default e fazem
        // parte de outro pacote.
        
        // DONE 20 escreva como comentário: o que pode ser feito para resolver este problema?
        // R: Encapsular a classe!
        
    }
    
}
