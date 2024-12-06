//Separa este string "antonylfredyljulianlmarcos", guardalo en una lista y luego imprimir la lista.

import java.util.ArrayList;
import java.util.List;

public class PuntoOcho {

    public static void main(String[] args) {
        // Cadena string original
        String texto = "antonylfredyljulianlmarcos";

        // Se crea una lista para almacenar las partes
        List<String> lista = new ArrayList<>();

        // Se separar manualmente el string
        lista.add("antony");
        lista.add("fredy");
        lista.add("julian");
        lista.add("marcos");


        // Se Imprime la lista
        System.out.println("Lista separada: " + lista);
    }
}
