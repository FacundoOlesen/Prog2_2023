import java.util.ArrayList;

public class Cliente {
    private String nombre;
    private String apellido;
    private int DNI;
    private String direccion;
    private ArrayList<String> autoresFav;
    protected ArrayList<String> generosFav;
    private ArrayList<Articulo> listaCompras;
    private double descuento;

    public Cliente(String nombre, String apellido, int dNI, String direccion, double descuento) {
        this.nombre = nombre;
        this.apellido = apellido;
        DNI = dNI;
        this.direccion = direccion;
        this.descuento = descuento;
        this.autoresFav = new ArrayList<>();
        this.generosFav = new ArrayList<>();
        this.listaCompras = new ArrayList<>();
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public int getDNI() {
        return DNI;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public double getDescuento() {
        return descuento;
    }

    public void setDescuento(double descuento) {
        this.descuento = descuento;
    }

    public void addAutorFav(String a) {
        if (!this.autoresFav.contains(a)) {
            this.autoresFav.add(a);
        }
    }

    public void addGeneroFav(String g) {
        if (!this.generosFav.contains(g)) {
            this.generosFav.add(g);
        }
    }

    public void addArticulo(Articulo a) {
        this.listaCompras.add(a);
    }

    public boolean yaCompro(Articulo art) {
        return this.listaCompras.contains(art);
    }

    public boolean leGusta(Articulo art) {
        return this.autoresFav.contains(art.getAutor());
    }

    @Override
    public String toString() {
        return "Cliente [nombre=" + nombre + ", apellido=" + apellido + ", DNI=" + DNI + ", direccion=" + direccion
                + ", autoresFav=" + autoresFav + ", generosFav=" + generosFav + ", listaCompras=" + listaCompras
                + ", descuento=" + descuento + "]";
    }

    @Override
    public boolean equals(Object o) {
        try {
            Cliente otro = (Cliente) o;
            return this.getDNI() == (otro.getDNI());
        } catch (Exception e) {
            return false;
        }
    }

}
