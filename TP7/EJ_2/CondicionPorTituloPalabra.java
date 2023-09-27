package TP7.EJ_2;

public class CondicionPorTituloPalabra extends CondicionDeBusqueda {
    private String palabra;
	
	public CondicionPorTituloPalabra(String palabra) {
		this.palabra = palabra;
	}

	@Override
	public boolean cumple(Documento documento) {
		return documento.getTitulo().contains(palabra);
	}
}
