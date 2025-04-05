import java.util.Scanner;

public class Ingreso {
    
    public static void main(String[] args) {

        Scanner scanner = new Scanner (System.in);

        int  contrasena_verdadera = 1234;
        int contrasena_ingresada = 0;

        System.out.println("ingrese su contraseña ");
        contrasena_ingresada = scanner.nextInt();
        
        
        for ( int contador = 3; contador > 0; contador --); 
            System.out.println("ingrese su contraseña");
            contrasena_ingresada = scanner.nextInt(); 

          if (contrasena_ingresada == contrasena_verdadera); 
                System.out.println("Acceso permitido");

                
        
            
            
            
            
            
            
    }}

