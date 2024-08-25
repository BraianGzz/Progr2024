package Programacion2024.TP6.Ejercicio2;

import java.time.LocalDateTime;

public class Administracion extends GestionTareas {
    public Administracion(LocalDateTime fechaInicio, LocalDateTime fechaFin, String responsable) {
        super(fechaInicio, fechaFin, responsable);
    }

    @Override
    public void generarInformeProgreso() {
    System.out.println("Informe de Progreso: Tarea de Administracion");
    System.out.println("Responsable: " + responsable);
    System.out.println("Fecha de Inicio: " + fechaInicio);
    System.out.println("Fecha de Fin: " + fechaFin);
    System.out.println("Tiempo invertido: " + calcularTiempoInvertido());
}
    
}
