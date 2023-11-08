package TP9.EJ_8;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

import TP9.EJ_8.Condiciones.Condicion;

public class Grupo extends Elemento {
    private String titulo;
    private int segsDemora;
    private ArrayList<Elemento> elementos;

    public Grupo(String titulo, int segsDemora) {
        this.titulo = titulo;
        this.segsDemora=segsDemora;
        this.elementos = new ArrayList<>();
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
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
    public ArrayList<Video> getVideosQueCumplenOrdenados(Condicion c, Comparator<Elemento> orden) {
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
        ArrayList<String> palabrasClaveConcatenadas = new ArrayList<>();
        for (int i = 0; i < elementos.size(); i++) {
            for (int j = 0; j < elementos.get(i).getPalabrasClave().size(); j++)
                if (!palabrasClaveConcatenadas.contains(elementos.get(i).getPalabrasClave().get(j)))
                    palabrasClaveConcatenadas.addAll(elementos.get(i).getPalabrasClave());
        }
        return palabrasClaveConcatenadas;
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
