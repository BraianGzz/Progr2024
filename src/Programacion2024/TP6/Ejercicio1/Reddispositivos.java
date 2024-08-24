package Programacion2024.TP6.Ejercicio1;

public class Reddispositivos {

    public static void main(String[] args) {
        SensorTemperatura sensor = new SensorTemperatura();
        sensor.encender();
        sensor.medirTemperatura();

        Camara cam = new Camara();
        cam.encender();
        cam.iniciarGrabacion();
        cam.detenerGrabacion();
        cam.apagar();
        
        Altavoz parlante = new Altavoz();
        parlante.encender();
        parlante.iniciarReproduccion();
        parlante.detenerReproduccion();
        parlante.apagar();

        //historial de estados
        System.out.println("Historial Sensor: " + sensor.getHistorialEstados());
        System.out.println("Historial Camara: " + cam.getHistorialEstados());
        System.out.println("Historial Altavoz: " + parlante.getHistorialEstados());
    }
    
}
