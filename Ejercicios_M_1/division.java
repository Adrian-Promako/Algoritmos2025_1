import java.util.Scanner;

public class division {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Solicitar los tres números
        System.out.print("Ingrese a: ");
        double a = scanner.nextDouble();
        System.out.print("Ingrese b: ");
        double b = scanner.nextDouble();
        System.out.print("Ingrese c: ");
        double c = scanner.nextDouble();

        // Comprobar si (a - b) es distinto de cero
        if (a - b != 0) {
            // Realizar y mostrar el resultado
            System.out.println("El resultado de la expresion es : " + (a + b) * c / (a - b));
        } else {
            System.out.println("No puede dividirse por cero los dos valores.");
        }

        scanner.close();
    }
}
