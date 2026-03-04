public class TemperaturasSemanales {

// Ejercicio 15 — Registro de temperaturas semanales (lineal)
// Guardar 7 temperaturas.
// Calcular promedio.
// Indicar qué días estuvieron por encima del promedio.

    public static void main(String[] args) {

        double[] temperaturas = {30, 32, 29, 35, 31, 28, 34};

        double suma = 0;

        for (int i = 0; i < temperaturas.length; i++) {
            suma += temperaturas[i];
        }

        double promedio = suma / temperaturas.length;

        System.out.println("Promedio semanal: " + promedio);
        System.out.println("Días por encima del promedio:");

        for (int i = 0; i < temperaturas.length; i++) {
            if (temperaturas[i] > promedio) {
                System.out.println("Día " + (i + 1) + ": " + temperaturas[i]);
            }
        }
    }
}