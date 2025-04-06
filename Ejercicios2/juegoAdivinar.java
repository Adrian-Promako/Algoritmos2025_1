
package Ejercicios_Clase;
import java.util.Scanner;
/*    */

 
public class juegoAdivinar {
    
    public static void main(String[] args) {
     
       int numeroAleatorio = 0; 
       int numeroUsuario = 0; 
       int intentos = 0;
       
       Scanner scanner = new Scanner(System.in);

      numeroAleatorio = (int) (Math.random()*20);

      System.out.println(numeroAleatorio);
    }
}
