package TP7.EJ_2;

public class CondicionPorContenidoMinimoPalabras extends CondicionDeBusqueda {
    private int cantPalabras;
	
	public CondicionPorContenidoMinimoPalabras(int cantPalabras) {
		this.cantPalabras = cantPalabras;
	}

	@Override
	public boolean cumple(Documento documento) {
		return documento.getContTextual().length()>(cantPalabras);
	}
}
