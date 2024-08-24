package Programacion2024.TP6.Ejercicio1;

import java.util.List;

public interface HistorialEstados {
    void guardarEstado(String estado);
    List<String> getHistorialEstados();
    
}
