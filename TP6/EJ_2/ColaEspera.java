package TP6.EJ_2;

import java.util.ArrayList;

public class ColaEspera {
    private ArrayList<ElementoCola> elementos;

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

    public void addElemento(ElementoCola elemento) {
        boolean encontro = false;
        int i = 0;
        while (!encontro && i < elementos.size()) {
            if (elemento.esMenor(elementos.get(i)))
                i++;
            else
                encontro = true;
        }
        if (encontro)
            elementos.add(i, elemento);
        else
            elementos.add(elemento);
    }
}