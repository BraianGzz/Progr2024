package Programacion2024.TPPLataformaStreaming;

import java.util.ArrayList;

class Catalogo {
    private ArrayList<Contenido> listaContenido;

    public Catalogo() {
        this.listaContenido = new ArrayList<>();
    }

    public void agregarContenido(Contenido contenido) {
        listaContenido.add(contenido);
    }


    public void buscar(String titulo) {
        for (Contenido c : listaContenido) {
            if (c.titulo.equalsIgnoreCase(titulo)) {
                c.informacion();
                return;
            }
        }
        System.out.println("Contenido no encontrado.");
    }
}