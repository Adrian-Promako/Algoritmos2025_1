import java.util.Scanner;

public class calificacion {
    
         public static void main(String[] args) {
    // crearemos un scanner para detectar los ingresos pro teclado
        Scanner scanner = new Scanner (System.in);

    // solicitar al usuario la calificacion con la variable note entre 1 y 10, tambien creamos la variable de nta

        System.out.println("Ingrese la calificacion con valores unicamente entre  1 a 10 porfavor." );
        int nota = scanner.nextInt();

        
        // Determinar aprovado con operador mayor o igual que 6 
        if (nota >=6 ) {
        System.out.println("La calificacion muestra Aprovado!! Felicitaciones, pasaste Algoritmos I! " );
        
        // imprime un error si es menor a 6    
        } else { System.out.println(" Reprovado, debes persistir y mejorar!. ");    
        }
        // cerrar el scanner 
        scanner.close();
    }
}
