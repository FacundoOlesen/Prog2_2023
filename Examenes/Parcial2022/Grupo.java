package Examenes.Parcial2022;

import java.util.ArrayList;

public class Grupo extends Elemento {
    private ArrayList<Elemento> elementos;
    private int posicion;
    private static String defecto = "Sin definir";

    public Grupo(int posicion) {
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
        this.elementos.add(e);
    }

    @Override
    public String getCategoria() {
        if (posicion < elementos.size())
            return elementos.get(posicion).getCategoria();
        return defecto;
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

}
