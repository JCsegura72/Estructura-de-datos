// =====================================================
// EJERCICIO 5: Spotify Lite (Archivo independiente)
// =====================================================
class Cancion {
    int dur;
    Cancion siguiente;

    public Cancion(int d){dur=d;}
}

class Lista {
    Cancion cabeza;

    void agregar(int d){
        Cancion c=new Cancion(d);
        if(cabeza==null) cabeza=c;
        else{
            Cancion t=cabeza;
            while(t.siguiente!=null) t=t.siguiente;
            t.siguiente=c;
        }
    }

    void total(){
        int suma=0;
        Cancion t=cabeza;
        while(t!=null){ suma+=t.dur; t=t.siguiente; }
        System.out.println("Total: "+(suma/60)+":"+(suma%60));
    }
}

public class Ejercicio5 {
    public static void main(String[] args) {
        Lista l=new Lista();
        l.agregar(120);
        l.agregar(180);
        l.total();
    }
}