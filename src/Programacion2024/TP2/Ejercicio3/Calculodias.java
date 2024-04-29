package Programacion2024.TP2.Ejercicio3;

import java.util.Calendar;

public class Calculodias {
    int dia;
    int mes;
    int anio;

    public Calculodias(int dia, int mes, int anio) {
        this.dia = dia;
        this.mes = mes;
        this.anio = anio;
    }
    
    public int calculoDias(int dia, int mes, int anio){
        Calendar inicio = Calendar.getInstance();
        inicio.set(anio, mes - 1, dia);
        
        Calendar actual = Calendar.getInstance();
        
        long diferenciaEnMs = actual.getTimeInMillis() - inicio.getTimeInMillis();
         
        int diasTranscurridos = (int) (diferenciaEnMs / (1000 * 60 * 60 * 24));
        
        return diasTranscurridos;
        
    }
}
