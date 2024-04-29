
package Programacion2024.TP2.Ejercicio4;
//clase
public class Cuadrado {
    private double lado;
//constructor
    public Cuadrado(double lado) {
        this.lado = lado;
    }
//metodos
    public void calcularArea() {
        System.out.println("Area del cuadrado: " + (lado * lado));
    }

    public void calcularPerimetro() {
        System.out.println("Perimetro del cuadrado: " + (4 * lado));
    }
    
}
