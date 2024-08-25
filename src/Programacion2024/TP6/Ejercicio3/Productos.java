package Programacion2024.TP6.Ejercicio3;

public abstract class Productos {
    protected String nombre;
    protected double precio;

    public Productos(String nombre, double precio) {
        this.nombre = nombre;
        this.precio = precio;
    }
    
    public abstract double calcularPrecio();

    public abstract void mostrarDetalles();
}
