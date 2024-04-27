package Programacion2024.TP2.Ejercicio1;

//clase
public class Empleado {
    String nombre;
    String apellido;
    int edad;
    double salario;

    //constructor
    public Empleado(String nombre, String apellido, int edad, double salario) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.edad = edad;
        this.salario = salario;
    }

    //metodo para mostrar la informacion con salario
    public void mostrarInfo(String nombre, String apellido, int edad, double salario){
        System.out.println("La informacion del empleado es:");
        System.out.println("Nombre:" + nombre);
        System.out.println("Apellido:" + apellido);
        System.out.println("Edad:" + edad);
        System.out.println("Salario:" + salario);
    }
    
    //metodo para mostrar la informacion sin salrio
    public void mostrarInfo(String nombre, String apellido, int edad){
        System.out.println("La informacion del empleado es:");
        System.out.println("Nombre:" + nombre);
        System.out.println("Apellido:" + apellido);
        System.out.println("Edad:" + edad);
    }
    
    //metodo aumentar salario
    public void aumentarSalario(double aumento) {
        salario += salario * (aumento/100);
    }
    
    
    
}
