package Estructura_de_datos;

import java.util.Arrays;

public class guia2arreglo1 {
    public static void ordenarAscendente (int [] arr){
        int n = arr.length;                                         //se crea variable n donde almacena la cantidad de datos del arreglo
        for (int i=0; i<n-1; i++){  
            for (int j=0; j< n-i-1; j++){ 
                //comparamos el elemento actual con el siguiente
                if (arr[j] > arr [j+1]){  /*aca determinamos el orden ascedente */
                    /*si el actual es mayor los intercambiamos */
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr [j+1]= temp;
                }
            }
        }
    }

    public static void main (String[] args){
        int [] numeros = {64,34,25,12,22,11,90};
        System.out.println("Matriz original: " +Arrays.toString(numeros));

        ordenarAscendente(numeros);

        System.out.println("Matriz ordenada Ascendente: " +Arrays.toString(numeros) );

    }
    

}
