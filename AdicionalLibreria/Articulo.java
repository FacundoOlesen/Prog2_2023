import java.util.ArrayList;

public class Articulo {
    private String nombre;
    private String autor;
    private double precio;
    private int cantPaginas;
    private String resumen;
    private ArrayList<String> generos;

    public Articulo(String nombre, String autor, String resumen, double precio, int cantPaginas) {
        this.nombre = nombre;
        this.autor = autor;
        this.resumen = resumen;
        this.precio = precio;
        this.cantPaginas = cantPaginas;
        this.resumen = resumen;
        this.generos = new ArrayList<>();
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public int getCantPaginas() {
        return cantPaginas;
    }

    public void setCantPaginas(int cantPaginas) {
        this.cantPaginas = cantPaginas;
    }

    public String getResumen() {
        return resumen;
    }

    public void setResumen(String resumen) {
        this.resumen = resumen;
    }

    public void addGenero(String g) {
        if (!this.generos.contains(g))
            this.generos.add(g);
    }

    public ArrayList<String> getGeneros() {
		return new ArrayList<>(this.generos); 
	}

    public boolean tieneGenero(String genero){
        return this.generos.contains(genero);
    }

    @Override
    public String toString() {
        return "Articulo [nombre=" + nombre + ", autor=" + autor + ", precio=" + precio + ", cantPaginas=" + cantPaginas
                + ", resumen=" + resumen + ", generos=" + generos + "]";
    }

    @Override
    public boolean equals(Object o) {
        try {
            Articulo otro = (Articulo) o;
            return this.getNombre().equals(otro.getNombre()) &&
                    this.getAutor().equals(otro.getAutor());
        } catch (Exception e) {
            return false;
        }
    }

}
