package com.azahartech;

import java.util.ArrayList;
import java.util.List;

public class Festival {
    private String nombre;
    private List<Escenario> escenarios = new ArrayList<>();
    private List<Artista> cartel = new ArrayList<>();
    private List<Artista> artistas = new ArrayList<>();

    @Override
    public String toString() {
        return "Festival{" +
                "nombre='" + nombre + '\'' +
                ", escenarios=" + escenarios +
                ", cartel=" + cartel +
                ", artistas=" + artistas +
                '}';
    }
    public boolean inscribir(Usuario usuario) {
        // TODO: Implementar lógica de inscripción y control de aforo
        return false; // Valor por defecto para que compile
    }


    public Festival(String nombre, List<Escenario> escenarios, List<Artista> artistas, List<Artista> cartel) {
        this.nombre = nombre;
        this.escenarios = escenarios;
        this.cartel = cartel;
        this.artistas = artistas;
    }

    public List<Escenario> getEscenarios() { return escenarios; }
}
