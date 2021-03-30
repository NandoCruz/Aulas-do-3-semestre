package br.clima;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.view.View;
import android.widget.ProgressBar;
import android.widget.Toast;

import java.util.List;

public class MainActivity extends AppCompatActivity {
    private RecyclerView listaRV;
    private ClimaAdapter climaAdapter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        listaRV = findViewById(R.id.lista_rv_clima);
        LinearLayoutManager lm = new LinearLayoutManager(this);
        lm.setOrientation(LinearLayoutManager.VERTICAL);
        listaRV.setLayoutManager( lm );
        listaRV.setHasFixedSize( true );

        carregarClimas();
    }

    private void carregarClimas() {
        if( Utils.isOnline(this) ) {
            String[] filtro = {"Belem,BR", "2bfe8d19224a72a9714c623429299b31", "10"};
            new ClimaService(this, new AsyncTaskDelegate() {
                @Override
                public void processFinish(Object output) {
                    List<Clima> climas = (List<Clima>) output;
                    if(climas != null) {
                        climaAdapter = new ClimaAdapter(climas);
                        listaRV.setAdapter( climaAdapter );
                    } else {
                        Toast.makeText(MainActivity.this, "Erro! Não foi possível carregar os dados.", Toast.LENGTH_SHORT).show();
                    }
                }
            }).execute(filtro);
        } else {
            Toast.makeText(this, "Você está offline.",
                    Toast.LENGTH_SHORT).show();
        }
    }
}
