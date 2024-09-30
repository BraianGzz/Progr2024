package Programacion2024.TP8.Ejercicio3;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Propinas {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        try{
            System.out.print("Ingrese el total gastado: ");
            double totalConsumido = teclado.nextDouble();
            System.out.print("Ingrese la propina que dejara: ");
            double propina = teclado.nextDouble();
            CalculoPropina factura1 = new CalculoPropina(totalConsumido, propina);
            factura1.calcularProp();
        }catch (InputMismatchException ex) {
            System.out.println("Debe ingresar obligatoriamente numero entero");
        }catch(Exception e){
            System.out.println(e.getMessage());
        }
    }
    
}
