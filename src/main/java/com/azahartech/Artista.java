package com.azahartech;

public class Artista extends Persona {
    private String genero;

    public Artista(String nombre, String email, String genero) {
        super(nombre, email);
        this.genero = genero;
    }

    public String getGenero() { return genero; }
}
