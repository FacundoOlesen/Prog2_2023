package TP7.EJ_5;

public class CondicionPorDirector extends CondicionDeBusqueda {
    private String director;

    public CondicionPorDirector(String director) {
        this.director = director;
    }

    @Override
    public boolean cumple(Pelicula pelicula) {
        return pelicula.getDirector().contains(director);
    }
}
