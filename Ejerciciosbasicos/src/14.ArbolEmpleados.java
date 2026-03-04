import java.util.LinkedList;
import java.util.Queue;

class NodoEmpleado {
    String cargo;
    NodoEmpleado izquierdo;
    NodoEmpleado derecho;

    public NodoEmpleado(String cargo) {
        this.cargo = cargo;
    }
}

public class ArbolEmpleados {

// Ejercicio 14 — Árbol de empleados (no lineal)
// Imprimir el árbol nivel por nivel.

    public static void main(String[] args) {

        NodoEmpleado gerente = new NodoEmpleado("Gerente");

        gerente.izquierdo = new NodoEmpleado("Supervisor1");
        gerente.derecho = new NodoEmpleado("Supervisor2");

        gerente.izquierdo.izquierdo = new NodoEmpleado("Analista1");
        gerente.izquierdo.derecho = new NodoEmpleado("Analista2");

        // Recorrido por niveles (BFS)
        Queue<NodoEmpleado> cola = new LinkedList<>();
        cola.add(gerente);

        while (!cola.isEmpty()) {
            NodoEmpleado actual = cola.poll();
            System.out.println(actual.cargo);

            if (actual.izquierdo != null)
                cola.add(actual.izquierdo);

            if (actual.derecho != null)
                cola.add(actual.derecho);
        }
    }
}