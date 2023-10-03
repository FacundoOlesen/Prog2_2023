package TP7.EJ_4;

public class CondicionPorFortaleza extends CondicionDeBusqueda {
    private int fortaleza;

    public CondicionPorFortaleza(int fortaleza) {
        this.fortaleza = fortaleza;
    }

    @Override
    public boolean cumple(Ficha ficha) {
        return ficha.getFortaleza()>fortaleza;
    }
}
