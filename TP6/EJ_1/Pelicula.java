package TP6.EJ_1;


public class Pelicula extends Item {
    private String nombre;
    private String director;
    private int cantCopias;

    public Pelicula( String nombre, String director, int cantCopias) {
        this.nombre = nombre;
        this.director = director;
        this.cantCopias = cantCopias;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDirector() {
        return director;
    }

    public void setDirector(String director) {
        this.director = director;
    }

    public int getCantCopias() {
        return cantCopias;
    }

    public void setCantCopias(int cantCopias) {
        this.cantCopias = cantCopias;
    }

    @Override
    public boolean puedeAlquilar() {
       return this.getCantCopias()>0;
    }

    

    @Override
    public void estaAlquilado() {
        this.cantCopias--;
    }

    public String toString(){
        return " Nombre: " + this.getNombre()+
                ", Director: " + this.getDirector()+
                ", Cant copias: "+ this.getCantCopias();
    }

}
