/*
* Crea un programa que sea capaz de solicitarte un número y se
* encargue de imprimir su tabla de multiplicar entre el 1 y el 10.
* - Debe visualizarse qué operación se realiza y su resultado.
*   Ej: 1 x 1 = 1
*       1 x 2 = 2
*       1 x 3 = 3
*       ...
*/

import java.util.Scanner;

public class main {

     public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("ingrese el numero: ");
        int numero = sc.nextInt();

        System.out.println(numero + " x 1 = " + numero * 1);
        System.out.println(numero + " x 2 = " + numero * 2);
        System.out.println(numero + " x 3 = " + numero * 3);
        System.out.println(numero + " x 4 = " + numero * 4);
        System.out.println(numero + " x 5 = " + numero * 5);
        System.out.printf("%d x %d = %d %n", numero, 6, numero * 6);
        System.out.printf("%d x %d = %d %n", numero, 7, numero * 7);
        System.out.printf("%d x %d = %d %n", numero, 8, numero * 8);
        System.out.printf("%d x %d = %d %n", numero, 9, numero * 9);
        System.out.printf("%d x %d = %d %n", numero, 10, numero * 10);
    }
}
