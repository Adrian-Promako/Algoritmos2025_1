import java.util.Scanner;
public class VectoresEstruc {

    public static void main(String[] args) {  //crear el main
        Scanner sc = new Scanner(System.in);   // crear un metodo Scanner 
        // int [] vector = new int [5]; // crear el vector con el tipo de dato de variable

        /*
        int numero ;
            vector [0] = 1;
            vector [1] = 2;
            vector [2] = 3;
            vector [3] = 4;
            vector [4] = 5;  */

            int [] precios = new int [3];  //crea una variable con nombre precios en el vector  de 3 posiciones 
            System.out.println("ingrese el precio");  //imprime la solicitud de los numeros
            precios[0] = sc.nextInt();   // establece en el primer espacio del vector el 1er ingreso por teclado
            precios[1] = sc.nextInt();   // establece en el primer espacio del vector el 2do ingreso por teclado 
            System.out.println("ingrese el valor a restar");  
            precios[2] = sc.nextInt();   // establece en el primer espacio del vector el 3er ingreso por teclado   

            int preciototal = precios[0]+precios[1]-precios[2];  // crea una variable para almacenar la operacion de los arreglos
            System.out.println("El total de precios es:"+preciototal); //imprime el resultado de la operacion

            sc.close();
       }
    
}
