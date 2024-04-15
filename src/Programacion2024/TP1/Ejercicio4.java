package Programacion2024.TP1;

import java.util.Scanner;

/**
 *
 * @author Braian Gonzalez
 */
public class Ejercicio4 {
    
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int dia, mes, año; 
        
        System.out.print("Ingrese el dia: ");
        dia = entrada.nextInt();
        if (dia < 1 || dia >31){
            System.out.print("El dia ingresado no es valido.");
            return;
        }
        
        System.out.print("Ingrese el mes: ");
        mes = entrada.nextInt();
        if (mes < 1 || mes > 12){
            System.out.print("El mes ingresado no es valido.");
            return;
        }
        
        System.out.print("Ingrese el año: ");
        año = entrada.nextInt();
        if (año < 1){
            System.out.print("El año ingresado no es valido.");
            return;
        }
        
        if (mes == 2) {
           if (dia < 1 || dia > 28) {
            System.out.println("El dia ingresado no es valido para febrero.");
            return;
            }
        }else {
            if(mes == 4 || mes == 6 || mes == 9 || mes == 11) {
                if (dia < 1 || dia > 30){
                    System.out.println("El dia ingresado no es valido para este mes.");
                    return;
                }
            }else if(mes == 1 || mes == 3 || mes == 5 || mes == 7 || mes == 8 || mes == 10 || mes == 12) {
                if (dia < 1 || dia > 31) {
                    System.out.println("El dia ingresado no es valido para este mes.");
                    return;  
                }
            }
        }
        
        if (mes >= 1 && mes <= 3){
            System.out.print("La fecha ingresada corresponde al primer trimestre del año");
        }else if (mes >= 4 && mes <= 6){
            System.out.print("La fecha ingresada corresponde al segundo trimestre del año");
        }else if (mes >= 7 && mes <= 9){
            System.out.print("La fecha ingresada corresponde al tercer trimestre del año");
        }else if (mes >= 10 && mes <= 12){
            System.out.print("La fecha ingresada corresponde al cuarto trimestre del año");
        }
        
        
    }
    
}
