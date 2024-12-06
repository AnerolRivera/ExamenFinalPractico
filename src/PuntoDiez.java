//Crea una clase Persona con los atributos nombre, edad y altura. Implementa un constructor y un método que imprima los datos de la persona. Crea una instancias de la clase y muestra sus datos.

public class PuntoDiez {

       // Clase Persona
        static class Persona {
        // Atributos
        String nombre;
        int edad;
        double altura;

        // Constructor para inicializar los atributos
        public Persona(String nombre, int edad, double altura) {
            this.nombre = nombre;
            this.edad = edad;
            this.altura = altura;
        }

        // Método para imprimir los datos de la persona
        public void imprimirDatos() {
            System.out.println("Nombre: " + nombre);
            System.out.println("Edad: " + edad);
            System.out.println("Altura: " + altura + " metros");
        }
    }

    public static void main(String[] args) {
        // Crear instancias de la clase Persona
        Persona persona1 = new Persona("Antony", 32, 1.75);
        Persona persona2 = new Persona("Fredy", 45, 1.80);
        Persona persona3 = new Persona("María", 23, 1.65);

        // Llamar al método imprimirDatos para mostrar los datos de cada persona
        persona1.imprimirDatos();
        System.out.println();
        persona2.imprimirDatos();
        System.out.println();
        persona3.imprimirDatos();
    }
}


