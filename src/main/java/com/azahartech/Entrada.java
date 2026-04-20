package com.azahartech;

public class Entrada {
    private double precio;
    private String tipo;

    public Entrada(double precio, String tipo) {
        this.precio = precio;
        this.tipo = tipo;
    }

    public double getPrecio() { return precio; }
    public String getTipo() { return tipo; }
}
