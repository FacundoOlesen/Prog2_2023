package TP2.EJ_1;

import java.util.ArrayList;

public class Serie {
    private String titulo;
    private String descripcion;
    private String creador;
    private String genero;
    private ArrayList<Episodio> arrEpisodios;

    public Serie(String titulo, String descripcion, String creador, String genero) {
        this.titulo = titulo;
        this.descripcion = descripcion;
        this.creador = creador;
        this.genero = genero;
        this.arrEpisodios = new ArrayList<Episodio>();
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getCreador() {
        return creador;
    }

    public void setCreador(String creador) {
        this.creador = creador;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public void insertarEpisodios(Episodio ep) {
        arrEpisodios.add(ep);
    }

    public int obtenerEpisodiosVistosPorSerie() {
        int epsVistos = 0;
        for (int i = 0; i < arrEpisodios.size(); i++) {
            if (arrEpisodios.get(i).isFlag()) {
                epsVistos++;
            }
        }
        return epsVistos;
    }

    public int obtenerPromedioCalificacionesPorSerie() {
        int califaciones = 0;
        int cont =0;
        for (int i = 0; i < arrEpisodios.size(); i++) {
            if(arrEpisodios.get(i).getCalificacion()>0){
                califaciones+= arrEpisodios.get(i).getCalificacion();
                cont++;
            }
        }
        return califaciones/cont;
    }

    public boolean vioTodosLosEpisodiosDeSerie(){
        int cont =0;
        for(int i =0; i<arrEpisodios.size();i++){
            if(arrEpisodios.get(i).isFlag()){
                cont++;
            }
        }
        return cont == arrEpisodios.size(); 
    }

}
