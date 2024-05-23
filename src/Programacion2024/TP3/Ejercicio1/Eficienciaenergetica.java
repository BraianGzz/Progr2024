package Programacion2024.TP3.Ejercicio1;

public class Eficienciaenergetica {

    public static void main(String[] args) {
        Consumos consumos = new Consumos(500, 100, 10, 30, 20);
        consumos.ahorroAnual();
        consumos.consumoAnterior();
        consumos.consumoMaximo();
        consumos.consumoMinimo();
        
    }
    
}


