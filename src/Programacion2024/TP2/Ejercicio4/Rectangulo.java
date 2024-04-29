
package Programacion2024.TP2.Ejercicio4;
//clase
public class Rectangulo {
    private double base;
    private double altura;
//constructor
    public Rectangulo(double base, double altura) {
        this.base = base;
        this.altura = altura;
    }
//metodos
    public void calcularArea() {
        System.out.println("Area del rectangulo: " + (base * altura));
    }

    public void calcularPerimetro() {
        System.out.println("Perimetro del rectangulo: " + (2 * (base + altura)));
    }
}
