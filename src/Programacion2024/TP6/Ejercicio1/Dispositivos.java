package Programacion2024.TP6.Ejercicio1;

import java.util.ArrayList;
import java.util.List;

public abstract class Dispositivos implements HistorialEstados {
    private boolean encendido;
    protected List<String> historialEstado;

    public Dispositivos() {
        this.encendido = false;
        this.historialEstado = new ArrayList<>();
    }
    
    public void encender() {
        encendido = true;
        guardarEstado("Encendido");
    }
    
    public void apagar() {
        encendido = false;
        guardarEstado("Apagado");
    }
    


    @Override
    public void guardarEstado(String estado) {
        historialEstado.add(estado);
    }

    @Override
    public List<String> getHistorialEstados() {
        return historialEstado;
    }
}