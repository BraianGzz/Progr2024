
package Programacion2024.TPPLataformaStreaming;

class Pelicula extends Contenido {
    private String director;

    public Pelicula(String titulo, int anio, int duracion, double calificacion, String director) {
        super(titulo, anio, duracion, calificacion);
        this.director = director;
    }


    public void mostrarInformacion() {
        System.out.println("Pelicula: " + titulo + ", Anio: " + anio + ", Duracion: " + duracion + " minutos, Calificacion: " + calificacion + ", Director: " + director);
    }
}
