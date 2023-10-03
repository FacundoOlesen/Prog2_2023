package TP7.EJ_4;

public class CondicionPorPoderDestruccion extends CondicionDeBusqueda {
    private int poderDestruccion;

    public CondicionPorPoderDestruccion(int poderDestruccion) {
        this.poderDestruccion = poderDestruccion;
    }

    @Override
    public boolean cumple(Ficha ficha) {
        return ficha.getPoderDestruccion()>poderDestruccion;
    }
}
