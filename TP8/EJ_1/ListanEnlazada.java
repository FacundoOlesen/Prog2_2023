package TP8.EJ_1;

import java.util.ArrayList;
import java.util.List;

public class ListanEnlazada implements SimpleList {
    private Nodo primero;
    private Nodo ultimo;
    private ArrayList<Object> listaEnlazada;

    public ListanEnlazada() {
        this.listaEnlazada = new ArrayList<>();
    }

    @Override
    public void add(Object element) {
        this.listaEnlazada.add(element);
    }

    @Override
    public Object add(int index, Object element) {
        this.listaEnlazada.add(index, element);
        return element;
    }

    @Override
    public void addAll(List<Object> otraLista) {
        this.listaEnlazada.addAll(otraLista);
    }

    @Override
    public void clear() {
        this.listaEnlazada.clear();
    }

    @Override
    public boolean contains(Object element) {
        return this.listaEnlazada.contains(element);
    }

    @Override
    public Object get(int index) {
        return this.listaEnlazada.get(index);
    }

    @Override
    public int indexOf(Object element) {
        return indexOf(element);
    }

    @Override
    public boolean isEmpty() {
        return this.listaEnlazada.isEmpty();
    }

    @Override
    public boolean remove(Object element) {
        return this.listaEnlazada.remove(element);
    }

    @Override
    public Object set(int index, Object element) {
        return this.listaEnlazada.set(index, element);
    }

    @Override
    public int size() {
        return this.listaEnlazada.size();
    }

}
