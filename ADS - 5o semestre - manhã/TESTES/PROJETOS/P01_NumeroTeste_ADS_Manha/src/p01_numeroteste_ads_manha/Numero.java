
package p01_numeroteste_ads_manha;

public class Numero {
    
    public String posNegNulo( int n ) {
        if ( n > 0 )
            return "positivo";
        else if ( n < 0 )
            return "negativo";
        else 
            return "nulo";
    } // fim do método posNegNulo

    public String parImpar(int n) {
        if( n % 2 == 0 )
            return "par";
        else
            return "ímpar";
    }
    
} // fim da classe
