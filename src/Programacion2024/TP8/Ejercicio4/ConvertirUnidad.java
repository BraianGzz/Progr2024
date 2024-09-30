package Programacion2024.TP8.Ejercicio4;
public class ConvertirUnidad {
    private double valor;
    private String unidadOrigen;
    private String unidadDestino;

    public ConvertirUnidad(double valor, String unidadOrigen, String unidadDestino) {
        this.valor = valor;
        this.unidadOrigen = unidadOrigen.toLowerCase();
        this.unidadDestino = unidadDestino.toLowerCase();
    }
    
    public void convertir() throws Exception{
        if (esLongitud(unidadOrigen) && esLongitud(unidadDestino)) {
            convertirLongitud();
        } else if (esPeso(unidadOrigen) && esPeso(unidadDestino)) {
            convertirPeso();
        }else {
            throw new Exception("Error. No se puede convertir de " + unidadOrigen + " a " + unidadDestino + ", debe ingresar unidades validas y compatibles.");
        }
    }
    
    private boolean esLongitud(String unidad) {
        return unidad.equals("m") || unidad.equals("cm") || unidad.equals("mm");
    }
    private boolean esPeso(String unidad) {
        return unidad.equals("kg") || unidad.equals("g");
    }
    
    
    private void convertirLongitud() {
        switch (unidadOrigen) {
            case "m":
                if (unidadDestino.equals("cm")) {
                    System.out.println(valor + " metros es igual a " + (valor * 100) + " centimetros.");
                } else if (unidadDestino.equals("mm")) {
                    System.out.println(valor + " metros es igual a " + (valor * 1000) + " milimetros.");
                }
                break;
            case "cm":
                if (unidadDestino.equals("m")) {
                    System.out.println(valor + " centimetros es igual a " + (valor / 100) + " metros.");
                } else if (unidadDestino.equals("mm")) {
                    System.out.println(valor + " centimetros es igual a " + (valor * 10) + " milimetros.");
                }
                break;
            case "mm":
                if (unidadDestino.equals("m")) {
                    System.out.println(valor + " milimetros es igual a " + (valor / 1000) + " metros.");
                } else if (unidadDestino.equals("cm")) {
                    System.out.println(valor + " milimetros es igual a " + (valor / 10) + " centimetros.");
                }
                break;
        }
    }
    
    private void convertirPeso() {
        switch (unidadOrigen) {
            case "kg":
                if (unidadDestino.equals("g")) {
                    System.out.println(valor + " kilogramos es igual a " + (valor * 1000) + " gramos.");
                }
                break;
            case "g":
                if (unidadDestino.equals("kg")) {
                    System.out.println(valor + " gramos es igual a " + (valor / 1000) + " kilogramos.");
                }
                break;
        }
    }
}
