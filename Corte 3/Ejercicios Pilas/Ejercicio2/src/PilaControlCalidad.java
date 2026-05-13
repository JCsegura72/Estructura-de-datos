public class PilaControlCalidad {

    private Pieza tope;
    private int tamanio;

    public PilaControlCalidad() {

        this.tope = null;
        this.tamanio = 0;
    }

    public boolean estaVacia() {
        return tope == null;
    }

    public int getTamanio() {
        return tamanio;
    }

    // PUSH
    public void push(Pieza nueva) {

        nueva.siguiente = tope;
        tope = nueva;

        tamanio++;
    }

    // POP
    public Pieza pop() {

        if (estaVacia()) {
            return null;
        }

        Pieza aux = tope;

        tope = tope.siguiente;

        tamanio--;

        aux.siguiente = null;

        return aux;
    }

    // PEEK
    public Pieza peek() {
        return tope;
    }

    // IMPRIMIR
    public void imprimir() {

        if (estaVacia()) {

            System.out.println("Pila vacía.");
            return;
        }

        Pieza actual = tope;

        System.out.println("=== CONTROL DE CALIDAD ===");

        while (actual != null) {

            if (actual == tope) {
                System.out.print("TOPE -> ");
            } else {
                System.out.print("         ");
            }

            System.out.println(actual.toString());

            actual = actual.siguiente;
        }

        System.out.println("==========================");
    }

    // RETO
    public void limpiarHastaDefecto() {

        while (!estaVacia()) {

            Pieza actual = pop();

            if (actual.esDefectuosa) {

                System.out.println(
                        "Pieza defectuosa encontrada: "
                                + actual.nombrePieza);

                break;

            } else {

                System.out.println(
                        "Retirando pieza buena: "
                                + actual.nombrePieza);
            }
        }
    }
}