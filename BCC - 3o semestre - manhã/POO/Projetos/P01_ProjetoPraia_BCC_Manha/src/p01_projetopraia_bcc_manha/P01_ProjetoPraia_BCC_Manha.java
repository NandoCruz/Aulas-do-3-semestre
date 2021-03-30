
package p01_projetopraia_bcc_manha;

public class P01_ProjetoPraia_BCC_Manha {

    public static void main(String[] args) {
        // criar um objeto da classe Crianca:
        Crianca c1; // variável!
        c1 = new Crianca(); // objeto!
        System.out.println("### Objeto c1 ###");
        c1.imprimirAtributos();
        
        // criando outro objeto:
        Crianca c2 = new Crianca();
        c2.corCabelo = "preto";
        c2.corPele   = "parda";
        c2.altura    = 1.45;
        c2.idade     = 7;
        System.out.println("### Objeto c2 ###");
        c2.imprimirAtributos();
        c2.brincar();
        c2.correr(0.76);
        c2.nadar(0.43);
        System.out.println( c2.sorrir() );
        
        // objeto da classe guarda sol
        GuardaSol g1 = new GuardaSol();
        g1.abrir();
        g1.fechar();
        
        
    } // fim do main
    
} // fim da classe
