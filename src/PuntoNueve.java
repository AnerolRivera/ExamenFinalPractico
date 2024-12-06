//Cree un arreglo con los nombre y edades de 3 compañeros y debe recorrerlos con un foreach y separarlos en dos listas dependiendo a donde le pertenesca se nombre o su edad:                           a) datos del arreglo: antony,32,fredy,45,maria,23                                                                                 b)List<String> nombre= new ArrayList<>();                                                                                   c)List<String> edad= new ArrayList<>();
import java.util.ArrayList;
import java.util.List;

public class PuntoNueve {
    public static void main(String[] args) {

            // Arreglo con nombres y edades
            Object[] datos = {"antony", 32, "fredy", 45, "maria", 23};

            // Se crean las listas para almacenar los nombres y las edades
            List<String> nombre = new ArrayList<>();
            List<String> edad = new ArrayList<>();

            // Se recorre el arreglo con un foreach y separar los datos
            for (int i = 0; i < datos.length; i++) {
                if (i % 2 == 0) {
                    // Si el índice es par, es un nombre
                    nombre.add((String) datos[i]);
                } else {
                    // Si el índice es impar, es una edad
                    edad.add(String.valueOf(datos[i])); // Convertir la edad a String
                }
            }

            // Imprimir las listas
            System.out.println("Lista de nombres: " + nombre);
            System.out.println("Lista de edades: " + edad);
        }
    }

