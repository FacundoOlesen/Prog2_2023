package TP9.EJ_7;

import TP9.EJ_7.Condiciones.Condicion;

public class ComboPagaUno extends Combo {

    public ComboPagaUno(int porcentaje, int descuentoTope, Condicion c) {
        super(porcentaje, descuentoTope, c);
    }

    @Override
    public double getPrecio() {
        double precioMayor = 0;
        for (int i = 0; i < super.getElementos().size(); i++) {
            if (super.getElementos().get(i).getPrecio() > precioMayor) {
                precioMayor = super.getElementos().get(i).getPrecio();
            }
        }
        return precioMayor;
    }

}
