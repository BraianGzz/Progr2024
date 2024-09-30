package Programacion2024.TP8.Ejercicio1;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ViajeTiempo {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int año;
        try {
            System.out.print("Ingrese un anio: ");
            año = teclado.nextInt();
            if(año < 1900 || año > 2100){
                throw new Exception();
            }
            System.out.print("Viajando al anio " + año);
        } catch (InputMismatchException ex) {
            System.out.println("Debe ingresar obligatoriamente numero entero");
        } catch (Exception ex) {
            System.out.println("Error! Viajar a ese anio es peligroso para el espacio-tiempo.");

        }
    }
    
}
