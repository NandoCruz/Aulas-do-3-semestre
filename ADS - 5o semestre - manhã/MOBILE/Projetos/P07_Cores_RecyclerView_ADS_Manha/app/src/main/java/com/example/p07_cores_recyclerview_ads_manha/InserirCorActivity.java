package com.example.p07_cores_recyclerview_ads_manha;

import androidx.appcompat.app.AppCompatActivity;

import android.content.ContentValues;
import android.database.sqlite.SQLiteDatabase;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class InserirCorActivity extends AppCompatActivity {
    private EditText editCor;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_inserir_cor);

        editCor = findViewById(R.id.edit_cor);
    }

    public void inserirCor(View v) {
        CorBD corBD = new CorBD(v.getContext());
        SQLiteDatabase bd = corBD.getWritableDatabase();
        try {
          String corDigitada = editCor.getText().toString();
          if(corDigitada.length() > 0) {
              ContentValues valores = new ContentValues();
              valores.put(CorBD.TabCor.COL_NOME, corDigitada);
              long idCor = bd.insert(CorBD.TabCor.TABELA, null, valores);
              if(idCor > 0) {
                  Toast.makeText(this, "Cor inserida.", Toast.LENGTH_SHORT).show();
                  editCor.setText("");
              } else {
                  Toast.makeText(this, "Cor não inserida. Erro BD.", Toast.LENGTH_SHORT).show();
              }
          }
        } catch (Exception e) {
            Toast.makeText(this, "Erro! Detalhes: " + e.getMessage(),
                    Toast.LENGTH_LONG).show();
        } finally {
            bd.close();
        }

    }

}
