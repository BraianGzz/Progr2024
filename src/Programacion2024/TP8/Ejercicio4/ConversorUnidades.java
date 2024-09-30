package Programacion2024.TP8.Ejercicio4;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ConversorUnidades {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        try {
            System.out.print("Ingrese el valor que desea convertir: ");
            double valor = teclado.nextDouble();
            
            System.out.print("Ingrese la unidad de origen (m, cm, mm, kg, g): ");
            String unidadOrigen = teclado.next().trim().toLowerCase();
            
            System.out.print("Ingrese la unidad de destino (m, cm, mm, kg, g): ");
            String unidadDestino = teclado.next().trim().toLowerCase();

            ConvertirUnidad conversor = new ConvertirUnidad(valor, unidadOrigen, unidadDestino);

            conversor.convertir();
        
        } catch (InputMismatchException ex) {
            System.out.println("Debe ingresar obligatoriamente numero");
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
  
    }
    
}
