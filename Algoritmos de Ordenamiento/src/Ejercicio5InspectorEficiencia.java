import java.util.Scanner;

/*
Algoritmos obligatorios:
Selección vs Inserción
Contexto: Un analista de sistemas quiere saber cuál algoritmo es más "pesado" en términos de operaciones paraun caso específico.
Detalle del ejercicio: El usuario debe ingresar 6 números enteros desordenados. El programa aplicará AMBOSmétodos al mismo conjunto de datos (puedes usar una copia del arreglo original).
Lógica de Conteo:
i.En Selección : Cuenta cada vez que ocurre un swap (intercambio físico de posiciones).
ii.En Inserción : Cuenta cada vez que un elemento se "mueve" hacia la izquierda dentro del bucle interno.
Resultado esperado: El programa debe imprimir cuántos intercambios hizo Selección y cuántos movimientoshizo Inserción. El estudiante debe concluir cuál fue más eficiente para esos datos ingresados por el teclado.
*/

public class Ejercicio5InspectorEficiencia {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int[] numeros = new int[6];

        for (int i = 0; i < 6; i++) {

            System.out.print("Ingrese el número " + (i + 1) + ": ");
            numeros[i] = sc.nextInt();

        }

        int[] copia = numeros.clone();

        int swaps = 0;

        // Selection Sort
        for (int i = 0; i < numeros.length - 1; i++) {

            int min = i;

            for (int j = i + 1; j < numeros.length; j++) {

                if (numeros[j] < numeros[min]) {
                    min = j;
                }

            }

            int temp = numeros[i];
            numeros[i] = numeros[min];
            numeros[min] = temp;

            swaps++;
        }

        int movimientos = 0;

        // Insertion Sort
        for (int i = 1; i < copia.length; i++) {

            int clave = copia[i];
            int j = i - 1;

            while (j >= 0 && copia[j] > clave) {

                copia[j + 1] = copia[j];
                j--;
                movimientos++;

            }

            copia[j + 1] = clave;
        }

        System.out.println("\nIntercambios en Selection Sort: " + swaps);
        System.out.println("Movimientos en Insertion Sort: " + movimientos);

        sc.close();
    }
}