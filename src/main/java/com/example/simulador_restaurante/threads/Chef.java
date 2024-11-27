package com.example.simulador_restaurante.threads;

import com.almasb.fxgl.entity.Entity;
import com.example.simulador_restaurante.monitor.Restaurante;

public class Chef implements Runnable {
    private final String nombre;
    private final Restaurante restaurante;
    private final Entity entidad;

    public Chef(String nombre, Restaurante restaurante, Entity entidad) {
        this.nombre = nombre;
        this.restaurante = restaurante;
        this.entidad = entidad;
    }

    @Override
    public void run() {
        while (true) {
            try {
                // Aquí puede implementar lógica para cocinar órdenes pendientes
            } catch (Exception e) {
                System.out.println("Error en chef: " + nombre);
            }
        }
    }
}
