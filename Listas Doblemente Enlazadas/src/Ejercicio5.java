// =====================================================
// EJERCICIO 5: Spotify Premium
// =====================================================
class Song {
    String nombre;
    Song sig,ant;

    public Song(String n){nombre=n;}
}

class Player {
    Song cabeza,cola,actual;

    void agregar(String n){
        Song s=new Song(n);
        if(cabeza==null) cabeza=cola=actual=s;
        else{
            cola.sig=s;
            s.ant=cola;
            cola=s;
        }
    }

    void atras(){
        if(actual.ant!=null) actual=actual.ant;
    }

    void adelante(){
        if(actual.sig!=null) actual=actual.sig;
    }
}

public class Ejercicio5 {
    public static void main(String[] args) {
        Player p=new Player();
        p.agregar("A"); p.agregar("B");
        p.atras(); p.adelante();
    }
}