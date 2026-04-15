
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
        if (cabeza == null) {
            System.out.println("No hay procesos");
            return;
        }

        Proceso actual = cabeza;
        String orden = "";

        while (cabeza != null) {

            System.out.println("Ejecutando: " + actual.nombre);
            actual.tiempo -= quantum;

            if (actual.tiempo <= 0) {
                System.out.println("Terminó: " + actual.nombre);
                orden += actual.nombre + " -> ";

                if (actual == cabeza && actual.siguiente == cabeza) {
                    cabeza = null;
                    break;
                }

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

        System.out.println("Orden final: " + orden + "FIN");
    }
}