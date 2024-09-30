package Programacion2024.TP8.Ejercicio3;

public class CalculoPropina {
    private double totalConsumido;
    private double propina;

    public CalculoPropina(double totalConsumido, double propina) {
        this.totalConsumido = totalConsumido;
        this.propina = propina;
    }
    
    public void calcularProp() throws Exception{
        if(propina < totalConsumido*0.10){
            throw new Exception("Error. La propina debe ser mayor al 10 porciento del total.");
        }
        System.out.print("Propina aceptada.");
        
    }
    

    
}
