
package Programacion2024.TPPLataformaStreaming;
public class PlatStreaming {

    public static void main(String[] args) {
        Usuario usuario = new Usuario();
        Catalogo catalogo = new Catalogo();

        Pelicula pelicula1 = new Pelicula("Inception", 2010, 148, 8.8, "Christopher Nolan");
        Pelicula pelicula2 = new Pelicula("Spiderman", 2002, 387, 9, "Kevin Feige y Amy Pascal");
        Serie serie1 = new Serie("Breaking Bad", 2008, 00, 10, 5, 62);
        Documental documental1 = new Documental("Our Planet", 2019, 50, 9.0, "Naturaleza");

        // Agregar contenido
        catalogo.agregarContenido(pelicula1);
        catalogo.agregarContenido(pelicula2);
        catalogo.agregarContenido(serie1);
        catalogo.agregarContenido(documental1);

        // Buscar contenido
        catalogo.buscar("Our Planet");

        // Información
        documental1.mostrarInformacion();

        // Reproducir
        documental1.reproducir();

        // Agregar al historial
        usuario.agregarAHistorial(documental1);
        
        // Agregar a favoritos
        usuario.agregarAFavoritos(documental1);

        //mostrar
        usuario.mostrarHistorial();
        usuario.mostrarFavoritos();
    }
}
