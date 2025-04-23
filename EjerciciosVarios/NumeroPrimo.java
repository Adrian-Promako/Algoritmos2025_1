import java.util.Scanner;

public class NumeroPrimo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Pedir un número al usuario
        System.out.print("Introduce un número entero: ");
        int numero = scanner.nextInt();
        
        // Verificar si el número es primo
        if ((numero <= 1 && numero % 2 != 0 ) || (numero % numero == 0 ))  {
            System.out.println(numero + " no es un número primo.");
        } else {
            boolean esPrimo = true;
            
            // Comprobar divisibilidad desde 2 hasta la raíz cuadrada del número
            
    
            // Mostrar el resultado
            if (esPrimo) {
                System.out.println(numero + " es un número primo.");
            } else {
                System.out.println(numero + " no es un número primo.");
            }
        }
        
        scanner.close();
    }
}

