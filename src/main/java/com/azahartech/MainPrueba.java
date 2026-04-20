package com.azahartech;

import java.util.ArrayList;
import java.util.List;

public class MainPrueba {
    static void main() {

        List<Escenario> escenarios = new ArrayList<>();
        List<Artista> artistas = new ArrayList<>();
        List<Artista> cartel = new ArrayList<>();

        // Crear algunos objetos de ejemplo
        Escenario escenario1 = new Escenario("Principal", 1000);
        Escenario escenario2 = new Escenario("Secundario", 1000);

        Artista artista1 = new Artista("Artista 1","asd@gmail.com","male" );
        Artista artista2 = new Artista("Artista 2","ads@sdkja.com","female");

        // Añadir a las listas
        escenarios.add(escenario1);
        escenarios.add(escenario2);

        artistas.add(artista1);
        artistas.add(artista2);

        cartel.add(artista1); // por ejemplo, los del cartel son algunos artistas



        Festival miFestival = new Festival(
                "Mi Festival",
                escenarios,
                artistas,
                cartel
        );
        System.out.println(miFestival);
        miFestival.getEscenarios().add(new Escenario("TEte", 1000));
    }
}
