    import java.util.Scanner;

public class ParImpar {
    public static void main(String[] args) {

    // Crear un objeto Scanner para leer la entrada del usuario
        Scanner scanner = new Scanner(System.in);

    // Solicitar al usuario un número
        System.out.print("Ingresa un numero: ");
        int numero = scanner.nextInt();

    // Determinar si el número dividido por dos es par si el residuo de la division es cero
        if (numero % 2 == 0) {
            System.out.println("El número " + numero + " es un numero par.");
        } 
    //  en este caso al no cumplirse la condicion seria impar
        else {
            System.out.println("El número " + numero + " es un numero impar.");
        }
        

    // Cerramos el scanner 
        scanner.close();
    }
}

