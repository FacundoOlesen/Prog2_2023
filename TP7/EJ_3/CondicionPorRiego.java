package TP7.EJ_3;

public class CondicionPorRiego extends CondicionDeBusqueda {
    private int condRiego;

    public CondicionPorRiego(int condRiego) {
        this.condRiego = condRiego;
    }

    @Override
    public boolean cumple(Planta planta) {
        return planta.getRiego()<condRiego;
    }
}
