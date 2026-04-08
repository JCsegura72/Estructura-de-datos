// =====================================================
// EJERCICIO 2: Carrusel de Imágenes
// =====================================================
class Foto {
    String nombre;
    Foto sig,ant;

    public Foto(String n){nombre=n;}
}

class Galeria {
    Foto cabeza,cola;

    void agregar(String n){
        Foto f=new Foto(n);
        if(cabeza==null) cabeza=cola=f;
        else{
            cola.sig=f;
            f.ant=cola;
            cola=f;
        }
    }

    void recorrer(){
        Foto t=cabeza;
        while(t!=null){ System.out.println(t.nombre); t=t.sig; }
        t=cola;
        while(t!=null){ System.out.println(t.nombre); t=t.ant; }
    }
}

public class Ejercicio2 {
    public static void main(String[] args) {
        Galeria g=new Galeria();
        g.agregar("img1"); g.agregar("img2");
        g.recorrer();
    }
}