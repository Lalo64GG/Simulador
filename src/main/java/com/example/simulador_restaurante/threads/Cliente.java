package com.example.simulador_restaurante.threads;

import com.almasb.fxgl.entity.Entity;
import com.example.simulador_restaurante.monitor.Restaurante;

import java.util.List;

public class Cliente implements Runnable {
    private final String nombre;
    private final Restaurante restaurante;
    private final List<Mesa> mesas;
    private final Entity entidad;

    public Cliente(String nombre, Restaurante restaurante, List<Mesa> mesas, Entity entidad) {
        this.nombre = nombre;
        this.restaurante = restaurante;
        this.mesas = mesas;
        this.entidad = entidad;
    }

    @Override
    public void run() {
        try {
            restaurante.sentarEnMesa(nombre, entidad);
            restaurante.tomarPedido(nombre);
            restaurante.prepararComida(nombre);
            restaurante.entregarComida(nombre, entidad);
            restaurante.FinishAndExit(nombre, entidad);
        } catch (InterruptedException e) {
            System.out.println("Error en cliente: " + nombre);
        }
    }
}
