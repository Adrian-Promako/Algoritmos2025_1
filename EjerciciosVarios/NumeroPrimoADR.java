import java.util.Scanner;

public class NumeroPrimoADR {
    
    public static void main(String[] args) {

       // crear un objeto Scanner para detectar la entrada de teclado 
        Scanner scanner = new Scanner (System.in);  

       // solicitar al usuario el numero entero
       System.out.println("Ingrese el número para determinar si es número primo.");
       int numero = scanner.nextInt();

       // realizar operacion de numero primo

       if ( numero  % 1 == 0  ) {
        System.out.println(" el " + numero +" es un numero primo");
        
       } else {System.out.println(" el " + numero + " no es un numero primo"); }
            
    
       scanner.close();

    }
}
