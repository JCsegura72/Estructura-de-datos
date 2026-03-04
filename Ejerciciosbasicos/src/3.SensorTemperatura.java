public class SensorTemperatura {
//Ejercicio 3 — Sensor de temperatura
//Un sensor industrial registra temperaturas. El sistema recibe:

//Temperatura actual en Celsius (double)
//Nombre del sensor (String)
//Número de lectura (int)
//Si la temperatura supera el límite de 80°C, una variable boolean llamada enAlarma debe ser true.
//Imprime el estado del sensor con todos sus datos.
    public static void main(String[] args) {

        // Declaración
        double temperaturaActual;
        String nombreSensor;
        int numeroLectura;
        boolean enAlarma;

        // Asignación
        temperaturaActual = 85.5;
        nombreSensor = "Sensor Industrial A1";
        numeroLectura = 150;

        // Condición
        enAlarma = temperaturaActual > 80;

        // Impresión
        System.out.println("=== Estado del Sensor ===");
        System.out.println("Sensor: " + nombreSensor);
        System.out.println("Lectura #: " + numeroLectura);
        System.out.println("Temperatura: " + temperaturaActual + " °C");
        System.out.println("En alarma: " + enAlarma);
    }
}