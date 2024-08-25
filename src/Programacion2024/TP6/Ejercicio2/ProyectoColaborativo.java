package Programacion2024.TP6.Ejercicio2;

import java.time.LocalDateTime;

public class ProyectoColaborativo {

    public static void main(String[] args) {
        
        // Datos
        LocalDateTime fechaInicio1 = LocalDateTime.of(2024, 8, 24, 10, 30);
        LocalDateTime fechaFin1 = LocalDateTime.of(2024, 8, 25, 15, 45);
        GestionTareas tarea1 = new Desarrollo(fechaInicio1, fechaFin1, "Juan");
        // Informe de progreso
        tarea1.generarInformeProgreso();
        
        // Datos
        LocalDateTime fechaInicio2 = LocalDateTime.of(2024, 8, 22, 19, 00);
        LocalDateTime fechaFin2 = LocalDateTime.of(2024, 8, 23, 19, 50);
        GestionTareas tarea2 = new Administracion(fechaInicio2, fechaFin2, "Pedro");
        // Informe de progreso
        tarea2.generarInformeProgreso();
        
        //datos
        LocalDateTime fechaInicio3 = LocalDateTime.of(2024, 8, 19, 07, 00);
        LocalDateTime fechaFin3 = LocalDateTime.of(2024, 8, 29, 23, 59);
        GestionTareas tarea3 = new Diseño(fechaInicio3, fechaFin3, "Fernanda");
        // Informe de progreso
        tarea3.generarInformeProgreso();
    
    }
}
