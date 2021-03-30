package com.example.p05_appdesconto_ads_manha;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    // 1. declaração de componente dinâmico:
    EditText editProduto, editValor, editDesconto;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        // 2. integração entre XML e Java:
        editProduto   = findViewById(R.id.edit_produto);
        editValor     = findViewById(R.id.edit_valor);
        editDesconto  = findViewById(R.id.edit_desconto);
    } // fim do onCreate

    // 3. inflar o menu:
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu_tela1, menu);
        return true;
    }

    // 4. controlar o clique no menu:
    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        int idClicado = item.getItemId();
        switch (idClicado) {
            case R.id.menu1_calcular:
                // 5. pegar os valores digitados:
                String produto = editProduto.getText().toString();
                String valorDigitado = editValor.getText().toString();
                String descDigitado  = editDesconto.getText().toString();
                // 6. converter valores numéricos:
                double valor = Double.parseDouble(valorDigitado);
                double desconto = Double.parseDouble(descDigitado);
                // 7. calcular o desconto:
                double valorComDesconto = calcDesconto(valor, desconto);
                // 8. Intent explícita:
                Intent i = new Intent(this, Tela2.class);
                i.putExtra("produto", produto);
                i.putExtra("valor_desc", valorComDesconto);
                startActivity( i );
                return true;
            case R.id.menu1_limpar:
                // 9. limpar os campos
                editProduto.setText("");
                editValor.setText("");
                editDesconto.setText("");
                return true;
        }
        return super.onOptionsItemSelected(item);
    } // fim do onOptionsItemSelected

    public double calcDesconto(double valor, double desconto) {
        return valor * (100 - desconto) / 100.0;
    }



} // fim da classe
