public class PilaMedicamentos {

    private Medicamento tope;
    private int tamanio;

    public PilaMedicamentos() {

        this.tope = null;
        this.tamanio = 0;
    }

    public boolean estaVacia() {
        return tope == null;
    }

    public int getTamanio() {
        return tamanio;
    }

    public void push(Medicamento nuevo) {

        nuevo.siguiente = tope;
        tope = nuevo;

        tamanio++;
    }

    public Medicamento pop() {

        if (estaVacia()) {
            return null;
        }

        Medicamento aux = tope;

        tope = tope.siguiente;

        tamanio--;

        aux.siguiente = null;

        return aux;
    }

    public Medicamento peek() {
        return tope;
    }

    public void imprimir() {

        if (estaVacia()) {

            System.out.println("Pila vacía.");
            return;
        }

        Medicamento actual = tope;

        System.out.println("=== DISPENSADOR DE MEDICAMENTOS ===");

        while (actual != null) {

            if (actual == tope) {
                System.out.print("TOPE -> ");
            } else {
                System.out.print("         ");
            }

            System.out.println(actual.toString());

            actual = actual.siguiente;
        }

        System.out.println("====================================");
    }

    public void validarDespacho() {

        while (!estaVacia()) {

            Medicamento actual = peek();

            if (actual.diasParaVencer < 10) {

                System.out.println(
                        "Retirando medicamento próximo a vencer: "
                                + actual.nombre);

                pop();

            } else {

                System.out.println(
                        "Medicamento seguro para despacho: "
                                + actual.nombre);

                break;
            }
        }

        if (estaVacia()) {

            System.out.println(
                    "No quedan medicamentos seguros.");
        }
    }
}
