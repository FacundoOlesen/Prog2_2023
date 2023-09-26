package TP6.EJ_2;

import java.util.ArrayList;

public class ColaEspera {
    private ArrayList<ElementoCola> elementos;

    public ColaEspera() {
        elementos = new ArrayList<>();
    }

    public ElementoCola getSiguiente() {
        if(this.tieneElementos()){
            return elementos.remove(0);
        }
        else{
            return null;
        }
    }

    public boolean tieneElementos() {
        return !elementos.isEmpty();
    }

    public void addElemento(ElementoCola elemento) {
        int i = 0;
        while (i < elementos.size() && elemento.esMenor(this.elementos.get(i), elemento)) {
            i++;
        }
        if (i < elementos.size()) {
            this.elementos.add(i, elemento);
        } else {
            this.elementos.add(elemento);
        }

    }
}