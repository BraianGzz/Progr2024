package Programacion2024.TP8.Ejercicio2;

import java.util.InputMismatchException;
import java.util.Scanner;

public class RedSocial {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        try {
            System.out.print("Ingrese una edad: ");
            int edad = teclado.nextInt();
            VerificacionEdad usuario1 = new VerificacionEdad(edad);
            usuario1.VerificarEdad();
        }catch (InputMismatchException ex) {
            System.out.println("Debe ingresar obligatoriamente numero entero");
        }catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
    
}