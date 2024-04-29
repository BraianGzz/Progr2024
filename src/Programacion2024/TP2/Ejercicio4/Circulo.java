
package Programacion2024.TP2.Ejercicio4;
//clases
public class Circulo {
    private double radio;
    private double Pi = 3.14159265359;
//constructor
    public Circulo(double radio) {
        this.radio = radio;
    }
//metodos
    public void calcularArea() {
        System.out.println("Area del circulo: " + (Pi * radio * radio));
    }

    public void calcularPerimetro() {
        System.out.println("Perimetro del circulo: " + (2 * Pi * radio));
    }
    
}
