package Vectores_Matrices;

import java.util.Scanner;

public class Inventario {
    
    public static void main(String[] args) {
        
    

        Scanner scanner = new Scanner(System.in);

        String [] idProd = new String[3];
        //int [] idProd = new int [3];
        int [] cantidadProd = new int [3];
        int [] precioProd = new int [3];

        // indexar cada vector

        idProd [0] = "leche" ;
        idProd [1] = "papa" ;
        idProd [2] = "arroz" ;
        /* 
        IdProd [0] = 1 ;
        IdProd [0] = 1 ;
        IdProd [0] = 1 ;
        IdProd [0] = 1 ;
        IdProd [0] = 1 ;
        IdProd [0] = 1 ;
        IdProd [0] = 1 ;  */

        cantidadProd [0] = 2;
        cantidadProd [1] = 4;
        cantidadProd [2] = 6;

        precioProd [0] = 100;
        precioProd [1] = 200;
        precioProd [2] = 300;

        int opcion = 0;
        while (opcion != 4 ) {
        System.out.println("1. Modificar\r\n" + //
                    "2. Buscar un producto\r\n" + //
                    "3. Valor total inventario\r\n" + //
                    "4. Salir\r\n");
            System.out.print("Opción seleccionada: ");
            opcion = scanner.nextInt();

        switch (opcion) {
            case 2 : 
                for ( int i = 0; i < idProd.length; i++) {
                    System.out.println("la lista de productos es: " + idProd[i] + ", cantidad = " + cantidadProd[i] );
                    
                }
                break;
            // sumar vectores
            case 3 : 
                int valorTotal = 0;
                for ( int i =0; i<cantidadProd.length ;i++ ) {
                    valorTotal = valorTotal + cantidadProd[i]*precioProd[i];
                }
                System.out.println("valor total " + valorTotal);
                break;
        



            }
        }



        }
    }


