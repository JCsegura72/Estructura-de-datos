// =====================================================
// EJERCICIO 1: Tren de Carga (Archivo independiente)
// =====================================================
class Vagon {
    String contenido, origen, destino;
    double peso;
    Vagon siguiente;

    public Vagon(String c, double p, String o, String d) {
        contenido=c; peso=p; origen=o; destino=d;
    }
}

class Tren {
    Vagon cabeza;

    void agregar(String c,double p,String o,String d){
        Vagon n=new Vagon(c,p,o,d);
        if(cabeza==null) cabeza=n;
        else{
            Vagon t=cabeza;
            while(t.siguiente!=null) t=t.siguiente;
            t.siguiente=n;
        }
    }

    double total(){
        double suma=0;
        Vagon t=cabeza;
        while(t!=null){ suma+=t.peso; t=t.siguiente; }
        return suma;
    }
}

public class Ejercicio1 {
    public static void main(String[] args) {
        Tren t=new Tren();
        t.agregar("Trigo",50,"Bogotá","Medellín");
        t.agregar("Carbón",70,"Cesar","Cartagena");
        System.out.println("Peso total: "+t.total());
    }
}