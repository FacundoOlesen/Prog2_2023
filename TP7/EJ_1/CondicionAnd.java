package TP7.EJ_1;

public class CondicionAnd extends CondicionDeBusqueda {
    private CondicionDeBusqueda c1;
	private CondicionDeBusqueda c2;
	
	public CondicionAnd(CondicionDeBusqueda c1,
			CondicionDeBusqueda c2) {
		this.c1 = c1;
		this.c2 = c2;
	}

	@Override
	public boolean cumple(ProductoQuimico productoQuimico) {
		return c1.cumple(productoQuimico) &&
				c2.cumple(productoQuimico);
	}

}
