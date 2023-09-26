package TP6.EJ_4;

public class Computadora extends ElementoCola {
    private String nombre;
    private double rapidez;

    public Computadora(String nombre, double rapidez) {
        this.nombre = nombre;
        this.rapidez = rapidez;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getRapidez() {
        return rapidez;
    }

    public void setRapidez(double rapidez) {
        this.rapidez = rapidez;
    }

    /*public void ejecutar(Proceso p) {
        this.proc = p;
    }*/

    
    @Override
    public void ejecutar(ElementoCola e) {
        Proceso p = (Proceso) e;
        super.ejecutar(p);
    }

    @Override
    public boolean esMenor(ElementoCola obj1, ElementoCola obj2) {
        return ((Computadora) obj1).getRapidez() > ((Computadora) obj2).getRapidez();
    }


    public String toString() {
        return "\nNombre PC:" + this.getNombre() +
                " Velocidad: " + this.getRapidez();
    }

}
