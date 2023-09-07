package practica.ej1y2Listas;


/*
* En esta implementación de lista enlazada simple se hace uso
* de dos objetos, el nodo y la lista en si
*/
public class ListaSimple {
    private Nodo inicio = null;

    public void agregarNodo(Nodo nodo){
        if(inicio == null){
            inicio = nodo;
        }
        else{
            Nodo n = inicio;
            while(n.getSiguiente() != null){
                n = n.getSiguiente();
            }
            n.setSiguiente(nodo);
        }
    }

    public void agregarDato(Object dato){
        Nodo nodo = new Nodo();
        nodo.setDato(dato);
        agregarNodo(nodo);
    }

    public Boolean es_vacia(){
        return inicio == null;
    }

    public int longitud(){
        Nodo actual = inicio;
        int l = 0;
        if(!es_vacia()) {
            while (actual != null) {
                actual = actual.getSiguiente();
                l++;
            }
        }
        return l;
    }

    public void eliminarPosicion(int pos){
        if(!es_vacia()) {
            if (pos == 1) inicio = inicio.getSiguiente();
            else {
                int posAct = 1;
                Nodo nodoAnt = inicio;
                Nodo nodoAct = inicio;
                boolean finale = false;
                while (pos != posAct && !finale) {
                    if (nodoAct == null) finale = true;
                    else {
                        nodoAnt = nodoAct;
                        nodoAct = nodoAct.getSiguiente();
                        posAct++;
                    }
                }
                if (posAct == pos) nodoAnt.setSiguiente(nodoAct.getSiguiente());
            }
        }
    }
}
