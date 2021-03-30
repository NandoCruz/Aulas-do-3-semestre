package edu.unama.p04_contagasolina_ads_manha;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class Tela2 extends AppCompatActivity {
    // 8. declaração do componente dinâmico:
    TextView txtResultado;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tela2);
        // 9. integração entre XML e Java:
        txtResultado = findViewById(R.id.txt_resultado);
        // 10. pegar a Intent passada da Tela1 para a Tela2:
        Intent i = getIntent();
        // 11. desempacotar a Intent:
        String modelo    = i.getStringExtra("modelo");
        double distancia = i.getDoubleExtra("distancia", 0.0);
        double potencia  = i.getDoubleExtra("potencia", 0.0);
        double gasolina  = i.getDoubleExtra("gasolina", 0.0);
        double valorGasto = i.getDoubleExtra("valor_gasto", 0.0);
        // 12. montar a mensagem e mostrar na tela:
        String resultado = modelo + " " + potencia + " gasta R$ " + valorGasto +
                " para percorrer " + distancia + " km com gasolina a R$ " +
                gasolina + " por litro.";
        txtResultado.setText( resultado );
    } // fim do onCreate

    // 13. método que será chamado no compartilhamento:
    public void compartilhar(View v) {
        // 14. Intent implícita:
        Intent j = new Intent(Intent.ACTION_SEND);
        j.setType("text/plain");
        j.putExtra(Intent.EXTRA_SUBJECT, "Gasapp");
        j.putExtra(Intent.EXTRA_TEXT, txtResultado.getText().toString());
        startActivity(Intent.createChooser(j, "Compartilhar..."));
    } // fim do compartilhar

} // fim da classe
