import java.util.Scanner;

public class BecaEstudiante {
    public static void main(String[] args) {
        // Crear un objeto Scanner para leer la entrada del usuario
        Scanner scanner = new Scanner(System.in);

        // Solicitarle el promedio de notas
        System.out.println("Ingrese el promedio de notas: ");
        double promedio = scanner.nextDouble();

        // Solicitarle el porcentaje de asistencia
        System.out.println("Ingrese el porcentaje de asistencia: ");
        double asistencia = scanner.nextDouble();

        // Evaluar que el promedio sea igual o mayor a 8.5
        // y con el operador AND tambien determine que la asistencia sea mayor al 90%
        // para que el estudiante apruebe la beca.
        if (promedio >= 8.5 && asistencia >= 90) {
            System.out.println("¡Felicidades! El estudiante si aplica para una beca.");
        } else {
            System.out.println(" ¡Lamentable! el estudiante NO califica para una beca.");
        }

        // Cerrariamos el scanner
        scanner.close();
    }
}
