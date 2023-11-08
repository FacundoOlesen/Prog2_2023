package TP9.EJ_8.Condiciones;

import TP9.EJ_8.Video;

public class CondicionPorAnio extends Condicion {

    private int anio;

    public CondicionPorAnio(int anio) {
        this.anio = anio;
    }

    @Override
    public boolean cumple(Video video) {
        return video.getAnioPublicacion() == anio;
    }

}
