public class HistorialMensajes {

// Ejercicio 8 — Historial de mensajes
// Se crean dos variables String:
// ultimoMensaje = "Hola"
// copiaTexto = ultimoMensaje
// Luego copiaTexto cambia a "¿Cómo estás?"
// Demuestra que ultimoMensaje no cambia.

    public static void main(String[] args) {

        String ultimoMensaje = "Hola";
        String copiaTexto = ultimoMensaje;

        copiaTexto = "¿Cómo estás?";

        System.out.println("Último mensaje: " + ultimoMensaje);
        System.out.println("Copia texto: " + copiaTexto);

       
    }
}