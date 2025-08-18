package Estructura_de_datos;
import java.util.Arrays;


    public class guia2arreglo2 {
    
    public static void ordenarDescendente (int[] arr){

        int n = arr.length;
        for(int i=0; i<n; i++){
            int clave = arr[i];
            int j= i-1;

            /*mueve elementos menores que la clave o el pivote 
             una posicion adelamnte que su posicion actual */
            while(j>=0 && arr[j] < clave){ //cambio aqui de mas a menos '>' a '<'
            arr [j+1] = arr[j];
            j= j-1;
            } 
            arr[j+1]= clave;
        }
    }

    public static void main (String[] args){
        int [] numeros = {12,11,13,5,6};
        System.out.println("Matriz original" + Arrays.toString(numeros));

        ordenarDescendente(numeros);

        System.out.println("Matriz ordenada (descendente)" +Arrays.toString(numeros));
    }
}
