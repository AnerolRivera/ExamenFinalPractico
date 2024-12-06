import java.util.Scanner;

public class PuntoCinco {
    public static void main(String[] args) {

        // Se Crea un objeto Scanner para leer la entrada del usuario
        Scanner scanner = new Scanner(System.in);

        // Se le Solicita al usuario el total de su compra
        System.out.print("Introduce el total de tu compra: ");
        double totalCompra = scanner.nextDouble();


        // Variables
        double descuento = 0;
        double precioFinal = totalCompra;

        // Se aplican los descuentos según el total de la compra
        if (totalCompra >= 1000) {
            descuento = 0.20; // 20% de descuento
        } else if (totalCompra >= 500) {
            descuento = 0.10; // 10% de descuento
        } else {
            descuento = 0; // No hay descuento
        }

        // Se calcula el precio final después del descuento
        precioFinal = totalCompra - (totalCompra * descuento);

        // Mostrar los resultados
        System.out.println("Total original: " + totalCompra);
        System.out.println("Descuento aplicado: " + (descuento * 100) + "%");
        System.out.println("Precio final después del descuento: " + precioFinal);

        // Cerrar el objeto scanner
        scanner.close();
    }
}
