
package p02_projetoheroi_bcc_manha;

public class P02_ProjetoHeroi_BCC_Manha {

    public static void main(String[] args) {
        Heroi batman = new Heroi();
        batman.setNome("Batman");
        batman.setSuperForca(false);
        batman.setVelocDeCorrida(15);
        batman.imprimir();
        
        Heroi superman = new Heroi("Superman", true, 8000);
        superman.imprimir();
        
    } // fim do main
    
} // fim da classe
