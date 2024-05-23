package Programacion2024.TP3.Ejercicio4;

import java.util.Scanner;

public class Contraseñasegura {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese la contrasenia:");
        String contraseña = scanner.nextLine();
        Verificacion v1 = new Verificacion(contraseña);

        v1.ochoCarcteres();
        v1.digitoNumerico();        
        v1.caracterEspecial();
    }
    
}
