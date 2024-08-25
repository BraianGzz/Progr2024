package Programacion2024.TP6.Ejercicio1;



public class SensorTemperatura extends Dispositivos  {
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
        this.encendido = true;
        guardarEstado("Encendido");
        System.out.println("Encendiendo sensor");
    }

    @Override
    public void apagar() {
        this.encendido = false;
        guardarEstado("Apagado");
        System.out.println("Apagando sensor");
    }

    
}
