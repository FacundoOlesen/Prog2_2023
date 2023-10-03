package TP7.EJ_4;

public class FichaEspecial extends Ficha {

    public FichaEspecial(int fortaleza, int espacioEnTablero) {
        super(fortaleza, espacioEnTablero);
    }

    @Override
    public int getPoderDestruccion() {
       return this.poderDestruccion = this.getFortaleza() / this.getEspacioEnTablero();
    }

}
