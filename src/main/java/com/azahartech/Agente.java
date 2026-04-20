package com.azahartech;

public class Agente {
    private String nombre;
    private Artista artistaRepresentado;

    public Agente(String nombre, Artista artista) {
        this.nombre = nombre;
        this.artistaRepresentado = artista;
    }

    public Artista getArtistaRepresentado() {
        return artistaRepresentado;
    }
}
