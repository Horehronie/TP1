package practica.ej1y2Listas;

/*
* La interfaz es muy similar pero no podría ser la misma
* ya que cambia la estructura del nodo y, por lo tanto,
* tambien cambia la forma de agregarse y eliminarse
* nodos en la lista, teniendo que actualizar ahora
* tambien el nodo anterior de cada uno que se agrega
* o elimina
*/

public class ListaDoble {
    private NodoDoble inicio = null;

    public void agregarNodo(NodoDoble nodo){
        if (inicio == null){
            inicio = nodo;
        }
        else{
            NodoDoble nodoAct = inicio;
            while(nodoAct.getSiguiente() != null){
                nodoAct = nodoAct.getSiguiente();
            }
            nodoAct.setSiguiente(nodo);
            nodo.setAnterior(nodoAct);
        }
    }

    public void agregarDato(Object dato){
        NodoDoble nodo = new NodoDoble();
        nodo.setDato(dato);
        agregarNodo(nodo);
    }

    public Boolean es_vacia(){
        return inicio == null;
    }

    public int longitud(){
        NodoDoble actual = inicio;
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
            if (pos == 1) {
                inicio = inicio.getSiguiente();
                inicio.setAnterior(null);
            }
            else {
                int posAct = 1;
                NodoDoble nodoAnt = inicio;
                NodoDoble nodoAct = inicio;
                boolean finale = false;
                while (pos != posAct && !finale) {
                    if (nodoAct == null) finale = true;
                    else {
                        nodoAnt = nodoAct;
                        nodoAct = nodoAct.getSiguiente();
                        posAct++;
                    }
                }
                if (posAct == pos){
                    nodoAnt.setSiguiente(nodoAct.getSiguiente());
                    nodoAct.getSiguiente().setAnterior(nodoAnt);
                }
            }
        }
    }




}


