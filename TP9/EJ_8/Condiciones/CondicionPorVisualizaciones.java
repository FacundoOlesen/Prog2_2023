package TP9.EJ_8.Condiciones;

import TP9.EJ_8.Video;

public class CondicionPorVisualizaciones extends Condicion {
    
    private int visualizaciones;

    public CondicionPorVisualizaciones(int visualizaciones) {
        this.visualizaciones = visualizaciones;
    }

    @Override
    public boolean cumple(Video video) {
        return video.getCantVisualizaciones()>visualizaciones;
    }

    
}
