public class PuntoUno {
    public static void main(String[] args) {
        //Variables
        String miNombre = "antony";
        int miEdad = 15;
        String profesion = "ingeniero de sistemas";

        // Se converte el nombre a mayúsculas
                miNombre = miNombre.toUpperCase();
        // Concatenar y mostrar el resultado
        System.out.println(miNombre + " tiene " + miEdad + " años y su profesion es " + profesion);
    }
}