package TP5.EJ_3;

public class Pastura extends Cereal {
    private double tamanioMinimo;

    public Pastura(String nombre, double tamanioMinimo) {
        super(nombre);
        this.tamanioMinimo = tamanioMinimo;
    }

    @Override
    public boolean sePuedeSembrarEn(Lote lote) {
        if (lote.getTamanio() > tamanioMinimo) {
            return super.sePuedeSembrarEn(lote);
        } else {
            return false;
        }
    }

}
