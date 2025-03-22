import java.util.Scanner;

public class AñoBisiesto {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Pedir al usuario el año
        System.out.println("Introduce un año: ");
        int año = scanner.nextInt();
        
        // Verificar si el año es bisiesto primero: si es divisible por 4 y no por 100
        // añadimos operador OR para sumar que sea divisible por 400
        if (  (año % 4 == 0 && año % 100 != 0) || (año % 400 == 0) ) {
            System.out.println(año + " es un año bisiesto!! ");
        } else {
            System.out.println(año + " no es un año bisiesto :o ");
        }
        // cerariamos el scanner
        scanner.close();
    }
}
