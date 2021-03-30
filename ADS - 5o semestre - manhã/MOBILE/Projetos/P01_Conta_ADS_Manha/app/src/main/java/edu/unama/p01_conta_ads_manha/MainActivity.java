package edu.unama.p01_conta_ads_manha;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

import java.text.DecimalFormat;

public class MainActivity extends AppCompatActivity {
    // 1. componentes dinâmicos:
    EditText campoConta;
    TextView txtResultado;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        // 2. integração entre XML e Java:
        campoConta = findViewById(R.id.edit_conta);
        txtResultado = findViewById(R.id.edit_resultado);
    } // fim do onCreate

    // 3. método para ser executado pelo botão:
    public void calcular10p(View v) {
        try {
            // 4. pegar valor digitado:
            String valorDigitado = campoConta.getText().toString();
            // 5. converter de String para double:
            double valor = Double.parseDouble(valorDigitado);
            // 6. calcular os 10%:
            double valor10p = calculo10p(valor);
            // 7. formatar número:
            DecimalFormat df = new DecimalFormat("#.##");
            // 8. atribuir o valor no campo de texto de resultado:
            txtResultado.setText("Conta com 10% R$ " + df.format(valor10p));
        } catch (Exception e){
            e.getMessage();
        }
    } // fim do calcular10p

    double calculo10p(double valor) {
        return valor * (110.0/100.0);
    }

} // fim da classe
