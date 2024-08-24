package Programacion2024.TP6.Ejercicio1;

public class Altavoz extends Dispositivos implements HistorialEstados {
    private boolean reproduciendo;
    
    public Altavoz() {
        super();
        this.reproduciendo = false;


    }
    
    public void iniciarReproduccion() {
        reproduciendo = true;
        System.out.println("Reproduciendo sonido");
       guardarEstado("Reproduccion iniciada");
    }

    public void detenerReproduccion() {
        reproduciendo = false;
        System.out.println("Pausando sonido");
        guardarEstado("Reproduccion detenida");
    }
    
     @Override
    public void encender() {
        super.encender();
        System.out.println("Encendiendo altavoz");
    }

    @Override
    public void apagar() {
        super.apagar();
        System.out.println("Apagando Altavoz");
    }

    
    
}
