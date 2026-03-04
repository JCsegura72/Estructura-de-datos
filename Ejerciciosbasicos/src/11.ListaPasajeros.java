public class ListaPasajeros {

// Ejercicio 11 — Lista de pasajeros (lineal)
// Una aerolínea registra los nombres de los pasajeros en un arreglo
// de 6 posiciones.
// Llenar el arreglo, recorrerlo con for e imprimir asiento y nombre.
// Mostrar cuántos asientos están ocupados.

    public static void main(String[] args) {

        String[] pasajeros = new String[6];

        pasajeros[0] = "Carlos";
        pasajeros[1] = "Ana";
        pasajeros[2] = "Luisa";
        pasajeros[3] = "Pedro";
        pasajeros[4] = "María";
        pasajeros[5] = "Jorge";

        int ocupados = 0;

        for (int i = 0; i < pasajeros.length; i++) {
            System.out.println("Asiento " + (i + 1) + ": " + pasajeros[i]);
            if (pasajeros[i] != null) {
                ocupados++;
            }
        }

        System.out.println("Total asientos ocupados: " + ocupados);
    }
}