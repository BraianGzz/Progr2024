package Programacion2024.TP3.Ejercicio3;

public class Tweet {
    private String tweet;

    public Tweet(String tweet) {
        this.tweet = tweet;
    }
    
    public void cLongitud(){
        System.out.println("Longitud:" +tweet.length());
        if(tweet.length() <= 280){
            System.out.println("El tweet cumple con el limite de 280 caracteres.");
        }else if(tweet.length() > 280){
            System.out.println("El tweet no cumple con el limite de 280 caracteres.");
            System.exit(1);
        }
    }
    
    public void hashtag(){
        tweet=tweet.concat("#Argentina");
        System.out.println(tweet);
    }
    
    public void usuario(){
        int inicio = tweet.indexOf("@");
        int fin = tweet.indexOf(" ", inicio);
        System.out.println("Usuario:" +tweet.substring(inicio, fin));
    }
    
    
    public void otroTweet(){
        StringBuilder otro = new StringBuilder(tweet);
        otro.append(" Aguante Boca").append(" hoy es 22 de mayo").append(" chau.");
        System.out.println(otro.toString());
    }
    
    public void nuevoTweet(){
        int inicio = tweet.indexOf("H");
        int fin = tweet.indexOf(",", inicio);
        int u1 = tweet.indexOf("@");
        int u2 = tweet.indexOf(" ", u1);
        StringBuilder aa = new StringBuilder(tweet);
        System.out.println(aa.substring(inicio, fin) +"." +aa.substring(u1, u2));
    }

}
