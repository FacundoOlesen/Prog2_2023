package TP7.EJ_3;

public class CondicionPorNombreCientifico extends CondicionDeBusqueda {
    private String palabra;

    public CondicionPorNombreCientifico(String palabra) {
        this.palabra = palabra;
    }

    @Override
    public boolean cumple(Planta planta) {
        return planta.getNombreCientifico().contains(palabra);
    }
}
