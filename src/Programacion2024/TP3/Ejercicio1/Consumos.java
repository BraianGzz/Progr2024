package Programacion2024.TP3.Ejercicio1;

public class Consumos {
    private int consumoAnterior;
    private int reduccionConsumo;
    private double consumoEd1;
    private double consumoEd2;
    private double consumoEd3;

    public Consumos(int consumoAnterior, int reduccionConsumo, double consumoEd1, double consumoEd2, double consumoEd3) {
        this.consumoAnterior = consumoAnterior;
        this.reduccionConsumo = reduccionConsumo;
        this.consumoEd1 = consumoEd1;
        this.consumoEd2 = consumoEd2;
        this.consumoEd3 = consumoEd3;
    }


    
    public void ahorroAnual(){
        double ahorroAnual = Math.sqrt(reduccionConsumo) * 365;
        System.out.println("El ahorro de energia anual es de: " + ahorroAnual + " kWh");
    }
    
    public void consumoAnterior(){
        double consumoPasado = Math.sqrt(consumoAnterior) * 365;
        System.out.println("El consumo antrior de energia anual era de: " + consumoPasado + " kWh");
    }
    
    public void consumoMaximo(){
        double maxConsumo = Math.max(consumoEd1, Math.max(consumoEd2, consumoEd3));
        System.out.println("El maximo consumo de energia entre los electrodomesticos es: " + maxConsumo + " kWh");
    }
    
    public void consumoMinimo(){
        double minConsumo = Math.min(consumoEd1, Math.min(consumoEd2, consumoEd3));
        System.out.println("El minimo consumo de energia entre los electrodomesticos es: " + minConsumo + " kWh");
    }
    
    
}
