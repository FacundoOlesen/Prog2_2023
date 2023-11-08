package TP10.EJ_3;

import java.util.Comparator;

public class ComparadorPorGanancia implements Comparator<Mueble> {

    @Override
    public int compare(Mueble o1, Mueble o2) {
        return ((Double)(o1.getPrecioVenta()-o1.getCosto())).compareTo((o2.getPrecioVenta()-o2.getPrecioVenta()));
    }
    
}
