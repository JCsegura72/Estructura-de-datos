// =====================================================
// EJERCICIO 4: Pacientes
// =====================================================
class Paciente {
    int edad;
    Paciente sig,ant;

    public Paciente(int e){edad=e;}
}

class ListaP {
    Paciente cabeza,cola;

    void agregar(int e){
        Paciente p=new Paciente(e);
        if(cabeza==null) cabeza=cola=p;
        else{
            cola.sig=p;
            p.ant=cola;
            cola=p;
        }
    }

    void mayor(){
        Paciente t=cola,max=cola;
        while(t!=null){
            if(t.edad>max.edad) max=t;
            t=t.ant;
        }
        System.out.println(max.edad);
    }
}

public class Ejercicio4 {
    public static void main(String[] args) {
        ListaP l=new ListaP();
        l.agregar(20); l.agregar(50);
        l.mayor();
    }
}