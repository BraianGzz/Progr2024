package Programacion2024.TP3.Ejercicio2;

public class Interes {
    private double capital;
    private double interes;
    private int años;
    private int interesPorAño;

    public Interes(double capital, double interes, int años, int interesPorAño) {
        this.capital = capital;
        this.interes = interes;
        this.años = años;
        this.interesPorAño = interesPorAño;
    }
    

    public void montoFuturo(){
        double montoFuturo = capital * Math.pow((1 + interes / interesPorAño), interesPorAño * años);//formula interes compuesto
        System.out.println("Monto futuro (sin redondear): $" + montoFuturo);
        System.out.println("Monto futuro (redondeado): $" + Math.round(montoFuturo));
        System.out.println("Monto futuro (ceil): $" + Math.ceil(montoFuturo));
    }

}
