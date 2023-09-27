package TP7.EJ_3;

public class CondicionOr extends CondicionDeBusqueda {
    private CondicionDeBusqueda c1;
	private CondicionDeBusqueda c2;
	
	public CondicionOr(CondicionDeBusqueda c1,
			CondicionDeBusqueda c2) {
		this.c1 = c1;
		this.c2 = c2;
	}

	@Override
	public boolean cumple(Planta planta) {
		return c1.cumple(planta) ||
				c2.cumple(planta);
	}
}
