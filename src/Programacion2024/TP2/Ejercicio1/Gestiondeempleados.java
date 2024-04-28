package Programacion2024.TP2.Ejercicio1;

import java.util.Scanner;

/**
 *
 * @author Braian Gonzalez
 */
public class Gestiondeempleados {

    public static void main(String[] args){
        
        Scanner entrada = new Scanner(System.in);
        
        //objeto
        Empleado emp1 = new Empleado ("Juan","Ortega",35,1000);
        
        
        System.out.println("Presione (1) para mostrar Informacion completa con salario");
        System.out.println("Presione (2) para mostrar Informacion sin salario");
        int opcion = entrada.nextInt();
        
        if(opcion == 1){
            emp1.mostrarInfo(emp1.nombre, emp1.apellido, emp1.edad, emp1.salario);
        }else if(opcion == 2){
            emp1.mostrarInfo(emp1.nombre, emp1.apellido, emp1.edad);
            System.exit(0);
        }else{
            System.out.println("Opcion no valida");
        }
        
        
        
        
        System.out.println("Si desea aumentar el salario presione (1), si no, presione cualquier tecla.");
        int opcionSalario = entrada.nextInt();

        if (opcionSalario == 1) {
            System.out.println("Ingrese el porcentaje a aumentar:");
            double aumento = entrada.nextDouble();
            emp1.aumentarSalario(aumento);
            emp1.mostrarInfo(emp1.nombre, emp1.apellido, emp1.edad, emp1.salario);
        } else {
            System.out.println("Gracias por usar el programa.");
        }
        
        
        
    }
    
}
