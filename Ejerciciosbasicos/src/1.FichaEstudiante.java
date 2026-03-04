public class FichaEstudiante {
//Ejercicio 1 — Ficha de un estudiante
// Un sistema universitario necesita registrar la información básica de un estudiante: nombre completo, código (número entero), semestre actual, promedio acumulado y si está matriculado o no.
// Declara las variables con los tipos de datos apropiados.
// Asigna valores de ejemplo.

    public static void main(String[] args) {

        // Declaración de variables
        String nombreCompleto;
        int codigo;
        int semestreActual;
        double promedioAcumulado;
        boolean matriculado;

        // Asignación de valores
        nombreCompleto = "Ana Torres";
        codigo = 20241001;
        semestreActual = 3;
        promedioAcumulado = 3.85;
        matriculado = true;

        // Impresión del reporte
        System.out.println("=== Ficha del Estudiante ===");
        System.out.println("Nombre: " + nombreCompleto);
        System.out.println("Código: " + codigo);
        System.out.println("Semestre: " + semestreActual);
        System.out.println("Promedio: " + promedioAcumulado);
        System.out.println("Matriculado: " + matriculado);
    }
}