// =====================================================
// EJERCICIO 3: Torre de Control (Archivo independiente)
// =====================================================
class Vuelo {
    String num; int comb;
    Vuelo siguiente;

    public Vuelo(String n,int c){num=n;comb=c;}
}

class Cola {
    Vuelo cabeza;

    void agregar(String n,int c){
        Vuelo v=new Vuelo(n,c);
        if(c<10){ v.siguiente=cabeza; cabeza=v; }
        else{
            if(cabeza==null) cabeza=v;
            else{
                Vuelo t=cabeza;
                while(t.siguiente!=null) t=t.siguiente;
                t.siguiente=v;
            }
        }
    }

    void emergencia(String n){
        Vuelo act=cabeza,ant=null;
        while(act!=null && !act.num.equals(n)){
            ant=act; act=act.siguiente;
        }
        if(act!=null && ant!=null){
            ant.siguiente=act.siguiente;
            act.siguiente=cabeza;
            cabeza=act;
        }
    }
}

public class Ejercicio3 {
    public static void main(String[] args) {
        Cola c=new Cola();
        c.agregar("A1",20);
        c.agregar("B2",5);
        c.emergencia("A1");
    }
}
