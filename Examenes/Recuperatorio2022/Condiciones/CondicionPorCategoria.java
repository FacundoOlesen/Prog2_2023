package Examenes.Recuperatorio2022.Condiciones;
import Examenes.Recuperatorio2022.Noticia;

public class CondicionPorCategoria extends Condicion {
    private String categoria;

    public CondicionPorCategoria(String categoria) {
        this.categoria = categoria;
    }

    @Override
    public boolean cumple(Noticia noticia) {
        return noticia.getCategoria().equals(categoria);
    }
}