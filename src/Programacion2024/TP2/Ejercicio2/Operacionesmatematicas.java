package Programacion2024.TP2.Ejercicio2;

import java.util.Scanner;

/**
 *
 * @author Braian Gonzalez
 */
public class Operacionesmatematicas {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        //objeto
        Calcular calc = new Calcular();
        
        System.out.println("Que operacion desea realizar?");
        System.out.println("(1) Suma");
        System.out.println("(2) Resta");
        System.out.println("(3) Multiplicacion");
        System.out.println("(4) Division");
        int opcion = entrada.nextInt();
        
        
        System.out.println("Ingrese el primer numero entero:");
        int a = entrada.nextInt();
        
        System.out.println("Ingrese el segundo numero entero:");
        int b = entrada.nextInt();
        
        switch (opcion) {
            case 1:
                calc.sumar(a, b);
                break;
            case 2:
                calc.restar(a, b);
                break;
            case 3:
                calc.multiplicar(a, b);
                break;
            case 4:
                calc.dividir(a, b);
                break;
            default:
                System.out.println("Opcion no valida.");
        }
        
        System.out.println("Ingrese el primer numero con decimales:");
        double da = entrada.nextDouble();
        
        System.out.println("Ingrese el segundo numero con decimales:");
        double db = entrada.nextDouble();
        
        switch (opcion) {
            case 1:
                calc.sumar(da, db);
                break;
            case 2:
                calc.restar(da, db);
                break;
            case 3:
                calc.multiplicar(da, db);
                break;
            case 4:
                calc.dividir(da, db);
                break;
            default:
                System.out.println("Opcion no valida.");
        }
    }
}
