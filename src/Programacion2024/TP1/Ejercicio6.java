package Programacion2024.TP1;

import java.util.Scanner;

/**
 *
 * @author Braian Gonzalez
 */
public class Ejercicio6 {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int n, equilateros = 0, isosceles = 0, escalenos = 0;
        float lado1, lado2, lado3;
        System.out.print("Ingrese la cantidad de triangulos:");
        n = entrada.nextInt();
        
        for(int i=0; i<n; i++){
            System.out.print("Triangulo "+(i + 1));
            
            System.out.print("\nIngrese el lado 1:");
            lado1 = entrada.nextFloat();
            
            System.out.print("Ingrese el lado 2:");
            lado2 = entrada.nextFloat();
            
            System.out.print("Ingrese el lado 3:");
            lado3 = entrada.nextFloat();
        
            
            if ((lado1 == lado2) && (lado2 == lado3)) {
                System.out.println("Este es un triangulo equilatero.");
                equilateros++;
            }if ((lado1 == lado2) && (lado2 != lado3) || (lado2 == lado3) && (lado3 != lado1) || (lado1 == lado3) && (lado3 != lado1)){
                System.out.println("Este es un triangulo isosceles.");
                isosceles++;
            }if ((lado1 != lado2) && (lado1 != lado3) && (lado2 !=lado3) && (lado2 != lado1) && (lado3 != lado2) && (lado3 != lado1)){
                System.out.println("Este es un triangulo escaleno.");
                escalenos++;
            }
        }
        
        System.out.print("Cantidad de triangulos equilateros: "+equilateros);
        System.out.print("\nCantidad de triangulos isosceles: "+isosceles);
        System.out.print("\nCantidad de triangulos escalenos: "+escalenos);
        
        if((equilateros < escalenos) && (equilateros < isosceles) || (equilateros == 0)){
            System.out.print("\nLa Menor cantidad de triangulos son los equilateros:"+equilateros);
        }if((isosceles < escalenos) && (isosceles < equilateros) || (isosceles == 0)){
            System.out.print("\nLa Menor cantidad de triangulos son los isosceles:"+isosceles);
        }if((escalenos < isosceles) && (escalenos < equilateros) || (escalenos == 0)){
            System.out.print("\nLa Menor cantidad de triangulos son los escalenos:"+escalenos);
        }
    }
    
}
