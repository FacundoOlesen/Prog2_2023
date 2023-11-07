package TP9.EJ_4;

public class CondicionOR  extends Condicion {
	
	private Condicion c1;
	private Condicion c2;
	
	public CondicionOR(Condicion c1,
			Condicion c2) {
		this.c1 = c1;
		this.c2 = c2;
	}

	@Override
	public boolean cumple(Noticia noticia) {
		return c1.cumple(noticia) ||
				c2.cumple(noticia);
	}

}

