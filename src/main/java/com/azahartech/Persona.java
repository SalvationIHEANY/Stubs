package com.azahartech;

public class Persona {
    private String nombre;
    private String email;

    // Constructor
    public Persona(String nombre, String email) {
        this.nombre = nombre;
        this.email = email;
    }

    // Getters y setters
    public String getNombre() { return nombre; }
    public String getEmail() { return email; }
}
