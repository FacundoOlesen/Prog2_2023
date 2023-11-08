package TP10.EJ_4;

import java.time.LocalDate;
import java.util.ArrayList;

public class Gasto extends Elemento {
    private LocalDate fecha;
    private ArrayList<Elemento> elementos;

    public Gasto(LocalDate fecha) {
        this.fecha = fecha;
        this.elementos = new ArrayList<>();
    }

    public LocalDate getFecha() {
        return fecha;
    }

    public void setFecha(LocalDate fecha) {
        this.fecha = fecha;
    }

    @Override
    public double getMonto() {
        // TODO Auto-generated method stub
        return 0;
    }

}
