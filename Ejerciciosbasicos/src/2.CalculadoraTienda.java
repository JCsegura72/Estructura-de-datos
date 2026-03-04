public class CalculadoraTienda {
//Ejercicio 2 — Calculadora de una tienda
// Una tienda de barrio vende productos al por menor. El cajero necesita calcular:

//Precio unitario de un producto (double)
//Cantidad comprada (int)
//Descuento aplicado en porcentaje (double)
//Total a pagar después del descuento
//Declara las variables, realiza el cálculo y muestra el resultado por consola.


    public static void main(String[] args) {

        // Declaración de variables
        double precioUnitario;
        int cantidadComprada;
        double descuentoPorcentaje;
        double totalSinDescuento;
        double totalConDescuento;

        // Asignación de valores
        precioUnitario = 2500.0;
        cantidadComprada = 4;
        descuentoPorcentaje = 10.0; // 10%

        // Cálculos
        totalSinDescuento = precioUnitario * cantidadComprada;
        totalConDescuento = totalSinDescuento - 
                (totalSinDescuento * descuentoPorcentaje / 100);

        // Resultado
        System.out.println("=== Factura ===");
        System.out.println("Precio unitario: $" + precioUnitario);
        System.out.println("Cantidad: " + cantidadComprada);
        System.out.println("Descuento: " + descuentoPorcentaje + "%");
        System.out.println("Total a pagar: $" + totalConDescuento);
    }
}