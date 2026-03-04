public class TurnoBanco {

// Ejercicio 6 — Turno en un banco
// Un cajero trabaja con el número del turno actual.
// Se crea una variable turnoActual y se asigna a turnoEnPantalla.
// Demuestra que cambiar turnoEnPantalla no afecta a turnoActual
// (comportamiento por valor).

    public static void main(String[] args) {

        int turnoActual = 25;
        int turnoEnPantalla = turnoActual;

        turnoEnPantalla = 30;

        System.out.println("Turno actual: " + turnoActual);
        System.out.println("Turno en pantalla: " + turnoEnPantalla);

        
    }
}
