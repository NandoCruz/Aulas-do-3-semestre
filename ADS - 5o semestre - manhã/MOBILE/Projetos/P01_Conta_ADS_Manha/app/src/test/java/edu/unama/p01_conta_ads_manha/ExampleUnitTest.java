package edu.unama.p01_conta_ads_manha;

import android.view.View;

import org.junit.Test;

import java.lang.reflect.Method;

import static org.junit.Assert.*;

/**
 * Example local unit test, which will execute on the development machine (host).
 *
 * @see <a href="http://d.android.com/tools/testing">Testing documentation</a>
 */
public class ExampleUnitTest {
    @Test
    public void addition_isCorrect() {
        assertEquals(4, 2 + 2);
    }

    @Test
    public void teste_10porcento() {
        MainActivity m = new MainActivity();
        assertEquals(11.0, m.calculo10p(10.0), 0.0);
    }
}