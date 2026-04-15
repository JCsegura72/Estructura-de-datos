class Anuncio {
    String titulo, categoria;
    int duracion, veces;
    Anuncio siguiente;

    public Anuncio(String t, int d, String c) {
        titulo = t;
        duracion = d;
        categoria = c;
        veces = 0;
    }
}

class Carrusel {
    Anuncio cabeza;

    void agregar(String t, int d, String c) {
        Anuncio nuevo = new Anuncio(t, d, c);

        if (cabeza == null) {
            cabeza = nuevo;
            cabeza.siguiente = cabeza;
        } else {
            Anuncio temp = cabeza;
            while (temp.siguiente != cabeza) {
                temp = temp.siguiente;
            }
            temp.siguiente = nuevo;
            nuevo.siguiente = cabeza;
        }
    }

    void reproducir(int ciclos) {
        if (cabeza == null) return;

        Anuncio temp = cabeza;
        int tiempoTotal = 0;

        for (int i = 0; i < ciclos; i++) {
            do {
                temp.veces++;
                tiempoTotal += temp.duracion;

                System.out.println("Mostrando: " + temp.titulo);

                temp = temp.siguiente;
            } while (temp != cabeza);
        }

        // Buscar el más repetido
        Anuncio max = cabeza;
        temp = cabeza.siguiente;

        while (temp != cabeza) {
            if (temp.veces > max.veces) {
                max = temp;
            }
            temp = temp.siguiente;
        }

        System.out.println("Más repetido: " + max.titulo);
        System.out.println("Tiempo total: " + tiempoTotal + "s");
    }
}

public class EjercicioCarrusel {
    public static void main(String[] args) {
        Carrusel c = new Carrusel();

        c.agregar("Promo 1", 10, "Oferta");
        c.agregar("Marca X", 15, "Marca");
        c.agregar("Evento Y", 20, "Evento");

        c.reproducir(2);
    }
}