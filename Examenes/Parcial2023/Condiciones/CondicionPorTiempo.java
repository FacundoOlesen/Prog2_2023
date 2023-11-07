package Examenes.Parcial2023.Condiciones;

import Examenes.Parcial2023.Pieza;

public class CondicionPorTiempo extends Condicion {
    private int tiempo;

    public CondicionPorTiempo(int tiempo){
        this.tiempo=tiempo;
    }

    @Override
    public boolean cumple(Pieza pieza) {
        return pieza.getTiempoEstimado()>tiempo;
    }

    
}