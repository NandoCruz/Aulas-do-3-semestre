package com.example.p06_appavaliaserie;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.EditText;
import android.widget.RatingBar;
import android.widget.Spinner;
import android.widget.Switch;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    // 1. declaração de componentes dinâmicos:
    private EditText editTitulo;
    private Spinner spinGenero;
    private Switch swAtiva;
    private RatingBar rbAvaliacao;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        // 2. integração entre XML e Java:
        editTitulo = findViewById(R.id.edit_titulo);
        spinGenero = findViewById(R.id.spin_genero);
        swAtiva = findViewById(R.id.sw_ativa);
        rbAvaliacao = findViewById(R.id.rb_avaliacao);
    } // fim do onCreate

    // 3. inflar (mostrar) o menu:
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu_tela1, menu);
        return true;
    }

    // 4. clique no menu:
    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        // 5. pegar o id do item clicado:
        int itemClicado = item.getItemId();
        switch (itemClicado) {
            case R.id.item1_avaliar:
                // 6. pegar os valores digitados/escolhidos:
                String titulo = editTitulo.getText().toString();
                String genero = spinGenero.getSelectedItem().toString();
                boolean ativa = swAtiva.isChecked();
                double avaliacao = rbAvaliacao.getRating();
                // 6.1 validação de valores:
                if ( titulo.length() <= 1 ) {
                    Toast.makeText(this,
                            "Erro! Título da série precisa ter mais de uma letra.",
                            Toast.LENGTH_LONG).show();
                    return true;
                }
                if ( genero.equals("Escolha...") ) {
                    Toast.makeText(this,
                            "Erro! Escolha um gênero da série.",
                            Toast.LENGTH_LONG).show();
                    return true;
                }
                // 7. enviar esses valores para a Tela2 (Intent Explícita):
                Intent i = new Intent(this, Tela2.class);
                i.putExtra("titulo", titulo);
                i.putExtra("genero", genero);
                i.putExtra("ativa", ativa);
                i.putExtra("avaliacao", avaliacao);
                startActivity( i );
            return true;
        }
        return super.onOptionsItemSelected(item);
    }


} // fim da classe
