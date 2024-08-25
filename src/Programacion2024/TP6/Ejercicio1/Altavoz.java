package Programacion2024.TP6.Ejercicio1;

public class Altavoz extends Dispositivos  {
    
    public Altavoz() {
        super();
    }
    
    public void iniciarReproduccion() {
        System.out.println("Reproduciendo sonido");
       guardarEstado("Reproduccion iniciada");
    }

    public void detenerReproduccion() {
        System.out.println("Pausando sonido");
        guardarEstado("Reproduccion detenida");
    }
    
     @Override
    public void encender() {
        this.encendido = true;
        guardarEstado("Encendido");
        System.out.println("Encendiendo altavoz");
    }

    @Override
    public void apagar() {
        this.encendido = false;
        guardarEstado("Apagado");
        System.out.println("Apagando Altavoz");
    }

    
    
}
