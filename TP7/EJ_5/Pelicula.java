package TP7.EJ_5;

import java.util.ArrayList;

public class Pelicula {
    private String titulo;
    private String sinoposis;
    private ArrayList<String> generos;
    private String director;
    private ArrayList<String> actores;
    private int anioEstreno;
    private int duracion;
    private int edadMinima;

    public Pelicula(String titulo, String sinoposis, String director, int anioEstreno, int duracion, int edadMinima) {
        this.titulo = titulo;
        this.sinoposis = sinoposis;
        this.director = director;
        this.anioEstreno = anioEstreno;
        this.duracion = duracion;
        this.edadMinima = edadMinima;
        this.generos = new ArrayList<>();
        this.actores = new ArrayList<>();
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getSinoposis() {
        return sinoposis;
    }

    public void setSinoposis(String sinoposis) {
        this.sinoposis = sinoposis;
    }

    public String getDirector() {
        return director;
    }

    public void setDirector(String director) {
        this.director = director;
    }

    public int getAnioEstreno() {
        return anioEstreno;
    }

    public void setAnioEstreno(int anioEstreno) {
        this.anioEstreno = anioEstreno;
    }

    public int getDuracion() {
        return duracion;
    }

    public void setDuracion(int duracion) {
        this.duracion = duracion;
    }

    public int getEdadMinima() {
        return edadMinima;
    }

    public void setEdadMinima(int edadMinima) {
        this.edadMinima = edadMinima;
    }

    public ArrayList<String> getGeneros() {
        ArrayList<String> lista = new ArrayList<>(this.generos);
        return lista;
    }

    public ArrayList<String> getActores() {
        ArrayList<String> lista = new ArrayList<>(this.actores);
        return lista;
    }

    public void addGenero(String g) {
        if (!this.generos.contains(g))
            this.generos.add(g);
    }

    public void addActor(String a) {
        if (!this.actores.contains(a))
            this.actores.add(a);
    }

    @Override
    public String toString() {
        return "Pelicula [titulo=" + titulo + ", sinoposis=" + sinoposis + ", generos=" + generos + ", director="
                + director + ", actores=" + actores + ", anioEstreno=" + anioEstreno + ", duracion=" + duracion
                + ", edadMinima=" + edadMinima + "]";
    }

    @Override
    public boolean equals(Object o) {
        try {
            Pelicula otro = (Pelicula) o;
            return this.getTitulo().equals(otro.getTitulo()) &&
                    this.getDirector().equals(otro.getDirector());
        } catch (Exception e) {
            return false;
        }
    }

}
