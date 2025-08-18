package Estructura_de_datos;

public class ejercicio1 {
    
    public static void bubbleSort (int [] array){
        int n =array.length;
        boolean swapped; 

        for (int i=0 ; i < n-1 ; i++) {
            swapped = false;
            for (int j=0; j< n-i-1; j++){

                if (array[j]>array[j+1]) {

                    int temp = array[j];
                    array [j] = array [j+1];
                    array [j+1] = temp;
                    swapped = true;
                }
            }
            if (!swapped) {
                break;
            }
     } }

    public static void main (String []args){
        int [] lista1 = {64,34,25,12,22,11,90};
        int [] lista2 ={64,34,25,12,22,11,9,98,32,40};
        System.out.println("Arreglo original:");

        printArray(lista2);
        bubbleSort(lista2);
        System.out.println("\nArreglo ordenado de forma ascedente");
        printArray(lista2);
    }
    
    public static void printArray (int[] arr5) {
        for (int i=0; i<arr5.length; i++) {
            System.out.print(arr5[i]+" ");
        }
    }
}
