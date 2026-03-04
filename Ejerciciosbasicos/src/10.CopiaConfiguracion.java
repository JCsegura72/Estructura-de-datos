public class CopiaConfiguracion {

// Ejercicio 10 — Copiando configuración
// int[] configuracion = {1920, 1080, 60}
// Crear una copia real (no referencia).
// Modificar la copia y demostrar que el original no cambia.

    public static void main(String[] args) {

        int[] configuracion = {1920, 1080, 60};
        int[] copiaConfiguracion = new int[configuracion.length];

        for (int i = 0; i < configuracion.length; i++) {
            copiaConfiguracion[i] = configuracion[i];
        }

        copiaConfiguracion[2] = 144;

        System.out.println("Original:");
        for (int v : configuracion) {
            System.out.print(v + " ");
        }

        System.out.println("\nCopia:");
        for (int v : copiaConfiguracion) {
            System.out.print(v + " ");
        }

      
    }
}