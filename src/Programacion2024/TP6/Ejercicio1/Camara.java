package Programacion2024.TP6.Ejercicio1;

public class Camara extends Dispositivos{


    public Camara() {
        super();

    }
    
    public void iniciarGrabacion() {
        System.out.println("Iniciando grabacion");
       guardarEstado("Grabacion iniciada");
    }

    public void detenerGrabacion() {
        System.out.println("Pausando grabacion");
        guardarEstado("Grabacion detenida");
    }
    
    @Override
    public void encender() {
        this.encendido = true;
        guardarEstado("Encendido");
        System.out.println("Encendiendo camara");
    }

    @Override
    public void apagar() {
        this.encendido = false;
        guardarEstado("Apagado");
        System.out.println("apagando camara");
    }

}
