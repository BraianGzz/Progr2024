package Programacion2024.TP8.Ejercicio5;

import java.util.ArrayList;

public class AgregarPlaylist {
    private ArrayList<String> playlist;


    public AgregarPlaylist() {
        playlist = new ArrayList<>();
        playlist.add("felicidad");
        playlist.add("llorar");
        playlist.add("sonreir");
    }

    public void agregarCancion(String cancion) throws Exception {
        if (playlist.contains(cancion)) {
            moverCancion(cancion);
            throw new Exception("La cancion " + cancion + " ya existe en la playlist y ha sido movida al final de la playlist..");
        } else {
            playlist.add(cancion);
            System.out.println("La cancion " + cancion + " ha sido aniadida a la playlist.");
            mostrarCanciones();
        }
    }
    
     public void moverCancion(String cancion) {
        playlist.remove(cancion);
        playlist.add(cancion);
        mostrarCanciones();
    }
    
    public void mostrarCanciones(){
        System.out.println("Playlist actual:");
        for (int i = 0; i < playlist.size(); i++) {
            System.out.println( playlist.get(i));
        }
    }
    
}
