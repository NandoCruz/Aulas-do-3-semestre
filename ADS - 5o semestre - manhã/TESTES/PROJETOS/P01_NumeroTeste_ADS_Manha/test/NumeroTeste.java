import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
import p01_numeroteste_ads_manha.Numero;

public class NumeroTeste {
    
    Numero n;
    
    public NumeroTeste() {
        n = new Numero();
    }

    @Test
    public void deveRetornarNulo() {
        assertEquals( "nulo", n.posNegNulo( 0 ) );
    }
    
    @Test
    public void deveRetornarPositivo() {
        assertEquals( "positivo", n.posNegNulo( 1 ) );
    }
    
    @Test
    public void deveRetornarNegativo() {
        assertEquals( "negativo", n.posNegNulo(-1) );
    }
    
    @Test
    public void deveRetornarPar() {
        assertEquals( "par", n.parImpar(2) );
        assertEquals( "par", n.parImpar(0) );
        assertEquals( "par", n.parImpar(-4) );
    }
    
    @Test
    public void deveRetornarImpar() {
        assertEquals( "ímpar", n.parImpar(3) );
        assertEquals( "ímpar", n.parImpar(-5) );
    }
    
}
