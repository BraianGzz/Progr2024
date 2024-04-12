package Programacion2024.TP1;

import java.util.Scanner;

/**
 *
 * @author Braian Gonzalez
 */
public class Ejercicio1 {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        float nota1;
        
        System.out.print("Ingrese la nota del alumno: ");
        nota1 = entrada.nextFloat();

        if (nota1 == 10){
            System.out.print("El alumno se encuentra aprobado con sobresaliente ");
        } else if (nota1 >= 4){
            System.out.print("El alumno se encuentra aprobado ");
        } else if (nota1 < 4){
            System.out.print("El alumno no se encuentra aprobado ");
        }
    }
}
