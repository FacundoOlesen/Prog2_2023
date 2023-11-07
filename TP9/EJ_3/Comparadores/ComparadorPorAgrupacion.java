package TP9.EJ_3.Comparadores;
import TP9.EJ_3.Candidato;
import java.util.Comparator;

public class ComparadorPorAgrupacion implements Comparator<Candidato> {
    @Override
    public int compare(Candidato o1, Candidato o2) {
        return o1.getAgrupacion().compareTo(o2.getAgrupacion());
    }
}
