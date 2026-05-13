import java.util.Scanner;

public class App {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        PilaControlCalidad pila =
                new PilaControlCalidad();

        int opcion;

        do {

            System.out.println("\n=== CONTROL DE CALIDAD ===");
            System.out.println("1. Agregar pieza");
            System.out.println("2. Mostrar pila");
            System.out.println("3. Limpiar hasta defecto");
            System.out.println("4. Salir");
            System.out.print("Opción: ");

            opcion = sc.nextInt();
            sc.nextLine();

            switch (opcion) {

                case 1:

                    System.out.print("Nombre pieza: ");
                    String nombre = sc.nextLine();

                    System.out.print("Número serie: ");
                    String serie = sc.nextLine();

                    System.out.print("¿Es defectuosa? (true/false): ");
                    boolean defecto = sc.nextBoolean();

                    pila.push(
                            new Pieza(
                                    nombre,
                                    serie,
                                    defecto));

                    System.out.println("Pieza agregada.");
                    break;

                case 2:

                    pila.imprimir();
                    break;

                case 3:

                    pila.limpiarHastaDefecto();
                    break;

                case 4:

                    System.out.println("Programa finalizado.");
                    break;

                default:

                    System.out.println("Opción inválida.");
            }

        } while (opcion != 4);

        sc.close();
    }
}