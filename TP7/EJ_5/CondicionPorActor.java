package TP7.EJ_5;

public class CondicionPorActor  extends CondicionDeBusqueda {
    private String actor;

    public CondicionPorActor(String actor) {
        this.actor = actor;
    }

    @Override
    public boolean cumple(Pelicula pelicula) {
        return pelicula.getActores().contains(actor);
    }
}

