package Examenes.Parcial2023;

public class PiezaExclusiva extends PiezaSimple {

    private int costoExclusividad;

    public PiezaExclusiva(String nombre, String descripcion, String color, int tiempoEstimado, int cantPLA,
            int costoExclusividad) {
        super(nombre, descripcion, color, tiempoEstimado, cantPLA);
        this.costoExclusividad = costoExclusividad;
    }

    public int getCosto() {
        return super.getCosto() + costoExclusividad;
    }

    public int getCostoExclusividad() {
        return costoExclusividad;
    }

    public void setCostoExclusividad(int costoExclusividad) {
        this.costoExclusividad = costoExclusividad;
    }
}
