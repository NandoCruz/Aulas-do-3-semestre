
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
        // R: o erro acontece, porque a classe TrianguloRetangulo faz parte de
        // outro pacote e ela está configurada como default, portanto só pode
        // ser acessada por classes do mesmo pacote.
        
        // DONE 14 escreva como comentário: o que pode ser feito para resolver o erro?
        // R: para resolver esse problema, poderíamos declarar a classe TrianguloRetangulo
        // como "public" ou colocar a classe TrianguloRetangulo no mesmo pacote
        // dessa classe que contém o método main.
        
        // DONE 15 altere o modificador da classe TrianguloRetangulo para public
        // DONE 16 escreva como comentário: por que o erro continua?
        // R: o erro permanece, porque é necessário realizar a importação da
        // classe TrianguloRetangulo aqui nessa classe
        
        // DONE 17 adicione a importação da classe TrianguloRetangulo (clique na lâmpada ao lado)
        
        // DONE 18 através do objeto, atribua valor dentro dos atributos diretamente
        tr1.cateto1 = 5.0;
        tr1.cateto2 = 7.0;
        tr1.hipotenusa = 12.5;
        tr1.alturaHipotenusa = 9.1;
        // DONE 19 escreva como comentário: é possível realizar esta atribuição? Justifique.
        // R: não é possível, porque os atributos estão declarados como default.
        // DONE 20 escreva como comentário: o que pode ser feito para resolver este problema?
        // R: para resolver esse problema, devemos declarar os atributos da classe
        // TrianguloRetangulo como public (solução ruim). 
        // A melhor solução seria criar métodos set e get para modificar e acessar 
        // os valores do atributos
    }
    
}
