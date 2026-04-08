// =====================================================
// EJERCICIO 3: Pestañas Navegador
// =====================================================
class Pestana {
    String url;
    Pestana sig,ant;

    public Pestana(String u){url=u;}
}

class Nav {
    Pestana cabeza,cola;

    void agregar(String u){
        Pestana p=new Pestana(u);
        if(cabeza==null) cabeza=cola=p;
        else{
            cola.sig=p;
            p.ant=cola;
            cola=p;
        }
    }

    void cerrar(String u){
        Pestana t=cabeza;
        while(t!=null && !t.url.equals(u)) t=t.sig;
        if(t!=null){
            if(t.ant!=null) t.ant.sig=t.sig;
            if(t.sig!=null) t.sig.ant=t.ant;
        }
    }
}

public class Ejercicio3 {
    public static void main(String[] args) {
        Nav n=new Nav();
        n.agregar("google"); n.agregar("youtube");
        n.cerrar("google");
    }
}