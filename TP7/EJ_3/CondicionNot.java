package TP7.EJ_3;

public class CondicionNot extends CondicionDeBusqueda {
    private CondicionDeBusqueda c1;
	
	public CondicionNot(CondicionDeBusqueda c1) {
		this.c1 = c1;
	}

	@Override
	public boolean cumple(Planta planta) {
		return !c1.cumple(planta);
	}
}
