package Examenes.Recuperatorio2022;

import java.util.ArrayList;

import Examenes.Recuperatorio2022.Condiciones.Condicion;

public class Noticia extends Elemento {
    private String titulo;
    private String contenido;
    private String autor;
    private ArrayList<String> palabrasClave;

    public Noticia(String titulo, String contenido, String autor, String categoria) {
        super(categoria);
        this.titulo = titulo;
        this.contenido = contenido;
        this.autor = autor;
        this.palabrasClave = new ArrayList<>();
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getContenido() {
        return contenido;
    }

    public void setContenido(String contenido) {
        this.contenido = contenido;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    @Override
    public ArrayList<String> getPalabrasClave() {
        return new ArrayList<>(this.palabrasClave);
    }

    public boolean contienePalabra(String palabra) {
        return this.palabrasClave.contains(palabra);
    }

    public void addPalabraClave(String palabra) {
        if (!this.palabrasClave.contains(palabra))
            palabrasClave.add(palabra);
    }

    @Override
    public ArrayList<Noticia> buscar(Condicion c) {
        ArrayList<Noticia> lista = new ArrayList<>();
        if (c.cumple(this))
            lista.add(this);
        return lista;
    }

    @Override
    public Elemento copia() {
        return new Noticia(this.getTitulo(), this.getContenido(), this.getAutor(), this.getCategoria());
    }

    @Override
    public Elemento copiaRestringida(Condicion cond) {
        if (cond.cumple(this))
            return this.copia();
        return null;
    }

}
