package practica.ej3Pilas;

import practica.ej1y2Listas.Nodo;

public class Pila {
    private Nodo tope = null;

    public Boolean esVacia(){
        return (tope == null);
    }

    public void apilar(Object dato){
        Nodo nodo = new Nodo();
        nodo.setSiguiente(tope);
        nodo.setDato(dato);
        tope = nodo;
    }

    public Nodo desapilar(){
        if (esVacia()) return null;

        Nodo nodo = tope;
        tope = nodo.getSiguiente();
        return nodo;
    }
}
