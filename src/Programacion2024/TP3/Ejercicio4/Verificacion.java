package Programacion2024.TP3.Ejercicio4;

public class Verificacion {
    private String contraseña;

    public Verificacion(String contraseña) {
        this.contraseña = contraseña;
    }
     
    public void ochoCarcteres(){
        if(contraseña.length() > 8){
            System.out.println("La contrasenia tiene mas de 8 caracteres.");
        }else if(contraseña.length() < 8){
            System.out.println("La contrasenia debe tener mas de 8 caracteres.");
            System.exit(0);
        }
    }
    
    public void digitoNumerico(){
        boolean numero = false;
        char c;
        for(int i=0; i<contraseña.length(); i++){
            c = contraseña.charAt(i);
            if(Character.isDigit(c)){
                numero = true;
                break;
            }
        }
        if (numero){
            System.out.println("La contrasenia posee numeros.");
        }else{
            System.out.println("La contrasenia debe poseer numeros.");
            System.exit(0);
        }
    }
    
    public void caracterEspecial(){
        String caractEspecial = "!@#$%^&*";
        boolean cEspecial = false;
        char c;
        for(int i=0; i<contraseña.length(); i++){
            c = contraseña.charAt(i);
            if(caractEspecial.indexOf(c) != -1){
                cEspecial = true;
                break;
            }
        }
        if (cEspecial){
            System.out.println("La contrasenia posee digitos especiales.");
        }else{
            System.out.println("La contrasenia debe poseer digitos especiales.");
            System.exit(0);
        }
    }
    
    public void generarContra(){
        char[] especiales = {'!','*','@','$','#','%','¡','&'};
        char[] minusculas = {'a','b','c','d','e','f','g','h'};
        char[] numeros = {'1','2','3','4','5','6','7','8'};
        
        StringBuilder caracteres = new StringBuilder();
        caracteres.append(especiales);
        caracteres.append(minusculas);
        caracteres.append(numeros);
        
        StringBuilder ncontra = new StringBuilder();
        for(int i=0; i<=15; i++){
            int cantidadCaracteres = caracteres.length();
            int numRandom = (int)(Math.random()*cantidadCaracteres);
            
            ncontra.append((caracteres.toString()).charAt(numRandom));
        }
        System.out.println("Contrasenia recomendada:"+ncontra);
    }
    
    
}
