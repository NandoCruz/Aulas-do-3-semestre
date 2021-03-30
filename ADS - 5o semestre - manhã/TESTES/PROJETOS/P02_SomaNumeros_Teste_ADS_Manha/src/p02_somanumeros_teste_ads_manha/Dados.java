
package p02_somanumeros_teste_ads_manha;

public class Dados {
    private String dados;
    
    public double somaDados() {
        String[] numeros = dados.split(",");
        double soma = 0.0;
        for(int i = 0; i < numeros.length; i++ ) {
            if( ! numeros[i].isEmpty() )
                soma = soma + Double.parseDouble( numeros[i] );
        }
        return soma;
    }

    public void setDados(String dados) {
        this.dados = dados;
    }
}


