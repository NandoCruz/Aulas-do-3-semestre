
package p12_projetoherois_ee_noite;

public class P12_ProjetoHerois_EE_Noite {

    public static void main(String[] args) {
        // objeto através do construtor não parametrizado:
        Heroi batman = new Heroi();
        batman.setUniforme("Morcego");
        batman.setAltura(1.92);
        batman.setPeso(89.2);
        System.out.println("Uniforme: " + batman.getUniforme());
        System.out.println("Altura: " + batman.getAltura());
        System.out.println("Peso: " + batman.getPeso());
        
        System.out.println("##############################");
        
        // objeto através do construtor parametrizado:
        Heroi superman = new Heroi("Roupa azul e capa vermelha", 1.93, 87.5);
        System.out.println("Uniforme: " + superman.getUniforme());
        System.out.println("Altura: " + superman.getAltura());
        System.out.println("Peso: " + superman.getPeso());
        
    } // fim do main
    
} // fim da classe
