package Programacion2024.TP2.Ejercicio3;

import java.util.Scanner;

/**
 *
 * @author Braian Gonzalez
 */

public class Manejodefechas {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.println("Ingrese el dia: ");
        int dia = entrada.nextInt();
        
        System.out.println("Ingrese el mes: ");
        int mes = entrada.nextInt();
        
        System.out.println("Ingrese el anio: ");
        int anio = entrada.nextInt();
        
        Calculodias fecha = new Calculodias(dia, mes, anio);
        
        int diasTranscurridos = fecha.calculoDias(dia, mes, anio);
        System.out.println("Dias transcurridos desde la fecha ingresada hasta hoy: " + diasTranscurridos);         
        
    }
    
}
