package Examenes.Recuperatorio2022.Condiciones;

import Examenes.Recuperatorio2022.Noticia;

public class CondicionPorPalabra extends Condicion {
    private String palabra;

    public CondicionPorPalabra(String palabra) {
        this.palabra = palabra;
    }

    @Override
    public boolean cumple(Noticia noticia) {
        return noticia.contienePalabra(palabra);
    }

    
}
