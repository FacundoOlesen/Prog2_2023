package TP9.EJ_4;

public abstract class Elemento {
    public abstract int getCantNoticias();
    public abstract Elemento copia();
    public abstract Elemento copiaRestringida(Condicion cond);
    public void imprimirContenido(String tab){
        System.out.println(tab+this.toString());
    }
}
