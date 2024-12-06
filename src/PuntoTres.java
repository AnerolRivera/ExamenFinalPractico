//Escribe un programa que declare tres variables double, les asigne valores e imprima la suma, resta, multiplicación y para la división usar (a+b)/c de las tres. Asegúrate de manejar divisiones por cero correctamente (ayuda usar un try-catch).
public class PuntoTres {
    public static void main(String[] args) {
        // Declarar tres variables de tipo double
        double a = 10.5;
        double b = 5.3;

        double c = 0;

        // Suma
        double suma = a + b;
        System.out.println("Suma: " + suma);

        // Resta
        double resta = a - b;
        System.out.println("Resta: " + resta);

        // Multiplicación
        double multiplicacion = a * b;
        System.out.println("Multiplicación: " + multiplicacion);

        // División
        try {
            if (c == 0) {
                throw new ArithmeticException("No se puede dividir por cero.");
            }
            double division = (a + b) / c;
            System.out.println("División (a + b) / c: " + division);
        } catch (ArithmeticException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
