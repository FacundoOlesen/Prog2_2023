package TP7.EJ_2;

public class CondicionPorAutor extends CondicionDeBusqueda {
    private String autor;
	
	public CondicionPorAutor(String autor) {
		this.autor = autor;
	}

	@Override
	public boolean cumple(Documento documento) {
		return documento.getAutores().contains(autor);
	}
}
