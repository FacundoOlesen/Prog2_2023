package Examenes.Parcial2022.Condiciones;

import Examenes.Parcial2022.Noticia;

public class CondicionPorFrase extends Condicion {
    private String frase;

    public CondicionPorFrase(String frase) {
        this.frase = frase;
    }

    @Override
    public boolean cumple(Noticia noticia) {
        return noticia.getContenido().equals(frase);
    }

    
    
}
