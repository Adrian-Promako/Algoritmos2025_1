import java.util.Scanner;

public class Primo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Introduce un número: ");
        int num = sc.nextInt();
        // establecer que el numero ingresado por teclado primo sea mayor que 1
        boolean esPrimo = num > 1;
        // agregamos el ciclo for para recorrer la raiz cuadrada de un numero
        for (int i = 2; i <= Math.sqrt(num) && esPrimo; i++) {
            if (num % i == 0) esPrimo = false;
        }
        
        System.out.println(esPrimo ? num + " es primo." : num + " no es primo.");
        sc.close();
    }
}
