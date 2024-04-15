package Programacion2024.TP1;

import java.util.Scanner;

/**
 *
 * @author Braian Gonzalez
 */
public class Ejercicio3 {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int num;

        System.out.print("Ingrese un numero del 1 al 99: ");
        num = entrada.nextInt();

        if (num > 0 & num <= 9) {
            System.out.println("El numero tiene un digito.");
        } else if (num > 9 & num <= 99) {
            System.out.println("El numero tiene dos digitos.");
        } else {
            System.out.println("El numero ingresado no esta en el rango solicitado.");
        }
    }
    
}
