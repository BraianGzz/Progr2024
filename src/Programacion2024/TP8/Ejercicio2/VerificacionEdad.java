package Programacion2024.TP8.Ejercicio2;
public class VerificacionEdad {
    private int edad;
    
    public VerificacionEdad(int edad){
        this.edad = edad;
    }

    public void VerificarEdad() throws Exception {
        if (edad < 13) {
            filtrarCont(edad);
            throw new Exception("El usuario no tiene la edad permitida para registrarse, ya que tiene " + edad + " anios.");
        }
        System.out.println("Puede registrarse.");
    }
    
    public void filtrarCont(int edad) {
        if(edad >= 6 && edad <= 13) {
            System.out.println("El usuario solo puede acceder a contenido educativo");
        }else if(edad > 0 && edad < 6){
            System.out.println("El usuario solo puede acceder a contenido para ninios");
        }
    }
    
}

