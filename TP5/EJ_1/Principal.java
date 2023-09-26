package TP5.EJ_1;

public class Principal {

    public static void main(String[] args) {
        Pila pila = new Pila();

        pila.pushPila(1);
        pila.pushPila(2);
        pila.pushPila(3);

        System.out.println("Tope de la pila: " + pila.topPila());
        System.out.println("Tope de la pila y lo elimino: " + pila.popPila());
        System.out.println("Tope de la pila ahora: " + pila.topPila());
        System.out.println("Tamaño de la pila: " + pila.sizePila());
    }
}
