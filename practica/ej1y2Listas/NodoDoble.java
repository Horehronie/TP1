package practica.ej1y2Listas;

public class NodoDoble {
    private Object dato;
    private NodoDoble siguiente = null;
    private NodoDoble anterior = null;

    public void setDato(Object dato){
        this.dato = dato;
    }

    public Object getDato(){
        return dato;
    }

    public NodoDoble getSiguiente(){
        return siguiente;
    }

    public NodoDoble getAnterior(){
        return anterior;
    }

    public void setSiguiente(NodoDoble siguiente){
        this.siguiente = siguiente;
    }

    public void setAnterior(NodoDoble anterior) {
        this.anterior = anterior;
    }
}
