package TP5.EJ_3;

import java.util.ArrayList;

public class Cereal {
    private String nombre;
    private ArrayList<String> minerales;

    public Cereal(String nombre) {
        this.nombre = nombre;
        this.minerales = new ArrayList<>();
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public ArrayList<String> getMinerales() {
        return new ArrayList<>(this.minerales);
    }

    public boolean sePuedeSembrarEn(Lote lote) {
        for (int i = 0; i < minerales.size(); i++) {
            String mineralI = this.minerales.get(i);
            if (!lote.tieneMineral(mineralI)) {
                return false;
            }
        }
        return true;
    }

    public boolean necesitaMineral(String mineral) {
        return this.minerales.contains(mineral);
    }
}
