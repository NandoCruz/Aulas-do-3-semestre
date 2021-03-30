package com.example.p05_appdesconto_ads_manha;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.TextView;

public class Tela2 extends AppCompatActivity {
    // 10. declaração de componente dinâmico:
    TextView txtResultado;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tela2);
        // 11. integração entre XML e Java:
        txtResultado = findViewById(R.id.txt_resultado);
        // 12. pegar a Intent passada para cá:
        Intent j = getIntent();
        String produto = j.getStringExtra("produto");
        double valorDesc = j.getDoubleExtra("valor_desc", 0.0);
        String resultado = produto + " R$ " + valorDesc;
        // 13. atribuir o valor de resultado:
        txtResultado.setText( resultado );
    } // fim do onCreate

    // 14. inflar menu da Tela2
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu_tela2, menu);
        return true;
    }

    // 15. controle dos itens de menu:
    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        int idClicado = item.getItemId();
        switch (idClicado) {
            case R.id.menu2_compartilhar:
                // 16. compartilhar resultado:
                Intent k = new Intent(Intent.ACTION_SEND);
                k.setType("text/plain");
                k.putExtra(Intent.EXTRA_SUBJECT, "AppDesconto");
                k.putExtra(Intent.EXTRA_TEXT, txtResultado.getText().toString());
                startActivity( Intent.createChooser(k, "Compartilhar...") );
                return true;
        }
        return super.onOptionsItemSelected(item);
    }


} // fim da classe
