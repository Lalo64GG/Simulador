package com.example.simulador_restaurante.threads;

public class Mesa {
    private final int numero;
    private boolean ocupada = false;
    private String orden;

    public Mesa(int numero) {
        this.numero = numero;
    }

    public synchronized boolean isOcupada() {
        return ocupada;
    }

    public synchronized void ocupar(String orden) {
        this.orden = orden;
        this.ocupada = true;
    }

    public synchronized void desocupar() {
        this.orden = null;
        this.ocupada = false;
    }

    public synchronized String getOrden() {
        return orden;
    }

    public int getNumero() {
        return numero;
    }
}
