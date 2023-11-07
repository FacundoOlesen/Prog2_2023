package TP9.EJ_4;

public class CondicionPorTitulo extends Condicion {
    private String titulo;

    public CondicionPorTitulo(String titulo) {
        this.titulo = titulo;
    }

    public boolean cumple(Noticia noticia) {
        return noticia.getTitulo().equals(this.titulo);
    }
}