public class HistorialVentas {

// Ejercicio 12 — Historial de ventas (lineal)
// Guardar 7 ventas del día.
// Calcular la venta más alta, más baja y el total.

    public static void main(String[] args) {

        double[] ventas = {120.5, 340.0, 89.9, 560.0, 230.4, 150.0, 410.3};

        double mayor = ventas[0];
        double menor = ventas[0];
        double total = 0;

        for (int i = 0; i < ventas.length; i++) {

            if (ventas[i] > mayor) {
                mayor = ventas[i];
            }

            if (ventas[i] < menor) {
                menor = ventas[i];
            }

            total += ventas[i];
        }

        System.out.println("Venta mayor: " + mayor);
        System.out.println("Venta menor: " + menor);
        System.out.println("Total del día: " + total);
    }
}