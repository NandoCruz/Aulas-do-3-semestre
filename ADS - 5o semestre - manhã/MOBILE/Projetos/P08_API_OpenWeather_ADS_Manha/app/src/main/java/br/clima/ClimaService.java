package br.clima;

import android.content.Context;
import android.os.AsyncTask;
import android.view.View;
import android.widget.ProgressBar;
import android.widget.Toast;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import org.jsoup.Jsoup;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class ClimaService extends AsyncTask<String, Void, List<Clima>> {
    private AsyncTaskDelegate delegate = null;
    private Context context;
    private ProgressBar barraProgresso;

    public ClimaService(Context context, AsyncTaskDelegate responder) {
        this.delegate = responder;
        this.context = context;
    }

    @Override
    protected void onPreExecute() {
        super.onPreExecute();
        // o que será executado antes do método doInBackground
        // poderia chamar uma barra de progresso
        barraProgresso = ((MainActivity) context).findViewById(R.id.pb_clima);
        if (barraProgresso != null) {
            barraProgresso.setVisibility(View.VISIBLE);
        }
    }

    @Override
    protected List<Clima> doInBackground(String... params) {
        try {
            String local = params[0];
            String appid = params[1];
            String qtd   = params[2];
            String urlAPI = "https://api.openweathermap.org/data/2.5/forecast?q="
                    + local + "&appid=" + appid + "&cnt=" + qtd
                    + "&units=metric&lang=pt_br";

            String dadosAPI = Jsoup.connect(urlAPI).ignoreContentType(true).execute().body();

            JSONObject jsonAPI = new JSONObject(dadosAPI);
            JSONArray vetorClimaAPI = jsonAPI.getJSONArray("list");
            List<Clima> listaClima = new ArrayList<>();
            for (int i = 0; i < vetorClimaAPI.length(); i++) {
                Clima c = new Clima();
                try {
                    JSONObject objExterno = vetorClimaAPI.getJSONObject(i);
                    c.setData( objExterno.getString("dt_txt") );

                    JSONObject objetoMain = objExterno.getJSONObject("main");
                    c.setTemperatura( objetoMain.getDouble("temp") );
                    c.setSensacaoTermica( objetoMain.getDouble("feels_like") );

                    JSONArray vetorWeatherAPI = objExterno.getJSONArray("weather");
                    for (int k = 0; k < vetorWeatherAPI.length(); k++) {
                        JSONObject objetoWeather = vetorWeatherAPI.getJSONObject(k);
                        c.setDescricao( objetoWeather.getString("description") );
                    }

                    listaClima.add( c );

                } catch (JSONException e) {
                    e.printStackTrace();
                    Toast.makeText(context, "Erro no parse do vetor de dados!\nDetalhes: "+e.getMessage(),
                            Toast.LENGTH_SHORT).show();
                } // fim do try-catch de leitura dos dados
            } // fim do for da leitura de dados
            return listaClima;
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        } // fim do try-catch do método doInBackground

    } // fim do método doInBackground

    @Override
    protected void onPostExecute(List<Clima> climas) {
        super.onPostExecute(climas);
        if(delegate != null) {
            delegate.processFinish(climas);
        }
        if(barraProgresso != null) {
            barraProgresso.setVisibility(View.GONE);
        }
    }
}
