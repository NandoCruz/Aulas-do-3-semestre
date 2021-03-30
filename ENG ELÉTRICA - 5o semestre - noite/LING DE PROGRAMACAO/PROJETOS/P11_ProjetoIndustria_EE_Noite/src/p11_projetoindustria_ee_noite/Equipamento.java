
package p11_projetoindustria_ee_noite;

public class Equipamento {
    // atributos:
    String marca;
    int anoFabricacao;
    double peso;
    
    // métodos:
    int calcTempoVida( int anoReferencia ) {
        int tempoVida = anoReferencia - anoFabricacao;
        return tempoVida;
    }
    
    void imprimirAtributos() {
        System.out.println("Marca: " + marca);
        System.out.println("Ano fabricação: " + anoFabricacao);
        System.out.println("Peso (kg): " + peso);
    }
    
} // fim da classe
