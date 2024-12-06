import java.util.Scanner;

//Crea un programa con switch que ingrese un numero y que identifique el tipo de cuenta según un su numero ingresado (Ejemplo, 1 para "Cuenta Corriente", 2 para "Cuenta de Ahorro", 3 para "Cuenta Nómina").
public class PuntoDos {
    public static void main(String[] args) {

        // Objeto Scanner para leer la entrada del usuario
        Scanner scanner = new Scanner(System.in);

        // Se solicita al usuario que ingrese un número
        System.out.print("Por favor ingresa el número de la cuenta (1: Cuenta Corriente, 2: Cuenta de Ahorro, 3: Cuenta Nómina): ");
        int numeroCuenta = scanner.nextInt();

        // Se utiliza el switch para identificar el tipo de cuenta

        switch (numeroCuenta) {
            case 1:
                System.out.println("Cuenta Corriente");
                break;
            case 2:
                System.out.println("Cuenta de Ahorro");
                break;
            case 3:
                System.out.println("Cuenta Nómina");
                break;
            default:
                System.out.println("Número de cuenta no válido");
                break;

        }

       scanner.close();
    }

}
