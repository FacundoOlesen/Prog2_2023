package TP7.EJ_2;

public class CondicionPorContenido extends CondicionDeBusqueda {
    private String palabra;
	
	public CondicionPorContenido(String palabra) {
		this.palabra = palabra;
	}

	@Override
	public boolean cumple(Documento documento) {
		return documento.getContTextual().contains(palabra);
	}
}
