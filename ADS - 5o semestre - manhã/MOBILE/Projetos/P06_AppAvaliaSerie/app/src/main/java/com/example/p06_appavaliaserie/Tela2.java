package com.example.p06_appavaliaserie;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.TextView;

public class Tela2 extends AppCompatActivity {
    // 8. declaração de componentes dinâmicos:
    private TextView txtTitulo, txtGenero, txtAtiva, txtAvaliacao;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tela2);
        // 9. integração entre XML e Java:
        txtTitulo = findViewById(R.id.txt2_titulo);
        txtGenero = findViewById(R.id.txt2_genero);
        txtAtiva = findViewById(R.id.txt2_ativa);
        txtAvaliacao = findViewById(R.id.txt2_avaliacao);
        // 10. pegar e desempacotar a Intent:
        Intent j = getIntent();
        String titulo = j.getStringExtra("titulo");
        String genero = j.getStringExtra("genero");
        boolean ativa = j.getBooleanExtra("ativa", false);
        double avaliacao = j.getDoubleExtra("avaliacao", 0.0);
        // 11. atribuir os valores nos campos da Tela2:
        txtTitulo.setText( titulo );
        txtGenero.setText( genero );
        txtAtiva.setText( ativa ? "Sim" : "Não" );
        txtAvaliacao.setText( avaliacao + "");
    } // fim do onCreate

    // 12. inflar (mostrar) o menu:
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu_tela2, menu);
        return true;
    }

    // 13. controlar o menu:
    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        // 14. pegar o id do item de menu selecionado:
        int itemClicado = item.getItemId();
        switch (itemClicado) {
            case R.id.item2_compartilhar:
                // 15. criar Intent implícita:
                Intent k = new Intent(Intent.ACTION_SEND);
                k.setType("text/plain");
                k.putExtra(Intent.EXTRA_SUBJECT, "Avaliação de Série");
                k.putExtra(Intent.EXTRA_TEXT, "Eu avaliei a série " +
                        txtTitulo.getText() + " com nota " + txtAvaliacao.getText());
                startActivity( Intent.createChooser(k, "Compartilhar") );
            return true;
        }
        return super.onOptionsItemSelected(item);
    }

} // fim da classe
