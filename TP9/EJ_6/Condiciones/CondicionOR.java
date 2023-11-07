package TP9.EJ_6.Condiciones;

import TP9.EJ_6.ElementoSimple;

public class CondicionOR  extends Condicion {
	
	private Condicion c1;
	private Condicion c2;
	
	public CondicionOR(Condicion c1,
			Condicion c2) {
		this.c1 = c1;
		this.c2 = c2;
	}

	@Override
	public boolean cumple(ElementoSimple e) {
		return c1.cumple(e) ||
				c2.cumple(e);
	}

}

