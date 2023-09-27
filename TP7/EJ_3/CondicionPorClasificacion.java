package TP7.EJ_3;

public class CondicionPorClasificacion extends CondicionDeBusqueda {
    private String clasificacion;

    public CondicionPorClasificacion(String clasificacion) {
        this.clasificacion = clasificacion;
    }

    @Override
    public boolean cumple(Planta planta) {
        return planta.getClasificacionSuperior().equals(clasificacion);
    }
}
