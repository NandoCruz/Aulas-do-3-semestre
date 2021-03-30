import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
import p02_somanumeros_teste_ads_manha.Dados;

public class DadosTeste {
    
    Dados d;
    
    public DadosTeste() {
        d = new Dados();
    }
    
    @Test
    public void deveRetornarSoma() {
        d.setDados("5,7,9");
        assertEquals(21.0, d.somaDados(), 0);
    }
    
    @Test
    public void deveRetornarSomaComNumerosReais() {
        d.setDados("5.3,7.2,9.5");
        assertEquals(22.0, d.somaDados(), 0);
    }
    
    @Test
    public void deveRetornarSomaComVirgulaNoFinal() {
        d.setDados("5,7,9,");
        assertEquals(21.0, d.somaDados(), 0);
    }
    
    @Test
    public void deveRetornarSomaComVirgulaNoInicio() {
        d.setDados(",5,7,9");
        assertEquals(21.0, d.somaDados(), 0);
    }
    
    @Test
    public void deveRetornarSomaUnicoNumero() {
        d.setDados("5");
        assertEquals(5.0, d.somaDados(), 0);
    }
    
    @Test
    public void deveRetornarSomaSemNumero() {
        d.setDados("");
        assertEquals(0.0, d.somaDados(), 0);
    }
    
    @Test
    public void deveRetornarSomaComEspacos() {
        d.setDados("5, 7, 9");
        assertEquals(21.0, d.somaDados(), 0);
    }
} // fim da classe DadosTeste





