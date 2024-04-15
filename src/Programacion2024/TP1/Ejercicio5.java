package Programacion2024.TP1;

import java.util.Scanner;

/**
 *
 * @author Braian Gonzalez
 */
public class Ejercicio5 {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int x,y;
        
        System.out.print("Ingrese el valor de la coordenada x:");
        x = entrada.nextInt();
        if (x == 0 ){
            System.out.print("El valor de las coordenadas debe ser distinto de 0");
            return;
        }
        
        System.out.print("Ingrese el valor de la coordenada y:");
        y = entrada.nextInt();
        if (y == 0 ){
            System.out.print("El valor de las coordenadas debe ser distinto de 0");
            return;
        }
      
        if (x > 0){
            if(y > 0){
            System.out.print("Las coordenadas (" + x + "," + y + ") se encuentran en el 1er cuadrante");
            }else if(y < 0){
             System.out.print("Las coordenadas (" + x + "," + y + ") se encuentran en el 4to cuadrante");
            }
        }else if(x < 0){
            if(y > 0){
                System.out.print("Las coordenadas (" + x + "," + y + ") se encuentran en el 2do cuadrante");
            }else if(y < 0){
                System.out.print("Las coordenadas (" + x + "," + y + ") se encuentran en el 3er cuadrante");
            }
        }
        
    }
    
}
