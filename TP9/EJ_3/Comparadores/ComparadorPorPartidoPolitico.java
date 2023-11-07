package TP9.EJ_3.Comparadores;
import TP9.EJ_3.Candidato;
import java.util.Comparator;

public class ComparadorPorPartidoPolitico implements Comparator<Candidato> {
    @Override
    public int compare(Candidato o1, Candidato o2) {
        return o1.getPartidoPolitico().compareTo(o2.getPartidoPolitico());
    }
}
