
package br.jogo.personagem;

import br.jogo.poder.BolaDeFogo;

public class Mario {
    private int vidas;
    private int moedas;
    private BolaDeFogo fogo;

    public Mario() {
    }

    public Mario(int vidas, int moedas, BolaDeFogo fogo) {
        this.vidas = vidas;
        this.moedas = moedas;
        this.fogo = fogo;
    }

    public int getVidas() {
        return vidas;
    }

    public void setVidas(int vidas) {
        this.vidas = vidas;
    }

    public int getMoedas() {
        return moedas;
    }

    public void setMoedas(int moedas) {
        this.moedas = moedas;
    }

    public BolaDeFogo getFogo() {
        return fogo;
    }

    public void setFogo(BolaDeFogo fogo) {
        this.fogo = fogo;
    }
    
    @Override
    public String toString(){
        return "Mario{vidas="+this.vidas+", moedas="+this.moedas+
                ", fogo="+fogo.toString()+"}";
    }
    
}
