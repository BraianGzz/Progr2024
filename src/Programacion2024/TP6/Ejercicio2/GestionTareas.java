package Programacion2024.TP6.Ejercicio2;

import java.time.Duration;
import java.time.LocalDateTime;

public abstract class GestionTareas implements TiempoInvertido {
    protected LocalDateTime fechaInicio;
    protected LocalDateTime fechaFin;
    protected String responsable;

    public GestionTareas(LocalDateTime fechaInicio, LocalDateTime fechaFin, String responsable) {
        this.fechaInicio = fechaInicio;
        this.fechaFin = fechaFin;
        this.responsable = responsable;
    }
    
    @Override
    public String calcularTiempoInvertido() {
        Duration duracion = Duration.between(fechaInicio, fechaFin);
        long hs = (int) duracion.toHours();
        long min = (int) (duracion.toMinutes() %60);
        return hs +"horas y " + min + "minutos";
    }
    
    public abstract void generarInformeProgreso();
}