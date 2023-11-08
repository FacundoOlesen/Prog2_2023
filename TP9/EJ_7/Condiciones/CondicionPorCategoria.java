package TP9.EJ_7.Condiciones;
import TP9.EJ_7.Elemento;

public class CondicionPorCategoria  extends Condicion{
    private String categoria ;

    public CondicionPorCategoria(String categoria) {
        this.categoria = categoria;
    }

    @Override
    public boolean cumple(Elemento elemento) {
        return elemento.getCategorias().contains(categoria);
    }
}

