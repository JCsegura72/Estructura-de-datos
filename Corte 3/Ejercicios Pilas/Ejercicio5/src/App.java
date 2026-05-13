import java.util.Scanner;

public class App {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        PilaRescate pila =
                new PilaRescate();

        int opcion;

        do {

            System.out.println("\n=== RUTA DE RESCATE ===");
            System.out.println("1. Agregar estación");
            System.out.println("2. Mostrar pila");
            System.out.println("3. Retroceder a superficie");
            System.out.println("4. Salir");
            System.out.print("Opción: ");

            opcion = sc.nextInt();
            sc.nextLine();

            switch (opcion) {

                case 1:

                    System.out.print("Nombre punto: ");
                    String nombre = sc.nextLine();

                    System.out.print("Profundidad: ");
                    int profundidad = sc.nextInt();

                    System.out.print("Nivel oxígeno: ");
                    double oxigeno = sc.nextDouble();

                    pila.push(
                            new Estacion(
                                    nombre,
                                    profundidad,
                                    oxigeno));

                    System.out.println("Estación agregada.");
                    break;

                case 2:

                    pila.imprimir();
                    break;

                case 3:

                    pila.retrocederASuperficie();
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