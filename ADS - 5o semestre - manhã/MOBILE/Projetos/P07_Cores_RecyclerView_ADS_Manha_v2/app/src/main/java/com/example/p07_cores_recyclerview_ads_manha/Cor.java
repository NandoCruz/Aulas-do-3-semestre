package com.example.p07_cores_recyclerview_ads_manha;

public class Cor {
    private int cod;
    private String nome;

    public Cor() {
    }

    public Cor(int cod, String nome) {
        this.cod = cod;
        this.nome = nome;
    }

    public int getCod() {
        return cod;
    }

    public void setCod(int cod) {
        this.cod = cod;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
}
