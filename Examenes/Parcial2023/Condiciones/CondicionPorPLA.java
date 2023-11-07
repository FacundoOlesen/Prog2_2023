package Examenes.Parcial2023.Condiciones;

import Examenes.Parcial2023.Pieza;

public class CondicionPorPLA extends Condicion {
    private int pla;

    public CondicionPorPLA(int pla){
        this.pla=pla;
    }

    @Override
    public boolean cumple(Pieza pieza) {
        return pieza.getPla()>pla;
    }

    
}
