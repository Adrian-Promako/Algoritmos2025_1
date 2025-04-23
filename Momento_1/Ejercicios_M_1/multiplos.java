import java.util.Scanner;

public class multiplos {
    public static void main(String[] args) {
        // Crear un scanner
        Scanner scanner = new Scanner(System.in);

        // pedimos los dos números a indagar
        System.out.print("Ingrese el primer número: ");
        int num1 = scanner.nextInt();
        System.out.print("Ingrese el segundo número: ");
        int num2 = scanner.nextInt();
        scanner.close();
        // revisamos si el segundo número es múltiplo del primero
        if (num2 % num1 == 0) {
            System.out.println(num2 + " es múltiplo de " + num1);
        } else {
            System.out.println(num2 + " no es múltiplo de " + num1);
        }

        
        
    }
}

    

