package edu.unama.p02_appnumeros_ads_manha;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    // 1. declarar os componentes dinâmicos:
    EditText campoNumero;
    TextView txtNumeros, txtPares, txtImpares, txtSoma;
    // 2. variáveis de controle globais:
    int qtdPares = 0, qtdImpares = 0, soma = 0;
    ArrayList<Integer> lista = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        // 3. integração entre o XML e o Java (componentes)
        campoNumero = findViewById(R.id.edit_numero);
        txtNumeros  = findViewById(R.id.txt_numeros);
        txtPares    = findViewById(R.id.txt_pares);
        txtImpares  = findViewById(R.id.txt_impares);
        txtSoma     = findViewById(R.id.txt_soma);
    } // fim do onCreate

    // 4. criar o método que será chamado quando tocar no botão:
    public void inserirNumero(View v) {
        // 5. pegar valor digitado:
        String valorDigitado = campoNumero.getText().toString();
        // 6. converter o valor de String para int:
        int valor = Integer.parseInt( valorDigitado );
        // 7. inserir o número na lista:
        lista.add( valor );
        // 8. realizar cálculo de par e ímpar:
        if( isPar(valor) == true )
            qtdPares++;
        else
            qtdImpares++;
        // 9. somar valores:
        soma = soma + valor;

        // 10. atribuir os valores nos respectivos componentes:
        txtNumeros.setText( lista.toString() );
        txtPares.setText(qtdPares + "");
        txtImpares.setText(qtdImpares + "");
        txtSoma.setText(soma + "");
    } // fim do inserirNumero

    public boolean isPar( int n ) {
        if( n % 2 == 0 )
            return true;
        else
            return false;
    } // fim do isPar

} // fim da classe
