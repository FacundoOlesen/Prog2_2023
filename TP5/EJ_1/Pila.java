package TP5.EJ_1;

import java.util.Stack;

public class Pila {
    private Stack<Integer> pila;

    public Pila() {
        this.pila = new Stack<>();
    }

    public void pushPila(int nro) {
        pila.push(nro);
    }

    public int popPila() {
        return pila.pop();
    }

    public int topPila() {
        return pila.peek();
    }

    public int sizePila() {
        return pila.size();
    }

    public void copyPila() {
        pila.clone();
    }
}
