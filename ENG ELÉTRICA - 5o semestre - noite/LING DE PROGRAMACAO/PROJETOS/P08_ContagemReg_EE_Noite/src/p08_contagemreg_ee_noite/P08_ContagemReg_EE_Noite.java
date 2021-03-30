
package p08_contagemreg_ee_noite;

public class P08_ContagemReg_EE_Noite {

    public static void main(String[] args) throws InterruptedException {
        // Contagem regressiva de 10 a 1
        System.out.println("### Versão com for ###");
        for ( int i = 10; i >= 1; i-- ) {
            System.out.println( i );
            Thread.sleep(1000);
        }
        System.out.println("### Versão com while ###");
        int j = 10;
        while( j >= 1 ) {
            System.out.println( j );
            Thread.sleep(1000);
            j--;
        }
        System.out.println("### Versão com do-while ###");
        int k = 10;
        do {
            System.out.println( k );
            Thread.sleep(1000);
            k--;
        } while ( k >= 1 );
        
    } // fim do main
    
} // fim da classe
