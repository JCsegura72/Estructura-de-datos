import java.util.Scanner;

public class MainCarrusel {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Carrusel c = new Carrusel();
        int op;

        do {
            System.out.println("\n--- CARRUSEL ---");
            System.out.println("1. Agregar anuncio");
            System.out.println("2. Reproducir");
            System.out.println("0. Salir");
            op = sc.nextInt();
            sc.nextLine();

            switch (op) {
                case 1:
                    System.out.print("Titulo: ");
                    String t = sc.nextLine();
                    System.out.print("Duracion: ");
                    int d = sc.nextInt();
                    sc.nextLine();
                    System.out.print("Categoria: ");
                    String cat = sc.nextLine();
                    c.agregar(t, d, cat);
                    break;

                case 2:
                    System.out.print("Ciclos: ");
                    int ciclos = sc.nextInt();
                    c.reproducir(ciclos);
                    break;
            }

        } while (op != 0);
    }
}