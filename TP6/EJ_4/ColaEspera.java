package TP6.EJ_4;

import java.util.ArrayList;

public class ColaEspera {
    ArrayList<ElementoCola> elementos = new ArrayList<>();

    public ColaEspera() {
        elementos = new ArrayList<>();
    }

    public ElementoCola getSiguiente() {
        if (this.tieneElementos()) {
            return elementos.remove(0);
        } else {
            return null;
        }
    }

    public boolean tieneElementos() {
        return !elementos.isEmpty();
    }

    public void addElemento(ElementoCola obj) {
        int i = 0;
        while (i < elementos.size() && obj.esMenor(elementos.get(i), obj)) {
            i++;
        }
        if (i < elementos.size()) {
            elementos.add(i, obj);
        } else {
            elementos.add(obj);
        }

    }
}
