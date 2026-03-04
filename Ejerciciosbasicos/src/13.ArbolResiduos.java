class NodoResiduo {
    String nombre;
    NodoResiduo izquierdo;
    NodoResiduo derecho;

    public NodoResiduo(String nombre) {
        this.nombre = nombre;
    }
}

public class ArbolResiduos {

// Ejercicio 13 — Clasificación de residuos (no lineal)
// Construir el árbol:
//         Residuos
//        /        \
//   Orgánicos   Inorgánicos
//    /    \       /      \
// Comida Jardín Plástico Papel
// Imprimir la raíz y descendientes indicando nivel.

    public static void imprimir(NodoResiduo nodo, int nivel) {
        if (nodo != null) {
            System.out.println("Nivel " + nivel + ": " + nodo.nombre);
            imprimir(nodo.izquierdo, nivel + 1);
            imprimir(nodo.derecho, nivel + 1);
        }
    }

    public static void main(String[] args) {

        NodoResiduo raiz = new NodoResiduo("Residuos");

        raiz.izquierdo = new NodoResiduo("Orgánicos");
        raiz.derecho = new NodoResiduo("Inorgánicos");

        raiz.izquierdo.izquierdo = new NodoResiduo("Comida");
        raiz.izquierdo.derecho = new NodoResiduo("Jardín");

        raiz.derecho.izquierdo = new NodoResiduo("Plástico");
        raiz.derecho.derecho = new NodoResiduo("Papel");

        imprimir(raiz, 0);
    }
}