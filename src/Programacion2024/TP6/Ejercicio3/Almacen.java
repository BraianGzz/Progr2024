package Programacion2024.TP6.Ejercicio3;

import java.time.LocalDate;

public class Almacen {
    public static void main(String[] args) {
        Productos alimento1 = new Alimentos("Leche", 100, LocalDate.of(2024, 9, 1));
        Productos electronico1 = new Electronica("Televisor", 1000, 24);
        Productos ropa1 = new Ropa("Camiseta", 100, "M");

        alimento1.mostrarDetalles();

        electronico1.mostrarDetalles();

        ropa1.mostrarDetalles();
    }
}
