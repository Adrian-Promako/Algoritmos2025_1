package Estructura_de_datos;

public class ejercicio1 {
        /*FUNCION DE ORDENAMIENTO DE BURBUJA ORDEN ASCEDENTE */
    public static void bubbleSort (int [] array){
        int n =array.length;
        boolean swapped; 

        for (int i=0 ; i < n-1 ; i++) {
            swapped = false;
            for (int j=0; j< n-i-1; j++){

                if (array[j] < array[j+1]) {   /* por otro lado aqui deberia ir el signo mayor > para que el resultado sea Ascendente */

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
            /* METODO PRINCIPAL PARA PROBAR LA FUNCION */
    public static void main (String []args){
        int [] arr = {64,34,25,12,22,11,90};
        int [] arr5 ={64,34,25,12,22,11,9,98,32,40};
        System.out.println("Arreglo original:");
        printArray(arr5);

        bubbleSort(arr5);

        System.out.println("\nArreglo ordenado de forma descedente");
        printArray(arr5);
    }
                /*fUNCION AUXILIAR PARA IMPRIMIR EL ARREGLO */
    public static void printArray (int[] arr5) {
        for (int i=0; i<arr5.length; i++) {
            System.out.print(arr5[i]+" ");
        }
        System.out.println();
    }
}

