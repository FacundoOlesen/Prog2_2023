package TP7.EJ_1;

public class CondicionPorCultivo extends CondicionDeBusqueda {
    private Cultivo cultivo;
    private Enfermedad enfermedad;

    public CondicionPorCultivo(Enfermedad e, Cultivo c) {
        this.enfermedad = e;
        this.cultivo = c;
    }

    @Override
    public boolean cumple(ProductoQuimico productoQuimico) {
        return cultivo.getEnfermedadesFrecuentes().contains(enfermedad);
    }
}
