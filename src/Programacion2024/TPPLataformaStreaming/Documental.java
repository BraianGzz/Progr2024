package Programacion2024.TPPLataformaStreaming;

class Documental extends Contenido {
    private String tema;

    public Documental(String titulo, int anio, int duracion, double calificacion, String tema) {
        super(titulo, anio, duracion, calificacion);
        this.tema = tema;
    }


    public void mostrarInformacion() {
        System.out.println("Documental: " + titulo + ", Anio: " + anio + ", Duracion: " + duracion + " minutos, Calificacion: " + calificacion + ", Tema: " + tema);
    }
}
