package TP9.EJ_1.Comparadores;
import TP9.EJ_1.Socio;
import java.util.Comparator;

public class ComparadorPorPago implements Comparator<Socio> {
    @Override
    public int compare(Socio o1, Socio o2) {
        return Boolean.compare(o1.isPagoUltCuota(),(o2.isPagoUltCuota()));
    }
}
