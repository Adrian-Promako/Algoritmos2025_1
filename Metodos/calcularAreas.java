import java.util.Scanner;
/* Cree un programa en Java que permita calcular el área de diferentes figuras
geométricas: cuadrado, rectángulo, triángulo y círculo. El programa debe
mostrar un menú de opciones, permitir que el usuario seleccione la figura
deseada, solicitar los datos necesarios desde consola, y mostrar el resultado del
área.
Cada figura debe tener un método independiente que no reciba parámetros ni
retorne valores, y que se encargue de:
● Pedir los datos necesarios al usuario (por ejemplo, base, altura o radio),
● Calcular el área,
● Mostrar el resultado directamente.
 */
public class calcularAreas {
   
    static Scanner scanner = new Scanner(System.in); // creamos el metodo scanner que se va a instanciar con el modificador adicional "static"
 
    public static void main (String[] args) {  // creamos nuestro metodo main
            mostrarMenu();
        }
 
        public static void mostrarMenu() {
            int opcion;
           
        do {
            System.out.println("\t\t\tBIENVENIDO!!\r\n"+
                                "--------=====CALCULADORA DE AREAS=====-------");
            System.out.println  ("1. Calcula area cuadrado: \n" + //
                                 "2. Calcula area de rectangulo\n" + //
                                 "3. Calcula area de triangulo\t\r\n" +//
                                 "4. Calcula area de circulo\t\r\n" +
                                 "5. Salir.");
            System.out.println("Elija una opcion valida:");
            opcion = scanner.nextInt();
//                  creamos los diferentes metodos que no retornan valor ni parametros
            switch (opcion) {
                case 1 : areaCuadrado ();
                            break;
                case 2 : areaRectangulo();
                            break;
                case 3 : areaTriangulo();
                            break;
                case 4 : areaCirculo();
                            break;
                case 5 : 
                        System.out.println("Saliendo del programa...");
                            break;
                default : 
                        System.out.println("opcion no adecuada, vuelva a seleccionar"); }
        }
            while (opcion != 5 ); 
            } 
            // ASIGNACION DE METODOS: aqui se establecen los parametros que deben realizar cada metodo y los resultados que deben retornar.

        public static void areaCuadrado() {
            int a = pedirNumero("ingrese el largo del cuadrado: ");
            int b = pedirNumero("ingrese el ancho del cuadrado: ");
            int resultado = a * b;
            System.out.println("El area del cuadrado es: " + resultado);
        }

        public static void areaRectangulo(){
            int a = pedirNumero("Ingrese el largo del rectangulo ");
            int b = pedirNumero("Ingrese el ancho del rectangulo ");
            int resultado = a * b;
            System.out.println("El area del rectangulo es: " +resultado);
        }
        
        public static void areaTriangulo (){
            int a = pedirNumero("Ingrese la base del triangulo ");
            int b = pedirNumero("ingrese la altura del triangulo ");
            int resultado = (a*b)/ 2;
            System.out.println("El area del triangulo es: " +resultado); 
        }

        public static void areaCirculo(){
            int a = pedirNumero("ingrese el radio del circulo: ");
            final double pi = 3.14159; 
            double resultado = (a*a)* pi;
            System.out.println("El area del criculo es: " +resultado);
        }

        // METODO AUXILIR PARA SOLICITAR NUMEROS
        public static int pedirNumero(String mensaje) {
            System.out.print(mensaje);
            return scanner.nextInt();
        }
        }
            

    
 
 