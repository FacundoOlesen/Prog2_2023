package TP6.EJ_4;

public abstract class ElementoCola {
    private ElementoCola ejecutable;

    public ElementoCola() {
        this.ejecutable = null;
    }

    public void ejecutar(ElementoCola e) {
        this.ejecutable = e;
    }

    public abstract boolean esMenor(ElementoCola obj1, ElementoCola obj2);
}
