public class NotasCurso {

// Ejercicio 9 — Notas de un curso
// El profesor tiene un arreglo con 4 notas.
// El coordinador recibe referencia al mismo arreglo.
// Corrige la nota índice 1 de 2.5 a 3.0
// y demuestra que el cambio afecta al profesor.

    public static void main(String[] args) {

        double[] notasProfesor = {3.5, 2.5, 4.0, 3.8};
        double[] notasCoordinador = notasProfesor;

        notasCoordinador[1] = 3.0;

        System.out.println("Notas profesor:");
        for (double n : notasProfesor) {
            System.out.print(n + " ");
        }

    }
}
