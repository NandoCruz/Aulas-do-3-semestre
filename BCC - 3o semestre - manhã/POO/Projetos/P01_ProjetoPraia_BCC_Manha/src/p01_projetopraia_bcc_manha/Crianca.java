
package p01_projetopraia_bcc_manha;

public class Crianca {
    // atributos:
    String corCabelo;
    String corPele;
    double altura;
    int    idade;
    
    // métodos:
    void brincar(){
        System.out.println("Brincando...");
    }
    void correr(double metros) {
        System.out.println("Correndo por " 
                + metros + " metros");
    }
    void nadar(double metros) {
        System.out.println("Nadando por " 
                + metros + " metros");
    }
    String sorrir() {
        return ":)";
    }
    
    void imprimirAtributos() {
        System.out.println("Cor do cabelo: " + corCabelo);
        System.out.println("Cor da pele: "   + corPele);
        System.out.println("Altura: " + altura);
        System.out.println("Idade: "  + idade);
    }
    
} // fim da classe
