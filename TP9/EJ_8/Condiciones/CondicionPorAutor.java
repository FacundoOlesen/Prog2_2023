package TP9.EJ_8.Condiciones;

import TP9.EJ_8.Video;

public class CondicionPorAutor extends Condicion {

    private String autor;

    public CondicionPorAutor(String autor) {
        this.autor = autor;
    }

    @Override
    public boolean cumple(Video video) {
        return video.getUsuario().getNombre().equals(autor);
    }

}
