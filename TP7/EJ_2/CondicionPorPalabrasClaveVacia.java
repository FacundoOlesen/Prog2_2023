package TP7.EJ_2;

public class CondicionPorPalabrasClaveVacia extends CondicionDeBusqueda {
    @Override
	public boolean cumple(Documento documento) {
		return documento.getPalabrasClave().isEmpty();
	}
}
