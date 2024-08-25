package Programacion2024.TP6.Ejercicio3;

public class Ropa extends Productos {
    private String talle;

    public Ropa(String nombre, double precio, String talle) {
        super(nombre, precio);
        this.talle = talle;
    }

    @Override
    public double calcularPrecio() {
        double precioRop = precio + (15.00/100 * precio);
        return precioRop;//con impuestos
    }

    @Override
    public void mostrarDetalles() {
        System.out.println("Nombre: " + nombre);
        System.out.println("Precio: $" + calcularPrecio());
        System.out.println("Talle: " + talle);
    }
}
