package TP7.EJ_1;

public class CondicionPorCultivosUsables extends CondicionDeBusqueda {
    private Cultivo cultivo;

    public CondicionPorCultivosUsables(Cultivo c) {
        this.cultivo = c;
    }

    @Override
    public boolean cumple(ProductoQuimico productoQuimico) {
        return productoQuimico.puedeUsarseEn(cultivo);
    }
}
