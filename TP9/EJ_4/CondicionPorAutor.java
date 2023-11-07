package TP9.EJ_4;

public class CondicionPorAutor extends Condicion {
    private String autor;

    public CondicionPorAutor(String autor) {
        this.autor = autor;
    }

    public boolean cumple(Noticia noticia) {
        return noticia.getAutor().equals(this.autor);
    }
}
