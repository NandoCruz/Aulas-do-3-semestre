
package p01_projetopraia_bcc_manha;

public class GuardaSol {
    // atributos:
    String  marca;
    double  tamanho;
    boolean fechado = true;
    
    // métodos/funções:
    void abrir()
    {
        if(fechado == true) {
            System.out.println("Abrindo guarda sol");
            fechado = false;
        } else {
            System.out.println("Guarda sol já está aberto");
        }
    }
    
    void fechar() 
    {
        if(fechado == false) {
            System.out.println("Fechando guarda sol");
            fechado = true;
        } else {
            System.out.println("Guarda sol já está fechado");
        }
    }
    
} //fim da classe
