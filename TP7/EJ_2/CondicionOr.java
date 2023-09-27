package TP7.EJ_2;

public class CondicionOr extends CondicionDeBusqueda {
    private CondicionDeBusqueda c1;
	private CondicionDeBusqueda c2;
	
	public CondicionOr(CondicionDeBusqueda c1,
			CondicionDeBusqueda c2) {
		this.c1 = c1;
		this.c2 = c2;
	}

	@Override
	public boolean cumple(Documento documento) {
		return c1.cumple(documento) ||
				c2.cumple(documento);
	}
}
