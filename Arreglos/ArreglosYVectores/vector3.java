/*Vamos a crear un arreglo unidimensional con valores numericos de caracter enteros 
y finalmente los vamos a imprimir actualizados. */

import java.util.Arrays;
import java.util.Scanner;
public class vector3 {
    
    public static void main(String[] args) {
        Scanner sc  = new Scanner( System.in);

        int [] vector = new int[5];
       //Recorremos el vector para agregar un valor en cada indice.
        for (int i =0; i<vector.length; i++){
            System.out.println("ingrese los numeros para el vector");
            vector [i] = sc.nextInt();
            System.out.println(vector[i]);
                
        } System.out.println(Arrays.toString(vector));  //imprimimos el vector completo 

        // Vamosd a crear otro for para mostras los valores pares
        System.out.println("vamos a comprobar los valores pares");
        for (int i =0; i< vector.length;i++){
            if (vector[i] %2 ==0){
                System.out.println(vector[i]);
            }
        }
     }    
}
/* como conclusion general vemos que se deben gerar dos ciclos for para la realizacxion del ejercicio
A: El primer ciclo for se usa para poder recorrer y llenar los indices del vector.
B: El segundo ciclo for se usa para recorrer y COMPROBAR cual de los indices son numeros pares */
