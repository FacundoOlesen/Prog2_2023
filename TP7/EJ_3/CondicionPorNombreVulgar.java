package TP7.EJ_3;

public class CondicionPorNombreVulgar extends CondicionDeBusqueda {
    private String nombreVulgar;

    public CondicionPorNombreVulgar(String nombreVulgar) {
        this.nombreVulgar = nombreVulgar;
    }

    @Override
    public boolean cumple(Planta planta) {
        return planta.getNombresVulgares().contains(nombreVulgar);
    }
}
