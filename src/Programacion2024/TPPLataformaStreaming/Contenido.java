
package Programacion2024.TPPLataformaStreaming;

class Contenido {
    protected String titulo;
    protected int anio;
    protected int duracion;
    protected double calificacion;

    public Contenido(String titulo, int anio, int duracion, double calificacion) {
        this.titulo = titulo;
        this.anio = anio;
        this.duracion = duracion;
        this.calificacion = calificacion;
    }

    public void reproducir() {
        System.out.println("Reproduciendo " + titulo + "...");
        
    }

    public void informacion() {
        System.out.println("Titulo: " + titulo + ", Anio: " + anio + ", Calificacion: " + calificacion);
    }
}

    

