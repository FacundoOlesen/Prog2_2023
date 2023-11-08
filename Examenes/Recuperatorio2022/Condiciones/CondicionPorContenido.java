package Examenes.Recuperatorio2022.Condiciones;
import Examenes.Recuperatorio2022.Noticia;

public class CondicionPorContenido extends Condicion {
    private String frase;

    public CondicionPorContenido(String frase) {
        this.frase = frase;
    }

    @Override
    public boolean cumple(Noticia noticia) {
        return noticia.getContenido().contains(frase);
    }
}

