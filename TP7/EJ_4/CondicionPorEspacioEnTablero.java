package TP7.EJ_4;

public class CondicionPorEspacioEnTablero extends CondicionDeBusqueda {
    private int espacioEnTablero;

    public CondicionPorEspacioEnTablero(int espacioEnTablero) {
        this.espacioEnTablero = espacioEnTablero;
    }

    @Override
    public boolean cumple(Ficha ficha) {
        return ficha.getEspacioEnTablero() > espacioEnTablero;
    }
}
