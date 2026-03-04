import java.util.Scanner;
public class ControlAccesoGimnasio {

//4. Control de Acceso (Gimnasio)
//Un gimnasio tiene una lista de códigos de acceso de los socios que pagaron la mensualidad. La lista está ordenada de menor a mayor.
//El Problema: Cuando un socio digita su código, el sistema debe validar si el código está en la lista de "pagos al día". Si no está, se le niega la entrada.
//Algoritmo a usar: Búsqueda Binaria. Es eficiente para buscar códigos numéricos en una lista que ya está organizada.
   
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int[] sociosActivos = {1001, 1020, 1055, 1100, 1200, 1305, 1500};

        System.out.print("Digite su código de acceso: ");
        int codigoIngresado = scanner.nextInt();

        int izquierda = 0;
        int derecha = sociosActivos.length - 1;
        boolean autorizado = false;

        while (izquierda <= derecha) {

            int medio = (izquierda + derecha) / 2;

            if (sociosActivos[medio] == codigoIngresado) {
                autorizado = true;
                break;
            } 
            else if (sociosActivos[medio] < codigoIngresado) {
                izquierda = medio + 1;
            } 
            else {
                derecha = medio - 1;
            }
        }

        if (autorizado) {
            System.out.println("Acceso permitido. Bienvenido al gimnasio.");
        } else {
            System.out.println("Acceso denegado. Mensualidad pendiente.");
        }

        scanner.close();
    }
}