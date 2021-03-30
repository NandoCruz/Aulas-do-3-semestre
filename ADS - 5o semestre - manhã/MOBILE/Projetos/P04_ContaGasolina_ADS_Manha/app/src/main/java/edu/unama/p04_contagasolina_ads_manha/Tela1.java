package edu.unama.p04_contagasolina_ads_manha;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class Tela1 extends AppCompatActivity {
    // 1. declaração de componentes dinâmicos:
    EditText campoModelo, campoDistancia, campoPotencia, campoGasolina;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tela1);
        // 2. integração entre XML e Java:
        campoModelo    = findViewById(R.id.edit_modelo);
        campoDistancia = findViewById(R.id.edit_distancia);
        campoPotencia  = findViewById(R.id.edit_potencia);
        campoGasolina  = findViewById(R.id.edit_gasolina);
    } // fim do onCreate

    // 3. método que será executado quando o botão calcular for tocado:
    public void botaoCalcular(View v) {
        // 4. pegar os valores digitados:
        String modelo       = campoModelo.getText().toString();
        String distanciaStr = campoDistancia.getText().toString();
        String potenciaStr  = campoPotencia.getText().toString();
        String gasolinaStr  = campoGasolina.getText().toString();
        // 5. conversão de String para double:
        double distancia = Double.parseDouble(distanciaStr);
        double potencia  = Double.parseDouble(potenciaStr);
        double gasolina  = Double.parseDouble(gasolinaStr);
        // 6. cálculo do valor gasto no trajeto:
        double valorGasto = calcValorGasto(distancia, potencia, gasolina);
        // 7. enviar os dados para outra activity (Intent explícita):
        Intent i = new Intent(this, Tela2.class);
        i.putExtra("modelo",    modelo);
        i.putExtra("distancia", distancia);
        i.putExtra("potencia",  potencia);
        i.putExtra("gasolina",  gasolina);
        i.putExtra("valor_gasto", valorGasto);
        startActivity( i );

    } // fim do botaoCalcular

    public double calcValorGasto(double distancia, double potencia, double gasolina) {
        double autonomia;
        if(potencia <= 1.0)
            autonomia = 13;
        else if(potencia > 1.0 && potencia <= 1.4)
            autonomia = 11;
        else if(potencia > 1.4 && potencia <= 1.9)
            autonomia = 9.50;
        else
            autonomia = 7.75;

        return (distancia * gasolina / autonomia);

    }

} // fim da classe
