package TP7.EJ_5;

public class CondicionPorAnio  extends CondicionDeBusqueda {
    private int anio;

    public CondicionPorAnio(int anio) {
        this.anio = anio;
    }

    @Override
    public boolean cumple(Pelicula pelicula) {
        return pelicula.getAnioEstreno()<anio;
    }
}
