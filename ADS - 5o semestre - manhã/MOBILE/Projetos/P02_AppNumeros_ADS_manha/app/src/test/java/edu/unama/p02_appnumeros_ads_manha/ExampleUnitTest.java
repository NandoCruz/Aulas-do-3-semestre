package edu.unama.p02_appnumeros_ads_manha;

import org.junit.Test;

import static org.junit.Assert.*;

public class ExampleUnitTest {
    MainActivity tela = new MainActivity();
    @Test
    public void testarParImpar() {
        assertEquals( true, tela.isPar(4) );
        assertEquals( false, tela.isPar(5) );
        assertEquals( true, tela.isPar(-4) );
        assertEquals( false, tela.isPar(-5) );
        assertEquals( true, tela.isPar(0) );
    }
}