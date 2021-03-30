package br.unama;

public class Carro {
    private int anoFabricacao, qtdPortas;
    private String marca;

    public double calcConsumo(double distanciaPercorrida) {
        return distanciaPercorrida * 0.75;
    }

    public void imprimirAtributos() {
        System.out.println("#############");
        System.out.println( "Carro{" +
                "anoFabricacao=" + this.anoFabricacao +
                ", qtdPortas=" + this.qtdPortas +
                ", marca='" + this.marca + '\'' +
                '}' );
    }

    public Carro() {
    }

    public Carro(int anoFabricacao, int qtdPortas, String marca) {
        this.anoFabricacao = anoFabricacao;
        this.qtdPortas = qtdPortas;
        this.marca = marca;
    }

    public int getAnoFabricacao() {
        return anoFabricacao;
    }

    public void setAnoFabricacao(int anoFabricacao) {
        if(anoFabricacao >= 1880 && anoFabricacao <= 2020) {
            this.anoFabricacao = anoFabricacao;
        } else {
            System.err.println("Erro! Ano de fabricção inválido.");
            System.exit(0);
        }
    }

    public int getQtdPortas() {
        return qtdPortas;
    }

    public void setQtdPortas(int qtdPortas) {
        if(qtdPortas == 2 || qtdPortas == 4) {
            this.qtdPortas = qtdPortas;
        } else {
            System.err.println("Erro! quantidade de portas inválida.");
            System.exit(0);
        }
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        if( ! marca.equals("") ) {
            this.marca = marca;
        } else {
            System.err.println("Erro! Marca inválida.");
            System.exit(0);
        }
    }
} // fim da classe
