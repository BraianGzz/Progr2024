package Programacion2024.TP3.Ejercicio3;

public class procesamientotweets {

    public static void main(String[] args) {
        Tweet tweet1 = new Tweet("@BraianGz :Hola soy Braian, esto es un tweet.");
        System.out.println("@BraianGz :Hola soy Braian, esto es un tweet.");
        tweet1.cLongitud();
        tweet1.hashtag();
        tweet1.usuario();
        tweet1.otroTweet();
        tweet1.nuevoTweet();
    }
    
}
