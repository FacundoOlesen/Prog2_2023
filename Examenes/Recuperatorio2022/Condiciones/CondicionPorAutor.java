package Examenes.Recuperatorio2022.Condiciones;
import Examenes.Recuperatorio2022.Noticia;

public class CondicionPorAutor extends Condicion {
    private String autor;

    public CondicionPorAutor(String autor) {
        this.autor = autor;
    }

    @Override
    public boolean cumple(Noticia noticia) {
        return noticia.getAutor().equals(autor);
    }
}
