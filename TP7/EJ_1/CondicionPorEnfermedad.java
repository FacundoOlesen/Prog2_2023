package TP7.EJ_1;


public class CondicionPorEnfermedad extends CondicionDeBusqueda {
    private Enfermedad enfermedad;

    public CondicionPorEnfermedad(Enfermedad enfermedad){
        this.enfermedad=enfermedad;
    }

    @Override
    public boolean cumple(ProductoQuimico productoQuimico){
        return productoQuimico.getEstadosPatologicos().containsAll(enfermedad.getEstadosPatologicos());
    }
}
