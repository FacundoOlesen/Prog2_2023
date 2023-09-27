package TP7.EJ_2;

public class CondicionPorPalabraClave extends CondicionDeBusqueda {
    private String palabra;
	
	public CondicionPorPalabraClave(String palabra) {
		this.palabra = palabra;
	}

	@Override
	public boolean cumple(Documento documento) {
		return documento.getPalabrasClave().contains(palabra);
	}
}
