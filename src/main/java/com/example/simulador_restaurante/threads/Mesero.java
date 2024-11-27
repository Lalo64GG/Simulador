package com.example.simulador_restaurante.threads;

import com.almasb.fxgl.entity.Entity;
import com.example.simulador_restaurante.monitor.Restaurante;

import java.util.List;

public class Mesero implements Runnable {
    private final String nombre;
    private final Restaurante restaurante;
    private final List<Mesa> mesas;
    private final Entity entidad;

    public Waiter(String nombre, Restaurante restaurante, List<Mesa> mesas, Entity entidad) {
        this.nombre = nombre;
        this.restaurante = restaurante;
        this.mesas = mesas;
        this.entidad = entidad;
    }

    @Override
    public void run() {
        while (true) {
            try {
                // Aquí puede implementar lógica adicional para buscar clientes
            } catch (Exception e) {
                System.out.println("Error en mesero: " + nombre);
            }
        }
    }
}
