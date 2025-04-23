import java.util.Scanner;

public class login {
    public static void main(String[] args) {
        // Crear un scanner
        Scanner scanner = new Scanner(System.in);

        //pedir la contraseña
        System.out.print("Ingrese su contraseña: ");
        String contrasena = scanner.nextLine();

        // ver si la contraseña es valida
        if (contrasena.length() >= 8 && contrasena.matches(".*[a-zA-Z].*") && contrasena.matches(".*\\d.*")) {
            System.out.println("La contraseña es válida.");
        } else {
            System.out.println("La contraseña no es válida.");
        }

        // Cerrariamos el scanner
        scanner.close();
    }
}
