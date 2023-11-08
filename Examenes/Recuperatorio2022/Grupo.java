package Examenes.Recuperatorio2022;

import java.util.ArrayList;

import Examenes.Recuperatorio2022.Condiciones.Condicion;

public class Grupo extends Elemento {
    private ArrayList<Elemento> elementos;
    private int posicion;

    public Grupo(int posicion, String categoria) {
        super(categoria);
        this.posicion = posicion;
        this.elementos = new ArrayList<>();
    }

    public int getPosicion() {
        return posicion;
    }

    public void setPosicion(int posicion) {
        this.posicion = posicion;
    }

    public void addElemento(Elemento e) {
        int pos = 0;
        while (pos < this.elementos.size() && this.elementos.get(pos).compareTo(e) < 0)
            pos++;
        this.elementos.add(pos, e);
    }

    @Override
    public ArrayList<String> getPalabrasClave() {
        ArrayList<String> palabrasClaveConcatenadas = new ArrayList<>();
        for (int i = 0; i < elementos.size(); i++) {
            ArrayList<String> aux = elementos.get(i).getPalabrasClave();
            for (int j = 0; j < aux.size(); j++)
                if (!palabrasClaveConcatenadas.contains(aux.get(i)))
                    palabrasClaveConcatenadas.add(aux.get(i));
        }
        return palabrasClaveConcatenadas;
    }

    @Override
    public ArrayList<Noticia> buscar(Condicion c) {
        ArrayList<Noticia> lista = new ArrayList<>();
        for (int i = 0; i < elementos.size(); i++) {
            lista.addAll(this.elementos.get(i).buscar(c));
        }
        return lista;
    }

    @Override
    public Grupo copia() {
        return new Grupo(this.getPosicion(), this.getCategoria());
    }

    @Override
    public Grupo copiaRestringida(Condicion cond) {
        Grupo copia = copia();
        for (int i = 0; i < elementos.size(); i++) {
            Elemento hijo = elementos.get(i);
            Elemento copiaHijo = hijo.copiaRestringida(cond);
            if (copiaHijo != null)
                copia.addElemento(copiaHijo);
        }

        return copia;
    }

}
