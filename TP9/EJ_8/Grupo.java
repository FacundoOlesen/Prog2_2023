package TP9.EJ_8;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

import TP9.EJ_8.Condiciones.Condicion;

public class Grupo extends Elemento {
    private int segsDemora;
    private ArrayList<Elemento> elementos;

    public Grupo(String titulo, int segsDemora) {
        super(titulo);
        this.segsDemora=segsDemora;
        this.elementos = new ArrayList<>();
    }

    public int getSegsDemora() {
        return segsDemora;
    }

    public void setSegsDemora(int segsDemora) {
        this.segsDemora = segsDemora;
    }

    public void addElementos(Elemento e) {
        this.elementos.add(e);
    }

    @Override
    public ArrayList<Video> getVideosQueCumplenOrdenados(Condicion c, Comparator<Video> orden) {
        ArrayList<Video> resultado = new ArrayList<>();
        for (int i = 0; i < elementos.size(); i++) {
            resultado.addAll(this.elementos.get(i).getVideosQueCumplenOrdenados(c, orden));
        }
        if (orden != null)
            Collections.sort(resultado, orden);
        else
            Collections.sort(resultado);
        return resultado;
    }

    @Override
    public ArrayList<String> getPalabrasClave() {
        ArrayList<String> resultado = new ArrayList<>();
        for (int i = 0; i < elementos.size(); i++) {
            ArrayList<String> aux = elementos.get(i).getPalabrasClave();
            for (int j = 0; j < aux.size(); j++)
                if (!resultado.contains(aux.get(j)))
                    resultado.add(aux.get(j));
        }
        return resultado;
    }

    @Override
    public int getCantidadVideos() {
        int cantVid = 0;
        for (int i = 0; i < elementos.size(); i++) {
            cantVid += elementos.get(i).getCantidadVideos();
        }
        return cantVid;
    }

    @Override
    public int getDuracion(){
        int duracion=0;
        for(int i =0; i<elementos.size();i++){
            duracion+=elementos.get(i).getDuracion();
        }
        return duracion+segsDemora;
    }
}
