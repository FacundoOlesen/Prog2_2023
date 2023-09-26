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
    public boolean esMenor(ElementoCola obj1, ElementoCola obj2) {
        return ((Camion) obj1).getFechaCarga().isBefore(((Camion) obj2).getFechaCarga());
    }
}
