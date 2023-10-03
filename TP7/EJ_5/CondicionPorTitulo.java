package TP7.EJ_5;

public class CondicionPorTitulo extends CondicionDeBusqueda {
    private String titulo;

    public CondicionPorTitulo(String titulo) {
        this.titulo = titulo;
    }

    @Override
    public boolean cumple(Pelicula pelicula) {
        return pelicula.getTitulo().contains(titulo);
    }
}