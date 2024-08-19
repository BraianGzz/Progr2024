package Programacion2024.TPPLataformaStreaming;
import java.util.ArrayList;

class Usuario {
    private ArrayList<Contenido> historial;
    private ArrayList<Contenido> favoritos;

    public Usuario() {
        this.historial = new ArrayList<>();
        this.favoritos = new ArrayList<>();
    }

    public void agregarAHistorial(Contenido contenido) {
        historial.add(contenido);
    }

    public void agregarAFavoritos(Contenido contenido) {
        favoritos.add(contenido);
    }

    public void mostrarHistorial() {
        System.out.println("Historial de reproducciones:");
        for (Contenido c : historial) {
            c.informacion();
        }
    }

    public void mostrarFavoritos() {
        System.out.println("Favoritos:");
        for (Contenido c : favoritos) {
            c.informacion();
        }
    }
}