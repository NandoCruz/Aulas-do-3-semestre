
package br.jogo.poder;

public class BolaDeFogo {
    private double tamanho;
    private String cor;

    public BolaDeFogo() {
    }

    public BolaDeFogo(double tamanho, String cor) {
        this.tamanho = tamanho;
        this.cor = cor;
    }

    public double getTamanho() {
        return tamanho;
    }

    public void setTamanho(double tamanho) {
        this.tamanho = tamanho;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    @Override
    public String toString() {
        return "BolaDeFogo{" + "tamanho=" + tamanho + ", cor=" + cor + '}';
    }
    
    
    
}
