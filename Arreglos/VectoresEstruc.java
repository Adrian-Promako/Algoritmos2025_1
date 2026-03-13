import java.util.Scanner; 

public class temperaturas {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
  /* Ejercicio 1: Registro de Temperaturas Mensuales
Contexto: Una estación meteorológica necesita procesar las temperaturas máximas
diarias registradas durante un mes (considera un mes de 30 días para simplificar).
Requisitos:
1. Crea un programa que solicite al usuario ingresar las 30 temperaturas
máximas del mes. Almacena estas temperaturas en un vector (array).
2. Calcula y muestra la temperatura máxima registrada en el mes.
3. Calcula y muestra la temperatura mínima registrada en el mes.
4. Calcula y muestra la temperatura promedio del mes.
5. Indica cuántos días la temperatura superó los 25 grados Celsius.
6. Utiliza ciclos para ingresar los datos y para realizar los cálculos. Usa
condicionales para encontrar el máximo, mínimo y contar los días cálidos.*/  

int temperaturas [] = new int [10];  //crear vector de 30 registros

System.out.println("Ingrese las temeperaturas");

temperaturas [0] = scanner.nextInt();
System.out.println("Ingrese las temeperatura 1");
temperaturas [1] = scanner.nextInt();
System.out.println("Ingrese las temeperatura 2");
temperaturas [2] = scanner.nextInt();
System.out.println("Ingrese las temeperatura 3");
temperaturas [3] = scanner.nextInt();
System.out.println("Ingrese las temeperatura 4");
temperaturas [4] = scanner.nextInt();
temperaturas [5] = scanner.nextInt();
temperaturas [6] = scanner.nextInt();
temperaturas [7] = scanner.nextInt();
temperaturas [8] = scanner.nextInt();
temperaturas [9] = scanner.nextInt();



    }
}
