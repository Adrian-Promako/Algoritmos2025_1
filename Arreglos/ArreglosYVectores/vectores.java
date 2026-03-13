import java.util.Arrays;

public class vectores {
    
    public static void main (String []args){

        System.out.println("Bienvenido al programa.");
        int vector[] = {100,200,150,300};

        // Recorremdos el vector para imprimir los valores alamcenados en este mismo 
        for(int i=0; i<vector.length;i++){
            System.out.println(vector[i]); // Creando el ciclo for es util para imprimir sin importar el Arrays.toString
        
            }
           //System.out.println(vector); // en este caso encontramos que al buscar imprimir el vector, solo imprime su direccion en memoria
           System.out.println(Arrays.toString(vector));
        } 
    }

