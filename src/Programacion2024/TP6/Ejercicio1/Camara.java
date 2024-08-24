package Programacion2024.TP6.Ejercicio1;

public class Camara extends Dispositivos implements HistorialEstados{
    private boolean grabando;


    public Camara() {
        super();
        this.grabando = false;


    }
    
    public void iniciarGrabacion() {
        grabando = true;
        System.out.println("Iniciando grabacion");
       guardarEstado("Grabacion iniciada");
    }

    public void detenerGrabacion() {
        grabando = false;
        System.out.println("Pausando grabacion");
        guardarEstado("Grabacion detenida");
    }
    
    @Override
    public void encender() {
        super.encender();
        System.out.println("Encendiendo camara");
    }

    @Override
    public void apagar() {
        super.apagar();
        System.out.println("apagando camara");
    }




}
