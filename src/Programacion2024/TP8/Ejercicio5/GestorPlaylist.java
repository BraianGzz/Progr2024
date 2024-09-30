package Programacion2024.TP8.Ejercicio5;

import java.util.Scanner;

public class GestorPlaylist {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        
        try {
            System.out.print("Ingrese la cancion que desea agregar: ");
            String cancion = teclado.nextLine().toLowerCase();
            AgregarPlaylist agregar1 = new AgregarPlaylist();
            agregar1.agregarCancion(cancion);
        }catch(Exception e){
            System.out.println(e.getMessage());
        }
    }
}