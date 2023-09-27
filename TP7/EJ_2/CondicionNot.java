package TP7.EJ_2;

public class CondicionNot extends CondicionDeBusqueda {
    private CondicionDeBusqueda c1;
	
	public CondicionNot(CondicionDeBusqueda c1) {
		this.c1 = c1;
	}

	@Override
	public boolean cumple(Documento documento) {
		return !c1.cumple(documento);
	}
}
