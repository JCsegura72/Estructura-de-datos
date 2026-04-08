// =====================================================
// EJERCICIO 1: Control de Versiones (Lista Doble)
// =====================================================

class Cambio {
    String texto;
    Cambio sig,ant;

    public Cambio(String t){texto=t;}
}

class Historial {
    Cambio cabeza,cola,actual;

    void agregar(String t){
        Cambio c=new Cambio(t);
        if(cabeza==null) cabeza=cola=actual=c;
        else{
            cola.sig=c;
            c.ant=cola;
            cola=c;
            actual=c;
        }
    }

    void deshacer(){ if(actual.ant!=null) actual=actual.ant; }
    void rehacer(){ if(actual.sig!=null) actual=actual.sig; }
}

public class Ejercicio1 {
    public static void main(String[] args) {
        Historial h=new Historial();
        h.agregar("A"); h.agregar("B");
        h.deshacer(); h.rehacer();
    }
}