package TP9.EJ_8;

import java.util.ArrayList;
import java.util.Comparator;

import TP9.EJ_8.Condiciones.Condicion;

public class Video extends Elemento implements Comparable<Video> {
    private String titulo;
    private Usuario usuario;
    private int duracion;
    private int cantVisualizaciones;
    private int cantMG;
    private int cantNoMG;
    private int anioPublicacion;
    private ArrayList<String> palabrasClave;

    public Video(String titulo, Usuario usuario, int duracion, int cantVisualizaciones, int cantMG, int cantNoMG,
            int anioPublicacion) {
        this.titulo = titulo;
        this.usuario = usuario;
        this.duracion = duracion;
        this.cantVisualizaciones = cantVisualizaciones;
        this.cantMG = cantMG;
        this.cantNoMG = cantNoMG;
        this.anioPublicacion = anioPublicacion;
        this.palabrasClave = new ArrayList<>();
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public Usuario getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }

    @Override
    public int getDuracion() {
        return duracion;
    }

    public void setDuracion(int duracion) {
        this.duracion = duracion;
    }

    public int getCantVisualizaciones() {
        return cantVisualizaciones;
    }

    public void setCantVisualizaciones(int cantVisualizaciones) {
        this.cantVisualizaciones = cantVisualizaciones;
    }

    public int getCantMG() {
        return cantMG;
    }

    public void setCantMG(int cantMG) {
        this.cantMG = cantMG;
    }

    public int getCantNoMG() {
        return cantNoMG;
    }

    public void setCantNoMG(int cantNoMG) {
        this.cantNoMG = cantNoMG;
    }

    public int getAnioPublicacion() {
        return anioPublicacion;
    }

    public void setAnioPublicacion(int anioPublicacion) {
        this.anioPublicacion = anioPublicacion;
    }

    public void addPalabraClave(String p) {
        this.palabrasClave.add(p);
    }

    @Override
    public ArrayList<String> getPalabrasClave() {
        return new ArrayList<>(this.palabrasClave);
    }

    public boolean contienePalabra(String palabra) {
        return this.getPalabrasClave().contains(palabra);
    }

    @Override
    public ArrayList<Video> getVideosQueCumplenOrdenados(Condicion c, Comparator<Elemento> orden) {
        ArrayList<Video> resultado = new ArrayList<>();
        if (c.cumple(this)) {
            resultado.add(this);
        }
        return resultado;
    }

    @Override
    public int compareTo(Video otro) {
        int comp = usuario.getNombre().compareTo(otro.getUsuario().getNombre());
        if (comp == 0)
            return usuario.getEmail().compareTo(otro.getUsuario().getEmail());
        return comp;
    }

    @Override
    public int getCantidadVideos() {
        return 1;
    }

    
}
