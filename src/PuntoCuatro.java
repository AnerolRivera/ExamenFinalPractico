//Crea un metodo que use un bucle for con los numero de 1 a 100 para solo sumar los numero pares . (Ayuda += 2).
public class PuntoCuatro {
    public static void main(String[] args) {

        // Se klama el método para sumar los números pares del 1 al 100
        int sumaPares = sumarPares(1, 100);
        System.out.println("La suma de los números pares del 1 al 100 es: " + sumaPares);
    }

    public static int sumarPares(int inicio, int fin) {
        int suma = 0;

        // Bucle for para recorrer del 1 al 100 y solo sumar los números pares
        for (int i = inicio; i <= fin; i += 2) {
            suma += i;
        }

        return suma;
    }
}
