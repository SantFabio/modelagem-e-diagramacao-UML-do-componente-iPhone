package com.iphone.aparelhoTelefonico;

public class Contato {
    private int ddd;
    private int numero;
    private String donoNumero;

    public Contato(int DDD, int numero, String donoNumero) {
        this.ddd = DDD;
        this.numero = numero;
        this.donoNumero = donoNumero;
    }

    public int getDDD() {
        return ddd;
    }

    public void setDDD(int DDD) {
        this.ddd = DDD;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public String getDonoNumero() {
        return donoNumero;
    }

    public void setDonoNumero(String donoNumero) {
        donoNumero = donoNumero;
    }
}
