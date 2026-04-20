package com.azahartech;

public class Escenario {
    private String nombre;
    private int capacidad;

    public Escenario(String nombre, int capacidad) {
        this.nombre = nombre;
        this.capacidad = capacidad;
    }

    public String getNombre() { return nombre; }
}
