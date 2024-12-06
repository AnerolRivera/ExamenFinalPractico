//Crea un programa con un while que pueda crear cualquier tipo de tabla de multiplicar y debe imprimir solo las 20 primeras multiplicaciones, solo se debe ingresar por consola el numero de la tabla. a)(Ayuda a tener en cuenta un contador contador=contador+1 )
import java.util.Scanner;
public class PuntoSeis {

        public static void main(String[] args) {

            // Se crea un objeto Scanner para leer la entrada del usuario
            Scanner scanner = new Scanner(System.in);

            // Se solicita al usuario el número de la tabla de multiplicar
            System.out.print("Introduce el número de la tabla de multiplicar: ");
            int numero = scanner.nextInt();

            // Inicializar el contador para las multiplicaciones
            int contador = 1;

            // Imprimir la tabla de multiplicar usando un while
            while (contador <= 20) {
                int resultado = numero * contador;
                System.out.println(numero + " x " + contador + " = " + resultado);
                contador = contador + 1;  // Incrementar el contador
            }

            // Cerrar el objeto scanner
            scanner.close();
        }
    }


