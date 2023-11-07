package TP9.EJ_1.Condiciones;

import TP9.EJ_1.Socio;

public class CondicionAnd extends Condicion {

	private Condicion c1;
	private Condicion c2;

	public CondicionAnd(Condicion c1,
			Condicion c2) {
		this.c1 = c1;
		this.c2 = c2;
	}

	@Override
	public boolean cumple(Socio socio) {
		return c1.cumple(socio) &&
				c2.cumple(socio);
	}

}