package Programacion2024.TP6.Ejercicio3;

public class Electronica extends Productos {
    private int garantia;

    public Electronica(String nombre, double precio, int garantia) {
        super(nombre, precio);
        this.garantia = garantia;
    }

    @Override
    public double calcularPrecio() {
        double precioElec = precio + (19.00/100 * precio);
        return precioElec; //con impuestos
    }

    @Override
    public void mostrarDetalles() {
        System.out.println("Nombre: " + nombre);
        System.out.println("Precio: $" + calcularPrecio());
        System.out.println("Periodo de Garantia: " + garantia + " meses");
    }
}