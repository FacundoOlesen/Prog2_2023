package TP7.EJ_5;

public class CondicionPorDuracion extends CondicionDeBusqueda {
    private int duracion;

    public CondicionPorDuracion(int duracion) {
        this.duracion = duracion;
    }

    @Override
    public boolean cumple(Pelicula pelicula) {
        return pelicula.getDuracion() < duracion;
    }
}
