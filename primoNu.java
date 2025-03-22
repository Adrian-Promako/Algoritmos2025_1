import java.util.Scanner;

public class primoNu {
    public static void main(String[] args) {
        // Crear un scaner 
        Scanner scanner = new Scanner(System.in);

        // Solicitar el numero 
        System.out.print("Ingrese un número entero: ");
        int numero = scanner.nextInt();

        // Verificar si el número es igual que 1 
        if (numero <= 1) {
            System.out.println("El número debe ser mayor que 1.");
        } else {
            boolean esPrimo = true;

            // Revisamos si el número se puede dividir por cualquier número entre 2 negativo
            for (int i = 2; i < numero; i++) {
                if (numero % i == 0) {
                    esPrimo = false;  // Si es divisible por otro numero no seria primo
                    break;  // cerrar el ciclo si encontramos un numero divisor distinto al numero y uno
                }
            }

            // generamos resultado 
            if (esPrimo) {
                System.out.println("El número " + numero + " es primo.");
            } else {
                System.out.println("El número " + numero + " no es primo.");
            }
        }

        scanner.close();
    }
}

