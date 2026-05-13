import java.util.Scanner;

public class App {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        PilaCamiones pila =
                new PilaCamiones();

        int opcion;

        do {

            System.out.println("\n=== LOGÍSTICA DE CAMIONES ===");
            System.out.println("1. Agregar camión");
            System.out.println("2. Mostrar pila");
            System.out.println("3. Calcular carga total");
            System.out.println("4. Salir");
            System.out.print("Opción: ");

            opcion = sc.nextInt();
            sc.nextLine();

            switch (opcion) {

                case 1:

                    System.out.print("Placa: ");
                    String placa = sc.nextLine();

                    System.out.print("Conductor: ");
                    String conductor = sc.nextLine();

                    System.out.print("Carga toneladas: ");
                    double carga = sc.nextDouble();

                    pila.push(
                            new Camion(
                                    placa,
                                    conductor,
                                    carga));

                    System.out.println("Camión agregado.");
                    break;

                case 2:

                    pila.imprimir();
                    break;

                case 3:

                    double total =
                            pila.calcularCargaTotal();

                    System.out.println(
                            "Carga total: "
                                    + total
                                    + " toneladas");

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