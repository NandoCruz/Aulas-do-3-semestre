package com.example.p07_cores_recyclerview_ads_manha;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    private RecyclerView rvCores;
    private CorAdapter   corAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        rvCores = findViewById(R.id.lista_cor);

        LinearLayoutManager m = new LinearLayoutManager(this);
        m.setOrientation(LinearLayoutManager.VERTICAL);

        rvCores.setLayoutManager( m );
        rvCores.setHasFixedSize( true );

        carregarDados();

    }

    @Override
    protected void onResume() {
        super.onResume();
        carregarDados();
    }

    private void carregarDados() {
        CorBD corBD = new CorBD(this);
        SQLiteDatabase bd = corBD.getReadableDatabase();
        List<String> lista = new ArrayList<>();
        Cursor dados = bd.query(
                CorBD.TabCor.TABELA, null, null, null,
                null, null, CorBD.TabCor.COL_NOME);
        while (dados.moveToNext()) {
            String cor = dados.getString(
                    dados.getColumnIndexOrThrow(CorBD.TabCor.COL_NOME) );
            lista.add( cor );
        }
        bd.close();
        Log.e("TAMANHO LISTA", lista.size()+"");
        corAdapter = new CorAdapter(lista);
        rvCores.setAdapter( corAdapter );
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu_principal, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        int idClicado = item.getItemId();
        switch (idClicado) {
            case R.id.menu_adicionar:
                Intent i = new Intent(this, InserirCorActivity.class);
                startActivity( i );
            break;
        }
        return super.onOptionsItemSelected(item);
    }
}
