package TP7.EJ_5;

import java.util.ArrayList;

public class PlataformaStreaming {
    private String nombre;
    private ArrayList<Pelicula> peliculas;
    private CondicionDeBusqueda rentable;

    public PlataformaStreaming(String nombre, CondicionDeBusqueda rentable) {
        this.nombre = nombre;
        this.rentable = rentable;
        this.peliculas = new ArrayList<>();
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void addPelicula(Pelicula p) {
        if (!this.peliculas.contains(p))
            this.peliculas.add(p);
    }

    public boolean esRentable(Pelicula p) {
        return rentable.cumple(p);
    }

    //METODO PARA CUANDO CAMBIA LA CONDICION DE RENTABILIDAD
    public void setRentabilidad(CondicionDeBusqueda nueva) {
        this.rentable = nueva;
    }

    public ArrayList<Pelicula> listarPeliculas(CondicionDeBusqueda c) {
        ArrayList<Pelicula> lista = new ArrayList<>();
        for (int i = 0; i < this.peliculas.size(); i++) {
            if (c.cumple(this.peliculas.get(i))) {
                lista.add(this.peliculas.get(i));
            }
        }
        return lista;
    }
}
