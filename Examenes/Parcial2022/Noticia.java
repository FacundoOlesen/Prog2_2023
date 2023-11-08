package Examenes.Parcial2022;

import java.util.ArrayList;

public class Noticia extends Elemento {
    private String titulo;
    private String contenido;
    private String autor;
    private String categoria;
    private ArrayList<String> palabrasClave;

    public Noticia(String titulo, String contenido, String autor, String categoria) {
        this.titulo = titulo;
        this.contenido = contenido;
        this.autor = autor;
        this.categoria = categoria;
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
    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    

    @Override
    public ArrayList<String> getPalabrasClave() {
        return new ArrayList<>(this.palabrasClave);
    }

    public void addPalabraClave(String palabra) {
        if (!this.palabrasClave.contains(palabra))
            palabrasClave.add(palabra);
    }
}
