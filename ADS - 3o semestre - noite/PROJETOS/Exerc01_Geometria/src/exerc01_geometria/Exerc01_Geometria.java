
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
        // R: O erro aconteceu, porque a classe TrianguloRetangulo faz parte de um 
        // outro pacote e foi declarada como default
        
        // DONE 14 escreva como comentário: o que pode ser feito para resolver o erro?
        // R: para resolver o erro, devemos declarar a classe como pública (public)
        // ou colocar a classe no mesmo pacote da classe Exerc01_Geometria
        
        // DONE 15 altere o modificador da classe TrianguloRetangulo para public
        
        // DONE 16 escreva como comentário: por que o erro continua?
        // R: o erro continua, porque é necessário fazer a importação da classe 
        // TrianguloRetangulo que faz parte de OUTRO pacote
        
        // DONE 17 adicione a importação da classe TrianguloRetangulo (clique na lâmpada ao lado)
        
        // TODO 18 através do objeto, atribua valor dentro dos atributos diretamente
        tr1.cateto1 = 5.5;
        tr1.cateto2 = 4.5;
        tr1.hipotenusa = 7;
        tr1.alturaHipotenusa = 2.5;
        // DONE 19 escreva como comentário: é possível realizar esta atribuição? Justifique.
        // R: Não é possível, porque os atributos estão declarados como default e a 
        // classe está declarada em outro pacote.
        
        // DONE 20 escreva como comentário: o que pode ser feito para resolver este problema?
        // R: A melhor forma de resolver esse problema é declarar os atributos como private
        // e criar os métodos de configuração (de acesso) set e get como públicos.
        
    }
    
}
