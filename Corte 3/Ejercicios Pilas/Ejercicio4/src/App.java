import java.util.Scanner;

public class App {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        PilaMedicamentos pila =
                new PilaMedicamentos();

        int opcion;

        do {

            System.out.println("\n=== FARMACIA ===");
            System.out.println("1. Agregar medicamento");
            System.out.println("2. Mostrar pila");
            System.out.println("3. Validar despacho");
            System.out.println("4. Salir");
            System.out.print("Opción: ");

            opcion = sc.nextInt();
            sc.nextLine();

            switch (opcion) {

                case 1:

                    System.out.print("Nombre: ");
                    String nombre = sc.nextLine();

                    System.out.print("Lote: ");
                    String lote = sc.nextLine();

                    System.out.print("Días para vencer: ");
                    int dias = sc.nextInt();

                    pila.push(
                            new Medicamento(
                                    nombre,
                                    lote,
                                    dias));

                    System.out.println("Medicamento agregado.");
                    break;

                case 2:

                    pila.imprimir();
                    break;

                case 3:

                    pila.validarDespacho();
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