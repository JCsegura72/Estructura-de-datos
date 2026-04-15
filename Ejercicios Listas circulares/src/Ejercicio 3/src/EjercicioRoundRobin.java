class Proceso {
    String nombre;
    int pid, tiempo, prioridad;
    Proceso siguiente;

    public Proceso(String n, int p, int t, int pr) {
        nombre = n;
        pid = p;
        tiempo = t;
        prioridad = pr;
    }
}

class Planificador {
    Proceso cabeza;

    void agregar(String n, int pid, int t, int pr) {
        Proceso nuevo = new Proceso(n, pid, t, pr);

        if (cabeza == null) {
            cabeza = nuevo;
            cabeza.siguiente = cabeza;
        } else {
            Proceso temp = cabeza;
            while (temp.siguiente != cabeza) {
                temp = temp.siguiente;
            }
            temp.siguiente = nuevo;
            nuevo.siguiente = cabeza;
        }
    }

    void ejecutar(int quantum) {
        if (cabeza == null) return;

        Proceso actual = cabeza;
        String orden = "";

        while (cabeza != null) {

            System.out.println("Ejecutando: " + actual.nombre);

            actual.tiempo -= quantum;

            if (actual.tiempo <= 0) {
                System.out.println(actual.nombre + " terminó");
                orden += actual.nombre + " -> ";

                if (actual == cabeza && actual.siguiente == cabeza) {
                    cabeza = null;
                    break;
                }

                // eliminar nodo
                Proceso temp = cabeza;
                while (temp.siguiente != actual) {
                    temp = temp.siguiente;
                }

                temp.siguiente = actual.siguiente;

                if (actual == cabeza) {
                    cabeza = actual.siguiente;
                }

                actual = actual.siguiente;
            } else {
                System.out.println("Tiempo restante: " + actual.tiempo);
                actual = actual.siguiente;
            }
        }

        System.out.println("Orden final: " + orden);
    }
}

public class EjercicioRoundRobin {
    public static void main(String[] args) {
        Planificador p = new Planificador();

        p.agregar("P1", 1, 10, 1);
        p.agregar("P2", 2, 15, 2);
        p.agregar("P3", 3, 8, 1);

        p.ejecutar(5);
    }
}