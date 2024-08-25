package Programacion2024.TP6.Ejercicio3;

import java.time.LocalDate;

public class Alimentos extends Productos implements Vencimiento {
    private LocalDate fechaVencimiento;

    public Alimentos(String nombre, double precio, LocalDate fechaVencimiento) {
        super(nombre, precio);
        this.fechaVencimiento = fechaVencimiento;
    }

    @Override
    public double calcularPrecio() {
        double precioAlim = precio + (10.5/100 * precio);
        return precioAlim; //con impuestos
    }

    @Override
    public boolean estaProximoAVencer() {
        LocalDate hoy = LocalDate.now();
        return fechaVencimiento.isBefore(hoy.plusDays(7)); 
    }

    @Override
    public void mostrarDetalles() {
        System.out.println("Nombre: " + nombre);
        System.out.println("Precio: $" + calcularPrecio());
        System.out.println("Fecha de Vencimiento: " + fechaVencimiento);
        if (estaProximoAVencer()) {
        System.out.println("Proximo a vencer: Si");
        } else {
        System.out.println("Proximo a vencer: No");
        }
    }
}
