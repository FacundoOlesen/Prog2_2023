package TP9.EJ_4;

public class CondicionPorLargoTexto extends Condicion {
    private int largoTexto;

    public CondicionPorLargoTexto(int largoTexto) {
        this.largoTexto = largoTexto;
    }

    @Override
    public boolean cumple(Noticia noticia) {
        return noticia.getTexto().length()>largoTexto;
    }


    
}
