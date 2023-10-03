package TP7.EJ_4;

public class Ficha {
    protected int fortaleza;
    protected int espacioEnTablero;
    protected int poderDestruccion;

    public Ficha(int fortaleza, int espacioEnTablero, int poderDestruccion) {
        this.fortaleza = fortaleza;
        this.espacioEnTablero = espacioEnTablero;
        this.poderDestruccion = poderDestruccion;
    }

    //CONSTRUCTOR PARA QUE LO USE LA FICHA ESPECIAL
    public Ficha(int fortaleza, int espacioEnTablero) {
        this.fortaleza = fortaleza;
        this.espacioEnTablero = espacioEnTablero;
    }

    public int getFortaleza() {
        return fortaleza;
    }

    public void setFortaleza(int fortaleza) {
        this.fortaleza = fortaleza;
    }

    public int getEspacioEnTablero() {
        return espacioEnTablero;
    }

    public void setEspacioEnTablero(int espacioEnTablero) {
        this.espacioEnTablero = espacioEnTablero;
    }

    public int getPoderDestruccion() {
        return poderDestruccion;
    }

    public void setPoderDestruccion(int poderDestruccion) {
        this.poderDestruccion = poderDestruccion;
    }

    @Override
    public boolean equals(Object o) {
        try {
            Ficha otro = (Ficha) o;
            return this.getFortaleza() == (otro.getFortaleza()) &&
                    this.getEspacioEnTablero() == (otro.getEspacioEnTablero()) &&
                    this.getPoderDestruccion() == (otro.getPoderDestruccion());
        } catch (Exception e) {
            return false;
        }
    }

    @Override
    public String toString() {
        return "Ficha [fortaleza=" + fortaleza + ", espacioEnTablero=" + espacioEnTablero + ", poderDestruccion="
                + this.getPoderDestruccion() + "]";
    }

}
