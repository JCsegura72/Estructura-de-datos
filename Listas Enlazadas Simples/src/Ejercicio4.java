// =====================================================
// EJERCICIO 4: Sensores (Archivo independiente)
// =====================================================
class Lectura {
    double temp;
    Lectura siguiente;

    public Lectura(double t){temp=t;}
}

class Historial {
    Lectura cabeza;

    void agregar(double t){
        Lectura l=new Lectura(t);
        l.siguiente=cabeza;
        cabeza=l;
    }

    void max(){
        Lectura t=cabeza,max=cabeza;
        while(t!=null){
            if(t.temp>max.temp) max=t;
            t=t.siguiente;
        }
        System.out.println("Max: "+max.temp);
    }
}

public class Ejercicio4 {
    public static void main(String[] args) {
        Historial h=new Historial();
        h.agregar(30);
        h.agregar(50);
        h.agregar(40);
        h.max();
    }
}
