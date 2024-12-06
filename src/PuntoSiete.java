//Usa un do-while para pedir notas notas hasta que el usuario ingrese -1 para detener el bucle, momento en el cual se calcula y muestra el promedio de las notas ingresadas.                                 a) Usar clase scanner para pedir las notas

import java.util.Scanner;

public class PuntoSiete {
    public static void main(String[] args) {
        // Se crea un objeto Scanner para leer la entrada del usuario
        Scanner scanner = new Scanner(System.in);

        // Variables
        double sumaNotas = 0;
        int contadorNotas = 0;
        double nota;

        // Bucle do-while para pedir las notas hasta que el usuario ingrese -1
        do {
            System.out.print("Introduce una nota, para finalizar ingresa (o -1): ");
            nota = scanner.nextDouble();

            // Si la nota no es -1, sumar la nota y aumentar el contador
            if (nota != -1) {
                sumaNotas += nota;
                contadorNotas++;
            }

        } while (nota != -1);

        if (contadorNotas > 0) {
            double promedio = sumaNotas / contadorNotas;
            System.out.println("El promedio de las notas ingresadas es: " + promedio);
        } else {
            System.out.println("No se ingresaron notas.");
        }
        scanner.close();
    }



}
