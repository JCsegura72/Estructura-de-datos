public class Vehiculo {
//Ejercicio 4 — Placa de un vehículo
// El RUNT almacena datos básicos de vehículos. Modela la información de un carro con:
// Placa (String)
// Año de fabricación (int)
// Cilindraje en cc (int)
// Precio de compra (double)
// Inicial del color (char)
// Si tiene SOAT vigente (boolean)
// Muestra todos los datos en consola.
    public static void main(String[] args) {

        // Declaración
        String placa;
        int anioFabricacion;
        int cilindraje;
        double precioCompra;
        char inicialColor;
        boolean soatVigente;

        // Asignación
        placa = "ABC123";
        anioFabricacion = 2022;
        cilindraje = 1600;
        precioCompra = 45000000;
        inicialColor = 'R'; // Rojo
        soatVigente = true;

        // Impresión
        System.out.println("=== Datos del Vehículo ===");
        System.out.println("Placa: " + placa);
        System.out.println("Año: " + anioFabricacion);
        System.out.println("Cilindraje: " + cilindraje + " cc");
        System.out.println("Precio: $" + precioCompra);
        System.out.println("Color (inicial): " + inicialColor);
        System.out.println("SOAT vigente: " + soatVigente);
    }
}