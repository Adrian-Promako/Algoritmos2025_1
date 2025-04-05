import java.util.Scanner;

public class CompNum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);

    // aqui solicitamos que ingresen el primer numero
        System.out.println("ingrese el primer numero");
        int numero1 = scanner.nextInt();
    // aqui solicitamos que ingresen el segundo numero 
        System.out.println("ingrese el segundo numero");
        int numero2 = scanner.nextInt();

    // en caso de que el numero1 sea mayor que el numero dos muestra el primer mensaje
        if ( numero1 > numero2 ) {
            System.out.println("El numero 1 es mayor ");

    // muestra lo contrario de que el numero1 sea mayor     
        } else {
            System.out.println("El numero 1 es menor ");
            
        }
    // agregamos otra condicion en caso de que ambos numeros sean iguales.
        if ( numero1 == numero2) { 
            System.out.println("Ambos numeros son iguales");
            
        }
    // cerramos el scanner        
        scanner.close();
    }
}
