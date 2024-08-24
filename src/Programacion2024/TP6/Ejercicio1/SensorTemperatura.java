package Programacion2024.TP6.Ejercicio1;



public class SensorTemperatura extends Dispositivos implements HistorialEstados {
    private int temperaturaActual;


    public SensorTemperatura() {
        super();
    }
    
    public void medirTemperatura() {
        temperaturaActual = (int) (Math.random() * 201) -100;
        System.out.println("Midiendo temperatura");
        guardarEstado("Temperatura medida: " + temperaturaActual + "C");
    }


    
    @Override
    public void encender() {
        super.encender();
        System.out.println("Encendiendo sensor");
    }

    @Override
    public void apagar() {
        super.apagar();
        System.out.println("Apagando sensor");
    }

    
}
