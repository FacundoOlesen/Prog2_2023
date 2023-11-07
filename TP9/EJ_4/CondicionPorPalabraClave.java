package TP9.EJ_4;

public class CondicionPorPalabraClave extends Condicion {
    private String palabraClave;

    public CondicionPorPalabraClave(String palabraClave) {
        this.palabraClave = palabraClave;
    }

    public boolean cumple(Noticia noticia) {
        return noticia.contienePalabra(palabraClave);
    }
}
