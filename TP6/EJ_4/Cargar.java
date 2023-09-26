package TP6.EJ_4;

public  abstract class Cargar extends ElementoCola {
    private ElementoCola elemento;

    public Cargar(){
        this.elemento=null;
    }

    public abstract void ejecutarCarga(ElementoCola e);

    
}
