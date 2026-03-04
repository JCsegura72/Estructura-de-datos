public class Inventario {

// Ejercicio 7 — Inventario compartido
// Un almacén tiene un arreglo con el stock de 5 productos.
// El sistema de ventas y el sistema de reportes apuntan al mismo arreglo.
// Simula una venta desde stockReportes y demuestra
// que stockAlmacen también cambia.

    public static void main(String[] args) {

        int[] stockAlmacen = {10, 20, 15, 8, 12};
        int[] stockReportes = stockAlmacen;

        stockReportes[2] -= 5;

        System.out.println("Stock almacen:");
        for (int s : stockAlmacen) {
            System.out.print(s + " ");
        }

       
    }
}