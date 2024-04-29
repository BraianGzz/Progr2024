package Programacion2024.TP2.Ejercicio2;

/**
 *
 * @author Braian Gonzalez
 */
public class Calcular{
    
    // metodos para las operaciones
    public void sumar(int a, int b) {
        System.out.println("Resultado: " + (a + b));
    }

    public void sumar(double da, double db) {
        System.out.println("Resultado: " + (da + db));
    }
    
    public void restar(int a, int b) {
        System.out.println("Resultado: " + (a - b));
    }

    public void restar(double da, double db) {
        System.out.println("Resultado: " + (da - db));
    }
    
    public void multiplicar(int a, int b) {
        System.out.println("Resultado: " + (a * b));
    }

    public void multiplicar(double da, double db) {
        System.out.println("Resultado: " + (da * db));
    }
    
    public void dividir(int a, int b) {
        if (b != 0) {
            System.out.println("Resultado: " + (a / b));
        } else {
            System.out.println("No se puede dividir por cero.");
        }
    }

    public void dividir(double da, double db) {
        if (db != 0) {
            System.out.println("Resultado: " + (da / db));
        } else {
            System.out.println("No se puede dividir por cero.");
        }
    }
}