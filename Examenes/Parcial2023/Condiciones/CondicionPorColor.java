package Examenes.Parcial2023.Condiciones;

import Examenes.Parcial2023.Pieza;

public class CondicionPorColor extends Condicion {
    private String color;

    public CondicionPorColor(String color){
        this.color=color;
    }

    @Override
    public boolean cumple(Pieza pieza) {
        return pieza.getColores().contains(this.color);
    }

    
}
