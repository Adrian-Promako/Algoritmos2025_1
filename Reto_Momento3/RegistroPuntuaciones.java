//Identificar los errores de sintaxis, lógicos y de declaración en el código Java proporcionado.  HECHO
//Corregir el código para que compile sin errores y ejecute las funcionalidades de agregar puntuaciones (hasta un máximo fijo)
//mostrar las puntuaciones registradas correctamente.


package Reto_Momento3;

import java.util.Scanner;

 // Unica clase para el Reto 1

public class RegistroPuntuaciones {

// Usaremos arrays de tamaño fijo para almacenar nombres y puntuaciones.
// Suponemos un máximo de 5 puntuaciones altas.

public static final int maxPuntuaciones = 5;  // SE AGREGA EL STATIC PARA SER INSTANCIADO
String[] nombresJugadores = new String[maxPuntuaciones];
int[] puntuaciones = new int[maxPuntuaciones];
int contadorActual = 0; // Para saber cuántas puntuaciones hemos registrado
// Método para agregar una nueva puntuación
// No se preocupará por ordenarlas, solo por registrarlas si hay espacio.


public void agregarPuntuacion(String nombre, int puntaje) {   
//vamos a intentar agregar dos scanner para guardar los nombres y los puntajes
  
if (contadorActual < maxPuntuaciones) {
nombresJugadores[contadorActual] = nombre;  // SE AGREGA UN PUNTO Y COMA 
puntuaciones[contadorActual] = puntaje; // Error: Falta ; en la línea anterior
contadorActual++; // Error: Falta ;
System.out.println("Puntuación para " + nombre + " registrada.");
} else {
System.out.println("Registro lleno. No se pudo agregar la puntuación de " + nombre); // Error: 'nomre' en lugar de 'nombre'

nombresJugadores[1]= scanner.nextLine();  // PENDIENTE!!!!!


}
 // Error: return innecesario en un método void si es la última línea, pero aquí puede causar confusión.
}

// Método para mostrar todas las puntuaciones registradas
public void mostrarPuntuaciones() {
System.out.println("\n--- Puntuaciones Más Altas ---");
if (contadorActual == 0) {
System.out.println("Aún no hay puntuaciones registradas.");
return;
// Error: Falta 'return;' si se quiere salir aquí, o quitar el return de agregarPuntuacion
}
for (int i = 0; i < contadorActual; i++) { // Error: Condición de bucle incorrecta (debería ser < contadorActual)
System.out.println(nombresJugadores[i] + ": " + puntuaciones[i] + " puntos");
}
System.out.println("---------------------------");
}



public static void main(String[] args) {
RegistroPuntuaciones registro = new RegistroPuntuaciones();
Scanner scanner = new Scanner(System.in);
int opcionUsuario = 0; // Error: debería ser String para comparar con "3"

while (opcionUsuario != 3) {   // se cambia el tipo de datos string a uno entero que pueda ser compatiblew con los selectores del SwitchCase
System.out.println("\nSistema de Puntuaciones Arcade");
System.out.println("1. Agregar Puntuación");
System.out.println("2. Mostrar Puntuaciones");
System.out.println("3. Salir");
System.out.print("Elige una opción: ");
opcionUsuario = scanner.nextInt();  // SE CAMBIA EL TIPO DE ENBTRADA DE STRING A INT

switch (opcionUsuario) {

case 1: // Error: switch con String, pero opcionUsuario es int si no se corrige arriba.
    if (registro.contadorActual < maxPuntuaciones) { // Error: MAX_PUNTUACIONES no es accesible directamente sin 'registro.' o declarándolo static
    System.out.print("Nombre del jugador: ");
    String nombreJugador = scanner.nextLine();
    System.out.print("Puntuación obtenida: ");
    int puntajeObtenido = scanner.nextInt();
    scanner.nextLine(); // Limpiar buffer
    registro.agregarPuntuacion(nombreJugador, puntajeObtenido);
} 
else {
System.out.println("El registro de puntuaciones está lleno.");
}
break;

case 2:                         //SE CAMBIA EL TIPO DE SWITCH DE STRING A INT
registro.mostrarPuntuaciones();
break;

case 3:                       //SE CAMBIA EL TIPO DE SWITCH DE STRING A INT
System.out.println("Gracias por jugar!");
break;

default:
System.out.println("Opción no válida. Intente nuevamente");              // Error: Falta ;
}
}
scanner.close();
}
}