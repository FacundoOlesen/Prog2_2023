package TP7.EJ_2;

public class CondicionPorTitulo extends CondicionDeBusqueda {
    private String titulo;
	
	public CondicionPorTitulo(String titulo) {
		this.titulo = titulo;
	}

	@Override
	public boolean cumple(Documento documento) {
		return documento.getTitulo().equals(titulo);
	}
}
