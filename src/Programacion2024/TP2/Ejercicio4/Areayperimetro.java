package Programacion2024.TP2.Ejercicio4;

import java.util.Scanner;

/**
 *
 * @author Braian Gonzalez
 */
public class Areayperimetro {

    public static void main(String[] args) {
         Scanner entrada = new Scanner(System.in);

         //Datos y resultados rectangulo
        System.out.println("Rectangulo:");
        System.out.print("Ingrese la base del rectangulo: ");
        double baseRectangulo = entrada.nextDouble();//dato para el nuevo objeto
        System.out.print("Ingrese la altura del rectangulo: ");
        double alturaRectangulo = entrada.nextDouble();//dato para el nuevo objeto
        Rectangulo rectangulo = new Rectangulo(baseRectangulo, alturaRectangulo);//objeto
        
        System.out.println("Resultado:");
        rectangulo.calcularArea();
        rectangulo.calcularPerimetro();

        //Datos y resultados circulo
        System.out.println("Circulo:");
        System.out.print("Ingrese el radio del circulo: ");
        double radioCirculo = entrada.nextDouble();
        Circulo circulo = new Circulo(radioCirculo);
        
        System.out.println("Resultado:");
        circulo.calcularArea();
        circulo.calcularPerimetro();

        //Datos y resultados cuadrado
        System.out.println("Cuadrado:");
        System.out.print("Ingrese el lado del cuadrado: ");
        double ladoCuadrado = entrada.nextDouble();
        Cuadrado cuadrado = new Cuadrado(ladoCuadrado);
        
        System.out.println("Resultado:");
        cuadrado.calcularArea();
        cuadrado.calcularPerimetro();


    }
}
