// =====================================================
// EJERCICIO 2: Inventario (Archivo independiente)
// =====================================================
class Producto {
    String nombre; int cant,dias;
    Producto siguiente;

    public Producto(String n,int c,int d){nombre=n;cant=c;dias=d;}
}

class Inventario {
    Producto cabeza;

    void agregar(String n,int c,int d){
        Producto p=new Producto(n,c,d);
        if(d<3){ p.siguiente=cabeza; cabeza=p; }
        else{
            if(cabeza==null) cabeza=p;
            else{
                Producto t=cabeza;
                while(t.siguiente!=null) t=t.siguiente;
                t.siguiente=p;
            }
        }
    }

    void mostrar(){
        Producto t=cabeza;
        while(t!=null){
            if(t.dias<5) System.out.println(t.nombre);
            t=t.siguiente;
        }
    }
}

public class Ejercicio2 {
    public static void main(String[] args) {
        Inventario i=new Inventario();
        i.agregar("Leche",10,2);
        i.agregar("Queso",5,6);
        i.mostrar();
    }
}