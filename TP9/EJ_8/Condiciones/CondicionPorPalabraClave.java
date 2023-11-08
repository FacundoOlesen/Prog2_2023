package TP9.EJ_8.Condiciones;

import TP9.EJ_8.Video;

public class CondicionPorPalabraClave extends Condicion {

    private String palabra;

    public CondicionPorPalabraClave(String palabra) {
        this.palabra = palabra;
    }

    @Override
    public boolean cumple(Video video) {
        return video.contienePalabra(palabra);
    }
}
