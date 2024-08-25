package Programacion2024.TP6.Ejercicio1;

import java.util.ArrayList;
import java.util.List;

public abstract class Dispositivos {
    protected boolean encendido;
    protected List<String> historialEstado;

    public Dispositivos() {
        this.encendido = false;
        this.historialEstado = new ArrayList<>();
    }
    
    public abstract void encender();
    
    public abstract void apagar();
    
    public void guardarEstado(String estado) {
        historialEstado.add(estado);
    }

    public List<String> getHistorialEstados() {
        return historialEstado;
    }
}