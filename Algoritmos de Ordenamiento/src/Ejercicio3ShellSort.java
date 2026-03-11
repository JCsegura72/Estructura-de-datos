import java.util.Scanner;

/*
Algoritmo obligatorio: Ordenamiento Shell (Shell Sort)
Contexto: Una empresa de logística maneja paquetes con diferentes pesos y necesita ordenarlos de forma máseficiente que el método de burbuja o inserción simple.
Detalle del ejercicio: Solicita al usuario el peso de N paquetes (se recomienda probar con al menos 10 paranotar el efecto).
Lógica de Shell: Implementa el algoritmo usando el salto (gap) inicial de $N/2$. El estudiante debe explicar encomentarios por qué este método es generalmente más rápido que la inserción simple al trabajar con elementosque están muy lejos de su posición final.
Resultado esperado: Mostrar el arreglo original y el arreglo final ordenado después de aplicar todas las fases dereducción de saltos.
*/

public class Ejercicio3ShellSort {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Ingrese la cantidad de paquetes: ");
        int n = sc.nextInt();

        double[] pesos = new double[n];

        for (int i = 0; i < n; i++) {

            System.out.print("Peso del paquete " + (i + 1) + ": ");
            pesos[i] = sc.nextDouble();

        }

        System.out.println("\nArreglo original:");

        for (double p : pesos) {
            System.out.print(p + " ");
        }

        for (int gap = n / 2; gap > 0; gap /= 2) {

            for (int i = gap; i < n; i++) {

                double temp = pesos[i];
                int j;

                for (j = i; j >= gap && pesos[j - gap] > temp; j -= gap) {

                    pesos[j] = pesos[j - gap];

                }

                pesos[j] = temp;

            }
        }

        System.out.println("\n\nArreglo ordenado:");

        for (double p : pesos) {
            System.out.print(p + " ");
        }

        sc.close();
    }
}