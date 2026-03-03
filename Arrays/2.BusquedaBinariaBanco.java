public class BusquedaBinariaBanco {
//2. Buscador de Cédulas (Base de Datos Bancaria)
//Un banco tiene una lista de 1.000 clientes organizados de forma estricta y ascendente por su número de cédula o ID.
//El Problema: Un cliente llega a la ventanilla y da su número. El sistema debe encontrar sus datos de la manera más rápida posible (en pocos pasos).
//Algoritmo a usar: Búsqueda Binaria. Como los datos ya están ordenados, este algoritmo permitirá encontrar al cliente dividiendo la lista a la mitad en cada paso.
  
    public static void main(String[] args) {

        int[] cedulas = {1010, 2050, 3090, 4120, 5500, 6780, 7890, 8900, 9500};
        int cedulaBuscada = 6780;

        int izquierda = 0;
        int derecha = cedulas.length - 1;
        int posicion = -1;

        while (izquierda <= derecha) {

            int medio = (izquierda + derecha) / 2;

            if (cedulas[medio] == cedulaBuscada) {
                posicion = medio;
                break;
            } 
            else if (cedulas[medio] < cedulaBuscada) {
                izquierda = medio + 1;
            } 
            else {
                derecha = medio - 1;
            }
        }

        if (posicion != -1) {
            System.out.println("Cliente encontrado en la posición: " + posicion);
        } else {
            System.out.println("Cliente no encontrado.");
        }
    }
}