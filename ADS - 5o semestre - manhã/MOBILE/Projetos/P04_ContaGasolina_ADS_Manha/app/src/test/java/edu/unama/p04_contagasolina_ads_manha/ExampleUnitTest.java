package edu.unama.p04_contagasolina_ads_manha;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Example local unit test, which will execute on the development machine (host).
 *
 * @see <a href="http://d.android.com/tools/testing">Testing documentation</a>
 */
public class ExampleUnitTest {
    @Test
    public void testarCalculoDeValorGasto() {
        Tela1 t1 = new Tela1();
        double valor = t1.calcValorGasto(60, 1.5, 3.899);
        assertEquals(valor, 24.62, 0.01);
    }
}