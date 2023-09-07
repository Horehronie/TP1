package practica.ej4Colas;

public class Cola {
    private Nodo topeCola = null;
    private Nodo finalCola = null;

    public boolean esVacia(){
        return topeCola == null;
    }

    public void Encolar(Object dato){
        Nodo nodo = new Nodo();
        nodo.setDato(dato);
        nodo.setSiguiente(null);
        if(esVacia()) topeCola = nodo;
        else {
            Nodo aux = topeCola;
            while (aux.getSiguiente() != null) {
                aux = aux.getSiguiente();
            }
            aux.setSiguiente(nodo);
        }
        finalCola = nodo;
    }

    public Nodo Desencolar(){
        Nodo nodo = new Nodo();
        if(esVacia()) nodo = null;
        else{
            nodo = topeCola;
            topeCola = topeCola.getSiguiente();
        }
        return nodo;
    }

    public Nodo recuperarTope(){
        return topeCola;
    }




}
