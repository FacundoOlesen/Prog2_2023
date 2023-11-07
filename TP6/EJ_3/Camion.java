package TP6.EJ_3;

import java.time.LocalDate;

public class Camion extends ElementoCola {
    LocalDate fechaCarga;

    public Camion(LocalDate fechaCarga) {
        this.fechaCarga = fechaCarga;
    }

    public LocalDate getFechaCarga() {
        return fechaCarga;
    }

    public void setFechaCarga(LocalDate fechaCarga) {
        this.fechaCarga = fechaCarga;
    }

    @Override
    public boolean esMenor(ElementoCola otro) {
        return this.getFechaCarga().isBefore(((Camion)otro).getFechaCarga());
    }
}
