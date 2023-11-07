package TP9.EJ_1.Condiciones;
import TP9.EJ_1.Socio;

public class CondicionPorCancha extends Condicion {
    private int IDcancha;

    public CondicionPorCancha(int IDcancha) {
        this.IDcancha = IDcancha;
    }

    @Override
    public boolean cumple(Socio socio) {
        return socio.alquilo(IDcancha);
    }
}
