package TP7.EJ_3;

public class CondicionPorSol extends CondicionDeBusqueda {
    private int condSol;

    public CondicionPorSol(int condSol) {
        this.condSol = condSol;
    }

    @Override
    public boolean cumple(Planta planta) {
        return planta.getSol()>condSol;
    }
}

