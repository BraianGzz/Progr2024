package Programacion2024.TP1;

import java.util.Scanner;

/**
 *
 * @author Braian Gonzalez
 */
public class Ejercicio2 {
    
    public static void main(String[] args) {
        
        Scanner entrada = new Scanner(System.in);
        float nota1,nota2,nota3,sumanotas,promedio;
        
        System.out.print("Ingrese la nota del primer parcial: ");
        nota1 = entrada.nextFloat();
        System.out.print("\nIngrese la nota del segundo parcial: ");
        nota2 = entrada.nextFloat();
        System.out.print("\nIngrese la nota del tercer parcial: ");
        nota3 = entrada.nextFloat();
        
        sumanotas = nota1+nota2+nota3;
        promedio = sumanotas/3;
        
        if (promedio >= 8){
            System.out.print("El alumno se encuentra promocionado con un promedio de "+promedio);
        }
        else 
         if (promedio < 8){
            System.out.print("El alumno no se encuentra promocionado con un promedio de "+promedio);
        }
        
        
    }
    
}
