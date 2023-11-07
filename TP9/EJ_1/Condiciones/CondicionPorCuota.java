package TP9.EJ_1.Condiciones;

import TP9.EJ_1.Socio;

public class CondicionPorCuota extends Condicion {
    private boolean pagoUltCuota;

    public CondicionPorCuota(boolean pagoUltCuota) {
        this.pagoUltCuota = pagoUltCuota;
    }

    @Override
    public boolean cumple(Socio socio) {
        return socio.isPagoUltCuota() == pagoUltCuota;
    }
}
