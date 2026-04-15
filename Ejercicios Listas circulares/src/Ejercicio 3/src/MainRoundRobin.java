import java.util.Scanner;

public class MainRoundRobin {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Planificador p = new Planificador();
        int op;

        do {
            System.out.println("\n--- ROUND ROBIN ---");
            System.out.println("1. Agregar proceso");
            System.out.println("2. Ejecutar");
            System.out.println("0. Salir");
            op = sc.nextInt();

            switch (op) {
                case 1:
                    System.out.print("Nombre: ");
                    String n = sc.next();
                    System.out.print("PID: ");
                    int pid = sc.nextInt();
                    System.out.print("Tiempo: ");
                    int t = sc.nextInt();
                    System.out.print("Prioridad: ");
                    int pr = sc.nextInt();
                    p.agregar(n, pid, t, pr);
                    break;

                case 2:
                    System.out.print("Quantum: ");
                    int q = sc.nextInt();
                    p.ejecutar(q);
                    break;
            }

        } while (op != 0);
    }
}