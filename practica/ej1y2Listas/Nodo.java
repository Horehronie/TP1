package practica.ej1y2Listas;

public class Nodo {
    private Object dato;
    private Nodo siguiente = null;

    public void setDato(Object dato){
        this.dato = dato;
    }

    public Object getDato(){
        return dato;
    }

    public Nodo getSiguiente(){
        return siguiente;
    }

    public void setSiguiente(Nodo siguiente){
        this.siguiente = siguiente;
    }



}
