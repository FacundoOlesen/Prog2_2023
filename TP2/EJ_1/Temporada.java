package TP2.EJ_1;

import java.util.ArrayList;

public class Temporada {
    private int cantEpisodios;
    private ArrayList<Episodio> arrEpisodios;

    public Temporada(int cantEpisodios) {
        this.cantEpisodios = cantEpisodios;
        this.arrEpisodios = new ArrayList<Episodio>();
    }

    public int getCantEpisodios() {
        return cantEpisodios;
    }

    public void setCantEpisodios(int cantEpisodios) {
        this.cantEpisodios = cantEpisodios;
    }

    public void insertarEpisodios(Episodio ep) {
        if (arrEpisodios.size() < cantEpisodios) {
            arrEpisodios.add(ep);
        } 
        else {
            System.out.println(
                    "No podés ingresar mas episodios a esta temporada porque vas a superar la cantidad de episodios: "
                            + this.cantEpisodios);
        }
    }

    public int obtenerEpisodiosVistosPorTemporada() {
        int epsVistos = 0;
        for (int i = 0; i < arrEpisodios.size(); i++) {
            if (arrEpisodios.get(i).isFlag()) {
                epsVistos++;
            }
        }
        return epsVistos;
    }

    public int obtenerPromedioCalificacionesPorTemp() {
        int califaciones = 0;
        int cont =0;
        for (int i = 0; i < arrEpisodios.size(); i++) {
            if(arrEpisodios.get(i).getCalificacion()>0 &&arrEpisodios.get(i).isFlag()){
                califaciones+= arrEpisodios.get(i).getCalificacion();
                cont++;
            }
        }
        return califaciones/cont;
    }

}
