package TP7.EJ_5;

public class CondicionPorGenero extends CondicionDeBusqueda {
    private String genero;

    public CondicionPorGenero(String genero) {
        this.genero = genero;
    }

    @Override
    public boolean cumple(Pelicula pelicula) {
        return pelicula.getGeneros().contains(genero);
    }
}
