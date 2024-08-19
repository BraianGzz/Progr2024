
package Programacion2024.TPPLataformaStreaming;

class Serie extends Contenido {
    private int temporadas;
    private int capitulos;

    public Serie(String titulo, int anio, int duracion, double calificacion, int temporadas, int capitulos) {
        super(titulo, anio, duracion, calificacion);
        this.temporadas = temporadas;
        this.capitulos = capitulos;
    }


    public void mostrarInformacion() {
        System.out.println("Serie: " + titulo + ", Anio: " + anio + ", Calificacion: " + calificacion + ", Temporadas: " + temporadas + ", Capitulos: " + capitulos);
    }
}


